package AiSD;

public class Main {

    public static void main(String[] args) {
        int N=6;
        System.out.println(ciag(N));
        System.out.println(ciag2(N));
    }
    //DZIEL I ZWYCIEZAJ
    static int ciag(int n){
        if(n==1 || n==2) return 1;
        if(n>2 && n%3==0) return 2*ciag(n-1);
        if(n>2 && n%3==1) return ciag(n-2)*ciag(n-2);
        if(n>2) return (int) Math.pow(2,ciag(n-3));
        return 0;
    }
    //PROGRAMOWANIE DYNAMICZNE
    static int ciag2(int n){
        int [] tab = new int[n+1];
        tab[1]=1;
        tab[2]=1;
        for (int i=3;i<tab.length;i++){
            if(i%3==0) tab[i]=tab[i-1] * 2;
            if(i%3==1) tab[i]=tab[i-2]*tab[i-2];
            if(i%3==2) tab[i]= (int) Math.pow(2,tab[i-3]);
        }
        return tab[n];
    }
}
