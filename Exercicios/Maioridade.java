import java.util.Scanner; 

public class Maioridade { 

    public static void main(String[] args) { 
        Scanner idade = new Scanner(System.in); 

        while (true) { // sistema de loop
            System.out.println("Digite sua idade, caso seja maior de 18 anos, você será aprovado"); 
            byte ano = idade.nextByte();

                if (ano == 0) { // encerramento do loop
                    System.out.println("Encerrando programa");
                    break;
                } else if (ano >= 18) {
                    System.out.println("Você foi aprovado"); 
                } else {
                    System.out.println("Você foi não foi aprovado"); 
                }
        }
        idade.close(); 
    }
}
