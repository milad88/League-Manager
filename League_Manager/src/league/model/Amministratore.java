package league.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

//prova commento
@Entity
public class Amministratore {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable=false)
	private String nome;
	@Column(nullable=false)
	private String cognome;
	
	@Column(nullable=false)
	private String nickname;
	
	@Column(nullable=false)
	private String password;
	
	public Amministratore(){}

	public Amministratore(Long id, String nome, String cognome,
			String nickname, String password) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.nickname = nickname;
		this.password = password;
	}
	
	
	
}