package Armas;

public class Arma_GolpeDeCauda extends SuperArma {
    public Arma_GolpeDeCauda() {
        nome = "Cauda";
    }

    @Override
    public void usarArma() {
        System.out.println("O dragão gira seu corpo e usa sua cauda como um gigantesco chicote");        
    }
    
}
