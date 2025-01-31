import java.io.*;

public class ChainedDecorationsExample {
    public static void main(String[] args) {
        try {
            // Create a file and write some data
            DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("data.bin")));
            dos.writeInt(12345);
            dos.writeDouble(3.14);
            dos.close();

            // Read the data back using a chain of filter streams
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("data.bin"));
            DataInputStream dis = new DataInputStream(bis);

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
