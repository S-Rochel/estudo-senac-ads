package polimorfismo;

import java.util.List;

import heranca.BaseComissionado;
import heranca.Colaborador;
import heranca.Comissionado;
import heranca.Horista;
import heranca.Mensalista;

public class EmpresaMain {
    
    public static long contadorMensalistas(List<Colaborador>colaboradores) {
        return colaboradores
                .stream()
                .filter(Colaborador -> Colaborador instanceof Mensalista)
                .count();
    }

    public static void main(String[] args) {
        List<Colaborador>colaboradores = List.of(
            new Horista("Avery Jordan", "Desenvolvimento", 75.5),
            new Mensalista("Christian Cunningham", "infraestrutura", 7000),
            new Mensalista("Taylor Griffin", "Agile", 8500),
            new Comissionado("Charlene Butler", "Comercial", 25),
            new BaseComissionado("Terrace Wallace", "Venda", 5, 3000),
            new Mensalista("Brennan Sims", "Engenharia", 15600)
        );

        System.out.printf("O total de colaboradores mensalista é de %d colaboradores", contadorMensalistas(colaboradores));
    }
}
