import java.io.*;
import java.net.*;

public class ClientUDP
{
    public static void main(String[] args)
    {
        try
        {
            InetAddress addr = InetAddress.getLocalHost();
            System.out.println("adresse=" + addr.getHostName());
            
            // Le client prépare et envoie "Hello World"
            String s = "Hello World";
            byte[] data = s.getBytes();
            
            DatagramPacket packet = new DatagramPacket(data, data.length, addr, 1234);
            DatagramSocket sock = new DatagramSocket();
            sock.send(packet);
            
            // Le client attend la réponse du serveur
            DatagramPacket reply = new DatagramPacket(new byte[1024], 1024);
            sock.receive(reply);
            
            // On convertit les données reçues en texte et on l'affiche directement
            String str = new String(reply.getData(), 0, reply.getLength());
            System.out.println(str); 
            
            sock.close();
        }
        catch(Exception ex)
        {
            System.out.println("erreur !");
            ex.printStackTrace();
        }
    }
}
