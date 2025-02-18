package inversionOfControl;

public class LocalDB implements Database {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void getMessage() {
        System.out.println("LocalDB message: " + message);
    }

    @Override
    public String toString() {
        return "LocalDB{" +
                "message='" + message + '\'' +
                '}';
    }
}
