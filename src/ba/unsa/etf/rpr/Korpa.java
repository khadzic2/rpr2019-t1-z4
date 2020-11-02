package ba.unsa.etf.rpr;

public class Korpa {
    Artikl[] niz_artikala = new Artikl[50];
    int max_broj_artikala = 0;
    public boolean dodajArtikl(Artikl a) {
        if(max_broj_artikala < 50){
            niz_artikala[max_broj_artikala] = new Artikl(a.getNaziv(),a.getCijena(),a.getKod());
            max_broj_artikala = max_broj_artikala + 1;
            return  true;
        }
        return  false;
    }

    public Artikl[] getArtikli() {
        return niz_artikala;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for(int i = 0; i < max_broj_artikala; i++){
            if(niz_artikala[i].getKod().equals(kod)){
                Artikl novi = new Artikl(niz_artikala[i].getNaziv(),niz_artikala[i].getCijena(),niz_artikala[i].getKod());
                niz_artikala[i] = null;

                int j = i;
                while (j < max_broj_artikala - 1) {
                    niz_artikala[j] = niz_artikala[j + 1];
                    j++;
                }

                niz_artikala[max_broj_artikala] = null;
                max_broj_artikala = max_broj_artikala - 1;
                return  novi;
            }
        }
        return  null;
    }

    public int dajUkupnuCijenuArtikala() {
        int ukupna_cijena = 0;
        for(int i = 0; i < max_broj_artikala; i++)
            ukupna_cijena = ukupna_cijena + niz_artikala[i].getCijena();
        return ukupna_cijena;
    }
}
