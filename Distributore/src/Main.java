import bevande.*;

public class Main {
    public static void main(String[] args) throws BevandaNonValida, TesseraNonValida, BevandaEsaurita, CreditoInsufficiente {
        Distributore distributore= new Distributore();
        distributore.aggiungiBevanda("A","acqua",1.50);
        distributore.aggiungiBevanda("B","coca-cola",2.00);
        distributore.aggiungiBevanda("C","birra",2.20);
        System.out.println(distributore.getPrice("A"));
        System.out.println(distributore.getName("C"));
        distributore.caricaTessera(12,5.5);
        distributore.caricaTessera(33,9.2);
        distributore.caricaTessera(4,3.3);
        System.out.println(distributore.leggiCredito(4));
        distributore.aggiornaColonna(1,"acqua",20);
        distributore.aggiornaColonna(2,"birra",30);
        distributore.aggiornaColonna(3,"coca-cola",50);
        distributore.aggiornaColonna(4,"acqua",42);
        System.out.println(distributore.lattineDisponibili("A"));
        System.out.println(distributore.eroga("B",12));

    }
}