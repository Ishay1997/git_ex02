import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class main {
    public static void main(String[] args) {
        try{
            Desktop.getDesktop().browse(new URI("https://ynet.co.il"));
        }
        catch(IOException e){
            e.printStackTrace();
        }
        catch(URISyntaxException e){
            e.printStackTrace();
        }
        System.out.println("more code to come");
        System.out.println(" code to very soon ishay");
    }
}
