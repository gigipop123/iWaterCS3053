//user stories - SCRUMS - backlog - super simple for first increment, not focused there
//Potentially static and dynamic models of the project
//Architecture

abstract class Hydration
{
    private double hydrationGoal;  //8 cups default?
    private double addBev;      //Tester value
    private double totalBev;    //Tester value

    /** Empty Constructor - protected*/
    Hydration(){}

    /** Constructor */
    Hydration(double addBev)
    {
        this.addBev = addBev;

        //Must create a base total = added amount
        setTotalBev(addBev);
    }
    Hydration(double addBev, double hydrationGoal)
    {
        this.hydrationGoal = hydrationGoal;
        this.addBev = addBev;

        //Must create a base total = added amount
        setTotalBev(addBev);
    }


    /** Getters */
    public double getHydrationGoal()
    {
        return hydrationGoal;
    }
    public double getAddBev()
    {
        return addBev;
    }
    public double getTotalBev()
    {
        return totalBev;
    }

    /** Setters */
    public void setHydrationGoal(double hydrationGoal)
    {
        this.hydrationGoal = hydrationGoal;
    }
    public void setAddBev(double addBev)
    {
        this.addBev = addBev;
    }
    public void setTotalBev(double totalBev)
    {
        this.totalBev = totalBev;
    }


    /** Adds new beverage value to the beverage total */
    public double addBevVal(double addBev)
    {
        return this.totalBev = totalBev + addBev;
    }

    //Instruction for children - should suggest to
    public abstract String suggestion();


    @Override
    public String toString()
    {
        return "Hydration Goal is " + getHydrationGoal() + ", Added amount is "
                + getAddBev() + ", Total amount consumed is " + getTotalBev();
    }

    /* My vision of use: Click on add water button in app
     * Amount given = addBev value
     * Click 'okay' or check mark
     * addBevVal runs - AddBev to pre-existing TotalBev
     */

}






public class Water extends Hydration
{
    //Space to set Water object to Nickname - Personalizing?
    private String name = "Water";


    private Water(){}
    Water(String name)
    {
        this.name = name;
    }

    /** Super Constructor #2 - AddBev */
    Water(String name, double addBev)
    {
        super(addBev);
        this.name = name;
    }

    /** Super Constructor #3 (AddBev + HydrationGoal) */
    Water(String name, double addBev, double hydrationGoal)
    {
        super(addBev, hydrationGoal);
        this.name = name;
    }


    /** Getter / Setter */
    //Call wherever Water is - gets Water or gets Name
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String suggestion()
    {
        double recommendation = 0;
        if(this.getHydrationGoal() == 0)
        {
            recommendation = 2;
        }
        //expand for weight - science etc
        //else if(){}

        return "You don't have a goal: perhaps you should try drinking " + recommendation + " liters per day";
    }

    @Override
    public String toString()
    {
        if(getHydrationGoal() != 0)
        {
            return "My " + getName() + " water consumption is " + getTotalBev()
                    + " liters and my goal is " + getHydrationGoal();
        }
        else
        {
            return "My " + getName() + " water consumption is " + getTotalBev() + " liters!";
        }
    }


    public static void main(String args[])
    {
        Water wet = new Water("Gym");
        Water tooWetTooFurious = new Water("Coffee Balancing", 3.5);
        Water wetTokyoDrift = new Water("Steve", 8.2,15);

        System.out.println(wet.toString());
        System.out.println(wet.suggestion());
        System.out.println(tooWetTooFurious.toString());
        System.out.println(wetTokyoDrift.toString() + "\n");
    }
}