package com.br.buspass.conexao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.br.buspass.classes.Aluno;
import com.br.buspass.classes.Funcionario;
import com.br.buspass.classes.Horario;
import com.br.buspass.classes.VagaVeiculo;
import com.br.buspass.classes.Veiculo;
import com.br.buspass.compra.Escolha;

/**
 **
 * @author Samara
 */

public class ConexaoBD {

    private final static String url = "jdbc:postgresql://localhost:5432/buspass";
    private final static String user = "postgres";
    private final static String password = "admin";
    private static final String QUERY = "SELECT * FROM aluno, horario, veiculo";

    public static void AtualizarNomeAluno(Aluno aluno_nome) {
        try (Connection connection = DriverManager.getConnection(url, user, password);

                PreparedStatement preparedStatement = connection
                        .prepareStatement("ALTER TABLE ADD aluno (nome) VALUES (?);");) {
            preparedStatement.setString(1, aluno_nome.getNome());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            printSQLException(e);
        }

    }

    public static void AtualizarNumeroAluno(Aluno aluno_numero) {
        try (Connection connection = DriverManager.getConnection(url, user, password);

                PreparedStatement preparedStatement = connection
                        .prepareStatement("ALTER TABLE ADD aluno (num_tel) VALUES (?);");) {
            preparedStatement.setString(2, aluno_numero.getNome());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            printSQLException(e);
        }

    }

    public static void AtualizarCPFAluno(Aluno aluno_cpf) {
        try (Connection connection = DriverManager.getConnection(url, user, password);

                PreparedStatement preparedStatement = connection
                        .prepareStatement("ALTER TABLE ADD aluno (cpf) VALUES (?);");) {
            preparedStatement.setString(3, aluno_cpf.getNome());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            printSQLException(e);
        }

    }

    public static void AtualizarSenhaAluno(Aluno aluno_senha) {
        try (Connection connection = DriverManager.getConnection(url, user, password);

                PreparedStatement preparedStatement = connection
                        .prepareStatement("ALTER TABLE ADD aluno (senha) VALUES (?);");) {
            preparedStatement.setString(4, aluno_senha.getNome());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            printSQLException(e);
        }

    }

    public static void AtualizarMatriculaAluno(Aluno aluno_mat) {
        try (Connection connection = DriverManager.getConnection(url, user, password);

                PreparedStatement preparedStatement = connection
                        .prepareStatement("ALTER TABLE ADD aluno (matricula) VALUES (?);");) {
            preparedStatement.setString(5, aluno_mat.getNome());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            printSQLException(e);
        }

    }

    public static void AtualizarNomeFuncio(Funcionario funcio_nome) {
        try (Connection connection = DriverManager.getConnection(url, user, password);

                PreparedStatement preparedStatement = connection
                        .prepareStatement("ALTER TABLE ADD funcionario (nome) VALUES (?);");) {
            preparedStatement.setString(1, funcio_nome.getNome());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            printSQLException(e);
        }

    }

    public static void AtualizarCPFFuncio(Funcionario funcio_cfp) {
        try (Connection connection = DriverManager.getConnection(url, user, password);

                PreparedStatement preparedStatement = connection
                        .prepareStatement("ALTER TABLE ADD funcionario (cpf) VALUES (?);");) {
            preparedStatement.setString(2, funcio_cfp.getCPF());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            printSQLException(e);
        }

    }

    public static void AtualizarSenhaFuncio(Funcionario funcio_senha) {
        try (Connection connection = DriverManager.getConnection(url, user, password);

                PreparedStatement preparedStatement = connection
                        .prepareStatement("ALTER TABLE ADD funcionario (senha) VALUES (?);");) {
            preparedStatement.setString(3, funcio_senha.getSenha());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            printSQLException(e);
        }

    }

    public static void EscolhaHorario(Escolha escolha) {
        try (Connection connection = DriverManager.getConnection(url, user, password);

                PreparedStatement preparedStatement = connection
                        .prepareStatement(
                                "INSERT INTO horario_aluno (matricula_aluno, numero_viagem) VALUES (?, ?);");) {
            preparedStatement.setInt(1, escolha.getMatricula());
            preparedStatement.setInt(2, escolha.getNum_horario());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            printSQLException(e);
        }

    }

