public class MojeTrojice<T extends Comparable> {
    T param1;
    T param2;
    T param3;

    public MojeTrojice(T param1, T param2, T param3) {
        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;
    }

    public T dejNejmensi() {
        if (param1.compareTo(param2) < 0) {
            if (param1.compareTo(param3) < 0) {
                return param1;
            } else {
                return param3;
            }
        }
        return param2;
    }

    @Override
    public String toString() {
        return "MojeTrojice{" +
                "param1='" + param1 + '\'' +
                ", param2='" + param2 + '\'' +
                ", param3='" + param3 + '\'' +
                '}';
    }

    public static void main(String[] args) {
        MojeTrojice<String> mojeTrojice1 = new MojeTrojice<>("A", "B", "C");
        MojeTrojice<Integer> mojeTrojice2 = new MojeTrojice<>(1,2,3);

        System.out.println(mojeTrojice1.dejNejmensi());
        System.out.println(mojeTrojice2.dejNejmensi());
    }
}
