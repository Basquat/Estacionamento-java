import java.util.Scanner;
import java.util.ArrayList;

public class Carro{

    Scanner car = new Scanner(System.in);
    ArrayList<String> meusCarros = new ArrayList<>();
    String placa;

    public void carro(String placa){
      while (true) {
            
        
         System.out.println("add carros\n");
         System.out.println("Digite a placa que você deseja adicionar");
        placa = car.nextLine();
        meusCarros.add(placa);
        System.out.println("Adicionado ao sistema !");
        return;   
        }
    }
}