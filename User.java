package frame;

import java.util.Objects;

public class User {
    private String id;
    private String pw;
    private String name;
    private String nickname;
    private String gender;

    public User(String id, String pw, String name, String nickname, String gender) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.nickname = nickname;
        this.gender = gender;
    }

    public User(String id, String pw) {
        this.id = id;
        this.pw = pw;
    }

    public String getId() {
        return id;
    }

    public String getPw() {
        return pw;
    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

