package generik;

public class equipamentosNinja {

    private String name;

    public equipamentosNinja(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "equipamentosNinja{" +
                "name='" + name + '\'' +
                '}';
    }
}
