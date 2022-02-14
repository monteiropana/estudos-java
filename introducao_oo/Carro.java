package introducao_oo;

public class Carro {
   
    String modelo;
    String cor;
    int ano;
    double preco;
    int numeroDePassageiros;
    double litrosCombustivel;
    double consumoCombustivel;

    void exibirAutonomia(){
        System.out.println("A autonomia do carro é : " + litrosCombustivel * consumoCombustivel + " km" );
    }

    double obterAutonomia(){
        System.out.println(" o metodo obterAutonomia foi chamado.");
        return litrosCombustivel * consumoCombustivel;

    }
}
