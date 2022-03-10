package introducao_oo;

public class GetSetCarro {
    private String marca;
    private String modelo;
    private int numPassageiros;
    private double consumoCombustivel;
    private int anoCarro;

    // metodo GET : obter valor do atributo marca: 
    public String getMarca(){
        return this.marca;
    }
    // metodo SET : setar um valor ao atributo marca:
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public int getNumPassageiros(){
        return this.getNumPassageiros();
    }
    public void setNumPasssageiros(int numPassageiros){
        this.numPassageiros = numPassageiros;
    }
    public double getConsumoCombustive(){
        return this.consumoCombustivel;
    }
    public void setConsumoCombustivel(double consumoCombustivel){
        this.consumoCombustivel = consumoCombustivel;
    }
    public int getAnoCarro(){
        return this.anoCarro;
    }
    public void setAnoCarro(int anoCarro){
        this.anoCarro = anoCarro;
    }

    
}
