package introducao_oo;

public class TesteGetSetCarro {

    public static void main(String[] args){
        GetSetCarro carro = new GetSetCarro();
        carro.setMarca("Fiat");
        
        System.out.println(carro.getMarca());

        carro.setModelo("Branco");
        System.out.println(carro.getModelo());
        
        carro.setConsumoCombustivel(50.0d);
        System.out.println(carro.getConsumoCombustive());

        carro.setNumPasssageiros(5);
        System.out.println(carro.getNumPassageiros());

    }
}
