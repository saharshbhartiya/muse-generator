package mozart.muse_generator.controller;

import mozart.muse_generator.dto.MusicPromptDto;
import mozart.muse_generator.entity.SavedPrompt;
import mozart.muse_generator.service.MusicPromptService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/prompts")
public class PromptController {
    private final MusicPromptService musicPromptService;

    public PromptController(MusicPromptService musicPromptService){
        this.musicPromptService = musicPromptService;
    }
    @GetMapping("/")
    public String showWelcomeMessage(){
        return "Welcome to Muse Generator!";
    }
    @GetMapping("/chords")
    public MusicPromptDto getChordPrompt(){
        return musicPromptService.getChordProgression();
    }

    @PostMapping("/save")
    public SavedPrompt savePrompt(@RequestBody MusicPromptDto promptToSave){
        return musicPromptService.savedPrompt(promptToSave);
    }
    @GetMapping("/saved")
    public List<SavedPrompt> getSavedPrompts(){
        return musicPromptService.getAllSavedPrompts();
    }
}
