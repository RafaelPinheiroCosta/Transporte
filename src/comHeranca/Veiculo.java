package comHeranca;

public class Veiculo {
    String marca;
    String modelo;
    int ano;
    int quantidadeDeRodas;
    String buzina;
    String tipoVeiculo;

    Veiculo(String marca, String modelo, int ano, int quantidadeDeRodas, String buzina, String tipoVeiculo){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.quantidadeDeRodas= quantidadeDeRodas;
        this.buzina = buzina;
        this.tipoVeiculo = tipoVeiculo;
    }

    public void ligar(){
        System.out.println(tipoVeiculo+" ligou!!!");
    }
    public void buzinar(){
        System.out.println(buzina);
    }
    public void informacoes(){
        System.out.println("--------"+tipoVeiculo+"------------");
        System.out.println("marca: "+marca);
        System.out.println("modelo: "+modelo);
        System.out.println("ano: "+ano);
    }
}
