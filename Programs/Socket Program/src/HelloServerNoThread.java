
import java.net.*;
import java.io.*;

public class HelloServerNoThread
{
   public static void main(String [] args) throws Exception
   {

	   int port = 6066;
	     //Create ServerSocket and bind to port
	  ServerSocket server_obj = new ServerSocket(port);
	  int req_num = 0;
	  //waits for 65000 milliseconds to receive request from client
	  //If no request is received from client within 65000, 
	  //SocketTimeoutException is thrown
	  server_obj.setSoTimeout(65000);
	  

	
				  for(;;) //infinite for loop
				  {
					   try
					      {
	     System.out.println("New Server: ..Waiting for client request on port number " +server_obj.getLocalPort() );
		 Socket client_soc = server_obj.accept();
		 DataInputStream in =
		       new DataInputStream(client_soc.getInputStream());
		 System.out.println(in.readUTF());//UTF - Unicode Text Format
		 req_num++;
		 DataOutputStream out =
		      new DataOutputStream(client_soc.getOutputStream());
		 out.writeUTF("[From Server] This message is from server "
		   + client_soc.getLocalSocketAddress() + " fffffffffgggggggghhhhhh"+req_num);
		 System.out.println("--------------Reg no."+req_num+" served--------------");
		         client_soc.close();
					      }
					   catch(SocketTimeoutException ste)
					   {
						   ste.printStackTrace();
					   }
					   catch(IOException ioe)
					   {
						   ioe.printStackTrace();
					   }
					   catch(Exception ep)
					   {
					         System.out.println("Server: Exception occurred");
					         ep.printStackTrace();
					   }
				  }
	      
	  
   }
}
