package league.model;

import javax.persistence.*;

@Entity
public class ResponsabileSquadra {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable=false)
	private String nome;
	@Column(nullable=false)
	private String cognome;
	
	@Column(nullable=false)
	private String email;
	@Column(nullable=false)
	private String password;
	
	@OneToOne(cascade ={CascadeType.PERSIST, CascadeType.REMOVE})
	private Squadra squadra;
	
	public ResponsabileSquadra(){}

	public ResponsabileSquadra(Long id, String nome, String cognome,
			String email, String password, Squadra squadra) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.password = password;
		this.squadra = squadra;
	}
	
	

	
}
