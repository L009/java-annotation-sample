import java.lang.*;

import java.lang.reflect.Method;
import java.util.logging.*;

/**
 * Created by leonid on 22.04.17.
 */
public class Logging {
    Logger logger;

    public Logging()
    {
        logger = Logger.getLogger("FirstLogger");
    }


    public void GetLogData()
    {
        Class clMain = Main.class;
        Class[] masClasses = new  Class[]{String[].class};

        try
        {
            Method main = clMain.getMethod("main", masClasses);
            Method getString = clMain.getMethod("getString", null);

            CreateByAnnotation anCrMain = main.getAnnotation(CreateByAnnotation.class);
            CreateByAnnotation anGetString = getString.getAnnotation(CreateByAnnotation.class);

            logger.info("Method: main, author: " + anCrMain.author()
                    + ", date: " + anCrMain.date());
            logger.info("Method: anGetString, author: " + anGetString.author()
                    + ", date: " + anGetString.date());

        }
        catch (Exception e)
        {

        }



    }
}
