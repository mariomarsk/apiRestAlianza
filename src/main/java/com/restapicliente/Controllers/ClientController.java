package com.restapicliente.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapicliente.Service.ClientService;
import com.restapicliente.Entity.*;

@RestController
@CrossOrigin(origins="http://localhost:4200")  
public class ClientController {

		
		@Autowired
		private ClientService clientService;

		@GetMapping("/clients")  
		public List<Client> getClients() {
			return clientService.getAllClients();
		}
		
		@GetMapping("/clients/{id}")
	    public Client obtenerCliente(@PathVariable("id") int id) {
	        return clientService.getClientById(id);
	    }
		
		@PostMapping("/clients")
	    public void guardarCliente(@RequestBody Client client) {
	         clientService.save(client);
	    }
		
		@PutMapping("/clients")
	    public void actualizarCliente(@RequestBody Client client) {
	         clientService.update(client);
	    }
		
		@DeleteMapping("/clients/{id}")
	    public void borrarCliente(@PathVariable("id") int id) {
			 clientService.delete(id);
	    }
		
		

}
