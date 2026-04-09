package TarefasClass;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Tarefas {
	// ==ATRIBUTOS==
	String titulo;
	String descricao;
	Boolean concluido;
	LocalDate dataCriacao;
	
	// ==CONSTRUTOR==
	
	public Tarefas(String titulo, String descricao, Boolean concluido, LocalDate dataCriacao) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.concluido = concluido;
		this.dataCriacao = dataCriacao;
	}


	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Boolean getConcluido() {
		return concluido;
	}

	public void setConcluido(Boolean concluido) {
		this.concluido = concluido;
		}

	public LocalDate getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	
	// ==MÉTODOS== 
}
