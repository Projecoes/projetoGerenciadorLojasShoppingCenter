package Principal;


public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;

    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    public boolean estaVencido(Data dataAtual) {
        // Verifica se o ano de validade é menor que o ano atual
        if(dataValidade.getAno() < dataAtual.getAno()) {
            return true; //venceu
            // Verifica se o ano de validade é igual ao ano atual
        }else if(dataValidade.getAno() == dataAtual.getAno()){
            // Verifica se o mês de validade é menor que o mês atual
            if(dataValidade.getMes() < dataAtual.getMes())
                return true; //venceu
            // Verifica se o mês de validade é igual ao mês atual
        }else if(dataValidade.getMes() == dataAtual.getMes()) {
            // Verifica se o dia de validade é menor que o dia atual
            return dataValidade.getDia() < dataAtual.getDia(); //retorna true se estiver vencido

        }
        return false; // em dia
    }

    public String toString() {
        return "Nome do Produto: " + getNome()
                + "\nPreço do produto: " + getPreco()
                + "\nValidade: " + getDataValidade();
    }
}
