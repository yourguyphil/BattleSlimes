package com.battleslimes.battleslimes.resources;

import com.battleslimes.battleslimes.com.battleslimes.battleslimes.services.BattleSlimeServiceGrpc;
import com.battleslimes.battleslimes.com.battleslimes.battleslimes.services.BattleSlimes;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class BattleSlimesResource extends BattleSlimeServiceGrpc.BattleSlimeServiceImplBase {
    @Override
    public void getSlimes(Empty request, StreamObserver<BattleSlimes.SlimeCollection> responseObserver) {
        BattleSlimes.Slime blu = BattleSlimes.Slime
                .newBuilder()
                .setCollectorNumber("1")
                .setName("Blu")
                .setPicture("INSERT PICTURE OF BLU")
                .build();

        BattleSlimes.SlimeCollection response = BattleSlimes.SlimeCollection
                .newBuilder()
                .addSlimes(blu)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getSlime(BattleSlimes.GetSlimeRequest request, StreamObserver<BattleSlimes.Slime> responseObserver) {
        super.getSlime(request, responseObserver);
    }

    @Override
    public void getRandomSlime(Empty request, StreamObserver<BattleSlimes.Slime> responseObserver) {
        super.getRandomSlime(request, responseObserver);
    }
}
