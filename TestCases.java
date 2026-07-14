
public class TestCases {

    public static void main(String[] args) {

        SocialNetwork network = new SocialNetwork();

        network.addFriendship("A", "B");
        network.addFriendship("A", "C");
        network.addFriendship("B", "D");
        network.addFriendship("C", "E");
        network.addFriendship("D", "F");
        network.addFriendship("E", "G");
        network.addFriendship("F", "H");

        System.out.println("Suggestions for A:");
        System.out.println(network.suggestFriends("A"));

        System.out.println();

        System.out.println("Suggestions for B:");
        System.out.println(network.suggestFriends("B"));

        System.out.println();

        System.out.println("Suggestions for C:");
        System.out.println(network.suggestFriends("C"));
    }
}