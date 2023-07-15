package semHeranca;

public class Caminhao {
    String marca;
    String modelo;
    int ano;
    int quantidadeDeRodas;
    int quantidadeDePortas;
    String buzina;
    String carroceria;

    Caminhao(String marca, String modelo, int ano, String carroceria){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.carroceria = carroceria;

        this.quantidadeDePortas = 2;
        this.buzina = "FUUUUOOONNNNN";
        this.quantidadeDeRodas = 6;
    }
    public void ligar(){
        System.out.println("o Caminhão ligou!!!");
    }
    public void buzinar(){
        System.out.println(buzina);
    }
    public void darRe(){
        System.out.println("A Ré foi acionada!!");
    }
    public void informacoes(){
        System.out.println("---------Caminhão-----------");
        System.out.println("marca: "+marca);
        System.out.println("modelo: "+modelo);
        System.out.println("ano: "+ano);
        System.out.println("carroceria: "+carroceria);
    }
}
