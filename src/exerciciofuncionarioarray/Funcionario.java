package exerciciofuncionarioarray;

/**
 *
 * @author glauc
 */
public class Funcionario {

    private int matricula;
    private String nome;
    private String cargo;
    private double salario;

    // construtor recebendo parametros
    public Funcionario(int matricula, String nome, String cargo, double salario) {
        this.matricula = matricula;
        this.cargo = cargo;
        this.nome = nome;
        this.salario = salario;

    }

    // um construtor qualquer, que não recebe parametros
    public Funcionario() {

    }
// métodos acessores

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    //metodo para calcular ajustes

    public void ajustarSalario(double percentual) {
        this.salario = this.salario + this.salario * percentual / 100;

    }

}
