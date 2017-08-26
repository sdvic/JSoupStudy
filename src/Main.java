import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import static org.jsoup.Jsoup.connect;
import java.net.*;
import java.io.*;

public class Main
{
    public static void main(String[] args) throws Exception
    {
//        Document doc = connect("http://www.oracle.com").get();
//        Elements images = doc.select("img[src~=(?i)\\.(png|jpe?g|gif)]");
//        for (Element image : images)
//        {
//            System.out.println("src : " + image.attr("src"));
//            System.out.println("height : " + image.attr("height"));
//            System.out.println("width : " + image.attr("width"));
//            System.out.println("alt : " + image.attr("alt"));
//        }
        URL oracle = new URL("http://www.cnn.com/");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(oracle.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }
}

