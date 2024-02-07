import java.util.Scanner;
    class questao1{
        public static void main(String args[]) {
            float n1;
            float n2;

            Scanner readScanner = new Scanner(System.in);
            System.out.print("Digite o primeiro numero: ");
            n1 = readScanner.nextFloat();
            System.out.print("Digite o segundo numero: ");
            n2 = readScanner.nextFloat();    
            System.out.print("A soma entre os números é: ");
            System.out.println(n1+n2);
            System.out.print("A subtração entre os números é: ");
            System.out.println(n1-n2);
            System.out.print("A multiplicação entre os números é: ");
            System.out.println(n1*n2);
            System.out.print("A divisão entre os números é: ");
            System.out.println(n1/n2);
    }
    }
