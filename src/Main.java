import async.callback.EventListenerWithCallbackFunction;
import async.callback.EventListenerWithCallbackFunctionImpl;
import async.callback.KlasaZWatkiemGlownym;

public class Main {
    public static void main(){
        KlasaZWatkiemGlownym glowny = new KlasaZWatkiemGlownym();
        EventListenerWithCallbackFunction callback = new EventListenerWithCallbackFunctionImpl();
        glowny.setEventListener(callback);
        glowny.metodaGlowna();

    }
}
