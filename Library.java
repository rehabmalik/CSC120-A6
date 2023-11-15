import java.util.Hashtable;

public class Library extends Building {
    /* List of all the books in the library's collection */
    private Hashtable<String, Boolean> collection;

    /**
     *  Creates a new library.
     * @param name String
     * @param address String
     * @param nFloors int
     */
    public Library(String name, String address, int nFloors) {
      super(name,address,nFloors);
      this.collection = new Hashtable<>();
      System.out.println("You have built a library: 📖");
    }

    /**
     *  Creates a new default library.
     */
    public Library(){
      super("Unknown", "Unknown", 0);
      this.collection = new Hashtable<>();
      System.out.println("You have built a library: 📖");
    }

    /**
     * Adds a new book to the library's collection.
     * @param title String
     */
    public void addTitle(String title){
      this.collection.put(title, true);
      System.out.println("This book has been added to the collection.");
    }
    
    /**
     * Removes a book from the library's collection.
     * @param title String
     * @return name of the book removed
     */
    public String removeTitle(String title){
      this.collection.remove(title);
      System.out.println("This book has been removed from the collection.");
      return title;
    }
    
    /**
     * Checks out a book from the collection. 
     * @param title String
     */
    public void checkOut(String title){
      this.collection.replace(title, false);
      System.out.println("This book has successfully been checked out.");
    }
    
    /**
     * Returns a book to the collection.
     * @param title String
     */
    public void returnBook(String title){
      this.collection.replace(title, true);
      System.out.println("This book has been successfully returned.");
    }

    /**
     * Checks if the collection contains a certain book.
     * @param title String
     * @return true if it contains the book or false if it doesn't. 
     */
    public boolean containsTitle(String title){
      return this.collection.containsKey(title);
      }
    
    /**
     * Indicates whether or not a book is available to check out.
     * @param title String
     * @return true if it is available or false if it isn't.
     */
    public boolean isAvailable(String title){
      return this.collection.get(title);
    }
    
    /**
     * Prints a list of the entire collection
     * @return Title and checkout status of each book
     */
    public void printCollection(){
      for (String key : this.collection.keySet()) {
        System.out.println("Title:" + key + ", " + "Checkout Status: " + this.collection.get(key));
      }
    }

    public static void main(String[] args) {
      new Library();
    }
  
  }
