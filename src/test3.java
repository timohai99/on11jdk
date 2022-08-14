public class test3 {
    public static void main(String[] args) {
        int x = 3;
        while (x > 0) {
            x = x - 1;
            System.out.println("  работаю  ");

            if (x == 1) {
                System.out.print("Q");
                x = x - 1;
            }
        }
    }
}

