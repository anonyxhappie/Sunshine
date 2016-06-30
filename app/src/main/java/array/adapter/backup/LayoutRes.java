package array.adapter.backup;

/**
 * Created by akshay on 30-06-2016.
 */
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.SOURCE;
/**
 * Denotes that an integer parameter, field or method return value is expected
 * to be a layout resource reference (e.g. {@link android.R.layout#list_content}).
 *
 * {@hide}
 */
@Documented
@Retention(SOURCE)
@Target({METHOD, PARAMETER, FIELD})
public @interface LayoutRes {
}
