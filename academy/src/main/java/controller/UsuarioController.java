package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import entidades.Usuario;
import service.UsuarioService;

@Controller
public class UsuarioController {

	@Autowired
	private UsuarioService service;

	@GetMapping("/")
	public String showForm() {
		return "cadastro";
	}

	@PostMapping("/cadastro")
	public String submitForm(@RequestParam("nome") String nome, @RequestParam("email") String email,
			@RequestParam("senha") String senha) {
		Usuario usuario = new Usuario();
		usuario.setNome(nome);
		usuario.setEmail(email);
		usuario.setSenha(senha);
		service.save(usuario);
		return "sucesso";
	}
}
