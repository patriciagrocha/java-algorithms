package S2.fatura;

public class TestFatura {
    public static void main(String[] args) {
        Fatura fatura = new Fatura("001", "venda de 5 cadernos",
                5,20);
        System.out.println(fatura.getValorFatura());

    }
}
