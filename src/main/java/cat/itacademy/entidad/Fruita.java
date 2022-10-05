package cat.itacademy.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fruites")
public class Fruita {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "nombre", nullable = false)
	private String nom;

	@Column(name = "quantitatKG", nullable = false)
	private int quantitatKG;

	public Fruita() {
		// TODO Auto-generated constructor stub
	}

	public Fruita(int id, String nom, int quantitatKG) {
		this.id = id;
		this.nom = nom;
		this.quantitatKG = quantitatKG;
	}
	public Fruita( String nom, int quantitatKG) {
		this.nom = nom;
		this.quantitatKG = quantitatKG;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getQuatitatQuilos() {
		return quantitatKG;
	}

	public void setQuatitatQuilos(int quantitatKG) {
		this.quantitatKG = quantitatKG;
	}

}
