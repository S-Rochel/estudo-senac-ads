package boletim;

public class Faculdade {

    public static void main(String[] args) {
        // instânciar novos objetos.

        Boletim B1 = new Boletim();
        Boletim B2 = new Boletim();

        B1.setNota(9);
        B1.setFrequencia(90);
        B1.setStatus("Aprovado");

        B2.setNota(7.5F);
        B2.setFrequencia(85);
        B2.setStatus("Aprovado");

        B1.calcular_media();

        
        /*
        B1.inserir_nota(10);
        B1.inserir_frequencia(true);
        B1.alterar_status();

        B2.nota = 9;
        B2.frequencia = 85;
        B2.status = "Aprovado";
        
        System.out.println(B2.nota);
        */
    }
}
