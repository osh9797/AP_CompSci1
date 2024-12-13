/* 
    Lecture note example - If Statements
*/
import java.util.Scanner;

class LectureIf{
    public static void main(String args[]) {
        // Your Code Goes here!
        Scanner sc = new Scanner(System.in);
        System.out.println("In a 5v4 post-plant situation on A site in Haven, you have some strong options to secure the round. Here are three strategies:");
        System.out.println("1. Set Up Crossfires: Position players in locations where they can support each other, like one player near A short and another near A long. This way, if the enemy tries to defuse, they’ll be caught in a crossfire, making it harder for them to pick off players.");
        System.out.println("2. Utilize Utility: Use smokes, flashes, or other abilities to deny vision and zone off areas where the enemies might approach. For example, a smoke at A long can force them to push through a choke point, where you can easily hold them off. ");
        System.out.println("3. Split Push: Send a few players to aggressively check different angles, like A long and A short, while others hold back to cover the bomb. This can catch the remaining enemies off guard as they try to retake, and with a numbers advantage, you can overwhelm them.");
        System.out.println("Witch strategy would you like to use?");
        int answer = sc.nextInt();
        if(answer==1){
            System.out.println("Where would you like to position?");
            System.out.println("1. A Short: Position one player in the corner near the A short entrance, ideally with a good line of sight to the bomb. They can watch for enemies pushing through A short.");
            System.out.println("2. A Long: Place another player at A long, either behind the box near the entrance or further back near the site, depending on your team’s utility. This player can provide cover for A short while also keeping an eye on A long pushes.");
            System.out.println("3. Heaven: If you have a player available, positioning one in Heaven can be very effective. They can provide vertical support and take out enemies pushing from either A long or A short.");
            System.out.println("4. Site: You could also have one player on the bomb site itself, possibly behind the default box or in a corner, to catch anyone trying to defuse from unexpected angles.");

        }
        else if(answer==2){
            System.out.println("What utility would you like to utilize?");
            System.out.println("1. Smokes: If you have a controller like Omen or Viper, use smokes to block vision from A long or A short. This will make it harder for enemies to approach and can force them to push through tighter angles.");
            System.out.println("2. Flashes: If you have a duelist like Reyna or Jett, use your flashes to blind enemies as they try to retake. Timing is crucial—throw them just as you anticipate an enemy push to catch them off guard.");
            System.out.println("3. Molotovs or Nanoswarms: If you’re playing a character like Raze or Killjoy, use your utility to deny specific areas. A well-placed grenade or a Nanoswarm on the bomb can force enemies to either take damage or wait it out.");
            System.out.println("4. Sova’s Shock Darts: Use shock darts to deal damage to enemies attempting to defuse the spike. This can slow them down and make them more vulnerable.");
            
        }
        else if(answer==3){
            System.out.println("Where would you like to split push to?");
            System.out.println("1. A Long and A Short: Divide your team into two groups—one group pushes A long while the other group pushes A short. This forces the enemies to split their attention and can overwhelm them as they try to retake the site.");
            System.out.println("2. Heaven and Site: Another effective split is to have a few players push from Heaven while others hold their position on site. This allows you to pressure from above and keep the bomb safe while watching for enemy movements.");
            System.out.println("3. CT Spawn and A Long: If you want to catch enemies off guard, you can have one or two players push through CT spawn while the rest push A long. This can create a flanking opportunity and split the enemy’s focus even further.");

        }
        else{
            System.out.println("Thats not a valid answer");
        }
        
        
        
        
	}
}