package br.com.exercicio2;

public class Funcionario extends Pessoa{
    public String departamento;
    public double salario;
    public String dataEntrada;
    public String rg;
    public boolean estaContratado;

    public Funcionario(String nome, String email, String telefone, String departamento, double salario, String dataEntrada, String rg, boolean estaContratado) {
        super(nome, email, telefone);
        this.departamento = departamento;
        this.salario = salario;
        this.dataEntrada = dataEntrada;
        this.rg = rg;
        this.estaContratado = estaContratado;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public boolean isEstaContratado() {
        return estaContratado;
    }

    public void setEstaContratado(boolean estaContratado) {
        this.estaContratado = estaContratado;
    }

    public void bonificar(){

    }

    public void demitir(){
        estaContratado = false;
    }

    public String mostrarDados(){
        String statusEmpresa;
        if(estaContratado == true){
            statusEmpresa = "Efetivado";
        }
        else{
            statusEmpresa = "Desligado";
        }
        return "Nome: " + getNome() + "\nE-mail: " + getEmail() + "\nTelefone: " + getTelefone() + "\nDepartamento: " + getDepartamento() + "\nSalario: " + getSalario() + "\nData de entrada: " + getDataEntrada() + "\nStatus na empresa: " + statusEmpresa;
    }

    public void bonificar(double aumento){
        this.salario += aumento;
    }

}