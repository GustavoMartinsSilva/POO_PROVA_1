/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_prova_1;

/**
 *
 * @author Gusta
 */

public class TesteSistema {
    public static void main(String[] args) {
        
        Departamento departamentoCompras = new Departamento("Compras");
        Departamento departamentoVendas = new Departamento("Vendas");
        Cargo cargoComprador = new Cargo("Comprador");
        Cargo cargoVendedor = new Cargo("Vendedor");
    
        Funcionario funcionario1 = new Funcionario(
            "Gustavo Martins silva", "142.583.285-50",
            departamentoCompras, cargoComprador,2500.00
        );

        Funcionario funcionario2 = new Funcionario(
            "Amanda louca","70.70.70-70", departamentoVendas,cargoVendedor,
            3000.00
        );

        Funcionario funcionario3 = new Funcionario();
      
        System.out.println("6. FUNCIONÁRIOS CRIADOS");
        System.out.println(funcionario1);
        System.out.println(funcionario2);
        System.out.println(funcionario3);
     
        funcionario3.alterarDados(
          "Rodrigo Lima", "111.111.111-11", departamentoVendas,
                cargoVendedor, 2200.00
        );

        System.out.println("\n7. FUNCIONÁRIO APÓS ALTERAÇÃO");

        System.out.println(funcionario3);

        funcionario1.aplicarReajuste(15.0);

        System.out.println("\n8. PRIMEIRO FUNCIONÁRIO APÓS REAJUSTE");

        System.out.println(funcionario1);

        funcionario3.demitir();

        System.out.println("\n10. TODOS OS FUNCIONÁRIOS");

        System.out.println(funcionario1);
        System.out.println(funcionario2);
        System.out.println(funcionario3);
    }
}