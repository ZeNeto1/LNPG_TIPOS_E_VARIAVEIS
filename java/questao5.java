import java.util.Scanner;

public class questao5 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        float nota1 = scan.nextFloat();
        System.out.print("Digite o peso da primeira nota: ");
        float peso1 = scan.nextFloat();
        
        System.out.print("Digite a segunda nota: ");
        float nota2 = scan.nextFloat();
        System.out.print("Digite o peso da terceira nota: ");
        float peso2 = scan.nextFloat();

        System.out.print("Digite a terceira nota: ");
        float nota3 = scan.nextFloat();
        System.out.print("Digite o peso da terceira nota: ");
        float peso3 = scan.nextFloat();

        float mediaponderada = (nota1*peso1 + nota2 *peso2 +nota3*peso3)/peso1+peso2+peso3;

        System.out.print("A média ponderada das notas fornecidas é: ");
        System.out.println(mediaponderada);





    }
}
