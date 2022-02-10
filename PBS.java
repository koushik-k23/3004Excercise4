import java.util.ArrayList;

public class PBS implements Channel,Observer{

    ArrayList<NewsAgency> agencies;
    public  PBS(ArrayList<NewsAgency> agencies){
        this.agencies = agencies;
        for (NewsAgency agency : agencies){
            agency.registerObserver(this);
        }
    }
    @Override
    public void display(NewsItem n) {
        if(n.time.equals("AM"))
            System.out.println("PBS reports: " + n.toString());
    }

    public void update(NewsItem n) {
        display(n);
    }
}
