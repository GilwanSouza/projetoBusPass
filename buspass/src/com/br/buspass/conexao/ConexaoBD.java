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
import com.br.buspass.classes.Pagamento;
import com.br.buspass.classes.VagaVeiculo;
import com.br.buspass.classes.Veiculo;
import com.br.buspass.compra.Escolha;

public class ConexaoBD {

    /*
     * private final static String url = "jdbc:postgresql://localhost:5432/buspass";
     * private final static String user = "postgres";
     * private final static String password = "admin";
     * private static final String QUERY = "SELECT * FROM aluno, horario, veiculo";
     */
    private final static String url = "jdbc:postgresql://localhost:5432/buspass";
    private final static String user = "postgres";
    private final static String password = "admin";
    private static final String QUERY = "SELECT * FROM aluno, horario, veiculo";

    public static void SelecionarVeiculo(Veiculo selecionar_veiculo) {
        try (Connection connection = DriverManager.getConnection(url, user, password);

                PreparedStatement preparedStatement = connection
                        .prepareStatement(
                                "INSERT INTO troca_veiculo (motivo, id_vel_antigo, id_vel_novo) VALUES (?,?,?);");) {
            preparedStatement.setString(1, selecionar_veiculo.getMotivo());
            preparedStatement.setInt(2, selecionar_veiculo.getId_vel_antigo());
            preparedStatement.setInt(3, selecionar_veiculo.getId_vel_novo());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            printSQLException(e);
        }

    }

    public static void VerVeiculo(Veiculo ver_veiculo) {
        try (Connection connection = DriverManager.getConnection(url, user, password);

                PreparedStatement preparedStatement = connection
                        .prepareStatement(
                                "SELECT ano, modelo, chassi, placa, id_vel FROM veiculo WHERE (placa) = (?);");) {
            preparedStatement.setString(1, ver_veiculo.getPlaca());

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {

                System.out.println("Ano: " + resultSet.getString("ano"));
                System.out.println("Modelo: " + resultSet.getString("modelo"));
                System.out.println("Chassi: " + resultSet.getString("chassi"));
                System.out.println("Placa: " + resultSet.getString("placa"));
                System.out.println("Id do veiculo: " + resultSet.getString("id_vel"));

            } else {

                System.out.println("\n Veiculo não encontrado no sistema! \n");

            }

        } catch (SQLException e) {
            printSQLException(e);
        }

    }

    public static boolean PagamentoAluno(Pagamento pago) {
        try (Connection connection = DriverManager.getConnection(url, user, password);

                PreparedStatement preparedStatement = connection
                        .prepareStatement(
                                "INSERT INTO pagamento (mes_pago, matricula_aluno, dia_pago) VALUES (?, ?, ?);");) {
            preparedStatement.setString(1, pago.getMes());
            preparedStatement.setInt(2, pago.getMat_pagador());
            preparedStatement.setString(3, pago.getDt_pago());

            preparedStatement.executeUpdate();

            return true;

        } catch (SQLException e) {
            printSQLException(e);
        }
        return false;

    }

    public static void VisualizarDados(Aluno visualizarAluno) {
        try (Connection connection = DriverManager.getConnection(url, user, password);

                PreparedStatement preparedStatement = connection
                        .prepareStatement("SELECT nome, num_tel FROM aluno WHERE matricula = (?);");) {
            preparedStatement.setInt(1, visualizarAluno.getMatricula());

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {

                System.out.println("Nome: " + resultSet.getString("nome"));
                System.out.println("Numero de telefone: " + resultSet.getString("num_tel"));

            } else {

                System.out.println("\n Aluno não encontrado no sistema! \n");

            }

        } catch (SQLException e) {
            printSQLException(e);
        }

    }

    public static boolean ExcluirVeiculo(Veiculo vel) {
        try (Connection connection = DriverManager.getConnection(url, user, password);

                PreparedStatement preparedStatement = connection
                        .prepareStatement("DELETE FROM veiculo WHERE (id_vel) = (?);");) {
            preparedStatement.setInt(1, vel.getId_vel());

            preparedStatement.executeUpdate();

            return true;

        } catch (SQLException e) {
            printSQLException(e);
        }

        return false;

    }

    public static boolean AtualizarNomeAluno(Aluno aluno_nome) {
        try (Connection connection = DriverManager.getConnection(url, user, password);

                PreparedStatement preparedStatement = connection
                        .prepareStatement("UPDATE aluno SET nome = (?) WHERE matricula = (?);");) {
            preparedStatement.setString(1, aluno_nome.getNome());
            preparedStatement.setInt(2, aluno_nome.getMatricula());

            preparedStatement.executeUpdate();

            return true;

        } catch (SQLException e) {
            printSQLException(e);
        }

        return false;

    }

    public static boolean AtualizarNumeroAluno(Aluno aluno_numero) {
        try (Connection connection = DriverManager.getConnection(url, user, password);

                PreparedStatement preparedStatement = connection
                        .prepareStatement("UPDATE aluno SET num_tel = (?) WHERE matricula = (?);");) {
            preparedStatement.setString(1, aluno_numero.getNumero());
            preparedStatement.setInt(2, aluno_numero.getMatricula());

            preparedStatement.executeUpdate();

            return true;

        } catch (SQLException e) {
            printSQLException(e);
        }

        return false;

    }

