
package main;


public class Pessoa {
    private String nome;
    private String CPF;
    private double salario;
    private IARP imposto;

    
    Pessoa(double salario){
    
     imposto = new IARP();
     imposto.setSalario(salario);
     imposto.validar();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public IARP getImposto() {
        return imposto;
    }

    public void setImposto(IARP imposto) {
        this.imposto = imposto;
    }
    
    
    
}
