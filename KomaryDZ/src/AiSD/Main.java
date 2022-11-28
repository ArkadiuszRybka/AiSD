package AiSD;

public class Main {
    static int poczPop = 1000;
    static int chlopy = 450;
    static int baby = 550;
    static int tydzien=1;
    static double licz(double populacja, double chlopy, double baby){
        if(chlopy>=baby) {
            System.out.println("Populacja: "+(int)populacja);
            System.out.println("Chlopy: "+(int)chlopy);
            System.out.println("Baby: "+(int)baby);
            return tydzien;
        }
        else {
            tydzien++;
            chlopy = chlopy*0.98+populacja*0.1;
//            System.out.println("Chłopy: "+chlopy);
            baby = baby*0.95+populacja*0.1;
//            System.out.println("Baby: "+baby);
            return licz(chlopy+baby, chlopy, baby);
        }
    }
    public static void main(String[] args) {
        System.out.println(licz(1000,450,550));
    }
}
