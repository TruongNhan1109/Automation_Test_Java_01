package StaticJava;

public class Counter2 {
    public static void openURL (String url){
        System.out.println(url);
    }
    public static void Click (String name){
        System.out.println("Click : " + name);
    }
    public static void setText(String text){
        System.out.println("In settext: " + text);
    }
    public static String getText (String name){
        return "text";

    }

    public static void main(String[] args) {
        openURL("jadfhhlfa");
        setText("test@gmail.com");
        setText("12345");
        Click("Login button" );
    }
}
