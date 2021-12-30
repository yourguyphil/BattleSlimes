# Running the Service locally

Pre-req:https://github.com/fullstorydev/grpcui

Navigate to the protos directory 

Local:
grpcui -proto BattleSlimes.proto -plaintext localhost:9090

# Calling the service on server

`grpcui -plaintext battleslimes-api.com:80`

or

`grpcui -plaintext echo-api.endpoints.battleslimes.cloud.goog:80`

## Exmaple Request: BattleSlimeService.GetSlimes

grpcui -plaintext battleslimes-api.com:80

<p align="center">
  <img src="https://github.com/yourguyphil/BattleSlimes/blob/main/API/battleslimes/notes/GetSlimesgRPCExample.PNG" />
</p>

Raw Response
```
{
  "slimes": [
    {
      "collector_number": "1",
      "name": "Blu",
      "description": "",
      "metadata": "",
      "picture": "https://storage.googleapis.com/battleslimes_bucket/assets/images/slimecollection/BattleSlime1.svg",
      "opensea_url": "https://opensea.io/assets/0x495f947276749ce646f68ac8c248420045cb7b5e/38702784988183345035410978490421897305681563005849230365966878050034284232705"
    },
    {
      "collector_number": "2",
      "name": "Spark",
      "description": "",
      "metadata": "",
      "picture": "https://storage.googleapis.com/battleslimes_bucket/assets/images/slimecollection/BattleSlime2.svg",
      "opensea_url": "https://opensea.io/assets/0x495f947276749ce646f68ac8c248420045cb7b5e/38702784988183345035410978490421897305681563005849230365966878051133795860481"
    },
    {
      "collector_number": "3",
      "name": "Apple",
      "description": "",
      "metadata": "",
      "picture": "https://storage.googleapis.com/battleslimes_bucket/assets/images/slimecollection/BattleSlime3.svg",
      "opensea_url": "https://opensea.io/assets/0x495f947276749ce646f68ac8c248420045cb7b5e/38702784988183345035410978490421897305681563005849230365966878052233307488257"
    },
    {
      "collector_number": "4",
      "name": "Boo",
      "description": "",
      "metadata": "",
      "picture": "https://storage.googleapis.com/battleslimes_bucket/assets/images/slimecollection/BattleSlime4.svg",
      "opensea_url": "https://opensea.io/assets/0x495f947276749ce646f68ac8c248420045cb7b5e/38702784988183345035410978490421897305681563005849230365966878053332819116033"
    },
    {
      "collector_number": "5",
      "name": "Devil",
      "description": "",
      "metadata": "",
      "picture": "https://storage.googleapis.com/battleslimes_bucket/assets/images/slimecollection/BattleSlime5.svg",
      "opensea_url": "https://opensea.io/assets/0x495f947276749ce646f68ac8c248420045cb7b5e/38702784988183345035410978490421897305681563005849230365966878054432330743809"
    },
    {
      "collector_number": "6",
      "name": "Poo",
      "description": "",
      "metadata": "",
      "picture": "https://storage.googleapis.com/battleslimes_bucket/assets/images/slimecollection/BattleSlime6.svg",
      "opensea_url": "https://opensea.io/assets/0x495f947276749ce646f68ac8c248420045cb7b5e/38702784988183345035410978490421897305681563005849230365966878055531842371585"
    },
    {
      "collector_number": "7",
      "name": "Fae",
      "description": "",
      "metadata": "",
      "picture": "https://storage.googleapis.com/battleslimes_bucket/assets/images/slimecollection/BattleSlime7.svg",
      "opensea_url": "https://opensea.io/assets/0x495f947276749ce646f68ac8c248420045cb7b5e/38702784988183345035410978490421897305681563005849230365966878056631353999361"
    },
    {
      "collector_number": "8",
      "name": "Shark",
      "description": "",
      "metadata": "",
      "picture": "https://storage.googleapis.com/battleslimes_bucket/assets/images/slimecollection/BattleSlime8.svg",
      "opensea_url": "https://opensea.io/assets/0x495f947276749ce646f68ac8c248420045cb7b5e/38702784988183345035410978490421897305681563005849230365966878057730865627137"
    },
    {
      "collector_number": "9",
      "name": "Sprout",
      "description": "",
      "metadata": "",
      "picture": "https://storage.googleapis.com/battleslimes_bucket/assets/images/slimecollection/BattleSlime9.svg",
      "opensea_url": " https://opensea.io/assets/0x495f947276749ce646f68ac8c248420045cb7b5e/38702784988183345035410978490421897305681563005849230365966878058830377254913"
    },
    {
      "collector_number": "10",
      "name": "Wurm",
      "description": "",
      "metadata": "",
      "picture": "https://storage.googleapis.com/battleslimes_bucket/assets/images/slimecollection/BattleSlime10.svg",
      "opensea_url": "https://opensea.io/assets/0x495f947276749ce646f68ac8c248420045cb7b5e/38702784988183345035410978490421897305681563005849230365966878059929888882689"
    },
    {
      "collector_number": "11",
      "name": "Bat",
      "description": "",
      "metadata": "",
      "picture": "https://storage.googleapis.com/battleslimes_bucket/assets/images/slimecollection/BattleSlime11.svg",
      "opensea_url": "https://opensea.io/assets/0x495f947276749ce646f68ac8c248420045cb7b5e/38702784988183345035410978490421897305681563005849230365966878061029400510465"
    },
    {
      "collector_number": "12",
      "name": "Rex",
      "description": "",
      "metadata": "",
      "picture": "https://storage.googleapis.com/battleslimes_bucket/assets/images/slimecollection/BattleSlime12.svg",
      "opensea_url": "https://opensea.io/assets/0x495f947276749ce646f68ac8c248420045cb7b5e/38702784988183345035410978490421897305681563005849230365966878062128912138241"
    },
    {
      "collector_number": "13",
      "name": "Ron",
      "description": "",
      "metadata": "",
      "picture": "https://storage.googleapis.com/battleslimes_bucket/assets/images/slimecollection/BattleSlime13.svg",
      "opensea_url": "https://opensea.io/assets/0x495f947276749ce646f68ac8c248420045cb7b5e/38702784988183345035410978490421897305681563005849230365966878063228423766017"
    },
    {
      "collector_number": "14",
      "name": "Darky",
      "description": "",
      "metadata": "",
      "picture": "https://storage.googleapis.com/battleslimes_bucket/assets/images/slimecollection/BattleSlime14.svg",
      "opensea_url": " https://opensea.io/assets/0x495f947276749ce646f68ac8c248420045cb7b5e/38702784988183345035410978490421897305681563005849230365966878064327935393793"
    },
    {
      "collector_number": "15",
      "name": "Wim",
      "description": "",
      "metadata": "",
      "picture": "https://storage.googleapis.com/battleslimes_bucket/assets/images/slimecollection/BattleSlime15.svg",
      "opensea_url": "https://opensea.io/assets/0x495f947276749ce646f68ac8c248420045cb7b5e/38702784988183345035410978490421897305681563005849230365966878065427447021569"
    },
    {
      "collector_number": "16",
      "name": "Trub",
      "description": "",
      "metadata": "",
      "picture": "https://storage.googleapis.com/battleslimes_bucket/assets/images/slimecollection/BattleSlime16.svg",
      "opensea_url": " https://opensea.io/assets/0x495f947276749ce646f68ac8c248420045cb7b5e/38702784988183345035410978490421897305681563005849230365966878066526958649345"
    },
    {
      "collector_number": "17",
      "name": "Shine",
      "description": "",
      "metadata": "",
      "picture": "https://storage.googleapis.com/battleslimes_bucket/assets/images/slimecollection/BattleSlime17.svg",
      "opensea_url": "https://opensea.io/assets/0x495f947276749ce646f68ac8c248420045cb7b5e/38702784988183345035410978490421897305681563005849230365966878067626470277121"
    },
    {
      "collector_number": "18",
      "name": "Grog",
      "description": "",
      "metadata": "",
      "picture": "https://storage.googleapis.com/battleslimes_bucket/assets/images/slimecollection/BattleSlime18.svg",
      "opensea_url": "https://opensea.io/assets/0x495f947276749ce646f68ac8c248420045cb7b5e/38702784988183345035410978490421897305681563005849230365966878068725981904897"
    },
    {
      "collector_number": "19",
      "name": "Rainbow",
      "description": "",
      "metadata": "",
      "picture": "https://storage.googleapis.com/battleslimes_bucket/assets/images/slimecollection/BattleSlime19.svg",
      "opensea_url": "https://opensea.io/assets/0x495f947276749ce646f68ac8c248420045cb7b5e/38702784988183345035410978490421897305681563005849230365966878069825493532673"
    },
    {
      "collector_number": "20",
      "name": "Blu(S)",
      "description": "",
      "metadata": "",
      "picture": "https://storage.googleapis.com/battleslimes_bucket/assets/images/slimecollection/BattleSlime20.svg",
      "opensea_url": "https://opensea.io/assets/0x495f947276749ce646f68ac8c248420045cb7b5e/38702784988183345035410978490421897305681563005849230365966878070925005160449"
    },
    {
      "collector_number": "21",
      "name": "Spark(S)",
      "description": "",
      "metadata": "",
      "picture": "https://storage.googleapis.com/battleslimes_bucket/assets/images/slimecollection/BattleSlime21.svg",
      "opensea_url": "https://opensea.io/assets/0x495f947276749ce646f68ac8c248420045cb7b5e/38702784988183345035410978490421897305681563005849230365966878072024516788225"
    },
    {
      "collector_number": "22",
      "name": "Apple(S)",
      "description": "",
      "metadata": "",
      "picture": "https://storage.googleapis.com/battleslimes_bucket/assets/images/slimecollection/BattleSlime22.svg",
      "opensea_url": "https://opensea.io/assets/0x495f947276749ce646f68ac8c248420045cb7b5e/38702784988183345035410978490421897305681563005849230365966878073124028416001"
    },
    {
      "collector_number": "23",
      "name": "Bat(S)",
      "description": "",
      "metadata": "",
      "picture": "https://storage.googleapis.com/battleslimes_bucket/assets/images/slimecollection/BattleSlime23.svg",
      "opensea_url": "https://opensea.io/assets/0x495f947276749ce646f68ac8c248420045cb7b5e/38702784988183345035410978490421897305681563005849230365966878074223540043777"
    },
    {
      "collector_number": "24",
      "name": "Devil(S)",
      "description": "",
      "metadata": "",
      "picture": "https://storage.googleapis.com/battleslimes_bucket/assets/images/slimecollection/BattleSlime24.svg",
      "opensea_url": "https://opensea.io/assets/0x495f947276749ce646f68ac8c248420045cb7b5e/38702784988183345035410978490421897305681563005849230365966878075323051671553"
    },
    {
      "collector_number": "25",
      "name": "Fae(S)",
      "description": "",
      "metadata": "",
      "picture": "https://storage.googleapis.com/battleslimes_bucket/assets/images/slimecollection/BattleSlime25.svg",
      "opensea_url": "https://opensea.io/assets/0x495f947276749ce646f68ac8c248420045cb7b5e/38702784988183345035410978490421897305681563005849230365966878076422563299329"
    }
  ]
}
```

## Exmaple Request: BattleSlimeService.GetSlime

Raw Request 
```
{
  "collectorNumber": "1"
}
```

grpcui -plaintext battleslimes-api.com:80

<p align="center">
  <img src="https://github.com/yourguyphil/BattleSlimes/blob/main/API/battleslimes/notes/GetSlimegRPCExample.PNG" />
</p>

Raw Response
```
{
  "collector_number": "1",
  "name": "Blu",
  "description": "",
  "metadata": "",
  "picture": "https://storage.googleapis.com/battleslimes_bucket/assets/images/slimecollection/BattleSlime1.svg",
  "opensea_url": "https://opensea.io/assets/0x495f947276749ce646f68ac8c248420045cb7b5e/38702784988183345035410978490421897305681563005849230365966878050034284232705"
}
```

# Generating Documentation 

Grpc Docs: https://github.com/pseudomuto/protoc-gen-doc 
(Mount `src/main/proton/gRPCDocs` to `/protos` & `/documentation` to `/out`)

OpenAPI docs: https://www.npmjs.com/package/protobuf2swagger
(Use the config file in `/documentation`)

gcloud endpoints services deploy swagger.yml
