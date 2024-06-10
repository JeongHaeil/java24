package frame;

import java.util.HashMap;
import java.util.Map;

public class UserDataSet {
    private Map<String, User> users;

    public UserDataSet() {
        users = new HashMap<>();
    }

    public boolean contains(String id) {
        return users.containsKey(id);
    }

    public void addUsers(User user) {
        users.put(user.getId(), user);
    }

    public User getUser(String id) {
        return users.get(id);
    }

    public boolean isIdOverlap(String id) {
        return users.containsKey(id);
    }

    public void withdraw(String id) {
        users.remove(id);
    }
}
