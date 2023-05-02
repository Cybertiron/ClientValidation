

    public class Main {
        public static void main(String[] args) {
            ClientValidation client = new ClientValidation("John", "Doe", "john.doe@example.com", "123-456-7890");
            if (client.isValid()) {
                System.out.println("Client data is valid");
            } else {
                System.out.println("Client data is invalid");
            }
        }
    }