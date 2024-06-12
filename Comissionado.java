// Classe Comissionado que estende a classe abstrata Empregado
public class Comissionado extends Empregado {
    // Propriedades específicas de um empregado comissionado
    private double totalVenda;
    private double taxaComissao;

    // Construtor para inicializar as propriedades
    public Comissionado(String nome, String sobrenome, String cpf, double totalVenda, double taxaComissao) {
        super(nome, sobrenome, cpf); // Chama o construtor da classe base
        this.totalVenda = totalVenda;
        this.taxaComissao = taxaComissao;
    }

    // Getters e Setters para acessar e modificar as propriedades totalVenda e taxaComissao
    public double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(double totalVenda) {
        this.totalVenda = totalVenda;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }

    // Implementação do método abstrato vencimento, retorna o valor da comissão
    @Override
    public double vencimento() {
        return totalVenda * taxaComissao;
    }
}
