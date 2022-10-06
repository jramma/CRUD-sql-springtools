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

	@Override
	public Fruita guardarFruita(Fruita fruita) {
		// TODO Auto-generated method stub

		return lista.save(fruita);
	}

	@Override
	public void eliminarFruita(int id) {
		lista.deleteById(id);

	}

	@Override
	public Fruita obtenerFruitaPorId(int id) {
		// TODO Auto-generated method stub
		return lista.findById(id).get();
	}

	@Override
	public Fruita actualizarFruita(Fruita fruita) {
		// TODO Auto-generated method stub
		return lista.save(fruita);
	}

}
