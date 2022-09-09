
public class Produto {

    //atributos
    public String nome;
    public String marca;
    public int quantidade;
    public double preco;
    public String codigo_barras;
    public double desconto;
    
    //metodos construtores
    Produto(){
       nome = "Celular";
       marca = "Apple";
       quantidade = 10;   
    }
    
    Produto(String nome, String marca, int quantidade){
       this.nome = nome;
       this.marca = marca;
       this.quantidade = quantidade;
    }

    //metodos
    void mostrarDados() {
        System.out.println("Nome: " + nome);
    }

    double calcularDesconto() {
        double valor = preco - (preco * desconto);
        return valor;
    }

    double calcularDesconto2(double preco, double desconto) {
        double valor = preco - (preco * desconto);
        return valor;
    }

}
