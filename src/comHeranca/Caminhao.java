package comHeranca;

public class Caminhao extends Veiculo{
    int quantidadeDePortas;
    String carroceria;

    Caminhao(String marca, String modelo, int ano, String carroceria){

        super(marca,modelo,ano,6,"FUUUUOOONNNNN","O Caminhão");
        this.carroceria = carroceria;
        this.quantidadeDePortas = 2;
    }
    public void darRe(){
        System.out.println("A Ré foi acionada!!");
    }
}
