package S3.construtor;

public class Funcionario {
    private String nome;
    private Float salario;

    //overload -> sobrecarga de construtores
    public Funcionario(){ }
    public Funcionario(String nome){
        this.nome = nome;
    }
    public Funcionario(String nome, Float salario){
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentar(Float valor){
        this.salario += valor;
    }
    public void aumentar(Float valor, Float comissao){
        this.salario += (valor + comissao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }
}
