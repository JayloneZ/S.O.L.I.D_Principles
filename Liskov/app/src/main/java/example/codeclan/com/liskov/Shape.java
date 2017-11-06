package example.codeclan.com.liskov;

/**
 * Created by user on 27/06/2017.
 */

abstract class Shape {
    private String name;

    public String getName() {
        return this.getClass().getSimpleName().toLowerCase();
    }

}
