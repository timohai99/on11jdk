public class test {
    public static void main(String[] args) {
        int a = 99;
        System.out.println("99 бутылок пива на стене");
        System.out.println("99 бутылок пива, возьми одну, передай её другим");

        while (a > 1) {
            a = a - 1;
            System.out.println("Осталось" + "  " + a + "  " + "бутылок пива на стене");
            System.out.println("Возьми одну, передай её братве");
        }
        if (a == 1) {

            System.out.println("Вот и кончилось пивко)");
        }

    }
}
