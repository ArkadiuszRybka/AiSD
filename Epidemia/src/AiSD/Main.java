package AiSD;

public class Main {
    public static void main(String[] args) {
        System.out.println("epidemia skonczy sie po  " + wynik(10) + " dniach i tego dnia bedzie najwiecej chorych. ");

    }


    public static int wynik(int zakazeni) {
        int zdrowi=0;
        int wyzdrowiali=0;
        int dzien=1;
        int[] tab=new int[50];
        tab[1]=zakazeni;
        for(int i=2; (tab[i-1]/2) * 3 < 100000 - zdrowi;i++){
            if(dzien<8){
                tab[i]= tab[i-1]/2+(tab[i-1]/2) * 3;

                dzien++;
            }
            else if(dzien>=8){
                wyzdrowiali=tab[dzien-7]-tab[dzien-8];
                tab[i]=tab[i-1]/2+(tab[i-1]/2) * 3 - wyzdrowiali;
                zdrowi+=wyzdrowiali;
                dzien++;
            }
            System.out.println("--" + tab[i]);
            System.out.println(zdrowi + " ==");
            if(tab[i]>100000/2) System.out.println("Liczba chorych przekracza polowe w dniu: " + (dzien) + " i wynosi: " + tab[i]);
        }
        return dzien;
    }
}