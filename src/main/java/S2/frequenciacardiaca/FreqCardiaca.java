package S2.frequenciacardiaca;

import S2.utils.SaudeUtils;

public class FreqCardiaca {
    private String nome;
    private String sobrenome;
    private String dataNascimento;

    public FreqCardiaca(String nome, String sobrenome, String dataNascimento){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
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
    public int calcularIdade() {
        return SaudeUtils.calcularIdade(this.dataNascimento);
    }

    public int freqCardiacaMax(){
        return 220 - calcularIdade();

    }
    public double[] freqCardiacaAlvo(){
        double[] intervaloFreqCardiacaAlvo = new double[2];
        intervaloFreqCardiacaAlvo[0] = freqCardiacaMax() * 0.5;
        intervaloFreqCardiacaAlvo[1] = freqCardiacaMax() * 0.85;

        return intervaloFreqCardiacaAlvo;
    }
}
