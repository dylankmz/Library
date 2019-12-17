package be.bib.model;

public class Boek extends Item {

    public Boek(long id, String titel, String genre, int aantal, int uitgeleend) {
        super(id, titel, genre, aantal, uitgeleend);
    }

    private String isbn;
    private String auteur;

    public Boek(long id, String titel, String genre, int aantal, int uitgeleend, String isbn, String auteur) {
        super(id, titel, genre, aantal, uitgeleend);
        this.isbn = isbn;
        this.auteur = auteur;
    }


}
