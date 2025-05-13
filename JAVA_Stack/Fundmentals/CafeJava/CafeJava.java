public class CafeJava {
    public static void main(String[] args) {
        // APP Varianles
        // lines of text that will appear in the app.
        String generalGreeting = "welcome to Cafe Java,";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", Your order is ready";
        String displayTotalMessage = "your total is ";

        // menu variables (add yours below)
        double mochaPrice = 2;
        double dripCoffe = 10;
        int latte = 7;
        int cappuccino = 4;


        // Customer name variables (add yours below)
        String customer1 = "Bahaa";
        String customer2 = "Ahmad";
        String customer3 = "Sali";
        String customer4 = "Adam";
        

        //order completions (add yours below)
        boolean isReadyOrder1= false;
        boolean isReadyOrder2= true;
        boolean isReadyOrder3= false;
        boolean isReadyOrder4= true;
        boolean isReadyOrder5 = true;
        boolean isReadyOrder6 = true;


        //app interaction simulation (add your code for the challenges below)
        //example:
        // System.out.println(generalGreeting + customer1); //displays "welcome to cafe java, Bahaa "
        //** your customer interaction print statments will go */
        // if (isReadyOrder2){
        //     System.out.println(generalGreeting + customer3 + readyMessage );
        // }
        // else {
        //     System.out.println(generalGreeting + customer3 + pendingMessage );


        // }
        // if (isReadyOrder2){
        //     System.out.println(generalGreeting + customer2 + readyMessage + " " + displayTotalMessage + cappuccino + '$' );
        // }
        // else {
        //     System.out.println(generalGreeting + customer2 + pendingMessage );


        // }
        // if (isReadyOrder5){
        //     System.out.println(generalGreeting + customer3 + readyMessage + " " + displayTotalMessage + (latte + latte) + '$' );
        // }
        // else {
        //     System.out.println(generalGreeting + customer3 + pendingMessage );
        // }
        if (isReadyOrder6){
            System.out.println(generalGreeting + customer4 + readyMessage + " " + displayTotalMessage + (latte - dripCoffe) + '$' );
        }
        else {
            System.out.println(generalGreeting + customer4 + pendingMessage );


        }
    }
}