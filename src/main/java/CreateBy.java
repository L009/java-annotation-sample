import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;




/**
 * Created by leonid on 22.04.17.
 */
//Annotation
@Retention(RetentionPolicy.RUNTIME)
@interface CreateByAnnotation {

    String author();
    String date();
}