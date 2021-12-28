package com.battleslimes.battleslimes.resources;

import com.battleslimes.battleslimes.services.BattleSlimeServiceGrpc;
import com.battleslimes.battleslimes.services.BattleSlimes;
import com.battleslimes.battleslimes.services.BattleSlimeService;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GrpcService
public class BattleSlimesResource extends BattleSlimeServiceGrpc.BattleSlimeServiceImplBase {

    @Autowired
    private BattleSlimeService battleSlimeService;

    @Override
    public void getSlimes(Empty request, StreamObserver<BattleSlimes.SlimeCollection> responseObserver) {
        var battleSlimeCollection = battleSlimeService.getAllSlimes();

        responseObserver.onNext(battleSlimeCollection);
        responseObserver.onCompleted();
    }

    @Override
    public void getSlime(BattleSlimes.GetSlimeRequest request, StreamObserver<BattleSlimes.Slime> responseObserver) {
        try {
            var battleSlime = battleSlimeService.getSlime(request.getCollectorNumber());

            responseObserver.onNext(battleSlime);
            responseObserver.onCompleted();
        } catch(Exception e) {
            responseObserver.onError(e);
        }
    }

    @Override
    public void getRandomSlime(Empty request, StreamObserver<BattleSlimes.Slime> responseObserver) {
        try {
            var battleSlime =  battleSlimeService.getRandomSlime();

            responseObserver.onNext(battleSlime);
            responseObserver.onCompleted();
        } catch(Exception e) {
            responseObserver.onError(e);
        }
    }
}
