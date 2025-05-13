public class SideItem {

    private String type;
    private int size;
    private  double price;

    public SideItem(String type, int size) {
        this.type = type;
        this.size = size;
       switch (size){
           case 1 -> this.price = 1.0d;
           case 2 -> this.price = 2.0d;
           case 3 -> this.price = 3.0d;
       }


    }

    public double getPrice() {
        return price;
    }
}
