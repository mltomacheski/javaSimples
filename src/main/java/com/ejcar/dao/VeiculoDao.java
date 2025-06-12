package main.java.com.ejcar.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import main.java.com.ejcar.conexao.Conexao;
import main.java.com.ejcar.pojo.VeiculoPojo;

public class VeiculoDao {
        public void cadastrarVeiculo(VeiculoPojo veiculoPojo) {
    
        Conexao conexao = new Conexao();

        String sqlInsert = "insert into veiculo(placa, ano, chassi ) value (?, ?, ?);";

        PreparedStatement ps = null;

        try {

            ps = conexao.getConexao().prepareStatement(sqlInsert);
           
            ps.setString(1, veiculoPojo.getPlaca());
            ps.setString(2, veiculoPojo.getAno());
            ps.setString(3, veiculoPojo.getChassi());

            ps.execute();
            ps.close();

            System.out.println("Conseguimos cadastar o veículo");

        } catch (SQLException e) {
            // Lança um erro (imprimir)
            e.printStackTrace();
            System.out.println("NÃO GRAVOU !!!!!!!!");
        }

    }
}
