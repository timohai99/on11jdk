package uchiJavaChak;

public class dz4 {


}
class student {
    int nomer;
    String name;
    String family;
    int year;
    int math;
    int aconomy;
    int language;

    int srednee (int a, int b, int c) {
        int res = (a+b+c)/3;
        return res;

    }


}
class StudentTest {
    public static void main(String[] args) {
        student Ivan = new student();
        student Sveta = new student();
        student Vlad = new student();

        Ivan.nomer = 1;
        Sveta.nomer = 2;
        Vlad.nomer = 3;

        Ivan.family = "Pavlov";
        Sveta.family = "Horly";
        Vlad.family = "Boo";

        Ivan.year = 23;
        Sveta.year = 22;
        Vlad.year = 29;

        Ivan.math = 3;
        Ivan.aconomy = 5;
        Ivan.language = 4;

        int im = Ivan.math;
        int ia = Ivan.aconomy;
        int il = Ivan.language;

        Sveta.math = 5;
        Sveta.aconomy = 3;
        Sveta.language = 5;


        Vlad.math = 2;
        Vlad.aconomy = 3;
        Vlad.language = 3;

        int vm = Vlad.math;
        int va = Vlad.aconomy;
        int vl = Vlad.language;

        student c1 = new student();
        int ccc = c1.srednee(Ivan.math, Ivan.aconomy, Ivan.language);

        student c2 = new student();
        int qqq = c2.srednee(Sveta.math, Sveta.aconomy, Sveta.language);

        student c3 = new student();
        int rrr = c3.srednee(Vlad.math, Vlad.aconomy, Vlad.language);

        System.out.println("средняя оценка Иванушки " + ccc);
        System.out.println("средняя оценка Светки " + qqq);
        System.out.println("средняя оценка Владика " + rrr);



     //   System.out.println(Ivan.nomer + "." +" Ivan " + Ivan.family + " " + Ivan.year + " years " + "- ochenka " + (im + ia + il)/3);
     //   System.out.println(Sveta.nomer + "." + " Sveta " + Sveta.family + " " + Sveta.year + " years " + "- ochenka " + (Sveta.math + Sveta.aconomy + Sveta.language)/3);
     //   System.out.println(Vlad.nomer + "." + " Vlad " + Vlad.family + "   " + Vlad.year + " years " + "- ochenka " + (vm + va + vl)/3);
    }
}