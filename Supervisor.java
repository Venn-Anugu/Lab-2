public class Supervisor {
    public static void main(String args[])
    {
        Supervisor s = new Supervisor();
        s.OrderAnItem();
        s.ReceiveTheItem();
    }
    public void OrderAnItem()
    {
        System.out.println("Supervisor enters order query in Kiva Database to fetch an item");
    }
    public void ReceiveTheItem()
    {
        System.out.println("Picksup the required item from the pod and updates the database");
    }
  
}