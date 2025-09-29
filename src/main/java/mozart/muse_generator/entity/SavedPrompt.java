package mozart.muse_generator.entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
@Entity
public class SavedPrompt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String musicKey;
    private String progression;
    private int tempoBPM;

    public Long getId() {
        return id;
    }
    public String getMusicKey() {
        return musicKey;
    }
    public void setMusicKey(String musicKey) {
        this.musicKey = musicKey;
    }
    public String getProgression() {
        return progression;
    }
    public void setProgression(String progression) {
        this.progression = progression;
    }
    public int getTempoBPM() {
        return tempoBPM;
    }
    public void setTempoBPM(int tempoBPM) {
        this.tempoBPM = tempoBPM;
    }
}
