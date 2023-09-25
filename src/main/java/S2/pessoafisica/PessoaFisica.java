package S2.pessoafisica;

public class PessoaFisica {

    private  String nome;
    private  String sobrenome;
    private  String cpf;
    private  String email;
    private String telefone;
    private String dataNascimento;

    //construtor
    public PessoaFisica(String cpf) {
        setCpf(cpf);
    }
    private boolean validarCpf(String cpf){
        return cpf.length() == 11;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(validarCpf(cpf)) {
            this.cpf = cpf;
        } else {
            /* error */
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

}
