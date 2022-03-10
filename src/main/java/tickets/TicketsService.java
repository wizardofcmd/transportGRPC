package tickets;

import com.transportSystem.grpc.purchaseInfo;
import com.transportSystem.grpc.ticketDetails;
import com.transportSystem.grpc.ticketsAvailable;
import com.transportSystem.grpc.ticketsGrpc.ticketsImplBase;
import com.transportSystem.grpc.trainRoute;

import io.grpc.stub.StreamObserver;

public class TicketsService extends ticketsImplBase{

	@Override
	public void buyTicket(purchaseInfo request, StreamObserver<ticketDetails> responseObserver) {
		String trainRoute = request.getTrainRoute();
		
		ticketDetails.Builder response = ticketDetails.newBuilder();
		
		response.setConfirmed("Ticket purchased successfully. Route"
				+ ": " + trainRoute);
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}

	@Override
	public void checkAvailableTickets(trainRoute request, StreamObserver<ticketsAvailable> responseObserver) {
		String[] seatTypes = {"First Class Tickets Available", "Second Class Tickets Available",
		"Economy Class Tickets Available"};
		String route = request.getRoute();
		
		for(String i : seatTypes) {
		
			int rand_num = (int)(Math.random()* (50 + 1));
			String tickets = String.valueOf(rand_num);
			
			System.out.println(tickets + " " + i);
			ticketsAvailable.Builder response = ticketsAvailable.newBuilder();
		
			response.setTicketDetail(tickets + " " + i + " for Route " + route);
			responseObserver.onNext(response.build());
			
			try {
				//wait for a second
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		responseObserver.onCompleted();
	}
	
}