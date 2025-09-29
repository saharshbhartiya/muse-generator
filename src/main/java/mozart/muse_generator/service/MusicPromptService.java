package mozart.muse_generator.service;

import mozart.muse_generator.dto.MusicPromptDto;
import mozart.muse_generator.entity.SavedPrompt;
import mozart.muse_generator.repository.SavedPromptRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class MusicPromptService {
    private final List<String> chordProgessions = List.of(
            "I - V - vi - IV  (The 'Pop' Progression)",
            "vi - IV - I - V  (The 'Sensitive Female' Progression)",
            "I - IV - V - I   (The 'Classic Rock' Progression)"
    );
    private final SavedPromptRepository savedPromptRepository;
    public MusicPromptService(SavedPromptRepository savedPromptRepository){
        this.savedPromptRepository = savedPromptRepository;
    }
    public MusicPromptDto getChordProgression(){
        Random random = new Random();
        String chordProgession = chordProgessions.get(random.nextInt(chordProgessions.size()));
        int tempo = ThreadLocalRandom.current().nextInt(60,141);
        String key = "C Major";
        return new MusicPromptDto(key , chordProgession ,tempo);
    }

    public SavedPrompt savedPrompt(MusicPromptDto promptDto){
        SavedPrompt newPrompt = new SavedPrompt();
        newPrompt.setMusicKey(promptDto.getKey());
        newPrompt.setProgression(promptDto.getProgression());
        newPrompt.setTempoBPM(promptDto.getTempoBPM());
        return savedPromptRepository.save(newPrompt);
    }
    public List<SavedPrompt> getAllSavedPrompts(){
        return savedPromptRepository.findAll();
    }
}
