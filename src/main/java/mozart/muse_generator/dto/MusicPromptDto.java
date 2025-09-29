package mozart.muse_generator.dto;

public class MusicPromptDto {
    private String key;
    private String progression;
    private int tempoBPM;

    public MusicPromptDto(String key , String progression , int tempoBPM){
        this.key = key;
        this.progression = progression;
        this.tempoBPM = tempoBPM;
    }
    public String getKey() {
        return key;
    }
    public String getProgression(){
        return progression;
    }
    public int getTempoBPM(){
        return tempoBPM;
    }
    public void setKey(String key){
        this.key = key;
    }

    public void setProgression(String progression) {
        this.progression = progression;
    }

    public void setTempoBPM(int tempoBPM) {
        this.tempoBPM = tempoBPM;
    }
}
