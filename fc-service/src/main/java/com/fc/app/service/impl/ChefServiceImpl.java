package com.fc.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.fc.app.model.Chef;
import com.fc.app.repository.ChefRepository;
import com.fc.app.service.ChefService;

@Service
public class ChefServiceImpl implements ChefService {

	@Autowired
	private ChefRepository repo;

	@Override
	public List<Chef> getAllChefs() {
		return repo.findAll();
	}

	@Override
	public Optional<Chef> getChefById(Long id) {
		return repo.findById(id);
	}

	@Override
	public List<Chef> getAllChefsByExample(Example<Chef> example) {
		return repo.findAll(example);
	}

	@Override
	public Chef save(Chef chef) {
		return repo.save(chef);
	}

	@Override
	public List<Chef> saveAll(Iterable<Chef> chefs) {
		return repo.saveAll(chefs);
	}
}
