public class Produto {

    String nome;
    double preco;
    int estoque;

    public Produto(String x, double y, int z) {
        this.nome = x;
        this.preco = y;
        this.estoque = z;
    }

    void Consultar() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: R$" + this.preco);
        System.out.println("Quantidade no estoque: " + this.estoque + "\n");
    }

    void AttNome(String x) {
        this.nome = x;
    }

    void AttPreco(double x) {
        this.preco = x;
    }

    void AttEstoque(int x) {
        this.estoque = x;
    }
}
