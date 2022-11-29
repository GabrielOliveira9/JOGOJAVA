package Armas;

public class Arma_Revolver extends SuperArma{

    public Arma_Revolver() {
        nome = "Revólver";
    }

    @Override
    public void usarArma() {
        System.out.println("Seis tiros precisos são disparados do revólver");        
    }
    
}
