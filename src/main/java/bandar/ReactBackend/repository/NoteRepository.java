package bandar.ReactBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bandar.ReactBackend.entity.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}
