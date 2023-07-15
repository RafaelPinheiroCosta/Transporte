package semHeranca;

public class Moto {
    String marca;
    String modelo;
    int ano;
    int quantidadeDeRodas;
    String buzina;

    Moto(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;

        this.buzina = "bi-bi";
        this.quantidadeDeRodas = 2;
    }
    public void ligar(){
        System.out.println("A moto ligou!!");
    }
    public void buzinar(){
        System.out.println(this.buzina);
    }
    public void empinar(){
        System.out.println("uuuuuhuuuuuuuu");
    }
    public void informacoes(){
        System.out.println("---------semHeranca.Moto-----------");
        System.out.println("marca: "+marca);
        System.out.println("modelo: "+modelo);
        System.out.println("ano: "+ano);
    }
}
