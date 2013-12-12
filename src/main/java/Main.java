import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

/**
 * Created by Modulus on 12/12/13.
 */
public class Main {

    public static void main(String args[]){
        Person person = new Person();
        ValidatorFactory vFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = vFactory.getValidator();
        Set<ConstraintViolation<Person>> violations = validator.validate(person);

        System.out.println(violations);

    }
}
