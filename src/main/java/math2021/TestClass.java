package math2021;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestClass {
    List<Character> alphabet = Arrays.asList(
            'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
            'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
            'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
            'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

    public static void main(String[] args) {
        Character chacha = 'а';
        String srastra = "фыоллфтик лкриофвыавкрлефорлкуцкцссаацуй";
        System.out.println(srastra.indexOf(chacha, 19));
        List <String> vasya = new ArrayList<>();
        vasya.add("aadadad");
        vasya.add("fjjgerojw");
        vasya.add("kdjfghwnfsf");

        for (String s:
             vasya) {
            System.out.println(s);
        }
        Object obj = new Object();
    }
}
