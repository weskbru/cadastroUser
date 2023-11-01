package repository;

import org.springframework.data.repository.CrudRepository;

import entidades.Usuario;

public interface UsuarioRespository  extends  CrudRepository<Usuario, Long>{

}
