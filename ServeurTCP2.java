import java.io.*;
import java.net.*;

public class ServeurTCP2
{
    public static void main(String[] args)
    {
        try
        {
            // Instanciation hors de la boucle
            ServerSocket socketserver = new ServerSocket(2016);
            System.out.println("serveur en attente");
            
            // Boucle infinie pour garder le serveur actif
            while(true) 
            {
                Socket socket = socketserver.accept();
                System.out.println("Connection d'un client");
                
                DataInputStream dIn = new DataInputStream(socket.getInputStream());
                System.out.println("Message: " + dIn.readUTF());
                
                socket.close();
            }
        }
        catch(Exception ex)
        {
            System.out.println("erreur !");
            ex.printStackTrace();
        }
    }
}
