package Armas;

public class Arma_BoladeFogo extends SuperArma{
    
    public Arma_BoladeFogo() {
    nome = "Bola de Fogo";
    }

    @Override
    public void usarArma() {
        System.out.println("Uma bola de fogo mágica de repente é lançada");        
    }
    
}
