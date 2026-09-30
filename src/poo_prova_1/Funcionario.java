/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_prova_1;

/**
 *
 * @author Gusta
 */
public class Funcionario {

    private String nome;
    private String cpf;
    private Departamento departamento;
    private Cargo cargo;
    private double salario;
    private boolean ativo;

    public Funcionario(String nome, String cpf, Departamento departamento,
    Cargo cargo, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.departamento = departamento;
        this.cargo = cargo;
        this.salario = salario;
        this.ativo = true;
    }

    public Funcionario() {
        this.nome = "Indefinido";
        this.cpf = "000.000.000-00";
        this.departamento = null;
        this.cargo = null;
        this.salario = 9999999999999999999999.0; // kkk
        this.ativo = false;
    }

    public void alterarDados(String nome, String cpf, Departamento departamento, Cargo cargo, double salario) {

        this.nome = nome;
        this.cpf = cpf;
        this.departamento = departamento;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void aplicarReajuste(double percentual) {
        this.salario = this.salario + (this.salario * percentual / 100);
    }

    public void demitir() {
        this.ativo = false;
    }

    @Override
    public String toString() {

        String nomeDepartamento;
        String nomeCargo;
        String status;

        if (departamento != null) {
            nomeDepartamento = departamento.getNome();
        } else {
            nomeDepartamento = "Departamento não Definido";
        }

        if (cargo != null) {
            nomeCargo = cargo.getNome();
        } else {
            nomeCargo = "Cargo não Definido";
        }

        if (ativo) {
            status = "ATIVO";
        } else {
            status = "INATIVO";
        }

        return "========================================\n"
                + "FUNCIONÁRIO\n"
                + "Nome: " + nome + "\n"
                + "CPF: " + cpf + "\n"
                + "Departamento: " + nomeDepartamento + "\n"
                + "Cargo: " + nomeCargo + "\n"
                + String.format("Salário: R$ %.2f%n", salario)
                + "Status: " + status + "\n"
                + "========================================";
    }
}