package cat.itacademy.service;

import java.util.List;

import cat.itacademy.entidad.Fruita;
public interface FruitaService {
	
	public List <Fruita> listarFruites();
	
	public Fruita guardarFruita(Fruita fruita);
	
	public void eliminarFruita(int id);
	
	public Fruita obtenerFruitaPorId(int id);
	
	public Fruita actualizarFruita(Fruita fruita);
}
