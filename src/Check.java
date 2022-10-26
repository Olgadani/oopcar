public class Check {
    public static String checkDefault(String value, String error) {
        if (value == null || value.isBlank()) {
            return error;
        } else {
            return value;
        }
    }

}
