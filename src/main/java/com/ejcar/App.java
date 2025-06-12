
package main.java.com.ejcar;

import main.java.com.ejcar.conexao.Conexao;
import main.java.com.ejcar.dao.VeiculoDao;
import main.java.com.ejcar.modelo.Veiculo;
import main.java.com.ejcar.pojo.VeiculoPojo;

public class App{
        public static void main( String[] args )
    {
        Conexao conexao = new Conexao();
        conexao.getConexao();

        Veiculo veiculo = new Veiculo("1546fgd", "","2019","", "ssugifygiYG");
        VeiculoPojo veiculoPojo = new VeiculoPojo(
            veiculo.getPlaca(), 
            veiculo.getModelo(),
            veiculo.getAno(), 
            veiculo.getCor(),
            veiculo.getChassi()
            );
        VeiculoDao veiculoDao = new VeiculoDao();
        veiculoDao.cadastrarVeiculo(veiculoPojo);
    }
}