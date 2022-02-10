import java.util.*;
public class OlympicsWire implements Subject{

    ArrayList <Observer> Observers;
    public OlympicsWire(){
        Observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        Observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if(Observers.contains(o)){
            Observers.remove(Observers.indexOf(o));
        }
    }

    @Override
    public void notifyObservers(NewsItem n) {
        System.out.println("New Olympic News Item!!");
        for (Observer o : Observers){
            o.update(n);
        }

    }

    public void broadcast(NewsItem newsItem){
        notifyObservers(newsItem);
    }
}
