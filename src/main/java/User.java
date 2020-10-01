public class User implements Runnable {
    private Box box;
    private int count;
    private int freezeTime;

    public User(Box box, int count, int freezeTime) {
        this.box = box;
        this.count = count;
        this.freezeTime = freezeTime;
    }

    public void run() {
        for (int i = 0; i < count; i++) {
            try {
                box.setStatus(true);
                System.out.println("> пользователь: открыл коробку");
                Thread.sleep(freezeTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
