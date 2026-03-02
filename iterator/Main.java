import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Playlist minhaPlaylist = new Playlist();
        
        System.out.println("Escolha o modo: (1) Tudo ou (2) Favoritas");
        int modo = leitor.nextInt();
        leitor.nextLine(); 

        Iterator<Musicas> it = minhaPlaylist.getIterator();

        System.out.println("\nAperte ENTER para a proxima musica");

        while (it.hasNext()) {
            Musicas m = it.next();

           
            if (modo == 2 && !m.favorita) {
                continue; 
            }

        
            System.out.print("Tocando agora: " + m);
            
            
            String comando = leitor.nextLine();
            
        }

        
        leitor.close();
    }
}