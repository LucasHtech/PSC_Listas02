import java.util.Scanner;

public class peçadoisnumeros {

public static void main(String[] args) {

Scanner scanner =new Scanner(System.in);

System.out.println("Digite o primeiro numero: ");
double numero1 = scanner.nextDouble();

System.out.println("Digite o segundo numero: ");
double numero2 = scanner.nextDouble();

double soma = numero1 + numero2;
double subtracao = numero1 - numero2;
double multiplicacao = numero1 * numero2;
System.out.println("Soma: " + soma);
System.out.println("Subtração: " + subtracao);
System.out.println("multiplicação: " + multiplicacao);

scanner.close();
    



    
}


    
}
