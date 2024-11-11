/*import java.util.HashMap;

public class GenerickyMultiton<T> {
    private static HashMap<String, T> instances;

    private GenerickyMultiton() {

    }

    public static T getInstance(String key) {
        if (null == instances) {
            instances = new HashMap<>();
        }
        if(instances.containsKey(key) == false) {
            instances.put(key, new T(key));
        }
        return instances.get(key);
    }

    public static void main(String[] args) {
        UserProfile user1 = GenerickyMultiton<UserProfile>.getInstance("user123");
        UserProfile user2 = GenerickyMultiton<UserProfile>.getInstance("user223");

        System.out.println(user1 = user2);
        System.out.println(user1);
        System.out.println(user2);
    }
}
*/