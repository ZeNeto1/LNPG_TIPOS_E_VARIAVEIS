import java.util.Scanner;
public class questao3 {
    public static void main(String args[]){

   System.out.print("Digite o valor da temperatura em Celsius: ");
   Scanner scan = new Scanner(System.in);
   float temp = scan.nextFloat();
   System.out.print("O valor da temperatura convertida é: " +(temp*1.8+32)+"F");
    }

}


