package com.fatec.scel.model;
//import java.time.format.DateTimeFormatter;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
@Entity
public class Emprestimo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name="isbn", nullable = false, length=4)
	@NotEmpty(message="O isbn deve ser preenchido")
	private String isbn;
	@Column(name="ra", nullable = false, length=4)
	@NotEmpty(message="O RA deve ser preenchido")
	private String usuario;
	private String dataEmprestimo;
	private String dataDevolucao;
	private String dataDevolucaoPrevista;
	
	public void setDataEmprestimo( ) {
		DateTime dataAtual = new DateTime();
		org.joda.time.format.DateTimeFormatter fmt = DateTimeFormat.forPattern("YYYY/MM/dd");
		this.dataEmprestimo = dataAtual.toString(fmt);
		setDataDevolucaoPrevista(dataDevolucao);
	}
	
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getDataEmprestimo() {
		return dataEmprestimo;
	}
	public void setDataEmprestimo(String dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}
	public String getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	public String getDataDevolucaoPrevista() {
		return dataDevolucaoPrevista;
	}
	public void setDataDevolucaoPrevista(String dataDevolucaoPrevista) {
		this.dataDevolucaoPrevista = dataDevolucaoPrevista;
	}
}
