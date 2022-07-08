public class PickupWindow extends ConsoleProgram
{
    public void run()
    {
        // Display menu
        String menu = "1. Hamburger\n2. Cheeseburger\n3. Veggie Burger\n4. Nachos\n5. Hot Dog\n";
        
        System.out.println(menu);
        
        // Get customer order
        String customerOrder = readLine("Enter label: ");
        
        // Print out what the customer ordered
        System.out.println("Customer ordered number " + Integer.valueOf(customerOrder.substring(0,1)));
    }
}
