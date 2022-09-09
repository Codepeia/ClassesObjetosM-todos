
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //instanciar a classe produto
        Produto p1 = new Produto();
        Produto p2 = new Produto();
        Produto p3 = new Produto();
        Produto p4 = new Produto("Relogio", "Rolex", 10);
        
        System.out.println(p3.nome);
        System.out.println(p4.marca);

        p1.codigo_barras = "12345948161856156";
        p1.marca = "Intel";
        p1.nome = "Core i3";
        p1.preco = 800.00;
        p1.quantidade = 10;
        p1.desconto = 0.1;

        System.out.println(
                "Dados do produto: "
                + p1.codigo_barras
                + ", " + p1.marca
                + ", " + p1.nome
                + ", " + p1.preco
                + ", " + p1.quantidade
        );

        p1.mostrarDados();

        System.out.println("Preço com desconto: " + p1.calcularDesconto());

        System.out.println("____________________________");

        Scanner n = new Scanner(System.in);
        System.out.println("Digite o nome do produto");
        String nome = n.nextLine();
        System.out.println("Digite o preco do produto");
        double p = n.nextDouble();
        System.out.println("Digite o valor do desconto");
        double d = n.nextDouble();
      
       //double p = 3000.00;
       //double d = 0.2;
        double res = p2.calcularDesconto2(p, d);
        System.out.println("Resutado" +res);

    }

}
