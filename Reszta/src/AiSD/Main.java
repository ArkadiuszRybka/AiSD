package AiSD;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int [] monety={500,200,100,50,20,10,5,2,1};
        int[] ilosc={7,0,1,1,4,1,4,7,30};
        int zl,gr,r=0,i=0;
        Scanner podaj = new Scanner(System.in);
        System.out.println("zlotych: ");
        zl=podaj.nextInt();
        System.out.println("groszy: ");
        gr=podaj.nextInt();
        r=zl*100 + gr;
        while(r>0 && i<ilosc.length){
            if(r>=monety[i] && ilosc[i]>0) {
                System.out.print(monety[i]/100.0 + ", ");
                r-=monety[i];
                ilosc[i]--;
            }
            else {
                i++;
            }
        }
        if(r>0) System.out.println("\n Nie wyplacono: " + r/100.0);
    }
}
