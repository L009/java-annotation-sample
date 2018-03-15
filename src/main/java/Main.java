import java.util.Calendar;
import java.util.Date;


/**
 * Created by leonid on 22.04.17.
 */

@CreateByAnnotation(author = "Leonid", date = "10.02.17")
public class Main {

    @CreateByAnnotation(author = "Leonid", date = "12.02.17")
    public static void main(String[] args) throws Exception
    {
        System.out.println("Beginning");

        Logging logging = new Logging();
        logging.GetLogData();

        System.out.println("Ending");
    }

    @CreateByAnnotation(author = "Leonid", date = "16.02.17")
    public static String getString()
    {
        return "dfsdfd";
    }
}
