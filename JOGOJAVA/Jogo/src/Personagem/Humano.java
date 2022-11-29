package Personagem;

public abstract class Humano extends SuperPersonagem{
    public abstract void Desenhar();

    public abstract void Falar(); 

    public static void Correr(){
        System.out.println("O personagem corre, se afastando do perigo");
    }
}
