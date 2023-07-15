package semHeranca;

public class Carro {
    String marca;
    String modelo;
    int ano;
    int quantidadeDeRodas;
    int quantidadeDePortas;
    String buzina;

    Carro(String marca, String modelo, int ano, int quantidadeDePortas){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.quantidadeDePortas = quantidadeDePortas;

        this.buzina = "Bi-Bi";
        this.quantidadeDeRodas = 4;
    }
    public void ligar(){
        System.out.println("o Carro ligou!!!");
    }
    public void buzinar(){
        System.out.println(buzina);
    }
    public void darRe(){
        System.out.println("A Ré foi acionada!!");
    }
    public void informacoes(){
        System.out.println("---------Carro-----------");
        System.out.println("marca: "+marca);
        System.out.println("modelo: "+modelo);
        System.out.println("ano: "+ano);
        System.out.println("Portas: "+quantidadeDePortas);
    }
}
