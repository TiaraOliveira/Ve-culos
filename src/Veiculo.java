public class Veiculo {

    //atributos
    private String marca, modelo, placa, cor, km ;
    private boolean ligado;
    private int litrosCombustivel, velocidade;
    private double preço;


    //getters and setter
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getKm() {
        return km;
    }
    public void setKm(String km) {
        this.km = km;
    }
    public boolean isLigado() {
        return ligado;
    }
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    public int getLitrosCombustivel() {
        return litrosCombustivel;
    }
    public void setLitrosCombustivel(int litrosCombustivel) {
        this.litrosCombustivel = litrosCombustivel;
    }
    public int getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    public double getPreço() {
        return preço;
    }
    public void setPreço(double preço) {
        this.preço = preço;
    }

//metodos 

public void acelerar() {
    this.setVelocidade(getVelocidade() + 20);
}

public void abastecer(int qdt) {
    if (this.litrosCombustivel <= 60) {
        setLitrosCombustivel(getLitrosCombustivel() + qdt);
    }
    
}

public void frear() {
   if (velocidade > 0) {
       this.setVelocidade(getVelocidade()-20);
    
   }

        
    }

public void pintar(String cor) {
    this.setCor(cor);

    
}
public void ligar() {
    if (this.isLigado()) {
        System.out.println("Veiculo já encontra-se ligado");
    } else{
        setLigado(true);
    }
    
}

public void desligar() {
    if (this.isLigado() && getVelocidade() == 0) {
        setLigado(false);
        
    } else {
        System.out.println("Veiculo se encontra desligado ou com velocidade acima de 0");
        
    }

    
    
}




public void dados() {
    System.out.println("Veiculo: "+ getMarca() +" , "+ getCor()+ "placa" +getPlaca() + "com "+  getKm()+ "km"+ getLitrosCombustivel() +"litros de combustivel rodando à"+ getVelocidade());
}
//Contructor
public Veiculo(String marca, String modelo, String placa, String cor, String km, boolean ligado, int litrosCombustivel,
        int velocidade, double preço) {
    this.marca = marca;
    this.modelo = modelo;
    this.placa = placa;
    this.cor = cor;
    this.km = km;
    this.ligado = ligado;
    this.litrosCombustivel = litrosCombustivel;
    this.velocidade = velocidade;
    this.preço = preço;
}


}
