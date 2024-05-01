package com.utfpr.backendcategoriamusicawebconf;

import com.utfpr.backendcategoriamusicawebconf.entity.Categoria;
import com.utfpr.backendcategoriamusicawebconf.entity.Musica;
import com.utfpr.backendcategoriamusicawebconf.service.CategoriaService;
import com.utfpr.backendcategoriamusicawebconf.service.MusicaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BackendCategoriaMusicaWebconfApplication {
	private static final Logger log = LoggerFactory.getLogger(BackendCategoriaMusicaWebconfApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BackendCategoriaMusicaWebconfApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(CategoriaService categoriaService, MusicaService musicaService) {
		return (arg) -> {
			log.info("");
			log.info("");
			log.info("======Listagem de todas as MUSICAS======");
			for (Musica m : musicaService.listar()) {
				log.info(m.toString());
			}
			log.info("");
			log.info("");
			log.info("======Listagem de todas as CATEGORIAS======");
			for (Categoria c : categoriaService.listarTodasCategorias())
				log.info(c.toString());
		};
	}
}
