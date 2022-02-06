package pessoa;

public class Pessoa {
    
    private String nome;
    private int CPF;
    private String email;

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int cPF) {
        if (Validar_CPF(cPF))
        CPF = cPF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public boolean Validar_CPF(int cpf) {
        // API com o sistema da Receita Federal
        return true;
    }
}
