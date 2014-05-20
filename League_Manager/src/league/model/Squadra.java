package league.model;

import java.util.List;
import java.util.Map;

import javax.persistence.*;

@Entity
public class Squadra {
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable=false)
	private String nome;
	@Column(nullable=false)
	private String colori_sociali;
	
	
	
	@OneToOne(cascade ={CascadeType.PERSIST, CascadeType.REMOVE})
	private ResponsabileSquadra responsabile;
	

	@OneToMany(mappedBy="squadra")
	private Map<Integer, Giocatore> giocatori;
	
	@OneToMany(mappedBy="squadraA")
	private List<Partita> partiteInCasa;
	
	@OneToMany(mappedBy="squadraB")
	private List<Partita> partiteFuori;
	
	
	public Squadra(){}


	public Squadra(String nome, String colori_sociali) {
		this.nome = nome;
		this.colori_sociali = colori_sociali;
	}
	
	
	
	
}
