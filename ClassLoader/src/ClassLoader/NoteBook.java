package ClassLoader;

/**
 * Created by Dyvak on 08.11.2016.
 */
public class NoteBook extends Data {

    private String surnameNameSecondName;
    private String phoneNumber;
    private String d2;

    public NoteBook() {
        surnameNameSecondName = "Ivanov I.I.";
        phoneNumber= "80935421212";
        d2 = "7.11.2016";
    }

    public NoteBook(String surnameNameSecondName) {
        super();
        this.surnameNameSecondName = surnameNameSecondName;
    }

    public String getSurnameNameSecondName() {
        return surnameNameSecondName;
    }

    public void setSurnameNameSecondName(String surnameNameSecondName) {
        this.surnameNameSecondName = surnameNameSecondName;
    }

    public String getPhoneNumber() {
        return phoneNumber;

    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getD2() {
        return d2;
    }

    public void setD2(String d2) {
        this.d2 = d2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NoteBook noteBook = (NoteBook) o;

        if (d2 != null ? !d2.equals(noteBook.d2) : noteBook.d2 != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(noteBook.phoneNumber) : noteBook.phoneNumber != null)
            return false;
        if (surnameNameSecondName != null ? !surnameNameSecondName.equals(noteBook.surnameNameSecondName) : noteBook.surnameNameSecondName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = surnameNameSecondName != null ? surnameNameSecondName.hashCode() : 0;
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (d2 != null ? d2.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "NoteBook{" +
                "surnameNameSecondName='" + surnameNameSecondName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", d2='" + d2 + '\'' +
                '}';
    }
}
