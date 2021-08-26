package br.com.cod3r.exerciciossb.conttrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.exerciciossb.entities.Produto;
import br.com.cod3r.exerciciossb.model.repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@PostMapping
	public @ResponseBody Produto novoPorduto(
			@RequestParam String nome,
			@RequestParam double preco,
			@RequestParam double desconto) {
		Produto produto = new Produto( nome, preco, desconto);
		//System.out.println(produto.repository);
		produtoRepository.save(produto);
		return produto;
	}
}
