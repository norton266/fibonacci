import java.util.Scanner;

public class Fibonacci{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int numero, a, b, c, aux;
        aux = 0;
        a = 0;
        b = 1;
        c = 0;
        numero = 0;

        while(numero != -1){
            System.out.println("Digite um número para verificar se está na sequência de fibonacci ( digite -1 para sair):");
            numero = input.nextInt();

            for(int i = 1; numero > c; i++){
                c = a+b;
                a = b;
                b = c;
                aux++;
            }

            if (numero == 1) {
                System.out.println("O número 1 é o 2º e o 3º elemento na sequência de fibonacci.");
            } else if (numero == 0){
                System.out.println("O número 0 é o primeiro elemento na sequência de fibonacci.");
            } else if (numero == c) {
                System.out.println("O número "+ numero +" é o " + (aux+2) + "º elemento da sequência de fibonacci.");
            } else {
                System.out.println("O número "+ numero +" não se encontra na sequência de fibonacci.");
            }
            c = 0;
            a = 0;
            b = 1;
            aux = 0;
        }
    }
}