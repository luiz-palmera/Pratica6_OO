package br.com.exercicio2;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[10];
        String nome, email, telefone, departamento, dataEtntrada, rg;
        Double salario;
        String nomeEmp, cnpj;
        int qtdeFuncionarios = 0;
        boolean status = true;

        for(int i = 0; i < 2; i++){
            nome = JOptionPane.showInputDialog("Nome");
            email = JOptionPane.showInputDialog("Email");
            telefone = JOptionPane.showInputDialog("Telefone");
            departamento = JOptionPane.showInputDialog("Departamento");
            dataEtntrada = JOptionPane.showInputDialog("Data de entrada");
            rg = JOptionPane.showInputDialog("RG");
            salario = Double.parseDouble(JOptionPane.showInputDialog("Salario"));
            Funcionario func = new Funcionario(nome, email, telefone, departamento, salario, dataEtntrada, rg, true );
            funcionarios[i] = func;

        }

        nomeEmp = JOptionPane.showInputDialog("Criando a empresa, digite o Nome");
        cnpj = JOptionPane.showInputDialog("CNPJ");
        qtdeFuncionarios = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de funcionarios"));
        Empresa emp1 = new Empresa(nomeEmp,cnpj,qtdeFuncionarios);
        for(Funcionario func1:funcionarios){
            emp1.adicionaFuncionario(func1);
            System.out.println(func1.mostrarDados());
        }
    }
}