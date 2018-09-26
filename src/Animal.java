public class Animal {

    private String type;
    private String[] continents = new String[6];
    private double weight;
    private int age;

    public Animal(){
        setType("Unknown");
        setContinents(null);
        setWeight(0);
        setAge(0);
    }

    public Animal(String type, String[] continents, double weight,int age){
        setType(type);
        setContinents(continents);
        setWeight(weight);
        setAge(age);
    }

    public String toString()
    {
        String arrayContents="";

        for(int i=0;i<continents.length;i++)
        {
            arrayContents+=continents[i];
        }

        return "\nType: "+getType()+"\nContinents: "+getContinents()+"\nWeight: "+weight+"\nAge: "+age;
    }

    public void setType(String type)
    {
        this.type=type;
    }

    public String getType()
    {
        return type;
    }

    public void setContinents(String[] continents)
    {
        this.continents=continents;
    }

    public String[] getContinents()
    {
        return continents;
    }

    public void setWeight(double weight)
    {
        this.weight=weight;
    }

    public double getWeight()
    {
        return weight;
    }

    public void setAge(int age)
    {
        this.age=age;
    }

    public int getAge(int age)
    {
        return age;
    }
}
