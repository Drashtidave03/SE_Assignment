import java.io.*;

class User implements Serializable {
    private static final long serialVersionUID = 1L; // Ensures version compatibility
    private String username;
    private transient String password; // Will NOT be serialized

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{username='" + username + "', password='" + password + "'}";
    }
}

public class SerializationDemo {
    public static void main(String[] args) {
        String fileName = "user.ser";
        User userObj = new User("Alice_2025", "secret123");

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            out.writeObject(userObj);
            System.out.println("Object serialized: " + userObj);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            User deserializedUser = (User) in.readObject();
            System.out.println("Object deserialized: " + deserializedUser);
            // Note: 'password' will be null because it was marked transient
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
