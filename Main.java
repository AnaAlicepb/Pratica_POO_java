// Classe principal para testar as classes de empregados
public class Main {
    public static void main(String[] args) {
        // Cria uma instância de Assalariado
        Empregado assalariado = new Assalariado("Ana", "Silva", "123.456.789-00", 3000.00);

        // Cria uma instância de Comissionado
        Empregado comissionado = new Comissionado("João", "Pereira", "987.654.321-00", 20000.00, 0.10);

        // Cria uma instância de Horista
        Empregado horista = new Horista("Carlos", "Souza", "111.222.333-44", 50.00, 160);

        // Exibe o vencimento de cada tipo de empregado
        System.out.println("Vencimento do Assalariado: " + assalariado.vencimento());
        System.out.println("Vencimento do Comissionado: " + comissionado.vencimento());
        System.out.println("Vencimento do Horista: " + horista.vencimento());
    }
}
