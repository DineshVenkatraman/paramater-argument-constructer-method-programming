public class Main {
    public static void main(String[] args) {
        cricketers raina=new cricketers();
        System.out.println(raina.cname+" has avarage of "+raina.calculateAvg());

        cricketers kapildev=new cricketers("Kapil dav",6000,30);
        System.out.println(kapildev.cname+" has Average of "+kapildev.calculateAvg());

        cricketers sachin=new cricketers();
        sachin.setCricketer("Sachin Tendulkar",5000,35);
        System.out.println(sachin.cname+" has Average of "+sachin.calculateAvg());

        cricketers virat=new cricketers();
        virat.setCricketer("Virat Kohli",3000,24);
        System.out.println(virat.cname+" has Average of "+virat.calculateAvg());
    }
}