public class Esercizio1 {
    // Metodo per stampare due rettangoli e calcolare la somma delle loro aree e perimetri
    public static void stampaDueRettangoli(Rettangolo rettangolo1, Rettangolo rettangolo2) {
        // Stampa del primo rettangolo
        System.out.println("Rettangolo 1:");
        rettangolo1.stampaRettangolo();
        System.out.println();

        // Stampa del secondo rettangolo
        System.out.println("Rettangolo 2:");
        rettangolo2.stampaRettangolo();
        System.out.println();

        // Calcolo della somma delle aree dei due rettangoli
        double sommaAree = rettangolo1.calcolaArea() + rettangolo2.calcolaArea();
        // Calcolo della somma dei perimetri dei due rettangoli
        double sommaPerimetri = rettangolo1.calcolaPerimetro() + rettangolo2.calcolaPerimetro();

        // Stampa della somma delle aree
        System.out.println("Somma delle aree: " + sommaAree);
        // Stampa della somma dei perimetri
        System.out.println("Somma dei perimetri: " + sommaPerimetri);
    }

    public static void main(String[] args) {
        // Creazione di due rettangoli con dimensioni specifiche
        Rettangolo rettangolo1 = new Rettangolo(5, 10);
        Rettangolo rettangolo2 = new Rettangolo(3, 7);

        // Stampa di un singolo rettangolo
        System.out.println("Stampa singolo rettangolo:");
        rettangolo1.stampaRettangolo();
        System.out.println();

        // Stampa di due rettangoli e calcolo delle loro proprietà
        System.out.println("Stampa due rettangoli:");
        stampaDueRettangoli(rettangolo1, rettangolo2);
    }
}
