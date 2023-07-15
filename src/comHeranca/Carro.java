package comHeranca;

public class Carro extends Veiculo{
   int quantidadeDePortas;

    Carro(String marca, String modelo, int ano, int quantidadeDePortas){
        super(marca,modelo,ano,6,"Bi-Bi","O Carro");
        this.quantidadeDePortas = quantidadeDePortas;
    }
    public void darRe(){
        System.out.println("A Ré foi acionada!!");
    }

}
