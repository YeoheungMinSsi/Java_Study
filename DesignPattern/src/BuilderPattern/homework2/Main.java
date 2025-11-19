package BuilderPattern.homework2;

public class Main {
    public static void main(String[] args) {
        final ValidationRule usernameRule = new ValidationBuilder()
                .required()
                .min(3)
                .max(12)
                .build();

        System.out.println(usernameRule.validate("")); // false

        System.out.println(usernameRule.validate("ab"));  // false
        System.out.println(usernameRule.validate("hello"));  // true

    }
}
