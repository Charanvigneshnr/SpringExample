package inversionOfControl;

public class WebDB implements Database {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void getMessage() {
        System.out.println("WebDB message: " + message);
    }

    @Override
    public String toString() {
        return "WebDB{" +
                "message='" + message + '\'' +
                '}';
    }
}
