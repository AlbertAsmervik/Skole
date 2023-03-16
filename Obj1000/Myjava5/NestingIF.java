public class NestingIF {
    public static void main(String[] args) {
        final int MIN_ITEMS = 5;
        final int MIN_VALUE = 1000;
        final int LARGE_BONUS = 50;
        final int MEDIUM_BONUS = 25;
        final int SMALL_BONUS = 10;

        int bonus = 0;
        int itemSold= 3;
        int totalValue = 800;

        if( itemSold >= MIN_ITEMS) {
            if(totalValue >= MIN_VALUE) {
                bonus = LARGE_BONUS;
            } else {
                bonus = MEDIUM_BONUS;
            } 

            
        } else {
            bonus = SMALL_BONUS;
        }




        
    }
}
