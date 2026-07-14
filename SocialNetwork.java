import java.util.*;

public class SocialNetwork {

    private Map<String, List<String>> adjList;

    public SocialNetwork() {
        adjList = new HashMap<>();
    }

    // Add a new user
    public void addUser(String user) {
        adjList.putIfAbsent(user, new ArrayList<>());
    }

    // Create friendship (Undirected Graph)
    public void addFriendship(String user1, String user2) {

        addUser(user1);
        addUser(user2);

        adjList.get(user1).add(user2);
        adjList.get(user2).add(user1);
    }

    // Display network
    public void displayNetwork() {

        System.out.println("------ Social Network ------");

        for (String user : adjList.keySet()) {
            System.out.println(user + " -> " + adjList.get(user));
        }

        System.out.println();
    }

    // BFS Friend Suggestion
    public List<String> suggestFriends(String user) {

        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        Map<String, Integer> levels = new HashMap<>();

        List<String> suggestions = new ArrayList<>();

        queue.add(user);
        visited.add(user);
        levels.put(user, 0);

        while (!queue.isEmpty()) {

            String current = queue.poll();
            int level = levels.get(current);

            if (level == 2)
                continue;

            for (String neighbor : adjList.get(current)) {

                if (!visited.contains(neighbor)) {

                    visited.add(neighbor);
                    queue.add(neighbor);

                    levels.put(neighbor, level + 1);

                    if (level + 1 == 2 &&
                            !adjList.get(user).contains(neighbor)) {

                        suggestions.add(neighbor);
                    }
                }
            }
        }

        return suggestions;
    }
}