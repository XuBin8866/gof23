package adapter.login;

/**
 * @author xxbb
 */
public class Member {
    private String mid;
    private String username;
    private String password;
    private String info;

    public Member() {
    }

    public Member(String mid, String username, String password, String info) {
        this.mid = mid;
        this.username = username;
        this.password = password;
        this.info = info;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Member{" +
                "mid='" + mid + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
