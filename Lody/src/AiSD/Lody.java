public class Lody {

    final static int N = 6; // permutacje n-elementowe
    private static int[] L = new int[N];
    static int[][] mapa= {
            {0,7,20,21,12,23},
            {27,0,13,16,46,5},
            {53,15,0,25,27,6},
            {16,2,35,0,47,10},
            {31,29,5,18,0,4},
            {28,24,1,17,5,0}

    };
    static int min=600;
    static int pom=0;
    static String smaki=" ";
    static String najKolejnosc=" ";
    static String wynik=" ";
    static int ostatnie=0;
    public static void main(String[] args) {
        permutacje(0);
        System.out.println(wynik);
    }

    static void permutacje(int i) {

        if (i == N) {

            for (int j = 0; j < N-1; j++) {
                if(mapa[L[j+1]-1][L[0]-1]!=-1) {
                    ostatnie = mapa[L[j + 1] - 1][L[0] - 1];
                    //System.out.print(mapa[L[j]-1][L[j+1]-1]+ " ");
                    pom += mapa[L[j] - 1][L[j + 1] - 1];
                    smaki += L[j] + " ";
                }
            }
            smaki+=L[N-1]+ " ";
            smaki+=L[0];
            pom+=ostatnie;
            if(min>pom) {min=pom; najKolejnosc=smaki;}
            pom=0;
            smaki=" ";
        }
        else {
            for (int j = 1; j <= N; j++) // j - element do wstawienia do tablicy
            {
                int k; // index tablicy (miejsce wstawienia wartosci j)
                for (k = 0; k < i; k++) {
                    if (L[k] == j) {
                        break;
                    }
                }
                if (k == i) {
                    L[k] = j;
                    permutacje(i + 1);
                }
            }
        }
        wynik="Czas: " + min + " smaki: " + najKolejnosc;
    }
}