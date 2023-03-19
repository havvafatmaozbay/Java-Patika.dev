import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in); //Sadece bu sınıf içerisinde kullanacağımız için private tanımladık
    public void start(){

        System.out.println("Welcome to the Adventure Game!");
        System.out.print("Please Enter User Name: ");
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        System.out.println(player.getName()+" Welcome To the Game!");
        System.out.println("Please select character to start the game");
        player.selectChar();
        Location loc = null;
        while(true){
            player.playerInfo();
            Location[] locationList = {new SafeHouse(player), new ToolStore(player), new Cave(player), new Forest(player), new River(player)};
            System.out.println("Locations:");
            System.out.println("-------------------------------");
            for(Location location : locationList){
                System.out.println("ID: "+location.getId()+
                        "\t Location: " + location.getName());
            }
            System.out.print("Please Select the Location ID:");
            int selectLoc = input.nextInt();
            switch (selectLoc){
                case 1:
                    loc = locationList[0];
                    break;
                case 2:
                    loc = locationList[1];
                    break;
                case 3:
                    loc = locationList[2];
                    break;
                case 4:
                    loc = locationList[3];
                    break;
                case 5:
                    loc = locationList[4];
                default:
                    loc = new SafeHouse(player);

            }
            System.out.println("Location ID :"
                    +loc.getId()+", Location Name :"
                    +loc.getName());

            if(!loc.onLocation()){
                System.out.println("You Lost, Game Over");
                break;
            };

        }

    }
}
