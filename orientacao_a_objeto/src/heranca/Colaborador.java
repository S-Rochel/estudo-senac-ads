package heranca;

public class Colaborador {
    
    private String nome;
    private String departamento;

    public Colaborador(String nome, String departamento) {
        this.nome = nome;
        this.departamento = departamento;
    }

    public String getNome() {
        return this.nome;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    @Override
    public String toString() {
        return String.format("Colaborador: %s\nDepartamento: %s", this.nome, this.departamento);
    }
}
