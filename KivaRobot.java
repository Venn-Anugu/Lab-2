public class Kiva_robot {
    public static void main(String args[])
    {
        Kiva_robot k = new Kiva_robot();
        k.DetectThePod();
        k.lift();
        k.FetchAnItem();
        k.Drop();
    }
    public void DetectThePod()
    {
        System.out.println("Bot searches for the pod by scanning barcode and finds it");
    }
    public void lift()
    {
        System.out.println("Ball screw turns to raise the pod");
    }
    public void FetchAnItem()
    {
        System.out.println("Carries the pod to supervisor to pickup an item");
    }
    public void Drop()
    {
        System.out.println("Bot takes the pod back to its storage location");
    } 
  
}