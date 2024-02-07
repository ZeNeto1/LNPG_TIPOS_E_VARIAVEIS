import java.util.Scanner;

public class questao2 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o um numero: ");
        int n1 = scan.nextInt();
        if (n1%2 == 0){
            System.out.print("O número digitado é par.");
        }else{
            System.out.print("O número digitado é impar.");
        }
}
}