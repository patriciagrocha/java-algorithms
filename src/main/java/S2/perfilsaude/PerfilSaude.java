package S2.perfilsaude;

import S2.utils.SaudeUtils;
public class PerfilSaude {
    private String nome;
    private String sobrenome;
    private String dataNascimento;
    private String sexo;
    private double altura;
    private double peso;

    public PerfilSaude(String nome, String sobrenome, String dataNascimento,
                         String sexo, double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int calculaIdade() {
        return SaudeUtils.calcularIdade(this.dataNascimento);
    }

    public int frequenciaCardiacaMaxima() {
        return 220 - calculaIdade();
    }

    public double[] frequenciaCardiacaAlvo() {
        double[] intervaloFreqCardAlvo = new double[2];
        intervaloFreqCardAlvo[0] = frequenciaCardiacaMaxima() * 0.5;
        intervaloFreqCardAlvo[1] = frequenciaCardiacaMaxima() * 0.85;

        return intervaloFreqCardAlvo;
    }

    public double imc() {
        return this.peso / (this.altura * this.altura);
    }
}
