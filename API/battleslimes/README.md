# Running the Service locally

Pre-req:https://github.com/fullstorydev/grpcui

Navigate to the protos directory 

grpcui -proto BattleSlimes.proto -plaintext localhost:9090

# Generating Documentation 

Grpc Docs: https://github.com/pseudomuto/protoc-gen-doc 
(Mount `src/main/proton/gRPCDocs` to `/protos` & `/documentation` to `/out`)

OpenAPI docs: https://www.npmjs.com/package/protobuf2swagger
(Use the config file in `/documentation`)