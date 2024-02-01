package bevande;

import java.util.ArrayList;

public class Distributore {

    private ArrayList<Bevanda> bevande;

    private ArrayList<Credito> crediti;

    private ArrayList<ApprovigionamentoDistributore> approvigionamentoDistributores;
    /**
     * Costruttore del distributore di bevande
     */
    public Distributore() {
        this.bevande=new ArrayList<>();
        this.crediti=new ArrayList<>();
        this.approvigionamentoDistributores=new ArrayList<>();
    }

    /**
     * Aggiunge la descrizione di una bevanda al
     * distributore.
     * @param cod codice della bevanda (1 carattere)
     * @param nome nome della bevanda
     * @param prezzo prezzo della bevanda
     */
    public void aggiungiBevanda(String cod, String nome, double prezzo) {
        bevande.add(new Bevanda(cod,nome,prezzo));
        System.out.println("Bevanda Aggiunta");
    }
    /**
     * Restituisce il prezzo della bevanda corrispondente
     * al codice dato
     * @param code il codice della bevanda
     * @return prezzo della bevanda
     * @throws BevandaNonValida nel caso in cui il codice
     * 			non corrisponda ad alcuna bevanda
     */
    public double getPrice(String code) throws BevandaNonValida {
        for(Bevanda b:bevande){
            if(b.getCodice().equals(code)){
                return b.getPrezzo();
            }
        } throw new BevandaNonValida("Codice non valido");


    }

    /**
     * Restituisce il nome della bevanda corrispondente
     * al codice dato
     * @param code il codice della bevanda
     * @return nome della bevanda
     * @throws BevandaNonValida nel caso in cui il codice
     * 			non corrisponda ad alcuna bevanda
     */
    public String getName(String code) throws BevandaNonValida {
        for(Bevanda b:bevande){
            if(b.getCodice().equals(code)){
                return b.getBevanda();
            }
        } throw new BevandaNonValida("Codice non valido");
    }

    /**
     * Carica una tessera specificando il codice ed il credito
     */
    public void caricaTessera(int codice, double credito) {
        crediti.add(new Credito(codice,credito));
        System.out.println("Tessere caricata");
    }

    /**
     * Resituisce il credito corrispondente ad una tessera
     * @param codice il codice della tessera
     * @throws TesseraNonValida nel caso in cui il codice non sia valido
     */
    public double leggiCredito(int codice) throws TesseraNonValida {
        for(Credito c:crediti){
            if(c.getCodice()==codice){
                return c.getCreditoDisponibile();
            }
        }throw new TesseraNonValida();

    }

    /**
     * Aggiorna il contenuto di una colonna di lattine del
     * distributore di bevante
     * @param numeroColonna
     * @param nomeBevanda
     * @param numeroLattine
     */
    public void aggiornaColonna(int numeroColonna, String nomeBevanda, int numeroLattine) {
        try{
            if(approvigionamentoDistributores.size()<=4){
                approvigionamentoDistributores.add(new ApprovigionamentoDistributore(numeroColonna,nomeBevanda,numeroLattine));
                System.out.println("Colonna Aggiornata");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Resituisce il numero di lattine disponibili per un dato
     * codice di bevanda
     * @throws BevandaNonValida se il codice della bevanda non � valido
     */
    public int lattineDisponibili(String code) throws BevandaNonValida {
        int quantita=0;
        for(Bevanda b:bevande){
           for(ApprovigionamentoDistributore a:approvigionamentoDistributores){
               if(b.getCodice().equals(code) && b.getBevanda().equals(a.getNomeBibita())){
                   quantita+= a.getLattine();
               }
           }
        } return quantita;
    }

    /**
     * Eroga la bevanda verificando le condizioni necessarie
     * @return il codice della colonna da cui prelevare la lattina
     */
    public int eroga(String codiceBevanda, int codiceTessera)  throws BevandaNonValida, BevandaEsaurita, TesseraNonValida, CreditoInsufficiente {
        int quantita;
        for(Bevanda b:bevande){
            for(Credito c:crediti){
                for(ApprovigionamentoDistributore a:approvigionamentoDistributores){
                    if(b.getCodice().equals(codiceBevanda) && c.getCodice()==codiceTessera){
                        if( c.getCreditoDisponibile()>=b.getPrezzo() && b.getBevanda().equals(a.getNomeBibita()) && a.getLattine()>=1){
                            c.setCreditoDisponibile(c.getCreditoDisponibile()-b.getPrezzo());
                            a.setLattine(a.getLattine()-1);
                            quantita=a.getNumColonna();
                            return quantita;
                        }
                    }
                }

            }
        }
        throw new BevandaNonValida();

    }
}
