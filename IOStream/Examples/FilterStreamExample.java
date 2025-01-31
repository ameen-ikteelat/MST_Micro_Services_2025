import java.io.*;

public class FilterStreamExample {
    public static void main(String[] args) {
        try {
            // Create a file and write some data
            DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("data.bin")));
            dos.writeInt(12345);
            dos.writeDouble(3.14);
            dos.close();

            // Read the data back using filter streams
            DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream("data.bin")));
            int number = dis.readInt();
            double pi = dis.readDouble();
            dis.close();

            // Output the read data
            System.out.println("Number: " + number);
            System.out.println("PI: " + pi);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
