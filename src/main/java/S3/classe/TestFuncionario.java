package S3.classe;

public class TestFuncionario {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario();
        funcionario1.setCpf(12345678901L);
        funcionario1.setNomeCompleto("Maria José");
        funcionario1.setSalario(10_000F);
        funcionario1.promover(20F);

        Funcionario funcionario2 = new Funcionario(2345678912L,"João Maria",9_000F);
        funcionario2.promover(10F);

        System.out.println(funcionario1);
        System.out.println(String.format("O salário atual de %s é R$ %.2f", funcionario1.getNomeCompleto(), funcionario1.getSalario()));

        System.out.println("O salário atual de " + funcionario2.getNomeCompleto() +  " é R$ " + funcionario2.getSalario());

    }
}
