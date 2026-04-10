package TerefasBD;

import java.util.ArrayList;
import TarefasClass.Tarefas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class TarefaDAO {
	//Classes e bibliotecas utilizadas para as funções
	ArrayList<Tarefas> tarefa_al = new ArrayList<>();;
	
	public void	AdicionarTarefa(Tarefas tarefa) {
		String sql = "INSERT INTO tarefa (titulo, descricao, concluido, data) VALUE (?, ?, ?, ?);";
		System.out.println(sql);
		//Envio das informações para o banco de dados
		try {
			Connection conn = Conexao.abrirConexao();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, tarefa.getTitulo());
			stmt.setString(2, tarefa.getDescricao());
			stmt.setBoolean(3, tarefa.getConcluido());
			stmt.setDate(4, java.sql.Date.valueOf(tarefa.getDataCriacao()));
		} catch (SQLException e){
			e.printStackTrace();
		}
		
	}
	
	public void LerTarefas() {
		String sql = "SELECT * FROM tarefa;";
		try {
			Connection conn = Conexao.abrirConexao();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Tarefas tarefa = new Tarefas(rs.getString("titulo"), rs.getString("descricao"), rs.getBoolean("concluida"), rs.getDate("data").toLocalDate());
				tarefa_al.add(tarefa);
			}
			conn.close();
		} catch (SQLException e){
			e.printStackTrace();
		}
		for(int i = 0; i < tarefa_al.size(); i++) {
			System.out.println("Titulo da tarefa: "+ tarefa_al.get(i).getTitulo());
			System.out.println("Descricao da tarefa: "+ tarefa_al.get(i).getDescricao());
			System.out.println("Status da tarefa: "+ tarefa_al.get(i).getConcluido());
			System.out.println("Data de criação da tarefa da tarefa: "+ tarefa_al.get(i).getDataCriacao() +"\n");
		}
	}

}
