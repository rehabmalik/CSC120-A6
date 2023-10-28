public class Cafe extends Building{
    private int nCoffeeOunces; 
    private int nSugarPackets;
    private int nCreams;
    private int nCups;
    
    /**
     * Creates a new cafe.
     * @param name String
     * @param address String
     * @param nFloors int
     * @param nCoffeeOunces int
     * @param nSugarPackets int
     * @param nCreams int
     * @param nCups int
     */
    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name,address,nFloors);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups= nCups;
        System.out.println("You have built a cafe: ☕");
    }
    
    /**
     * Sells a coffee and alters stock based on how much is used.
     * Directs user to restock if enough ingredients for current order are  not available.
     * @param size int
     * @param nSugarPackets int
     * @param nCreams int
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        try{ 
            if (this.nCups < 1 || this.nCoffeeOunces < size || this.nSugarPackets < nSugarPackets || this.nCreams < nCreams){
                throw new RuntimeException("Not enough ingredients. Please restock before making this order.");
            }

            else {
                this.nCoffeeOunces -= size;
                this.nSugarPackets -= nSugarPackets;
                this.nCreams -= nCreams;
                this.nCups -- ;
                System.out.println("Order successful.");
            }
        }

        catch (RuntimeException e){
            restock(size, nSugarPackets, nCreams, nCreams);
        }

    }

    /**
     * Restocks the ingredients in the cafe.
     * @param nCoffeeOunces int
     * @param nSugarPackets int
     * @param nCreams int
     * @param nCups int
     */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces += nCoffeeOunces;
        this.nSugarPackets += nSugarPackets;
        this.nCreams += nCreams;
        this.nCups += nCups;
        System.out.println("The ingredients have been restocked.");
    }

    public static void main(String[] args) {
        new Cafe();
    }
    
}
