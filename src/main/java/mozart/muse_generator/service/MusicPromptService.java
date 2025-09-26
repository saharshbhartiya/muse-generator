package mozart.muse_generator.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class MusicPromptService {
    private final List<String> chordProgessions = List.of(
            "I - V - vi - IV  (The 'Pop' Progression)",
            "vi - IV - I - V  (The 'Sensitive Female' Progression)",
            "I - IV - V - I   (The 'Classic Rock' Progression)"
    );
    public String getChordProgression(){
        Random random = new Random();
        return chordProgessions.get(random.nextInt(chordProgessions.size()));
    }
}
