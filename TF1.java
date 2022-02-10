import java.util.ArrayList;

public class TF1 implements Channel, Observer{

    ArrayList<NewsAgency> agencies;
    public TF1 (ArrayList<NewsAgency> agencies){
        this.agencies = agencies;
        for (NewsAgency agency : agencies){
            agency.registerObserver(this);
        }
    }
    @Override
    public void display(NewsItem n) {
        if(n.country.equals("France"))
            System.out.println("TF1 reports: " + n.toString());
    }
    @Override
    public void update(NewsItem n) {
        display(n);
    }
}
