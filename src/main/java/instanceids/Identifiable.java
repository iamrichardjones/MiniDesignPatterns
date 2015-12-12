package instanceids;


public abstract class Identifiable {

    private final Integer id;
    private final String className;

    public Identifiable(Integer id, String className){
        this.id = id;
        this.className = className;
        checkValue();
    }

    private void throwException()  {
        throw new IllegalArgumentException(String.format("Invalid value %s for class %s" , id , className));
    }

    private void checkValue()  {
        if(id == null){
            throwException();
        }
        if(id != null && id <= 0 ){
            throwException();
        }
    }

    public Integer getValue() {
        return id;
    }


}
