package it.ecubit.contatto.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;



@NoArgsConstructor

public class Contatto {

    private long id;

    @NotEmpty(message = "Inserisci il nome")
    private String utente;

    @NotEmpty(message = "Inserisci il telefono")
    @Size(min = 2, max = 256, message = "il nome deve essere tra 2 e 256 caratteri")
    private String telefono;

    public Contatto(long id, String utente, String telefono) {
        this.id = id;
        this.utente = utente;
        this.telefono = telefono;
    }

    public Contatto() {

    }

    public Contatto(String utente, String telefono) {
        this.utente = utente;
        this.telefono = telefono;
    }

    public long getId() {
        return id;
    }

    public String getUtente() {
        return utente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUtente(String utente) {
        this.utente = utente;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
