package inversionOfControl;

public class CloudDB implements Database {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void getMessage() {
        System.out.println("CloudDB message: " + message);
    }

    @Override
    public String toString() {
        return "CloudDB{" +
                "message='" + message + '\'' +
                '}';
    }
}
