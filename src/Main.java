public class Main {
    public static void main(String[] args) {
    /*    Account emptyAccount = new Account();
        Account magnus = new Account("Magnus", 100);
        System.out.println(emptyAccount);
        System.out.println(magnus);
        emptyAccount.setName("Testar");
        magnus.deposit(1000);
            System.out.println(magnus);
        System.out.println(emptyAccount);*/

        Rectangle firstRectangle = new Rectangle(11, 11);
        Rectangle secondRectangle = new Rectangle(10,10,10,10);

        boolean collisionCheck = Rectangle.checkCollision(firstRectangle, secondRectangle);
        System.out.println("collisionCheck = " + collisionCheck);


    }
}