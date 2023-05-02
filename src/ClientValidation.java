import java.util.regex.*;

public class ClientValidation {
    private String name;
    private String surname;
    private String email;
    private String phone;

    public ClientValidation(String name, String surname, String email, String phone) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
    }

    public boolean isValid() {
        boolean isValid = true;
        if (!isValidName()) {
            System.out.println("Klaida: netinkamas vardo formatas. Vardas turi būti ne trumpesnis nei 3 simboliai ir ne ilgesnis nei 20 simboliai.");
            isValid = false;
        }
        if (!isValidSurname()) {
            System.out.println("Klaida: netinkamas pavardės formatas. Pavardė turi būti ne trumpesnė nei 3 simboliai ir ne ilgesnė nei 25 simboliai.");
            isValid = false;
        }
        if (!isValidEmail()) {
            System.out.println("Klaida: netinkamas el. pašto formatas.");
            isValid = false;
        }
        if (!isValidPhone()) {
            System.out.println("Klaida: netinkamas telefono formatas. Telefonas turi būti ne ilgesnis nei 15 simbolių.");
            isValid = false;
        }
        return isValid;
    }

    private boolean isValidName() {
        return name != null && name.length() >= 3 && name.length() <= 20;
    }

    private boolean isValidSurname() {
        return surname != null && surname.length() >= 3 && surname.length() <= 25;
    }

    private boolean isValidEmail() {
        if (email == null) {
            return false;
        }
        Pattern pattern = Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    private boolean isValidPhone() {
        return phone == null || phone.length() <= 15;
    }
}