package ba.unsa.etf.rpr;

public class Artikl {
    String naziv_artikla, kod_artikla;
    int cijena_artikla;
    public Artikl(String naziv_art, int cijena_art, String kod_art) {
        naziv_artikla = naziv_art;
        cijena_artikla = cijena_art;
        kod_artikla = kod_art;
    }

    public String getNaziv() {
        return naziv_artikla;
    }

    public String getKod() {
        return  kod_artikla;
    }

    public int getCijena() {
        return  cijena_artikla;
    }
}
