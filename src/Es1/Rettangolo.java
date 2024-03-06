public class Rettangolo {
    // Attributi privati per altezza e larghezza del rettangolo
    private double altezza;
    private double larghezza;

    // Costruttore per la classe Rettangolo
    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza; // Inizializzazione dell'altezza
        this.larghezza = larghezza; // Inizializzazione della larghezza
    }

    // Metodo per calcolare l'area del rettangolo
    public double calcolaArea() {
        return altezza * larghezza; // Calcolo dell'area come altezza * larghezza
    }

    // Metodo per calcolare il perimetro del rettangolo
    public double calcolaPerimetro() {
        return 2 * (altezza + larghezza); // Calcolo del perimetro come 2 * (altezza + larghezza)
    }

    // Metodo per stampare i dettagli del rettangolo
    public void stampaRettangolo() {
        System.out.println("Area: " + calcolaArea()); // Stampa dell'area del rettangolo
        System.out.println("Perimetro: " + calcolaPerimetro()); // Stampa del perimetro del rettangolo
    }
}
