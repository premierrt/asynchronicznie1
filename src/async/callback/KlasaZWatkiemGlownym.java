package async.callback;

/**
 *
 */
public class KlasaZWatkiemGlownym {

    private EventListenerWithCallbackFunction eventListener;
    public void metodaGlowna(){
        System.out.println("===Metoda Główna === To jest metoda glowna ");

        Runnable runnable = () ->{
          System.out.println(">>>Wątek do wykonania zadania async");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
          eventListener.callbackFunction();
        };
        Thread t1 = new Thread(runnable);
        t1.start();


        System.out.println("===Metoda Główna === Tutaj konczy sie metoda glowna");
    }

    public void setEventListener(EventListenerWithCallbackFunction eventListener) {
        this.eventListener = eventListener;
    }
}
