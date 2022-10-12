package com.br.buspass.conexao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.br.buspass.Aluno;
import com.br.buspass.Funcionario;
import com.br.buspass.Horario;
import com.br.buspass.LoginFuncionario;
import com.br.buspass.VagaVeiculo;
import com.br.buspass.Veiculo;
import com.br.buspass.compra.Escolha;

/**
 **
 * @author Samara
 */

public class ConexaoBD {

    private final static String url = "jdbc:postgresql://localhost:1234/teste";
    private final static String user = "postgres";
    private final static String password = "admin";
    private static final String QUERY = "SELECT * FROM aluno, horario, veiculo";
    private final String QUERY2 = "";
    private final String QUERY3 = "";

    public static Escolha CompraPassagem(Escolha aluno_compra) {
        try (Connection connection = DriverManager.getConnection(url, user, password);
                // Step 2:Create a statement using connection object
                PreparedStatement preparedStatement = connection
                        .prepareStatement("SELECT * FROM horarios;");) {
            // Step 3: Execute the query or update query

            ResultSet resultset = preparedStatement.executeQuery();

            System.out.println(resultset);

            // Step 4: Process the ResultSet object.
        } catch (SQLException e) {
            printSQLException(e);
        }
        return null;
    }

    public static Aluno LoginAluno(Aluno login_aluno) {
        try (Connection connection = DriverManager.getConnection(url, user, password);
                // Step 2:Create a statement using connection object
                PreparedStatement preparedStatement = connection
                        .prepareStatement("SELECT cpf, senha FROM funcionario WHERE cpf = ? and senha = ?;");) {
            preparedStatement.setInt(1, login_aluno.getMatricula());
            preparedStatement.setString(2, login_aluno.getSenha());
            // Step 3: Execute the query or update query

            ResultSet resultset = preparedStatement.executeQuery();

            Aluno aluno_logado = new Aluno();

            if(resultset.next()){
                
                aluno_logado.setMatricula(resultset.getInt("matricula"));
                aluno_logado.setSenha(resultset.getString("senha"));
            } 
           return aluno_logado;

            // Step 4: Process the ResultSet object.
        } catch (SQLException e) {
            printSQLException(e);
        }
        return null;
    }

    public static Funcionario LoginFunc(Funcionario login_fun) {
        try (Connection connection = DriverManager.getConnection(url, user, password);
                // Step 2:Create a statement using connection object
                PreparedStatement preparedStatement = connection
                        .prepareStatement("SELECT cpf, senha FROM funcionario WHERE cpf = ? and senha = ?;");) {
            preparedStatement.setString(1, login_fun.getCPF());
            preparedStatement.setString(2, login_fun.getSenha());
            // Step 3: Execute the query or update query

            ResultSet resultset = preparedStatement.executeQuery();

            Funcionario fun_logado = new Funcionario();

            if(resultset.next()){
                
                fun_logado.setCPF(resultset.getString("cpf"));
                fun_logado.setSenha(resultset.getString("senha"));
            } 
           return fun_logado;

            // Step 4: Process the ResultSet object.
        } catch (SQLException e) {
            printSQLException(e);
        }
        return null;
    }

    public static void cadastroFuncionario(Funcionario funcionario) {
        try (Connection connection = DriverManager.getConnection(url, user, password);
                // Step 2:Create a statement using connection object
                PreparedStatement preparedStatement = connection
                        .prepareStatement("INSERT INTO funcionario (nome, cpf, senha, id_vel) VALUES (?, ?, ?, ?);");) {
            preparedStatement.setString(1, funcionario.getNome());
            preparedStatement.setString(2, funcionario.getCPF());
            preparedStatement.setString(3, funcionario.getSenha());
            preparedStatement.setInt(4, funcionario.getId_veiculo());
            // Step 3: Execute the query or update query
            preparedStatement.executeUpdate();
            // Step 4: Process the ResultSet object.

        } catch (SQLException e) {
            printSQLException(e);
        }

    }

    public static void cadastroVaga(VagaVeiculo vaga) {
        try (Connection connection = DriverManager.getConnection(url, user, password);
                // Step 2:Create a statement using connection object
                PreparedStatement preparedStatement = connection
                        .prepareStatement("INSERT INTO vagas (vagas, id_vel) VALUES (?, ?);");) {
            preparedStatement.setInt(1, vaga.getVaga());
            preparedStatement.setInt(2, vaga.getId_Search());
            // Step 3: Execute the query or update query
            preparedStatement.executeUpdate();
            // Step 4: Process the ResultSet object.

        } catch (SQLException e) {
            printSQLException(e);
        }

    }

    public static void cadastroVeiculo(Veiculo veiculo) {
        try (Connection connection = DriverManager.getConnection(url, user, password);
                // Step 2:Create a statement using connection object
                PreparedStatement preparedStatement = connection.prepareStatement(
                        "INSERT INTO veiculo (ano, modelo, chassi, placa, id_vel) VALUES (?, ?, ?, ?, ?);");) {
            preparedStatement.setInt(1, veiculo.getAno());
            preparedStatement.setString(2, veiculo.getModelo());
            preparedStatement.setString(3, veiculo.getChassi());
            preparedStatement.setString(4, veiculo.getPlaca());
            preparedStatement.setInt(5, veiculo.getId_vel());
            // Step 3: Execute the query or update query
            preparedStatement.executeUpdate();
            // Step 4: Process the ResultSet object.

        } catch (SQLException e) {
            printSQLException(e);
        }

    }

    public static void cadastroAluno(Aluno aluno) {
        try (Connection connection = DriverManager.getConnection(url, user, password);
                // Step 2:Create a statement using connection object
                PreparedStatement preparedStatement = connection.prepareStatement(
                        "INSERT INTO aluno (nome, num_tel, cpf, senha, matricula) VALUES (?, ?, ?, ?, ?);");) {
            preparedStatement.setString(1, aluno.getNome());
            preparedStatement.setString(2, aluno.getNumero());
            preparedStatement.setString(3, aluno.getCpf());
            preparedStatement.setString(4, aluno.getSenha());
            preparedStatement.setInt(5, aluno.getMatricula());
            // Step 3: Execute the query or update query
            preparedStatement.executeUpdate();
            // Step 4: Process the ResultSet object.

        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    public static void cadastroHorario(Horario horario) {
        try (Connection connection = DriverManager.getConnection(url, user, password);
                // Step 2:Create a statement using connection object
                PreparedStatement preparedStatement = connection.prepareStatement(
                        "INSERT INTO horario (numero, hr_ida, hr_volta, dt_viagem) VALUES (?, ?, ?, ?);");) {
            preparedStatement.setInt(1, horario.getNumero());
            preparedStatement.setString(2, horario.getHrIda());
            preparedStatement.setString(3, horario.getHrVolta());
            preparedStatement.setDate(4, Date.valueOf(horario.getDataViagem()));
            // Step 3: Execute the query or update query
            preparedStatement.executeUpdate();
            // Step 4: Process the ResultSet object.

        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    public void getUserById() {
        // Step 1: Establishing a Connection
        try (Connection connection = DriverManager.getConnection(url, user, password);
                // Step 2:Create a statement using connection object
                PreparedStatement preparedStatement = connection.prepareStatement(QUERY);) {
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();
            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int matricula = rs.getInt("matricula");
                String nome = rs.getString("nome");
                System.out.println(matricula + "," + nome);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    public static void main(String[] args) {
        ConexaoBD example = new ConexaoBD();
        example.getUserById();
    }

    public static void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}