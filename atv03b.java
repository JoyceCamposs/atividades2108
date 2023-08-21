import java.util.*;
public class atv03b {
    public static void main(String[] args) {
        double seno, grau;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o grau da forma geométrica:");
        grau = sc.nextDouble();
        seno = Math.sin(grau);
        System.out.println("O valor do seno é " + seno);
    }
}
