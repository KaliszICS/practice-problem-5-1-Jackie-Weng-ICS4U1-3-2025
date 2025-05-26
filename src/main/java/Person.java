/* Jackie Weng */
/* J.Kalisz */

class Person{
    String name;
    int age;

    /* constructor with a string of name and int of age */
    /* @param Name: the name of the dude */
    /* @param Age: the age of the dude */
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    

    /* gets the name of the current  Person */
    /* @return: return the name of the person as a string */
     public String getName(){
        return this.name;
    }
    
//* does like the exact same thing but for age */
/* @return: return the age of the person as a int */
     public int getAge(){
        return this.age;
    }
//* set the name */
//* param newName: the string that the name is replaced with  */
    public void setName(String newName){
        this.name = newName;
    }
//* set the age */
//* @param newAge: the int that age is replaced with */
      public void setAge(int newAge){
        this.age = newAge;
    }


}