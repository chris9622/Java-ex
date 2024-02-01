package sanita;

import java.util.ArrayList;
import java.util.HashSet;

public class Sanità implements Medici {

    private ArrayList<Paziente> pazientiList;
    private ArrayList<Medico> mediciList;

    private ArrayList<Persona> personeArrayList;

    public Sanità() {
        this.pazientiList = new ArrayList<>();
        this.mediciList = new ArrayList<>();
        this.personeArrayList=new ArrayList<>();

    }

    public ArrayList<Paziente> getPazientiList() {
        return pazientiList;
    }

    public ArrayList<Medico> getMediciList() {
        return mediciList;
    }

    public void setPazientiList(ArrayList<Paziente> pazientiList) {
        this.pazientiList = pazientiList;
    }

    public void setMediciList(ArrayList<Medico> mediciList) {
        this.mediciList = mediciList;
    }

    public ArrayList<Paziente> aggiungiPersona(String nome,String cognome, String codiceFiscale ){
        pazientiList.add(new Paziente(nome,cognome,codiceFiscale));
        return pazientiList;
    }

    public Paziente getPersona(String code) throws ErrPersonaInesistente {
        for(int i=0;i<pazientiList.size();i++){
            if(pazientiList.get(i).getCodiceFiscale()!=null){
                return pazientiList.get(i);
            }
        }
        throw new ErrPersonaInesistente();
    }

    public ArrayList<Medico> aggiungiMedico(String nome, String cognome, String codiceFiscale, String matricola){
        mediciList.add(new Medico(nome,cognome,codiceFiscale,matricola));
        return mediciList;
    }

    @Override
    public Medico getMedico(String matricola) throws ErrMedicoInesistente {
        for(int i=0;i<mediciList.size();i++){
            if(mediciList.get(i).getMatricola()!=null){
                return mediciList.get(i);
            }
        }throw  new ErrMedicoInesistente();
    }

    public ArrayList<Persona> assegnaMedico(String matricola, String codiceFiscale) throws ErrMedicoInesistente, ErrPersonaInesistente {
        for(int i=0;i<mediciList.size();i++){
            for(int j=0;j<pazientiList.size();j++){
                if(mediciList.get(i).getMatricola().equals(matricola) || pazientiList.get(j).getCodiceFiscale().equals(codiceFiscale)){
                    personeArrayList.add(getMedico(matricola));
                    personeArrayList.add(getPersona(codiceFiscale));
                    return  personeArrayList;
                }
            }
        } return  null;
    }

    @Override
    public String getMatricola() {
        return null;
    }

    @Override
    public HashSet<Paziente> getPazienti() {
        return null;
    }

    @Override
    public Medici getMedico() throws ErrMedicoInesistente {
        return null;
    }

    @Override
    public String getNome() {
        return null;
    }

    @Override
    public String getCognome() {
        return null;
    }
}
