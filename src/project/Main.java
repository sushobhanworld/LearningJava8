package project;

import java.text.ParseException;
import java.util.*;

import static project.ItemsPriceRate.*;

public class Main {
    public static void main(String[] args) throws ParseException, InvalidWholeSaleException {
        // Peter purchase
        Map<String,Integer> peterPurchase= new HashMap<>();
        peterPurchase.put("BAT",3);
        peterPurchase.put("BALL",8);
        peterPurchase.put("STUMP",1);

        // Sushobhan purchase
        Map<String,Integer> sushobhanPurchase= new HashMap<>();
        sushobhanPurchase.put("BAT",1);
        sushobhanPurchase.put("BALL",4);
        sushobhanPurchase.put("STUMP",3);

        // Ram purchase
        Map<String,Integer> ramPurchase= new HashMap<>();
        ramPurchase.put("BAT",5);
        ramPurchase.put("BALL",3);
        ramPurchase.put("STUMP",2);

        Purchase p1= new Purchase(1, "12-12-2012","Peter", peterPurchase);
        Purchase p2= new Purchase(2, "07-10-2017","Sushobhan", sushobhanPurchase);
        Purchase p3= new Purchase(3, "10-11-2015","Ram", ramPurchase);

        List<Purchase> purchaseList= new ArrayList<>();
        purchaseList.add(p1);
        purchaseList.add(p2);
        purchaseList.add(p3);

        System.out.println("******** Before Sort *********");
        purchaseList.forEach(System.out::println);

        System.out.println("******** After Sort *********");
        Collections.sort(purchaseList, Comparator.comparingDouble(amount -> amount.getTotalAmount()));
        purchaseList.forEach(System.out::println);


        System.out.println("*******************************************************************************************************************************************************");

        // Peter purchase
        System.out.println("Peter purchase..............");
        System.out.println(p1.getId()+","+p1.getPurchaseDate()+","+p1.getUsername()+","+"BAT"+","+p1.itemsPurchase.get("BAT")*BAT_PRICE_RATE+","+p1.itemsPurchase.get("BAT")+","+"BALL"+","+p1.itemsPurchase.get("BALL")*BALL_PRICE_RATE+","+p1.itemsPurchase.get("BALL")+","+"STUMP"+","+p1.itemsPurchase.get("STUMP")*STUMP_PRICE_RATE+","+p1.itemsPurchase.get("STUMP"));
        System.out.println("------------------------------------------------");
        System.out.println("Sushobhan purchase..............");
        System.out.println(p2.getId()+","+p2.getPurchaseDate()+","+p2.getUsername()+","+"BAT"+","+p2.itemsPurchase.get("BAT")*BAT_PRICE_RATE+","+p2.itemsPurchase.get("BAT")+","+"BALL"+","+p2.itemsPurchase.get("BALL")*BALL_PRICE_RATE+","+p2.itemsPurchase.get("BALL")+","+"STUMP"+","+p2.itemsPurchase.get("STUMP")*STUMP_PRICE_RATE+","+p2.itemsPurchase.get("STUMP"));
        System.out.println("------------------------------------------------");
        System.out.println("Ram purchase..............");
        System.out.println(p3.getId()+","+p3.getPurchaseDate()+","+p3.getUsername()+","+"BAT"+","+p3.itemsPurchase.get("BAT")*BAT_PRICE_RATE+","+p3.itemsPurchase.get("BAT")+","+"BALL"+","+p3.itemsPurchase.get("BALL")*BALL_PRICE_RATE+","+p3.itemsPurchase.get("BALL")+","+"STUMP"+","+p3.itemsPurchase.get("STUMP")*STUMP_PRICE_RATE+","+p3.itemsPurchase.get("STUMP"));

    }
}
