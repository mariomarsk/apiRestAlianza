package com.restapicliente.Repository;
 
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.restapicliente.Entity.*;  
@Repository
public interface ClientRepository extends CrudRepository<Client, Integer>  
{  
	  List<Client> findBySharedKey  (String sharedKey);
}  


