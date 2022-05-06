package org.uv.RepasoS103;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.uv.RepasoS103.dao.IRepositoryPersona;
import org.uv.RepasoS103.dao.Persona;

@SpringBootApplication
public class RepasoS103Application implements CommandLineRunner {
    
    @Autowired
    IRepositoryPersona repositoryPersona;

	public static void main(String[] args) {
		SpringApplication.run(RepasoS103Application.class, args);
	}

        @Override
        public void run(String... args) throws Exception {
            
            Persona persona = new Persona();
            
            persona.getClave();
            persona.setNombre("sopa");
            persona.setDireccion("cordoba");
            persona.setTelefono("9696322");
            repositoryPersona.save(persona);
            System.out.println("Se guardo");
            

//            repositoryPersona.findById(Integer.SIZE);
//            repositoryPersona.findAll();
//            repositoryPersona.delete(persona);
            
        }
}