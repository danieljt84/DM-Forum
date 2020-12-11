package br.com.alura.forum.controller;



import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.controller.dto.TopicoDto;
import br.com.alura.forum.models.Curso;
import br.com.alura.forum.models.Topico;

@RestController
public class TopicosController {
	
	@RequestMapping("/topicos")
	public List<TopicoDto> lista(){
		Topico topico = new Topico("titulo", "mensagem", new Curso("Spring","Desenvolvimento"));
		
		return TopicoDto.converte(Arrays.asList(topico,topico,topico));
		
	}

}
