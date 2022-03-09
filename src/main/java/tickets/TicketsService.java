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

	}
	
}