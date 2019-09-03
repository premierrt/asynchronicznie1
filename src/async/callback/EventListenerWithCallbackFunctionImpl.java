package async.callback;

public class EventListenerWithCallbackFunctionImpl implements EventListenerWithCallbackFunction {
    @Override
    public void callbackFunction() {
        System.out.println("Funkcja callback - wykona sie po zakonczeniu taska asynchronicznego");
    }
}

