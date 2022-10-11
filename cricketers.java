public class cricketers {
    String cname;
    int total_runs;
    int total_matches;

    cricketers()  //default construter
    {
        cname="Raina";
        total_runs=5000;
        total_matches=20;
    }
    cricketers(String cname,int total_runs,int total_matches) // paramater argument constructer
    {
        this.cname=cname;
        this.total_runs=total_runs;
        this.total_matches=total_matches;
    }


    public void setCricketer(String cname,int total_runs,int total_matches)  // parametric argument method
    {
        this.cname=cname;
        this.total_runs=total_runs;
        this.total_matches=total_matches;
    }
    public double calculateAvg()
    {
        double avg=(double)total_runs/total_matches;
        return avg;
    }
}
