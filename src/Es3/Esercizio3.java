package Es3;

import java.util.ArrayList;
import java.util.Date;

public class Esercizio3 {
    public static void main(String[] args) {
        // Creazione di alcuni articoli
        Articolo articolo1 = new Articolo("10101", "Laptop", 999.99, 10);
        Articolo articolo2 = new Articolo("20202", "Smartphone", 499.99, 20);
        Articolo articolo3 = new Articolo("30303", "Tablet", 299.99, 50);
        Articolo articolo4 = new Articolo("40404", "TV 8K", 799.99, 50);

        // Creazione di un cliente
        Cliente cliente1 = new Cliente("C001", "Aldo Baglio ", "ajeje_brazorf@garpez.com", new Date());

        // Creazione di un carrello per il cliente
        Carrello carrello = new Carrello(cliente1);

        // Aggiunta di articoli al carrello
        carrello.aggiungiArticolo(articolo1, 2);
        carrello.aggiungiArticolo(articolo2, 1);
        carrello.aggiungiArticolo(articolo3, 1);
        carrello.aggiungiArticolo(articolo4, 6);

        // Stampa del carrello
        carrello.stampaCarrello();
    }
}

class Articolo {
    private String codiceArticolo;
    private String descrizioneArticolo;
    private double prezzo;
    private int pezziDisponibili;

    // Costruttore per la classe Articolo
    public Articolo(String codiceArticolo, String descrizioneArticolo, double prezzo, int pezziDisponibili) {
        this.codiceArticolo = codiceArticolo;
        this.descrizioneArticolo = descrizioneArticolo;
        this.prezzo = prezzo;
        this.pezziDisponibili = pezziDisponibili;
    }

    // Metodi di accesso per ottenere i valori degli attributi privati
    public String getCodiceArticolo() {
        return codiceArticolo;
    }

    public String getDescrizioneArticolo() {
        return descrizioneArticolo;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getPezziDisponibili() {
        return pezziDisponibili;
    }
}

class Cliente {
    private String codiceCliente;
    private String nomeCognome;
    private String email;
    private Date dataIscrizione;

    // Costruttore per la classe Cliente
    public Cliente(String codiceCliente, String nomeCognome, String email, Date dataIscrizione) {
        this.codiceCliente = codiceCliente;
        this.nomeCognome = nomeCognome;
        this.email = email;
        this.dataIscrizione = dataIscrizione;
    }

    // Metodi di accesso per ottenere i valori degli attributi privati
    public String getCodiceCliente() {
        return codiceCliente;
    }

    public String getNomeCognome() {
        return nomeCognome;
    }

    public String getEmail() {
        return email;
    }

    public Date getDataIscrizione() {
        return dataIscrizione;
    }
}

class Carrello {
    private Cliente cliente;
    private ArrayList<ArticoloQuantita> elencoArticoli;

    // Costruttore per la classe Carrello
    public Carrello(Cliente cliente) {
        this.cliente = cliente;
        this.elencoArticoli = new ArrayList<>();
    }

    // Metodo per aggiungere un articolo al carrello
    public void aggiungiArticolo(Articolo articolo, int quantita) {
        elencoArticoli.add(new ArticoloQuantita(articolo, quantita));
    }

    // Metodo per stampare i dettagli del carrello
    public void stampaCarrello() {
        double totale = 0; // Variabile per tenere traccia del totale del costo degli articoli

        // Stampa dei dettagli del cliente
        System.out.println("Cliente: " + cliente.getNomeCognome());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("Data di iscrizione: " + cliente.getDataIscrizione());
        System.out.println("Carrello:");

        // Iterazione attraverso gli articoli nel carrello
        for (ArticoloQuantita articoloQuantita : elencoArticoli) {
            Articolo articolo = articoloQuantita.getArticolo(); // Ottenimento dell'articolo
            int quantita = articoloQuantita.getQuantita(); // Ottenimento la quantità dell'articolo
            double costoArticolo = articolo.getPrezzo() * quantita; // Calcolo del costo totale dell'articolo
            totale += costoArticolo; // Aggiornamento del totale del costo degli articoli nel carrello

            // Stampa dei dettagli dell'articolo
            System.out.println("- Codice: " + articolo.getCodiceArticolo() + ", Descrizione: " + articolo.getDescrizioneArticolo() + ", Quantità: " + quantita + ", Prezzo: " + articolo.getPrezzo() + " €, Totale: " + String.format("%.2f", costoArticolo) + " €");
        }

        // Stampa del totale del costo degli articoli nel carrello
        System.out.println("Totale costo articoli nel carrello: " + String.format("%.2f", totale) + " €");
    }
}

class ArticoloQuantita {
    private Articolo articolo;
    private int quantita;

    // Costruttore per la classe ArticoloQuantita
    public ArticoloQuantita(Articolo articolo, int quantita) {
        this.articolo = articolo;
        this.quantita = quantita;
    }

    // Metodi di accesso per ottenere i valori degli attributi privati
    public Articolo getArticolo() {
        return articolo;
    }

    public int getQuantita() {
        return quantita;
    }
}
