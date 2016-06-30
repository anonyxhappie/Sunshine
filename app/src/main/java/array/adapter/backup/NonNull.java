package array.adapter.backup;

/**
 * Created by akshay on 30-06-2016.
 */
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.SOURCE;
/**
 * Denotes that a parameter, field or method return value can never be null.
 * <p>
 * This is a marker annotation and it has no specific attributes.
 *
 * @hide
 */
@Retention(SOURCE)
@Target({METHOD, PARAMETER, FIELD})
public @interface NonNull {
}