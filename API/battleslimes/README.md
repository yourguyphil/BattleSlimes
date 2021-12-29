# Running the Service locally

Pre-req:https://github.com/fullstorydev/grpcui

Navigate to the protos directory 

Local:
grpcui -proto BattleSlimes.proto -plaintext localhost:9090

# Calling the service on server

On GCP:
grpcui -plaintext 35.239.184.105:80

or

grpcui -plaintext battleslimes-api.com:80

or

grpcui -plaintext echo-api.endpoints.battleslimes.cloud.goog:80

# Generating Documentation 

Grpc Docs: https://github.com/pseudomuto/protoc-gen-doc 
(Mount `src/main/proton/gRPCDocs` to `/protos` & `/documentation` to `/out`)

OpenAPI docs: https://www.npmjs.com/package/protobuf2swagger
(Use the config file in `/documentation`)

gcloud endpoints services deploy swagger.yml