    public static void CompraPassagem() {
        try (Connection connection = DriverManager.getConnection(url, user, password);

                PreparedStatement preparedStatement = connection
                        .prepareStatement("SELECT * FROM horario;");) {

            ResultSet resultset = preparedStatement.executeQuery();

            while (resultset.next()) {
                System.out.println(resultset.getInt("numero") + " ");
                System.out.println(resultset.getString("hr_ida") + " ");
                System.out.println(resultset.getString("hr_volta") + " ");
                System.out.println(resultset.getDate("dt_viagem") + " ");
            }

        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    public static Aluno LogarAluno(Aluno login_aluno) {
        try (Connection connection = DriverManager.getConnection(url, user, password);

                PreparedStatement preparedStatement = connection
                        .prepareStatement("SELECT cpf, senha FROM funcionario WHERE cpf = ? and senha = ?;");) {
            preparedStatement.setInt(1, login_aluno.getMatricula());
            preparedStatement.setString(2, login_aluno.getSenha());

            ResultSet resultset = preparedStatement.executeQuery();

            Aluno aluno_logado = new Aluno();

            if (resultset.next()) {

                aluno_logado.setMatricula(resultset.getInt("matricula"));
                aluno_logado.setSenha(resultset.getString("senha"));
            }
            return aluno_logado;

        } catch (SQLException e) {
            printSQLException(e);
        }
        return null;
    }

    public static Funcionario LoginFunc(Funcionario login_fun) {
        try (Connection connection = DriverManager.getConnection(url, user, password);

                PreparedStatement preparedStatement = connection
                        .prepareStatement("SELECT cpf, senha FROM funcionario WHERE cpf = ? and senha = ?;");) {
            preparedStatement.setString(1, login_fun.getCPF());
            preparedStatement.setString(2, login_fun.getSenha());

            ResultSet resultset = preparedStatement.executeQuery();

            Funcionario fun_logado = new Funcionario();

            if (resultset.next()) {

                fun_logado.setCPF(resultset.getString("cpf"));
                fun_logado.setSenha(resultset.getString("senha"));
            }
            return fun_logado;

        } catch (SQLException e) {
            printSQLException(e);
        }
        return null;
    }

    public static void cadastroFuncionario(Funcionario funcionario) {
        try (Connection connection = DriverManager.getConnection(url, user, password);

                PreparedStatement preparedStatement = connection
                        .prepareStatement("INSERT INTO funcionario (nome, cpf, senha, id_vel) VALUES (?, ?, ?, ?);");) {
            preparedStatement.setString(1, funcionario.getNome());
            preparedStatement.setString(2, funcionario.getCPF());
            preparedStatement.setString(3, funcionario.getSenha());
            preparedStatement.setInt(4, funcionario.getId_veiculo());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            printSQLException(e);
        }

    }

    public static void cadastroVaga(VagaVeiculo vaga) {
        try (Connection connection = DriverManager.getConnection(url, user, password);

                PreparedStatement preparedStatement = connection
                        .prepareStatement("INSERT INTO vagas (vagas, id_vel) VALUES (?, ?);");) {
            preparedStatement.setInt(1, vaga.getVaga());
            preparedStatement.setInt(2, vaga.getId_Search());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            printSQLException(e);
        }

    }

    public static void cadastroVeiculo(Veiculo veiculo) {
        try (Connection connection = DriverManager.getConnection(url, user, password);

                PreparedStatement preparedStatement = connection.prepareStatement(
                        "INSERT INTO veiculo (ano, modelo, chassi, placa, id_vel) VALUES (?, ?, ?, ?, ?);");) {
            preparedStatement.setInt(1, veiculo.getAno());
            preparedStatement.setString(2, veiculo.getModelo());
            preparedStatement.setString(3, veiculo.getChassi());
            preparedStatement.setString(4, veiculo.getPlaca());
            preparedStatement.setInt(5, veiculo.getId_vel());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            printSQLException(e);
        }

    }

    public static void cadastroAluno(Aluno aluno) {
        try (Connection connection = DriverManager.getConnection(url, user, password);

                PreparedStatement preparedStatement = connection.prepareStatement(
                        "INSERT INTO aluno (nome, num_tel, cpf, senha, matricula) VALUES (?, ?, ?, ?, ?);");) {
            preparedStatement.setString(1, aluno.getNome());
            preparedStatement.setString(2, aluno.getNumero());
            preparedStatement.setString(3, aluno.getCpf());
            preparedStatement.setString(4, aluno.getSenha());
            preparedStatement.setInt(5, aluno.getMatricula());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    public static void cadastroHorario(Horario horario) {
        try (Connection connection = DriverManager.getConnection(url, user, password);

                PreparedStatement preparedStatement = connection.prepareStatement(
                        "INSERT INTO horario (numero, hr_ida, hr_volta, dt_viagem) VALUES (?, ?, ?, ?);");) {
            preparedStatement.setInt(1, horario.getNumero());
            preparedStatement.setString(2, horario.getHrIda());
            preparedStatement.setString(3, horario.getHrVolta());
            preparedStatement.setDate(4, Date.valueOf(horario.getDataViagem()));

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    public void getUserById() {

        try (Connection connection = DriverManager.getConnection(url, user, password);

                PreparedStatement preparedStatement = connection.prepareStatement(QUERY);) {

            ResultSet rs = preparedStatement.executeQuery();

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