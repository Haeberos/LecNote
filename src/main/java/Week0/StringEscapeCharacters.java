package Week0;

public class StringEscapeCharacters{
    public static void main(String[] args) {
        String message = "This class is \"Java Programming\"!";
        System.out.println(message);
        String anothermessage = "Welcome everyone! \nI Hope you enjoy class";
        System.out.println(anothermessage);
        String andanothermessage = "Videos\tLabs\tZoom";
        System.out.println(andanothermessage);

        // This character "\" is used for escapes as seen above, to avoid character function errors
        // The characters \n are used for new lines
        // the characters \t are used for new tabs
    }
}