//Use itewrators with a Hashtable.
import java.util.*;
public class HTDemo2 {
    public static void main(String[] args) {
        Hashtable<String, Double> balance= new Hashtable<String,Double>();
        String str;
        double bal;
        balance.put("A",4563.34);
        balance.put("B",123.22);
        balance.put("C",1356.88);
        balance.put("D",86.34);
        balance.put("E",-19.08);
        //Show all balances in hashtable,
        //First, get a set view of the keys.
        Set<String> set = balance.keySet();
        //Get an iterator
        Iterator<String> itr =set.iterator();
        while(itr.hasNext())
        {
            str= itr.next();
            System.out.println(str+":"+balance.get(str));
        }
        System.out.println();
        //Deposit 1000 into A's account
        bal = balance.get("A");
        balance.put("A",bal+1000);
        System.out.println("A's new balance:"+ balance.get("A"));
    }

}
