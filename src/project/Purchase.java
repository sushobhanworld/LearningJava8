package project;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class Purchase implements Comparable<Purchase>{
    public long id;
    public Date purchaseDate;
    public double totalAmount;
    public String username;
    public Map<String,Integer> itemsPurchase;

    public Purchase(long id, String date, String username,Map<String,Integer> itemsPurchase) throws ParseException, InvalidWholeSaleException {
        this.id = id;
        this.purchaseDate = formatDate(date);
        this.username = username;
        this.itemsPurchase = itemsPurchase;
        this.totalAmount = obtainPurchaseWithAmount();
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public long getId() {
        return id;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public String getUsername() {
        return username;
    }

    public Map<String, Integer> getItemsPurchase() {
        return itemsPurchase;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "id=" + id +
                ", purchaseDate=" + purchaseDate +
                ", totalAmount=" + totalAmount +
                ", username='" + username + '\'' +
                ", itemsPurchase=" + itemsPurchase +
                '}';
    }

    @Override
    public int compareTo(Purchase anotherPurchase) {
        return 0;
    }

    public double obtainPurchaseWithAmount() throws InvalidWholeSaleException {
        int totalQuantity = 0;
        double batPrice = 0;
        double ballPrice = 0;
        double stumpPrice = 0;

        for(Map.Entry<String,Integer> entry: itemsPurchase.entrySet()){
            totalQuantity= totalQuantity+ entry.getValue();
        }
        if(totalQuantity <5){
            throw new InvalidWholeSaleException("Purchase "+id+" is not a wholesale");
        }
        for(Map.Entry<String,Integer> entry: itemsPurchase.entrySet()){
            if(entry.getKey().equals("BAT"))
                batPrice= getBatPrice(entry);
            else if(entry.getKey().equals("BALL"))
                ballPrice= getBallPrice(entry);
            else if(entry.getKey().equals("STUMP"))
                stumpPrice= getStumpPrice(entry);
            else{
                throw new RuntimeException("Item name passed is not matching :"+entry.getKey());
            }
        }
        totalAmount= batPrice+ballPrice+stumpPrice;
        return totalAmount;
    }

    private double getBatPrice(Map.Entry<String, Integer> entry) {
        return entry.getValue()* ItemsPriceRate.BAT_PRICE_RATE;
    }

    private double getBallPrice(Map.Entry<String, Integer> entry) {
        return entry.getValue()* ItemsPriceRate.BAT_PRICE_RATE;
    }

    private double getStumpPrice(Map.Entry<String, Integer> entry) {
        return entry.getValue()* ItemsPriceRate.BAT_PRICE_RATE;
    }

    private Date formatDate(String date) throws ParseException {
        return new SimpleDateFormat("MM-dd-yyyy").parse(date);
    }
}
