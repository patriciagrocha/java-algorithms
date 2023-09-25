package S2.fatura;

public class Fatura {
    private String numeroFatura;
    private String descricao;
    private int qtdItens;
    private double precoUnitario;

    public Fatura(String numeroFatura, String descricao, int qtdItens, double precoUnitario){
        this.numeroFatura = numeroFatura;
        this.descricao = descricao;
        setQtdItens(qtdItens);
        setPrecoUnitario(precoUnitario);
    }

    public String getNumeroFatura() {
        return numeroFatura;
    }

    public void setNumeroFatura(String numeroFatura) {
        this.numeroFatura = numeroFatura;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtdItens() {
        return qtdItens;
    }

    public void setQtdItens(int qtdItens) {
        /* this.qtdItens = qtdItens < 0 ? 0 : qtdItens; */
        this.qtdItens = Math.max(qtdItens, 0);
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = Math.max(precoUnitario, 0);
    }
    /* o método getValorFatura não recebe por parâmetro pq todos os valores que ele vai usar no cálculo
    são atributos do objeto que chamou esse método */
    public double getValorFatura(){
        return this.qtdItens * precoUnitario;
    }


}
