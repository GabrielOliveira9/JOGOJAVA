package jogo;

import java.util.Scanner;

import Personagem.DragaoAlado;
import Personagem.General;
import Personagem.Humano;
import Personagem.LutSUMO;
import Personagem.Mago;
import Personagem.Soldado;
import Personagem.SuperPersonagem;

public class Jogo {
    static Scanner sc = new Scanner(System.in);
    public static SuperPersonagem classe;
    SuperPersonagem personagem = new SuperPersonagem();
    public static void main(String[] args) throws Exception {
        setClasse();
        SuperPersonagem.setArma(Jogo.classe);
        System.out.println(Jogo.classe);
        System.out.println(SuperPersonagem.armaAtual);
        Menu(classe);
    }

    public static void setClasse(){
        System.out.println("Qual classe desejas usar?\n");
        System.out.println("[1] Para Dragão\n");
        System.out.println("[2] Para General\n");
        System.out.println("[3] Para Lutador de sumô\n");
        System.out.println("[4] Para Mago\n");
        System.out.println("[5] Para Soldado\n");
        System.out.println("Digite sua escolha: ");
        int opcaoClasse = sc.nextInt();
        switch(opcaoClasse){
            case 1: classe = new DragaoAlado();
            System.out.println("Você é um Dragão");
            break;
            case 2: classe = new General();
            System.out.println("Você é um General");            
            break;
            case 3: classe = new LutSUMO();
            System.out.println("Você é um Lutador de Sumô");
            break;
            case 4: classe = new Mago();
            System.out.println("Você é um Mago");            
            break;
            case 5: classe = new Soldado();
            System.out.println("Você é um Soldado");
            break;
            default: System.out.println("Opção inválida");
            setClasse();
            break;
        }
    }

    public static void Menu(SuperPersonagem classe) throws Exception{
        System.out.println("Digite [1] para desenhar\n"); 
        System.out.println("Digite [2] para falar\n"); 
        System.out.println("Digite [3] para usar a arma\n"); 
        System.out.println("Digite [4] para correr/voar\n");
        System.out.println("Digite [5] para trocar de arma\n");
        System.out.println("Digite sua escolha: ");
        int opcaoMenu = sc.nextInt();
        switch(opcaoMenu){
            case 1:
                if(!(classe instanceof DragaoAlado)){
                    classe.Desenhar();
                Menu(classe);
                }
            else{
                System.out.println("O dragão não sabe desenhar...");
                Menu(classe);
            }
            break;
            case 2: 
            if(!(classe instanceof DragaoAlado)){
                classe.Falar();
                Menu(classe);
            }
            else{
                System.out.println("Dragões não falam...");
                Menu(classe);
            }
            break;
            case 3:
                SuperPersonagem.armaAtual.usarArma();
                Menu(classe);
                break;
            case 4:
                if(!(classe instanceof DragaoAlado)){
                    Humano.Correr();
                    Menu(classe);
            }
            else{
                DragaoAlado.Voar();
                Menu(classe);
            }
                break;
            case 5:
                SuperPersonagem.setArma(classe);
                Menu(classe);
                break;
            default:
            System.out.println("Opção inválida.");
            Menu(classe);
            break;
        }
    }
}

