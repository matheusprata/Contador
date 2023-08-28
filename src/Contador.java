import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe um numero inteiro para o primeiro parametro");
        int parametroUm = scanner.nextInt();

        System.out.println("Informe um numero inteiro para o segundo parametro");
        int parametroDois = scanner.nextInt();
        Contar(parametroUm, parametroDois);
    }

    static void Contar(int parametroUm, int parametroDois){
        if(parametroUm < parametroDois){
            int contagem = parametroDois - parametroUm;
            for(int x = 1; x <= contagem; x++){
                System.out.println("Contador: "+x);
            }
        }
    }
}