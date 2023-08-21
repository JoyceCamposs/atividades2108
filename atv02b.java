import java.util.Scanner;

public class atv02b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double num = sc.nextDouble();
        System.out.println("O número "+num+" Arredondado para baixo fica: "+Math.floor(num));
    }
}
