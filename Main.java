import java.util.*;

public class Main {

    public static void main(String[] args) {

        SocialNetwork network = new SocialNetwork();

        network.addFriendship("Alice", "Bob");
        network.addFriendship("Alice", "Charlie");
        network.addFriendship("Bob", "David");
        network.addFriendship("Charlie", "Eva");
        network.addFriendship("David", "Frank");
        network.addFriendship("Eva", "Grace");
        network.addFriendship("Charlie", "Henry");

        network.displayNetwork();

        System.out.println("Friend Suggestions for Alice:");

        List<String> suggestions = network.suggestFriends("Alice");

        for (String person : suggestions) {
            System.out.println(person);
        }
    }
}