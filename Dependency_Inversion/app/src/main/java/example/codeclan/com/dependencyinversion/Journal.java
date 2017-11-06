package example.codeclan.com.dependencyinversion;

/**
 * Created by user on 06/11/2017.
 */

public interface Journal {

    public void write(String text);
    public String readLast();
}
