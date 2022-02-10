import java.util.ArrayList;

public class NewsAgency implements Observer, Subject{

    OlympicsWire olympicsWire;
    String agencyName;
    NewsItem newsItem;
    ArrayList <Observer> observers;

    public NewsAgency(String name, OlympicsWire ow){
        this.agencyName = name;
        this.olympicsWire = ow;
        this.observers = new ArrayList<Observer>();
        ow.registerObserver(this);
    }
    @Override
    public void update(NewsItem n) {
        this.newsItem = n;
        notifyObservers(n);
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if(observers.contains(o)){
            observers.remove(observers.indexOf(o));
        }
    }

    @Override
    public void notifyObservers(NewsItem n) {
        for (Observer observer : observers){
            observer.update(n);
        }
    }
}
