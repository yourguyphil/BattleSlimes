package com.battleslimes.battleslimes.resources;

import com.battleslimes.battleslimes.services.BattleSlimeServiceGrpc;
import com.battleslimes.battleslimes.services.BattleSlimes;
import com.battleslimes.battleslimes.services.BattleSlimeService;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GrpcService
@Slf4j
public class BattleSlimesResource extends BattleSlimeServiceGrpc.BattleSlimeServiceImplBase {

    @Autowired
    private BattleSlimeService battleSlimeService;

    @Override
    public void getSlimes(Empty request, StreamObserver<BattleSlimes.SlimeCollection> responseObserver) {
        log.info("Request to getSlimes!");
        try {
            var battleSlimeCollection = battleSlimeService.getAllSlimes();

            responseObserver.onNext(battleSlimeCollection);
            responseObserver.onCompleted();
            log.info("Request to getSlimes Success!");
        } catch(Exception e) {
            responseObserver.onError(e);
            log.info("Request to getSlimes Error: " + e);
        }
    }

    @Override
    public void getSlime(BattleSlimes.GetSlimeRequest request, StreamObserver<BattleSlimes.Slime> responseObserver) {
        log.info("Request to getSlime!");
        try {
            var battleSlime = battleSlimeService.getSlime(request.getCollectorNumber());

            responseObserver.onNext(battleSlime);
            responseObserver.onCompleted();
            log.info("Request to getSlime Success!");
        } catch(Exception e) {
            responseObserver.onError(e);
            log.info("Request to getSlime Error: " + e);
        }
    }

    @Override
    public void getRandomSlime(Empty request, StreamObserver<BattleSlimes.Slime> responseObserver) {
        log.info("Request to getRandomSlime!");
        try {
            var battleSlime =  battleSlimeService.getRandomSlime();

            responseObserver.onNext(battleSlime);
            responseObserver.onCompleted();
            log.info("Request to getRandomSlime Success!");
        } catch(Exception e) {
            responseObserver.onError(e);
            log.info("Request to getRandomSlime Error: " + e);
        }
    }
}
