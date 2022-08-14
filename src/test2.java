public class test2 {
    public static void main(String[] args) {
        int beernum = 99;
        String word = "бутылок";

        while (beernum > 0) {
            if (beernum == 1) {
                word = "бутылка";
            }
            if (beernum == 2) {
                word = "бутылки";
            }
            if (beernum == 3) {
                word = "бутылки";
            }
            if (beernum == 4) {
                word = "бутылки";
            }

            System.out.println(beernum + " " + word + " пива.");
            System.out.println("Возьми одну");
            System.out.println("Пусти по кругу.");
            beernum = beernum - 1;
            if (beernum > 0) {
                System.out.println(beernum + " " + word + " пивА на стене");
            }
            else {
                System.out.println("Нет бутылок пива на стене!");
            }


        }
    }
}
