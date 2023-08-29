import java.util.Locale;
import java.util.Scanner;

public class Contador extends Exception{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe um numero inteiro para o primeiro parametro");
        int parametroUm = scanner.nextInt();
        System.out.println("Informe um numero inteiro para o segundo parametro");
        int parametroDois = scanner.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosExceptional exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosExceptional {
        if(parametroUm < parametroDois){
            int contagem = parametroDois - parametroUm;
            for(int x = 1; x <= contagem; x++){
                System.out.println("Contador: "+x);
            }
        }else{
            throw new ParametrosInvalidosExceptional("O segundo parâmetro deve ser maior que o primeiro");
        }
    }
}