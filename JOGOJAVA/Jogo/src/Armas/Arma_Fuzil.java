package Armas;

public class Arma_Fuzil extends SuperArma {
    
    public Arma_Fuzil() {
    nome = "Fuzil";
    }

    @Override
    public void usarArma() {
        System.out.println("Rajadas de tiros são disparadas da arma");        
    }
    
}
