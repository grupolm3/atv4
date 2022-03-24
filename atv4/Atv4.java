/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv4;

/**
 *
 * @author alunocmc
 */
public class Atv4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        contribuinte c1 = new contribuinte("Lucas","11211101115", 1300);
        contribuinte c2 = new contribuinte("Maria","11211101482", 2150);
        contribuinte c3 = new contribuinte("Marcos","11211501848", 3500);
        contribuinte c4 = new contribuinte("Matheus","11211100367", 5600);
        
        c1.calcularIRPF();
        System.out.println(c1.getNome()+" - Salario liquido "+c1.calcularSalarioLiq() + " - Porcentagem a pagar: " + c1.getDesc_irpf() + "%");
         c2.calcularIRPF();
        System.out.println(c2.getNome()+" - Salario liquido "+c2.calcularSalarioLiq() + " - Porcentagem a pagar: " + c2.getDesc_irpf() + "%");
         c3.calcularIRPF();
        System.out.println(c3.getNome()+" - Salario liquido "+c3.calcularSalarioLiq() + " - Porcentagem a pagar: " + c3.getDesc_irpf() + "%");
         c4.calcularIRPF();
        System.out.println(c4.getNome()+" - Salario liquido "+c4.calcularSalarioLiq() + " - Porcentagem a pagar: " + c4.getDesc_irpf() + "%");
        
        System.out.println("\n\nAtributos:");
        c1.imprimir();
        System.out.println("\n--------------");
        c2.imprimir();
        System.out.println("\n--------------");
        c3.imprimir();
        System.out.println("\n--------------");
        c4.imprimir();
    }
    
}

//valor do desconto de 1300 é 0 
//valor do desconto de 1988.75 é 161.25 
//valor do desconto de 3500 é 525 
//valor do desconto de 5600 é 0 1.540