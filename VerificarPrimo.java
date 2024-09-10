import java.util.Scanner;   


public class VerificarPrimo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int Number = scanner.nextInt();

        if(Number < 2){
            System.out.println("O numero não é primo");
        }else{
            boolean primo = true;

            for(int i = 2; i <= Number/2; i++ ){
                if (Number % i == 0){
                    primo = false;
                    break;
                }
            }

        if(primo){
                System.out.println("O numero é primo");
        }else{
            System.out.println("O numero é do teu tio");
        }
    }
    scanner.close();
    }
}