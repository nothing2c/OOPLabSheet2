public class Animal {

    private String type;
    private String[] continents;
    private double weight;
    private int age;

    public Animal(){
        setType("Unknown");
        setContinents(null);
        setWeight(0);
        setAge(0);
        continents = new String[7];
    }

    public Animal(String type, String[] continents, double weight, int age){
        setType(type);
        setContinents(continents);
        setWeight(weight);
        setAge(age);
        continents = new String[continents.length];
    }

    public String toString()
    {
        String arrayContents="";

        System.out.println(continents);

        for(int i=0;i<continents.length;i++)
        {
            if(continents[i]!=null)
                arrayContents+=continents[i]+", ";
            else
                break;
        }

        return "\nType: "+getType()+"\nContinents: "+arrayContents+"\nWeight: "+weight+"\nAge: "+age+"\n";
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
