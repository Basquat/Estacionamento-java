import java.util.Scanner;
import java.util.ArrayList;

public class Carro {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> meusCarros = new ArrayList<>();
    String placa;

    public void carro(String placa) {
        
            System.out.println("add carros\n");
            System.out.println("Digite a placa que você deseja adicionar");
            
            placa = sc.nextLine();
            meusCarros.add(placa);
            
            meusCarros.add(placa);
            System.out.println("Adicionado ao sistema !");
            return;               
        
    }
}

// System in development