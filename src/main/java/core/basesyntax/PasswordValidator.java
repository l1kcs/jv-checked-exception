package core.basesyntax;

public class PasswordValidator {
    public static void validate(String password, String repeatPassword) throws PasswordValidationException {
        //write your code here
        if(password == null || repeatPassword == null || !password.equals(repeatPassword) || password.length() >= 10) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
