import java.util.ArrayList;

public class CBC implements Channel,Observer{

    ArrayList<NewsAgency> agencies;
    public CBC (ArrayList<NewsAgency> agencies){
        this.agencies = agencies;
        for (NewsAgency agency : agencies){
            agency.registerObserver(this);
        }
    }
    @Override
    public void display(NewsItem n) {
        System.out.println("CBC reports: " + n.toString());
    }

    @Override
    public void update(NewsItem n) {
        display(n);
    }
}
