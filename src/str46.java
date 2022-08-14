public class str46 {
    public static void main(String[] args) {
        String [] wordListOne = {"нивъебенный", "Ошеломительный", "сексопильный", "чмошный", "деревянный", "ебаньковый"};
        String [] wordListTwo = {"уполномоченный", "трудный", "чистый", "сетевой", "сфокусированный", "общий"};
        String [] wordListThree = {"процесс", "мутант", "баклан", "человек", "сникерс", "романтик"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne [rand1] + " " + wordListTwo [rand2] + " " + wordListThree [rand3];

        System.out.println("Всё что нам нужно, - это" + " " + phrase);
    }
}
