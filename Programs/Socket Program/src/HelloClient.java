

/**
 *
 * @author ADMIN
 */
import java.net.*;
import java.io.*;

public class HelloClient
{
   public static void main(String [] args)
   {
      String serverName = "127.0.0.1"; //"localhost";
      //"localhost" can b replaced with Loopback IP addr 127.0.0.1, 
      //if server program is on same machine as client
      
      //If server is located on some other machine, pls specify it's IP address, 
      //above
      int port = 6066; //port no. on which server program is listening
      try
      {
         System.out.println("Client: Connecting to (Server) " + serverName +
		 " on port number " + port);
         
         Socket server_soc = new Socket(serverName, port); //Step 1
         System.out.println("Client: Just connected to (Server) " 
		 + server_soc.getRemoteSocketAddress());
         
         OutputStream outToServer = server_soc.getOutputStream(); //step 2

         DataOutputStream out = new DataOutputStream(outToServer);
         /*out.writeUTF("[From Client]Request from "
                      + client.getLocalSocketAddress());*/
         
         out.writeUTF("dddddddddddddddd");
         InputStream inFromServer = server_soc.getInputStream(); //step 3
         DataInputStream in =
                        new DataInputStream(inFromServer);
         System.out.println("Client: Response on Server " + in.readUTF());
         server_soc.close();
         }
      catch(MalformedURLException me)
      {
          me.printStackTrace();
      }
      catch(IOException e)
      {
         e.printStackTrace();
      }
   }
}
