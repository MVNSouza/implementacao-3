public class Musicas { 
    String nome;
    boolean favorita;

    public Musicas(String nome, boolean favorita) { 
        this.nome = nome;
        this.favorita = favorita;
    }

    @Override
    public String toString() {
        return "Musica: " + nome ;
    }
}