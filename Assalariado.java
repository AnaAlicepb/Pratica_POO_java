// Classe Assalariado que estende a classe abstrata Empregado
public class Assalariado extends Empregado {
    // Propriedade específica de um empregado assalariado
    private double salario;

    // Construtor para inicializar as propriedades
    public Assalariado(String nome, String sobrenome, String cpf, double salario) {
        super(nome, sobrenome, cpf); // Chama o construtor da classe base
        this.salario = salario;
    }

    // Getter e Setter para acessar e modificar a propriedade salario
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Implementação do método abstrato vencimento, retorna o salário
    @Override
    public double vencimento() {
        return salario;
    }
}
