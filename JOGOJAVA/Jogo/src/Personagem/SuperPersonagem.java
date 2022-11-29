package Personagem;

import java.util.Scanner;

import Armas.Arma_BoladeFogo;
import Armas.Arma_Desarmado;
import Armas.Arma_Faca;
import Armas.Arma_Fuzil;
import Armas.Arma_GolpeDeCauda;
import Armas.Arma_Revolver;
import Armas.SuperArma;
import jogo.Jogo;

public class SuperPersonagem {
    private static Scanner sc = new Scanner(System.in);
    public static SuperArma armaAtual;

    public void usarArma(){
    SuperPersonagem.armaAtual.usarArma();
    }
    
    public void Falar() {
    }

    public void Desenhar(){
    }

    public static void setArma(SuperPersonagem classe) throws Exception{
        System.out.println("Qual arma desejas equipar?\n");
        System.out.println("[1] Para Bola de Fogo\n");
        System.out.println("[2] Para Nenhuma\n");
        System.out.println("[3] Para Faca\n");
        System.out.println("[4] Para Fuzil\n");
        System.out.println("[5] Para Revólver\n");
        System.out.println("[6] Para Cauda\n");
        System.out.println("Digite sua escolha: ");
        int opcaoArma = sc.nextInt(); 
        switch(opcaoArma){
            case 1: 
            System.out.println(Jogo.classe.getClass());
                
            if((Jogo.classe instanceof DragaoAlado) || (Jogo.classe instanceof Mago)){
                    armaAtual = new Arma_BoladeFogo();
                    System.out.println("Bola de fogo equipada");}
                else{
                    System.out.println("Arma incompatível com sua classe.");
                    setArma(classe);
                }
                break;
            case 2: 
                if(!(classe instanceof DragaoAlado)){
                    armaAtual = new Arma_Desarmado();}
                else{
                    System.out.println("Arma incompatível com a classe");
                    setArma(classe);
                }
                break;
            case 3: 
                if(!(classe instanceof DragaoAlado)){
                    armaAtual = new Arma_Faca();}
                else{
                    System.out.println("Arma incompatível com a classe");
                    setArma(classe);
                }
                break;
            case 4: 
                if(!(classe instanceof DragaoAlado)){
                    armaAtual = new Arma_Fuzil();}
                else{
                    System.out.println("Arma incompatível com a classe");
                    setArma(classe);
                }
                break;
            case 5: 
            if(!(classe instanceof DragaoAlado)){
                armaAtual = new Arma_Revolver();
                }    
                else{
                    System.out.println("Arma incompatível com a classe");
                    setArma(classe);
                }
                break;
            case 6: 
                if(classe instanceof DragaoAlado){
                    armaAtual = new Arma_GolpeDeCauda();
                }    
                else{
                    System.out.println("Arma incompatível com a classe");
                    setArma(classe);
                }
                break;
            default: System.out.println("Opção inválida");
                setArma(classe);
                break;
            }
    }
}
