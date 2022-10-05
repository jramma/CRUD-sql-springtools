package cat.itacademy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cat.itacademy.repository.*;
import cat.itacademy.entidad.Fruita;

@Service
public class ImplementaFruitaService implements FruitaService {

	@Autowired
	private FruitaRepositorio lista;
	
	
	@Override
	public List<Fruita> listarFruites() {
		return lista.findAll();
	}

}
