public class Main {
    public static void main(String[] args) throws InterruptedException {
        Box box = new Box();
        Toy toy = new Toy(box);
        User user = new User(box,3,5000);

        Thread userThread = new Thread(user);
        Thread toyThread = new Thread(toy);

        userThread.start();
        toyThread.start();

        userThread.join();
        toyThread.interrupt();
        System.out.println("----------------------------");
    }
}
