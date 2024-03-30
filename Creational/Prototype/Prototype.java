public class Prototype {
    public static void main(String[] args) {

        System.out.println("PROTOTYPE START ::::::");

        NetworkConnection networkConnection = new NetworkConnection();

        try {

            networkConnection.setIp("192.168.4.4");
            networkConnection.setImportantData("HIIII");

            System.out.println(networkConnection);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // we want new object of network connection
        try {

            NetworkConnection networkConnection2 = (NetworkConnection) networkConnection.clone();
            System.out.println(networkConnection2);
            
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}