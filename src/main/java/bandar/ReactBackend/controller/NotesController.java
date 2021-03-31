package bandar.ReactBackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bandar.ReactBackend.entity.Note;
import bandar.ReactBackend.repository.NoteRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class NotesController {

	@Autowired NoteRepository nRepo;
	
	@GetMapping("/notes")
	public ResponseEntity<List<Note>> readNotes(){
		return new ResponseEntity<List<Note>>(nRepo.findAll(), HttpStatus.OK);
	}
	
	@PostMapping("/notes")
	public ResponseEntity<Note> createNotes(@RequestBody Note note){
		return new ResponseEntity<Note>(nRepo.save(note), HttpStatus.CREATED);
		
	}
}
