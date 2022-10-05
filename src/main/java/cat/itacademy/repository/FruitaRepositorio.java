package cat.itacademy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import cat.itacademy.entidad.Fruita;
@Repository
public interface FruitaRepositorio extends JpaRepository<Fruita, Integer>{
	
}
