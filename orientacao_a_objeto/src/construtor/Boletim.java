package construtor;

public class Boletim {
    // Essa classe cria instâncias de objetos do tipo Boletim.
    // Encapsulando as variáveis.
    private float nota;
    private int frequencia;
    private String status;

    // Métodos construtores.
    public Boletim(float n, int f, String s) {
        setBolelim(n, f, s);
    }

    public Boletim(String st) {
        this(10, 100, st);
    }

    public Boletim() {
        this(0, 0, null);
    }

    // Método para inicializar as instâncias dos objetos.
    public void setBolelim(float n, int f, String st) {
        setNota(n);
        setFrequencia(f);
        setStatus(st);
    }

    // Métodos para atribuir valores as variáveis.
    public void setNota(float nota) {
        this.nota = nota;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Métodos para fazer a leitura dos valores das variáveis.
    public float getNota() {
        return nota;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public String getStatus() {
        return status;
    }

    // Método para imprimir os atributos do objeto.
    public void imprimir() {
        System.out.printf("Nota: %.1f \nFrequência: %d \nStatus: %s \n", getNota(), getFrequencia(), getStatus());
    }    
}
