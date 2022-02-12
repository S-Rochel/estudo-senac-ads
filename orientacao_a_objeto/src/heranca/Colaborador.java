package heranca;

public abstract class Colaborador {
    
    private String nome;
    private String departamento;

    public Colaborador(String nome, String departamento) {
        this.nome = nome;
        this.departamento = departamento;
    }

    // Método abstrato para calcular salário, ai precisa tranformar a classe em abstract.
    public abstract double salario();

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
