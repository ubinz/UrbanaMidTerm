package design;

public  abstract class EmployeeAbstract {
    int rating;//this is our instance variable.

    //abstract method
    public  abstract void emphistor();

    //non-abstract method
    public void rating (int rate){
        this.rating = rate;
    }
}
