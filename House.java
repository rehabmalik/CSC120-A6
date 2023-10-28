import java.util.ArrayList;

public class House extends Building {
    private ArrayList<String> residents;
    private boolean hasDiningRoom;
  
   /**
    * Creates a new house.
    * @param name String
    * @param address String
    * @param nFloors int
    * @param hasDiningRoom boolean
    */
    public House(String name, String address, int nFloors, boolean hasDiningRoom) {
     super(name,address,nFloors);
     this.hasDiningRoom = hasDiningRoom;
     this.residents = new ArrayList<>();
     System.out.println("You have built a house: 🏠");
    }

   /**
    * Indicates whether or not the house has a dining room.
    * @return true if it does or false if it does not 
    */
    public boolean hasDiningRoom(){
      return this.hasDiningRoom;
    }

    /**
     * Indicates the number of residents in the house.
     * @return number of residents
     */
    public int nResidents(){
      return this.residents.size();
    }
    
    /**
     * Adds a new resident to the house
     * @param name String
     */
    public void moveIn(String name){
      this.residents.add(name);
    }
    
    /**
     * Removes a resident from the house
     * @param name String
     * @return name of the resident moved out
     */
    public String moveOut(String name){
        this.residents.remove(name);
        return name;
    }

    /**
     * Checks whether or not a person is a resident of this house.
     * @param person String
     * @return true if the person is a resident or false if not 
     */
    public boolean isResident(String person){
      if (this.residents.contains(person)){return true;}
      else {return false;}
    }

    public static void main(String[] args) {
      new House();
    }
}
