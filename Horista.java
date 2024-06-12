// Classe Horista que estende a classe abstrata Empregado
public class Horista extends Empregado {
    // Propriedades específicas de um empregado horista
    private double precoHora;
    private double horasTrabalhadas;

    // Construtor para inicializar as propriedades
    public Horista(String nome, String sobrenome, String cpf, double precoHora, double horasTrabalhadas) {
        super(nome, sobrenome, cpf); // Chama o construtor da classe base
        this.precoHora = precoHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    // Getters e Setters para acessar e modificar as propriedades precoHora e horasTrabalhadas
    public double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    // Implementação do método abstrato vencimento, retorna o valor total das horas trabalhadas
    @Override
    public double vencimento() {
        return precoHora * horasTrabalhadas;
    }
}
