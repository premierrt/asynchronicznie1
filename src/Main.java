import async.callback.EventListenerWithCallbackFunction;
import async.callback.EventListenerWithCallbackFunctionImpl;
import async.callback.KlasaZWatkiemGlownym;

public class Main {
    public static final void main(String[] arg){
        KlasaZWatkiemGlownym glowny = new KlasaZWatkiemGlownym();
        EventListenerWithCallbackFunction callback = new EventListenerWithCallbackFunctionImpl();
        glowny.setEventListener(callback);
        glowny.metodaGlowna();

    }
}
