package structural.adapter;

public class AudioToTextAdapter extends AudioFile implements AudioFileAccessor {
    private final AudioFile audioFile;
    public AudioToTextAdapter(AudioFile audioFile) {
        super("");
        this.audioFile = audioFile;
    }

    @Override
    public String getData() {
        String audioData = audioFile.getData();
        return convertData(audioData);
    }

    private String convertData (String audioData) {
        return "Audio is converted!";
    }
}
