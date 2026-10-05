import java.io.*;
import java.net.*;

public class ClientTCP2
{
    public static void main(String[] args)
    {
        try
        {
            Socket socket = new Socket("localhost", 2016);
            DataOutputStream dOut = new DataOutputStream(socket.getOutputStream());
            
            // On vérifie qu'un argument a bien été passé pour éviter un plantage
            if (args.length > 0)
            {
                dOut.writeUTF(args[0]);
            }
            else
            {
                dOut.writeUTF("Aucun argument fourni");
            }
            
            socket.close();
        }
        catch(Exception ex)
        {
            System.out.println("erreur !");
            ex.printStackTrace();
        }
    }
}
