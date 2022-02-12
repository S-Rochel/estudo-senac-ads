package heranca;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class FolhaPagamento {
    
    private List<Colaborador> colaboradores;
    private LocalDate hoje;

    public FolhaPagamento(List<Colaborador> colaboradores) {
        this.colaboradores = colaboradores;
        this.hoje = LocalDate.now();
    }

    public void geraRelatorio() {
        System.out.println("|" + repeteCaracter('-', 80) + "|");
        printTitulo();
        System.out.println("|" + repeteCaracter('-', 80) + "|");
        printColaboradores();
        System.out.println("|" + repeteCaracter('-', 80) + "|");
        printTotalFolha();
        System.out.println("|" + repeteCaracter('-', 80) + "|");
    }

    private void printTitulo() {
        String titulo = String.format("Folha de pagamento - Mês: %s Ano: %d", hoje.getMonth().getDisplayName(TextStyle.FULL, new Locale("pt")), hoje.getYear());

        System.out.printf("| %-79s|\n", titulo);
    }

    private void printColaboradores()  {
        System.out.printf("| %-39s| %-37s |\n", "Nome", "Salário");
        System.out.println("|" + repeteCaracter('-', 80) + "|");
        colaboradores.forEach(
            Colaborador -> 
                 System.out.printf("| %-39s|%38s |\n", 
                       Colaborador.getNome(),
                       String.format("R$ %.2f", Colaborador.salario())));
    }

    private void printTotalFolha() {
        double total = colaboradores
                 .stream()
                 .mapToDouble(Colaborador::salario)
                 .sum();
        System.out.printf("| %-40s%38s |\n", "Total de pagamentos", String.format("R$ %.2f", total));         
    }

    private String repeteCaracter(char c, int tamanho) {
        char[] caracteres = new char[tamanho];
        Arrays.fill(caracteres, c);
        return new String(caracteres);
    }
}
