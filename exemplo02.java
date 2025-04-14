import java.util.Locale;
import java.util.Scanner;

public class exemplo02 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double nota1,nota2,nota3,media;
        String nome01;

        System.out.print("digite o nome do aluno:");
        nome01 =sc.nextLine();

        System.out.println("imforme a primeira nota");
        nota1 = sc.nextDouble();

        System.out.println("imforme a segunda nota");
        nota2 = sc.nextDouble();

        System.out.println("imforme a terceira nota");
        nota3 = sc.nextDouble();

        media=(nota1+nota2+nota3)/3;
        if (media>=7) {
            System.out.print("aprovado "+nome01);
        }else{
            if(media>=4 && media<=6.9){
                System.out.print("recuperação "+nome01);
            }
            else{
                System.out.print("Reprovado "+nome01);
            }
        }

    }
    }
    

