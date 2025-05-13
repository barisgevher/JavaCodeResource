public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel,  boolean duplex) {
//        if (tonerLevel < 0){
//            System.out.println("Toner level cannot below 0");
//            tonerLevel = 0;
//        } else if (tonerLevel > 100) {
//            System.out.println("Toner level cannot be greater than 100");
//        }

//        this.pagesPrinted = pagesPrinted;

        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
//       tonerLevel += tonerAmount;
//       if (tonerLevel > 100){
//           return  -1;
//       }else {
//           return tonerLevel;
//       }
        int tempAmount = tonerAmount + tonerLevel;
        if (tempAmount > 100 || tempAmount < 0){
            return -1;
        }
        tonerLevel += tonerAmount;
        return tonerLevel;
    }

    public int printPages(int pages){
//      if (duplex){
//          System.out.println("it is a duplex printer");
//          return pagesPrinted + (pages / 2 );
//      }else{
//          return  pagesPrinted + pages;
//      }
        int jobPages = (duplex) ? (pages / 2) + (pages % 2) : pages;
        pagesPrinted += jobPages;
        return jobPages;

    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
