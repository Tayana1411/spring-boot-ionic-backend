package com.tayana.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tayana.cursomc.domain.Cliente;
import com.tayana.cursomc.repositories.ClienteRepository;
import com.tayana.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: "+id+ " "
				+ ", tipo: " +Cliente.class.getName()));
	}
}
