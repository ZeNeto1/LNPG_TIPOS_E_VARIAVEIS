import java.util.Scanner;

public class questao4 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a sua idade: ");
        int n1 = scan.nextInt();
        if (n1  >= 18){
            System.out.print("Você é maior de idade.");
        }else{
            System.out.print("Você é menor de idade.");
        }
}
}