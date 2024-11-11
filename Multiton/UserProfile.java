import java.util.HashMap;

public class UserProfile {
    private String userId;
    private String jmeno;
    private String prijmeni;
    private String email;

    public UserProfile(String userId, String jmeno, String prijmeni, String email) {
        this.userId = userId;
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserProfile{" +
                "userId='" + userId + '\'' +
                ", jmeno='" + jmeno + '\'' +
                ", prijmeni='" + prijmeni + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    private static HashMap<String, UserProfile> instances;
    private UserProfile(String key) {
        this.userId = key;
    }

    public static UserProfile getInstance(String key) {
        if (null == instances) {
            instances = new HashMap<>();
        }
        if(instances.containsKey(key) == false) {
            instances.put(key, new UserProfile(key));
        }
        return instances.get(key);
    }

    private void setUserId(String key) {
    }

    public static void main(String[] args) {
        UserProfile user1 = UserProfile.getInstance("user123");
        UserProfile user2 = UserProfile.getInstance("user223");

        System.out.println(user1 = user2);
        System.out.println(user1);
        System.out.println(user2);
    }
}
