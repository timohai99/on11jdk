package uchiJavaChak;

public class test111 {
    int summa (int a, int b, int c) {
        int result = a+b+c;
        return result;
    }
}
class test {
    public static void main(String[] args) {
        test111 d = new test111();
        d.summa(12, 11,22);
        int summaTrexChisel = d.summa(12,11,11);
        System.out.println(summaTrexChisel);
    }
}