    public static boolean AtualizarSenhaAluno(Aluno aluno_senha) {
        try (Connection connection = DriverManager.getConnection(url, user, password);

                PreparedStatement preparedStatement = connection
                        .prepareStatement("UPDATE aluno SET senha = (?) WHERE matricula = (?);");) {
            preparedStatement.setString(1, aluno_senha.getSenha());
            preparedStatement.setInt(2, aluno_senha.getMatricula());

            preparedStatement.executeUpdate();

            return true;

        } catch (SQLException e) {
            printSQLException(e);
        }

        return false;

    }

    public static boolean EscolhaHorario(Escolha escolha) {
        try (Connection connection = DriverManager.getConnection(url, user, password);

                PreparedStatement preparedStatement = connection
                        .prepareStatement(
                                "INSERT INTO horario_aluno (numero_viagem, matricula_aluno) VALUES (?, ?);");) {
            preparedStatement.setInt(1, escolha.getNum_horario());
            preparedStatement.setInt(2, escolha.getMatricula());

            preparedStatement.executeUpdate();

            return true;

        } catch (SQLException e) {
            printSQLException(e);
        }
        return false;

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
                        .prepareStatement("SELECT matricula, senha FROM aluno WHERE matricula = ? and senha = ?;");) {
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

    public static boolean cadastroFuncionario(Funcionario funcionario) {
        try (Connection connection = DriverManager.getConnection(url, user, password);

                PreparedStatement preparedStatement = connection
                        .prepareStatement(
                                "INSERT INTO funcionario (nome, cpf, senha, id_funcio) VALUES (?, ?, ?, ?);");) {
            preparedStatement.setString(1, funcionario.getNome());
            preparedStatement.setString(2, funcionario.getCPF());
            preparedStatement.setString(3, funcionario.getSenha());
            preparedStatement.setInt(4, funcionario.getId_funcio());

            preparedStatement.executeUpdate();

            return true;

        } catch (SQLException e) {
            printSQLException(e);
        }
        return false;
    }

    public static boolean cadastroVaga(VagaVeiculo vaga) {
        try (Connection connection = DriverManager.getConnection(url, user, password);

                PreparedStatement preparedStatement = connection
                        .prepareStatement("INSERT INTO vagas (vagas, id_vel) VALUES (?, ?);");) {
            preparedStatement.setInt(1, vaga.getVaga());
            preparedStatement.setInt(2, vaga.getId_Search());

            preparedStatement.executeUpdate();

            return true;

        } catch (SQLException e) {
            printSQLException(e);
        }

        return false;

    }

    public static boolean cadastroVeiculo(Veiculo veiculo) {
        try (Connection connection = DriverManager.getConnection(url, user, password);

                PreparedStatement preparedStatement = connection.prepareStatement(
                        "INSERT INTO veiculo (ano, modelo, chassi, placa, id_vel) VALUES (?, ?, ?, ?, ?);");) {
            preparedStatement.setInt(1, veiculo.getAno());
            preparedStatement.setString(2, veiculo.getModelo());
            preparedStatement.setString(3, veiculo.getChassi());
            preparedStatement.setString(4, veiculo.getPlaca());
            preparedStatement.setInt(5, veiculo.getId_vel());

            preparedStatement.executeUpdate();

            return true;

        } catch (SQLException e) {
            printSQLException(e);
        }
        return false;

    }

    public static boolean cadastroAluno(Aluno aluno) {
        try (Connection connection = DriverManager.getConnection(url, user, password);

                PreparedStatement preparedStatement = connection.prepareStatement(
                        "INSERT INTO aluno (nome, num_tel, cpf, senha, matricula) VALUES (?, ?, ?, ?, ?);");) {
            preparedStatement.setString(1, aluno.getNome());
            preparedStatement.setString(2, aluno.getNumero());
            preparedStatement.setString(3, aluno.getCpf());
            preparedStatement.setString(4, aluno.getSenha());
            preparedStatement.setInt(5, aluno.getMatricula());

            preparedStatement.executeUpdate();

            return true;

        } catch (SQLException e) {
            printSQLException(e);
        }
        return false;
    }

    public static boolean cadastroHorario(Horario horario) {
        try (Connection connection = DriverManager.getConnection(url, user, password);

                PreparedStatement preparedStatement = connection.prepareStatement(
                        "INSERT INTO horario (numero, hr_ida, hr_volta, dt_viagem) VALUES (?, ?, ?, ?);");) {
            preparedStatement.setInt(1, horario.getNumero());
            preparedStatement.setString(2, horario.getHrIda());
            preparedStatement.setString(3, horario.getHrVolta());
            preparedStatement.setDate(4, Date.valueOf(horario.getDataViagem()));

            preparedStatement.executeUpdate();

            return true;

        } catch (SQLException e) {
            printSQLException(e);
        }
        return false;
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