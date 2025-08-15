import java.util.Scanner;

public class Main{
    public static void main(String[] args){
       // while (true) {
            
       do{
        Scanner automovel = new Scanner(System.in);
        Scanner menu = new Scanner(System.in);
        Carro opt1 = new Carro();

        System.out.println("Bem vindo ao gerenciador de estacionamento");

        int opt = 0;
        if (menu.hasNextInt()) {
        opt = menu.nextInt();
        }

        switch(opt){

            case 1 -> opt1.carro(null); 
            
            case 2 -> System.out.println("add motos");

            case 3 -> System.exit(opt);

            default -> System.out.println("opção errada");
        }
    automovel.close();
    menu.close();
         } while(true);
    }
}

//System in development