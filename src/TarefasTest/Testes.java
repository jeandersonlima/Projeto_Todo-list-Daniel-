package TarefasTest;

import org.junit.Test;
import TarefasClass.Tarefas;

import static org.junit.Assert.*;

import java.time.LocalDate;

public class Testes {
	 @Test
	    public void TestarCriarTarefa() {
		 Tarefas tarefa_test = new Tarefas("Treinar pernas", "Realizar o treino de pernas hoje as 18:00", false, LocalDate.of(2026, 05, 06));
		 assertEquals("Treinar pernas", tarefa_test.getTitulo());
		 assertEquals("Realizar o treino de pernas hoje as 18:00", tarefa_test.getDescricao());
		 assertFalse(tarefa_test.getConcluido());
		 assertEquals(LocalDate.of(2026, 05, 06), tarefa_test.getDataCriacao());
	 }
	 
	 @Test
	 	public void test_AlterarTitlo() {
		 Tarefas tarefa_test = new Tarefas("Ler Livro", "Ler o pequeno principe", false, LocalDate.of(2026, 05, 06));
		 tarefa_test.setTitulo("Pequeno Principe");
		 assertEquals("Pequeno Principe", tarefa_test.getTitulo());
	 }
	 
	 @Test
	 	public void test_TarefaConluida() {
		 Tarefas tarefa_test = new Tarefas("Ler Livro", "Ler o pequeno principe", false, LocalDate.of(2026, 05, 06));
		 tarefa_test.setConcluido(true);
		 assertTrue(tarefa_test.getConcluido());
	 }
	 
	 @Test
	 	public void test_AlterarDescricao() {
		 Tarefas tarefa_test = new Tarefas("Tomar agua", "preciso tomar agua hoje", false, LocalDate.of(2026, 05, 06));
		 tarefa_test.setDescricao("Preciso tomar em media 3 litros de água hoje");
		 assertEquals("Preciso tomar em media 3 litros de água hoje", tarefa_test.getDescricao());
	 }

}
