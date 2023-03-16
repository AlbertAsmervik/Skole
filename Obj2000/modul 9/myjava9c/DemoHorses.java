import java.util.Scanner;


public class DemoHorses {
    public static void main(String[] args) {

        Scanner bro = new Scanner(System.in);
        horse daddy = new horse();
        RaceHorse obj = new RaceHorse();

        System.out.print("does your horse have a name? ");
        daddy.setName(bro.nextLine());
        System.out.print("Which colour is your horse? ");
        daddy.setColor(bro.nextLine());
        System.out.print("Which year was your horse concepted ");
        daddy.setBirth_year(bro.nextInt());

        
        System.out.print("How many races has your racehorse won? ");
        obj.setCompleted_races(bro.nextInt());
        System.out.print("which year was your racehorse concepted? ");
        obj.setBirth_year(bro.nextInt());
        bro.nextLine();
        System.out.print("Whats your racehorses name? ");
        obj.setName(bro.nextLine());
        System.out.print("What color is your racehorse? ");
        obj.setColor(bro.nextLine());

        System.out.print("På pallen har vi den raskeste vi noen gang har sett");

        System.out.print(daddy.getName());
        System.out.print(daddy.getColor());
        System.out.print(daddy.getBirth_year());
        


        System.out.print("Andre plass går til denne karen");

        System.out.print(obj.getName());
        System.out.print(obj.getColor());
        System.out.print(obj.getBirth_year());
        System.out.print(obj.getCompleted_races());




        


        



        
    }
}
