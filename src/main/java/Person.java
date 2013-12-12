import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Created by Modulus on 12/12/13.
 */


public class Person {

    private String firstName;
    private String lastName;
    private int age;

    @NotNull(message = "First name must be set")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @NotNull(message = "Last name must be set")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Min(value = 10, message = "Must be greater than 10 and less than 20")
    @Max(value = 20, message = "Must be greater than 10 and less than 20")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
