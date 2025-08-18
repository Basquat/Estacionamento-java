import java.util.Scanner;
import java.util.ArrayList;

public class Moto {
    Scanner sc = new Scanner(System.in);
    static ArrayList<String> minhasMotos = new ArrayList<>();
    String placa;

    public void moto(String placa) {
        
            System.out.println("add motos\n");
            System.out.println("Digite a placa que você deseja adicionar");
            
            placa = sc.nextLine();
            minhasMotos.add(placa);
            
            System.out.println("Adicionado ao sistema !\n");
            return;               
        
    }
}

