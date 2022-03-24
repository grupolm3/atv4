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
public class contribuinte {
    
    private String nome;
    private String cpf;
    private float salario;
    private float desc_irpf;
    
    public contribuinte(){}

    public contribuinte(String nome, String cpf, float salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getDesc_irpf() {
        return desc_irpf;
    }

    public void setDesc_irpf(float desc_irpf) {
        this.desc_irpf = desc_irpf;
    }
    
    public void calcularIRPF() {
        if (salario <= 1903.98) {
            desc_irpf = 0f;
        }
        else if (salario > 1903.98 && salario <=  2826.65) {
            desc_irpf = 7.5f;
        }
        else if (salario > 2826.65 && salario <=  3751.05) {
            desc_irpf = 15f;
        }
        else if (salario > 3751.05 && salario <=  4664.68) {
            desc_irpf = 22.5f;
        }
        else {
            desc_irpf = 27.5f;
        }    
    }
    
    public float calcularSalarioLiq() {    
        return salario - (salario * (desc_irpf / 100));
   }   
    public void imprimir(){
        System.out.println("Nome: "+ this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Salario: " + this.getSalario());
        System.out.println("Porcentagem de desconto: " + this.getDesc_irpf());
    }
    
    
    
    
}
