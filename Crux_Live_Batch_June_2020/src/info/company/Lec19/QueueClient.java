package info.company.Lec19;

public class QueueClient {

    public static void main(String[] args) {

        Optimizedqueue queue = new Optimizedqueue();

        for (int i = 0; i <=10 ; i++) {
            queue.insert(i);
        }

        for (int i = 0; i <10 ; i++) {
            System.out.println(queue.delete());

        }

        System.out.println(queue.delete());


    }
}
