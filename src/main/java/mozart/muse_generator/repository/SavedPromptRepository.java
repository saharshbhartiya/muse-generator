package mozart.muse_generator.repository;

import mozart.muse_generator.entity.SavedPrompt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SavedPromptRepository extends JpaRepository<SavedPrompt , Long> {
}
