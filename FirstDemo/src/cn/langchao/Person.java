package cn.langchao;

public class Person
{
    private static int id=1;
    private String name;
    public Person()
    {
        super();
        // TODO Auto-generated constructor stub
    }
    public Person(String name)
    {
        super();
        this.name = name;
    }
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        Person.id = id++;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    @Override
    public String toString()
    {
        return "Person [name=" + name + "]";
    }
 
}
