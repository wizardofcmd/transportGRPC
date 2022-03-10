package timetables;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Random;

import com.transportSystem.grpc.TimetableProto.trainRide;
import com.transportSystem.grpc.TimetableProto.trainTimetables;
import com.transportSystem.grpc.timetableGrpc.timetableImplBase;

import io.grpc.stub.StreamObserver;

public class TimetablesService extends timetableImplBase {
	@Override
	public StreamObserver<trainRide> getTimetables(StreamObserver<trainTimetables> responseObserver) {
		return new StreamObserver<trainRide>() {
			ArrayList<String> rides = new ArrayList();
			@Override
			public void onNext(trainRide req) {
				rides.add(req.getRoute());
			}
			
			@Override
			public void onError(Throwable t) {
				t.printStackTrace();
			}
			
			@Override
			public void onCompleted() {
				Random random = new Random();
				String msg = "";
				for (String i : rides) {
				    LocalDateTime time = LocalDateTime.of(LocalDate.now(), 
				            LocalTime.of(random.nextInt(24), random.nextInt(60),
				            random.nextInt(60), random.nextInt(999999999 + 1)));
				    msg += i + " timetable: " + time.toString() + " ~~~ "; 
				}
				
				trainTimetables.Builder response = trainTimetables.newBuilder();
				response.setTimetables(msg);
				
				responseObserver.onNext(response.build());
				
				responseObserver.onCompleted();
			}
		};
	}
}