package Solid_AULA06_AVALIACAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.CallableStatement;

public class BancoDeDadosArmazenamento implements Iarmazenamento{

	
	public void adicionarVeiculo(Iveiculos veiculo) {
		
		
		Connection conecta = bancodedados.getConexaoMySQL();
		
		
		try {
			
			String[] x = veiculo.salvar().split(",");
			//System.out.println(x[0]);
			 
			
			CallableStatement ps = conecta.prepareCall("{call inserir_veiculo(?,?,?,?,?,?,?)}");
			ps.setString(1,x[0]);
			ps.setString(2,x[1]);
			ps.setInt(3,Integer.parseInt(x[2]));
			ps.setDouble(4,Double.parseDouble(x[3]));
			ps.setString(5,x[4]);
			ps.setString(6,x[5]);
			ps.setInt(7,Integer.parseInt(x[6]));
			
			
			ps.executeQuery();
			
				
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public Object imprimirEstoque() {
		
		
		Connection conexao = bancodedados.getConexaoMySQL();
		
		
		try {
			
			String sql = "select * from veiculo";
			
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			
			ResultSet rs = ps.executeQuery();
			
			
			while(rs.next()) {
				int id = rs.getInt("idveiculo");
				String marca = rs.getString("marca");
				String modelo = rs.getString("modelo");
				int ano = rs.getInt("anofabricacao");
				Double preco = rs.getDouble("preco");
				String motor = rs.getString("motor");
				String tipo= rs.getString("tipo");
				int portas = rs.getInt("qtdportas");
				
				
				
				System.out.println("ID: " +id + " \nMARCA: " + marca);
				System.out.println("MODELO: " +modelo + " \nANO: " + ano);
				System.out.println("PREÇO: " +preco + " \nMOTOR: " + motor);
				System.out.println("TIPO: " +tipo + " \nPORTAS: " + portas);
				System.out.println();
		}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
		
		
		
		
		
	}
	
}
