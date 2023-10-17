package S4.sobrescrita;

public final class Gerente extends Funcionario{
    //final -> a classe não pode mais ser extendida, ou seja, não pode ter subclasses.
    // Encerra a hierarquia de heranças, torna atributos imutáveis e torna a variável em constante
    @Override
    public String obterCargo() {
        return "Sou gerente!";
    }
}
