public class UserInputValidator {
    public static void validateUsername(String username) {
        assert username.matches("^[a-zA-Z][a-zA-Z0-9_]{4,19}$") : "Username must be at least 5 characters long, start with a letter, and contain only letters, digits, and underscores.";
    }

    public static void validateEmail(String email) {
        assert email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$") : "Email must be a valid email address.";
    }

    public static void validateAge(int age) {
        assert age >= 17 && age <= 99 : "Age must be between 17 and 99.";
    }
}
