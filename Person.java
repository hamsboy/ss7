/**
 * This is program is to create several classes using inheritance and polymorphism
 *
 *=
 */
public abstract class Person
{
    
    private String name;
    private String id;
    private String email;

    /**
     * contructor for object of class person
     * @param id   as id type String
     * @param name    string as a name
     * @param email  string as an email
     * @return
     */
    public Person(String id, String name, String email){
        setId(id);
        setName(name);
        setEmail(email);

    }

    /**
     *  constructor method to create  person with only id and name
     * @param id  type string 
     * @param name    name type string 
     * @return
     */
    public Person(String id, String name){
        this(id, name, "");
    }

    /**
     * Method to set id
     * @param id type Sting
     * @return
     */
    public void setId(String id){
        if(!isValidId(id)) throw new IllegalArgumentException("Sorry, not a valid student ID");
        this.id = id;
    }

    /**
     * Method to set name
     * @param name     type String
     * @return
     */
    public void setName(String name){
        if(name.length() == 0) throw new IllegalArgumentException("Sorry, name cannot be empty");
        this.name = name;
    }

    /**
     * Method to set email
     * @param email   type string
     * @return
     */
    public void setEmail(String email){
        if(!isValidEmail(email)) throw new IllegalArgumentException("Sorry, not a valid email");
        this.email = email;
    }

    /**
     * Method to get id
     * @param
     * @return id     type String
     */
    public String getID(){
        return id;
    }

    /**
     * Method to get name
     * @param
     * @return name type string
     */
    public String getName(){
        return name;
    }

    /**
     * Method to get email
     * @param
     * @return email      returns email
     */
    public String getEmail(){
        return email;
    }

    /**
     * Abstract method 
     * @param id      type String
     * @return
     */
    abstract public boolean isValidId(String id);

    
    /**
     * Method to validate email 
     * @param email    email type string 
     * @return true or false   typeboolean  
     */
    public boolean isValidEmail(String email){
        return email.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    }
    
    /**
     * Method to display results 
     * @param
     * @return res     returns type String
     */
    public String toString(){
        String res = "";
        res += String.format("%-5s", "Id") +  " = " + getID() + "\n";
        res += String.format("%-5s", "Name") + " = " + getName() + "\n";
        res += String.format("%-4s", "Email")+  " = " + getEmail() + "\n";
        return res;
    }
}

