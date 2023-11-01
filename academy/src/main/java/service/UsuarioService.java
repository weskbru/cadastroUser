package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entidades.Usuario;
import repository.UsuarioRespository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRespository repository;
	
	public Usuario save(Usuario usuario) {
		return repository.save(usuario);
	}
	
	public Iterable<Usuario> findAll() {
        return repository.findAll();
    }
}
