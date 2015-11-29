package instanceids;

public abstract class Identifiable {

    private Integer id;

    public Identifiable(Integer id) {
        this.id = id;
    }

    public Integer getValue() {
        return id;
    }


}
