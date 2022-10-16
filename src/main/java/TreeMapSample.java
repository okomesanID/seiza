import java.time.MonthDay;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapSample {

    public static void main(String args[]) {
    	

		 MonthDay a= MonthDay.of(3,31);
		 
	      TreeMap<MonthDay, String> lastDayOfSeiza = new TreeMap<>(
	    		  
	         Map.ofEntries(Map.entry(MonthDay.of(1, 19), "山羊座"), Map.entry(MonthDay.of(2, 18), "水瓶座"),
	                        Map.entry(MonthDay.of(3, 20), "魚座"), Map.entry(MonthDay.of(4, 19), "牡羊座"),
	                        Map.entry(MonthDay.of(5, 20), "牡牛座"), Map.entry(MonthDay.of(6, 21), "双子座"),
	                        Map.entry(MonthDay.of(7, 22), "蟹座"), Map.entry(MonthDay.of(8, 22), "しし座"),
	                        Map.entry(MonthDay.of(9, 22), "乙女座"), Map.entry(MonthDay.of(10, 23), "てんびん座"),
	                        Map.entry(MonthDay.of(11, 22), "蠍座"), Map.entry(MonthDay.of(12, 21), "射手座"),
	                        Map.entry(MonthDay.of(12, 31), "山羊座")
	                        ));
	      
			System.out.println(lastDayOfSeiza.ceilingEntry(a).getValue());
    }

}
