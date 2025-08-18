import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carro opt1 = new Carro();
        Moto opt3 = new Moto();
        Add opt2 = new Add();
        
        while (true) {
            System.out.println("Bem vindo ao gerenciador de estacionamento");
            
            int opt = 0;
                       
                opt = sc.nextInt();
                      
            switch (opt) {
                case 1 -> opt1.carro(null); 
                case 2 -> opt3.moto(null);
                case 3 -> opt2.add();
                case 4 -> System.exit(opt);
                default -> System.out.println("opção errada");
            }
           // sc.close();
        }
    }
}
