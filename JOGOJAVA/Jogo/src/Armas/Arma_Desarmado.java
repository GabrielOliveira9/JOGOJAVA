package Armas;

public class Arma_Desarmado extends SuperArma {
    
    public Arma_Desarmado() {
    nome = "Desarmado";
    }

    @Override
    public void usarArma() {
        System.out.println("O personagem desfere uma série de golpes com os punhos, utilizando de sua proeza em combate, ou de seu desespero por estar desarmado?");        
    }
}
