package exception;

public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();

        System.out.println((int) 'z');

        for (int i = 0; i < 5; i++) {
            String str = "";
            int a = 0;
            while (a != 5) {
                str += (char) ((Math.random() * 25) + 97);
                a++;
            }
            list.add(str);
        }

        System.out.println(list);

        list.remove(0);
        System.out.println(list);
        list.add(0, "sşdlsiş");
        System.out.println(list);
        System.out.println(list.get(4));
        System.out.println("index of :" + list.indexOf("sşdlsiş"));
        System.out.println(list.contains("ali"));
        //    list.clear();
        java.util.Collections.sort(list);
        System.out.println(list);

    }
}
