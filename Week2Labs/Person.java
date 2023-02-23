import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Person {

    private String firstName;
	private String lastName;
    private String dateOfBirth;
    private int age;

    public Person(String firstName, String lastName, String dateOfBirth) throws ParseException{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.age = age;

        Calendar today = Calendar.getInstance();
        Calendar birthDay = Calendar.getInstance();
        birthDay.setTime(newDate.parse(dateOfBirth));
        int thisYear = today.get(Calendar.YEAR);
        int birthYear = birthDay.get(Calendar.YEAR);
        age = thisYear - birthYear;

        if (today.get(Calendar.DAY_OF_YEAR) < birthDay.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }
		
	}

    SimpleDateFormat newDate = new SimpleDateFormat("dd-MM-yy");
    //Date birthDate = newDate.parse("07-07-95");

    public String getFullName() {
        String s = (firstName + " " + lastName);
        return s;
    }

    public int getAge(){
        return age;
    }

    public String toString(){
        String s = (firstName + " " + lastName + " " + age);
        return s;
    }

}