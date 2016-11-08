package ClassLoader;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by Dyvak on 08.11.2016.
 */
public class Data {

    SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

    Date date1;
    Date date2;

    public Data(SimpleDateFormat format) {
        this.format = format;
    }

    public Data() {
        Date date1 = null;
        Date date2 = null;
   }

    void getDate(String d2){
        try {
            date1 = format.parse(format.format(new Date()));
            date2 = format.parse(d2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        long difference = date1.getTime() - date2.getTime();
        long days =  difference / (24 * 60 * 60 * 1000);
        System.out.println("days=" + days);
    }

    public SimpleDateFormat getFormat() {
        return format;
    }

    public void setFormat(SimpleDateFormat format) {
        this.format = format;
    }

    public Date getDate1() {
        return date1;
    }

    public void setDate1(Date date1) {
        this.date1 = date1;
    }

    public Date getDate2() {
        return date2;
    }

    @Anno(enabled = false)
    public void setDate2(Date date2) {
        this.date2 = date2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Data data = (Data) o;

        if (date1 != null ? !date1.equals(data.date1) : data.date1 != null) return false;
        if (date2 != null ? !date2.equals(data.date2) : data.date2 != null) return false;
        if (format != null ? !format.equals(data.format) : data.format != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = format != null ? format.hashCode() : 0;
        result = 31 * result + (date1 != null ? date1.hashCode() : 0);
        result = 31 * result + (date2 != null ? date2.hashCode() : 0);
        return result;
    }

    @Anno(enabled = true)
    @Override
    public String toString() {
        return "Data{" +
                "format=" + format +
                ", date1=" + date1 +
                ", date2=" + date2 +
                '}';
    }
}
