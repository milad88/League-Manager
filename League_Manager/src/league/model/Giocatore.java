package league.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints=@UniqueConstraint(columnNames={"squadra_id","numeroMaglia"}))
public class Giocatore {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable=false)
	private String nome;
	@Column(nullable=false)
	private String cognome;
	
	@Column(nullable=false)
	private int eta;
	
	@Column
	private int punti;
	
	@Column
	private float mediaVoto;
	
	@Column(nullable=false)
	private int numeroMaglia;
	
	
	@ManyToOne(cascade ={CascadeType.PERSIST, CascadeType.REMOVE})
	private Squadra squadra;
	
	public Giocatore(){}

	public Giocatore(String nome, String cognome, int eta, int numeroMaglia) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.numeroMaglia = numeroMaglia;
		this.squadra = squadra;
	}
	
	
	
}
