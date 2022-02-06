package boletim;

public class Boletim {
    // private = encapsula as variáveis, tornando-as visíveis dentro apenas desta 
    private float nota;
    private int controle;
    private double media;
    private int frequencia;
    private String status;


    public void setNota(float nota) {
        this.nota = nota;
        this.controle += 1;
    }

    public void setFrequencia(int freq) {
        this.frequencia = freq;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void calcular_media(){
        media = nota / controle;
        System.out.println(media);
    }
    /*
    public void inserir_nota(float nota) {
        
    }

    public void excluir_nota() {
        
    }

    public void alterar_nota(float nova_nota) {
        
    }

    public void inserir_frequencia(boolean freq) {
        
    }

    public void alterar_status() {
        
    }

    public void calcular_media() {
        
    }
    */
    
}
