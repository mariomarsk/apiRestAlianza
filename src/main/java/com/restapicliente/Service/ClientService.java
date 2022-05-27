package com.restapicliente.Service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.restapicliente.Repository.ClientRepository;
import com.restapicliente.Entity.*;

@Service  
public class ClientService {

	@Autowired  
	ClientRepository clientRepository;
	
  
	
	public List<Client> getAllClients()   
	{  
	List<Client> clients = new ArrayList<Client>();  
	clientRepository.findAll().forEach(client1 -> clients.add(client1));  
	return clients;  
	}  
	
	public Client getClientById(int id)   
	{  
	return clientRepository.findById(id).get();  
	}  
	
	public void save(Client client)   
	{  
	clientRepository.save(client);  
	}  
	
	public void delete(int id)   
	{  
	clientRepository.deleteById(id);  
	}  
	
	public void update(Client client)   
	{  
	clientRepository.save(client);  
	}  
	
}
