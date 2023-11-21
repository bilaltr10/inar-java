package week_10.Q_10;

public class test {

    public static void main(String[] args) {
        Queue queue = new Queue();

        for (int i = 0; i <= 20; i++) {
            queue.enqueue(i);
        }
        int[] list = queue.showTheList();


        for (int i = 0; i < queue.getSize(); i++) {
            System.out.print(list[i] + " ");
        }


        System.out.println("\nProcess of dequeue");
        int i = 0;
        while (i < queue.getSize()) {
            System.out.print(queue.dequeue() + " ");
        }

        System.out.println("\nNew list");
        queue.makeTheListDefault();
        int[] list2 = queue.showTheList();
        for (i = 0; i < list2.length; i++) {
            System.out.print(list2[i] + "  ");
        }

    }
}
