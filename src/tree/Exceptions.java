package tree;

/**
 * Created by User on 10.02.17.
 */
public enum Exceptions {
    InvalidNodeValue("Provided arguments are not the same type"),
    ExistedTreeInitializationException("Tree was already initialized");
    public String message;

    Exceptions(String message) {
        this.message = message;
    }

}
