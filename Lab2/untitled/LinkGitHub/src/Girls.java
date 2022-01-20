/**
 * Created by TOSHIBA on 15/01/22.
 */
public class Girls {
    int id;
    String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Girls{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
