public class prob12 {

    /**
     * Q: User defined execptions
     */
    public static void main(String[] args) {
        CredentialValidator cv = new CredentialValidator();

        final String userName = "admin";
        final String password = "admin";

        try {
            cv.validate(userName, password);
        } catch (InvalidDetails e) {
            System.out.println(e.getMessage());
        }
    }
}

class InvalidDetails extends Exception {
    public InvalidDetails() {
        super("Invalid Login Credentials !");
    }
}

class CredentialValidator {
    private final String password = ".WKC(Aj*_..3%-K[";

    public void validate(String userName, String password) throws InvalidDetails {
        if (userName.equals("admin") && password.equals(this.password)) {
            System.out.println("Login Successful !");
        } else {
            throw new InvalidDetails();
        }
    }
}
