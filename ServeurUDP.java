import java.io.*;
import java.net.*;

public class ServeurUDP
{
    public static void main(String[] args)
    {
        try
        {
            DatagramSocket sock = new DatagramSocket(1234);
            while (true)
            {
                System.out.println("-Waiting data");
                DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
                sock.receive(packet);
                
                String str = new String(packet.getData(), 0, packet.getLength());
                System.out.println("str=" + str);
                
                // Renvoi de la chaîne reçue au client
                DatagramPacket reply = new DatagramPacket(packet.getData(), packet.getLength(), packet.getAddress(), packet.getPort());
                sock.send(reply);
            }
        }
        catch(Exception ex)
        {
            System.out.println("erreur !");
            ex.printStackTrace();
        }
    }
}
