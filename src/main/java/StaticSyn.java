public class StaticSyn {
    public static void main(){
        Display d1 = new Display();
        Display d2 = new Display();
        MyThread t1 = new MyThread(d1, "Dhonu");
        MyThread t2 = new MyThread(d2, "sofia");
        t1.start();
        t2.start();
    }
}

class Display {

    public static synchronized void wish(String name) {

        for (int i = 0; i < 3; i++) {
            System.out.println("Good Morning");
            System.out.println(name);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
    class MyThread extends Thread{
        Display d;
        String name;

        MyThread (Display d, String name){
            this.d=d;
            this.name=name;
        }
        public void run(){
            d.wish(name);
        }
    }




