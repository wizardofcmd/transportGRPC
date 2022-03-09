package tickets;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.Properties;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import tickets.TicketsService;

public class TicketsServer{
	public static void main(String[] args) {
		TicketsServer ticketsServer = new TicketsServer();

		Properties prop = ticketsServer.getProperties();
		
		ticketsServer.registerService(prop);
		
		int port = Integer.valueOf(prop.getProperty("service_port"));

		try {

			Server server = ServerBuilder.forPort(port)
					.addService(new TicketsService())
					.build()
					.start();

			System.out.println("Math Server started, listening on " + port);

			server.awaitTermination();


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
	
	
	private Properties getProperties() {
		
		Properties prop = null;		
		
		 try (InputStream input = new FileInputStream("src/main/resources/ticket.properties")) {

	            prop = new Properties();

	            // load a properties file
	            prop.load(input);

	            // get the property value and print it out
	            System.out.println("\t service_type: " + prop.getProperty("service_type"));
	            System.out.println("\t service_name: " +prop.getProperty("service_name"));
	            System.out.println("\t service_description: " +prop.getProperty("service_description"));
		        System.out.println("\t service_port: " +prop.getProperty("service_port"));

	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
	
		 return prop;
	}
	
	
	private  void registerService(Properties prop) {
		
		 try {
	            // Create a JmDNS instance
	            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
	            
	            String service_type = prop.getProperty("service_type") ;
	            String service_name = prop.getProperty("service_name")  ;
	            int service_port = Integer.valueOf( prop.getProperty("service_port"));
	            
	            String service_description_properties = prop.getProperty("service_description");
	            
	            // Register a service
	            ServiceInfo serviceInfo = ServiceInfo.create(service_type, service_name, service_port, service_description_properties);
	            jmdns.registerService(serviceInfo);
	            
	            System.out.printf("Registering service with type %s and name %s \n", service_type, service_name);
	            
	            // Wait a bit
	            Thread.sleep(1000);

	            // Unregister all services
	            //jmdns.unregisterAllServices();

	        } catch (IOException e) {
	            System.out.println(e.getMessage());
	        } catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    
	}
}