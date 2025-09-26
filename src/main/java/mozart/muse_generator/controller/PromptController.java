package mozart.muse_generator.controller;

import mozart.muse_generator.service.MusicPromptService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/prompts")
public class PromptController {
    private final MusicPromptService musicPromptService;

    public PromptController(MusicPromptService musicPromptService){
        this.musicPromptService = musicPromptService;
    }
    @GetMapping("/chords")
    public String getChordPrompts(){
        return musicPromptService.getChordProgression();
    }
}
