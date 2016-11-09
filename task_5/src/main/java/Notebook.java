/**
 * Created by click on 11/9/2016.
 */
public class Notebook extends Date {

    private String name;
    private String phone;
    private Date birthday;

    public static final String notebook = "Notebook";

    public Notebook() {
    }

    public Notebook(String name, String phone, Date birthday) {
        this.name = name;
        this.phone = phone;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Annotation(value = "day quantity")
    public int getDayToBirthday(){
        return 0;
    }

    @Override
    public String toString(){
        return name + phone + birthday;
    }
}
