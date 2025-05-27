/* Jackie Weng */
/* J.Kalisz */
/* Child.java */
import java.util.Arrays; //* needed as we are using arrays  */

/* The Child class extends the Person class and represents a child with two parents and "potential" siblings. (they can have none)*/
 

public class Child extends Person {
    private Parent parent1;
    private Parent parent2;
    private Child[] siblings = new Child[0];
/* Constructs a Child object with a name, age and 2 parents */
    public Child(String name, int age, Parent par1, Parent par2) {
        super(name, age);
		this.parent1 = par1;
        this.parent2 = par2;
    }

    
    
    
//* @return parent of the child */
    public Parent getParent2() {
        return this.parent2;
    }
//* @return exact same thing but for parent one */
    public Parent getParent1() {
        return this.parent1;
    }

//* Returns an array of the child's siblings */
//*@return an array of Child object */
    public Child[] getSiblings() {
        return this.siblings;
    }
//* @param siblings an array of Child objects to set as siblings */
    public void setSiblings(Child[] siblings) {
        this.siblings = siblings;
    }

//* Add a sibling to the child's list of siblings */
    public void addSibling(Child child) {
        Child[] newSiblings = Arrays.copyOf(this.siblings, this.siblings.length + 1);
		newSiblings[newSiblings.length -1] = child;
		this.siblings = newSiblings;
    }
}

//* FINALLY DONE */