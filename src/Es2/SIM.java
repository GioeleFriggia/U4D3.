import java.util.ArrayList;

public class SIM {
    private String numeroTelefono;
    private double creditoDisponibile;
    private ArrayList<Chiamata> ultimeChiamate;

    // Costruttore per la classe SIM
    public SIM(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.creditoDisponibile = 10.15;
        this.ultimeChiamate = new ArrayList<>();
    }

    // Metodo per stampare i dati della SIM
    public void stampaDatiSIM() {
        // Stampa del numero di telefono e del credito disponibile
        System.out.println("Numero di telefono: " + numeroTelefono);
        System.out.println("Credito disponibile: " + creditoDisponibile + " €");

        // Verifica se sono state effettuate chiamate
        if (ultimeChiamate.isEmpty()) {
            System.out.println("Nessuna chiamata effettuata.");
        } else {
            // Stampa delle ultime chiamate effettuate
            System.out.println("Ultime chiamate effettuate:");
            for (Chiamata chiamata : ultimeChiamate) {
                System.out.println("- Durata: " + chiamata.getDurata() + " minuti, Numero chiamato: " + chiamata.getNumeroChiamato());
            }
        }
    }

    public static void main(String[] args) {
        // Creazione di una nuova SIM con un numero di telefono specifico
        SIM sim = new SIM("3333333334");
        // Stampare i dati della SIM
        sim.stampaDatiSIM();
    }
}

// Classe che rappresenta una chiamata
class Chiamata {
    private int durata; // Durata della chiamata in minuti
    private String numeroChiamato; // Numero telefonico chiamato

    // Costruttore per la classe Chiamata
    public Chiamata(int durata, String numeroChiamato) {
        this.durata = durata;
        this.numeroChiamato = numeroChiamato;
    }

    // Metodo per ottenere la durata della chiamata
    public int getDurata() {
        return durata;
    }

    // Metodo per ottenere il numero telefonico chiamato
    public String getNumeroChiamato() {
        return numeroChiamato;
    }
}
