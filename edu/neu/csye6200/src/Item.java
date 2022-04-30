package neu.csye6200.src;

import java.util.List;

public class Item extends AbstractItemAPI{

    private static abstract class AbstractFactoryAPI{
        public  abstract void addItem(String items, List<Item> itemList);
    }

    public static class AbstractItemFactory extends AbstractFactoryAPI{
        public static AbstractItemFactory instance;
        public  AbstractItemFactory getInstance() {
            if (instance == null) {
                instance =  new AbstractItemFactory();
            }
            return instance;
        }

        @Override
        public void addItem(String items, List<Item> itemList) {
            String[] s=items.split(",");
            itemList.add(new Item(Integer.parseInt(s[0]),s[1],Double.parseDouble(s[2])));
        }
    }

    public int itemId;
    public String itemName;
    public Double itemPrice;

    public Item(int itemId, String itemName, Double itemPrice) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    @Override
    public String toString() {
        return "Item{ " +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                " } ";
    }
}
