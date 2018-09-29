public class Bicycle {
    private String name, make;
    private float value;

    public Bicycle()
    {
        setName("");
        setValue(0f);
        setMake("");
    }

    public Bicycle(String name, float value, String make)
    {
        setName(name);
        setValue(value);
        setMake(make);
    }

    public String toString()
    {
        return "\nName: "+getName()+"\nValue: "+getValue()+"\nMake: "+getMake()+"\n";
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return name;
    }

    public void setValue(float value)
    {
        this.value=value;
    }

    public float getValue()
    {
        return value;
    }

    public void setMake(String make)
    {
        this.make=make;
    }

    public String getMake()
    {
        return make;
    }
}
