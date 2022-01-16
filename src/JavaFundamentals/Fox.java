package JavaFundamentals;

public class Fox {
    private class Den {}
    public void goHome() {
        new Den();
    }
    public static void visitFriend() {
        //new Den();  // DOES NOT COMPILE  --> static method
    }
}

 class Squirrel {
    public void visitFox() {
        //new Den();  // DOES NOT COMPILE
    }
}
