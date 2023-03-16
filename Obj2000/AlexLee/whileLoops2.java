public class whileLoops2 {
    public static void main(String[]args) {
        int a = 0;

        do {
            System.out.println("a");
        } while(a == 1); 
    }
}

// vi får en utskrift av a fordi do leses før while
// når maskinen ser at while parameteret ikke stemmer
// så slutter den å skrive ut a