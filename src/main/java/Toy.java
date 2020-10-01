public class Toy implements Runnable {
    private Box box;

    public Toy(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        Thread currentThread = Thread.currentThread();
        while (!currentThread.isInterrupted()) {
            if (box.getStatus()) {
                box.setStatus(false);
                System.out.println("> игрушка: закрыла коробку");
            }
        }
        currentThread.interrupt();
    }
}
