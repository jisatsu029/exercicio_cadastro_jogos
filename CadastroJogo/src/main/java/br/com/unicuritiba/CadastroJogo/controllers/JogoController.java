package br.com.unicuritiba.CadastroJogo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import br.com.unicuritiba.CadastroJogo.models.Jogo;
import br.com.unicuritiba.CadastroJogo.repositories.JogoRepository;

@RestController
public class JogoController {

	@Autowired
	JogoRepository repository;
	
	@GetMapping("/jogos")
	public ResponseEntity<List<Jogo>> getJogos(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@PostMapping("/jogos")
	public ResponseEntity<Jogo> saveAluno( @RequestBody Jogo jogo){
		Jogo jogoSalvo = repository.save(jogo);
		return ResponseEntity.ok(jogoSalvo);
	}
	
	@DeleteMapping("/jogos/{id}")
	public void removeJogo(@PathVariable long id) {
		repository.deleteById(id);
	}
	
	@PutMapping("/jogos/{id}")
    public ResponseEntity<Jogo> updateJogo(@PathVariable long id, @RequestBody Jogo jogoAtualizado) {
        return repository.findById(id)
            .map(jogo -> {
                jogo.setNome(jogoAtualizado.getNome());
                Jogo jogoAtualizadoSalvo = repository.save(jogo);
                return ResponseEntity.ok(jogoAtualizadoSalvo);
            })
            .orElse(ResponseEntity.notFound().build());
    }
	
}
