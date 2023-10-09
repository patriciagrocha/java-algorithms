package S3.construtor;

public class Test {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Vera", 1_000F);

        funcionario.aumentar(100F);
        System.out.println(funcionario.getSalario()); //1100

        funcionario.aumentar(0F, 300F);
        System.out.println(funcionario.getSalario()); //1400


    }
}
