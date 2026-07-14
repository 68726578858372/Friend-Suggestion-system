# 👥 Friend Suggestion System using Breadth-First Search (BFS)

A Java-based social network application that recommends new friends using **Breadth-First Search (BFS)** on a graph. The project models users as vertices and friendships as edges, suggesting second-degree connections (friends of friends) who are not already directly connected.

---

## 📌 Features

- Graph-based social network representation
- Friend recommendations using Breadth-First Search (BFS)
- Models user relationships with an adjacency list
- Object-Oriented and modular Java implementation
- Includes multiple test cases for validation
- Beginner-friendly project for learning Graph Data Structures and BFS

---

## 🛠️ Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Data Structures
  - Graph
  - Adjacency List
  - Queue
  - HashMap
  - HashSet
- Breadth-First Search (BFS)

---

## 📂 Project Structure

```
FriendSuggestionSystem/
│
├── SocialNetwork.java    # Graph implementation and BFS logic
├── Main.java             # Driver program
├── TestCases.java        # Additional test cases
└── README.md
```

---

## ⚙️ How It Works

1. Create users in the social network.
2. Add friendships between users.
3. Represent the network as an undirected graph.
4. Perform Breadth-First Search (BFS) from the selected user.
5. Recommend second-degree connections (friends of friends) who are not already direct friends.

---

## ▶️ How to Run

### Clone the Repository

```bash
git clone https://github.com/YOUR_USERNAME/FriendSuggestionSystem.git
```

### Navigate to the Project

```bash
cd FriendSuggestionSystem
```

### Compile

```bash
javac *.java
```

### Run

```bash
java Main
```

---

## 📷 Sample Output

```
------ Social Network ------

Alice -> [Bob, Charlie]
Bob -> [Alice, David]
Charlie -> [Alice, Eva, Henry]
David -> [Bob, Frank]
Eva -> [Charlie, Grace]
Frank -> [David]
Grace -> [Eva]
Henry -> [Charlie]

Friend Suggestions for Alice:

David
Eva
Henry
```

---

## 🧪 Test Cases

The project includes a `TestCases.java` file that tests the BFS algorithm with different social network configurations to verify the correctness of friend recommendations.

Run using:

```bash
java TestCases
```

---

## 📈 Time Complexity

| Operation | Complexity |
|-----------|------------|
| Add User | O(1) |
| Add Friendship | O(1) |
| BFS Friend Suggestion | O(V + E) |
| Space Complexity | O(V) |

Where:

- **V** = Number of Users
- **E** = Number of Friendships

---

## 📚 Concepts Covered

- Breadth-First Search (BFS)
- Graph Data Structure
- Adjacency List
- Queue
- HashMap & HashSet
- Object-Oriented Programming
- Graph Traversal
- Social Network Modeling

---

## 🎯 Learning Outcomes

- Understand graph traversal using BFS.
- Learn how social networks can be represented as graphs.
- Implement friend recommendation logic using second-degree connections.
- Improve Java programming and Object-Oriented Programming skills.
- Analyze the time and space complexity of graph algorithms.

---

## 🚀 Future Improvements

- Calculate mutual friend count for ranking suggestions.
- Allow user input instead of predefined data.
- Store user relationships in a database such as MySQL.
- Add a graphical user interface (GUI).
- Recommend friends based on shared interests or profile attributes.

---

## 👨‍💻 Author

**Dhanush Gowda M C**

- GitHub: https://github.com/68726578858372

---

⭐ If you found this project helpful, consider giving it a star.
