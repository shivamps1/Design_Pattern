package Head_ObserverDesignPattern;

public interface Subject {

    void registerObserver(Observer obj);
    void removeObserver(Observer obj);
    void notifyObserver();
}
