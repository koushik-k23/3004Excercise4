import java.util.ArrayList;

public class CBS implements Channel, Observer{

    ArrayList<NewsAgency> agencies;
    public CBS (ArrayList<NewsAgency> agencies){
        this.agencies = agencies;
        for (NewsAgency agency : agencies){
            agency.registerObserver(this);
        }
    }
    @Override
    public void display(NewsItem n) {
        if(n.country.equals("US"))
            System.out.println("CBS reports: " + n.toString());
    }

    @Override
    public void update(NewsItem n) {
        display(n);
    }
}
