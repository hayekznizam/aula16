package br.com.db1.recibo.endereco;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.db1.recibo.cidade.Cidade;
import br.com.db1.recibo.pessoa.Pessoa;

@Entity
@Table(name="endereco")
public class Endereco {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name ="cidade_id", referencedColumnName="id",nullable = false)
	private Cidade cidade;
	
	
	@JoinColumn(name = "TipoLogradouro", referencedColumnName = "id", nullable = false)
	private TipoLogradouro tipologradouro;
	//endereco
	@Column(name = "logradouro", length= 60, nullable = false)
	private String logradouro;
	
	@Column(name="numero",length = 30,nullable = false)
	private String numero;
	
	@Column(name="complemento", length = 60, nullable = true)
	private String complemento;
	
	@Column(name="cep",length = 8,nullable = false)
	private String cep;
	
	@ManyToOne
	@JoinColumn(name="pessoa", referencedColumnName="id", nullable = false)
	private Pessoa pessoa_id;
	
	

}
