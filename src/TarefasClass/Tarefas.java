package TarefasClass;

import java.time.LocalDateTime;

public class Tarefas {
	// ==ATRIBUTOS==
	String titulo;
	String descricao;
	Boolean concluido;
	LocalDateTime dataCriacao;
	LocalDateTime dataConcluido;
	
	// ==CONSTRUTOR==
	
	public Tarefas(String titulo, String descricao, Boolean concluido, LocalDateTime dataCriacao, LocalDateTime dataConcluido) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.concluido = concluido;
		this.dataCriacao = dataCriacao;
		this.dataConcluido = dataConcluido;
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
		if(concluido) {
			this.dataConcluido = LocalDateTime.now();
		}
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	
	public LocalDateTime getDataConcluido() {
		return dataConcluido;
	}
	
	public void setDataConcluido(LocalDateTime dataConcluido) {
		this.dataConcluido = dataConcluido;
	}
	
	// ==MÉTODOS== 
}
