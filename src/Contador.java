import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva o primeiro paramêtro: ");
        int parametroUm = sc.nextInt();
        System.out.println("Escreva o segundo paramêtro: ");
        int parametroDois = sc.nextInt();

        try {
            contar(parametroUm, parametroDois);
        }catch (ParametrosInvalidosException e){
            System.out.println("O primeiro paramêtro foi MAIOR que o segundo! É necessário que o primeiro paramêtro seja menor que o segundo.");
        }

        sc.close();  
    }

    static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }else{
            int contagem = parametroDois - parametroUm;

            for (int i = 1; i <= contagem; i ++){
                System.out.println("Imprimindo o número " + i);
            }
        }
    }
}
