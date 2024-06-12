// Classe abstrata Empregado
public abstract class Empregado {
    // Propriedades comuns a todos os empregados
    protected String nome;
    protected String sobrenome;
    protected String cpf;

    // Construtor para inicializar as propriedades
    public Empregado(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    // Getters e Setters para acessar e modificar as propriedades
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Método abstrato que deve ser implementado pelas subclasses
    public abstract double vencimento();
}
