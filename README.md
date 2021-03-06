<div id="top"></div>
<!-- PROJECT LOGO -->
<br />
<div align="center">
  <h3 align="center">Welcome to BattleSlimes!</h3>

  <p align="center">
    <img src="https://github.com/yourguyphil/BattleSlimes/blob/main/Art/Socials/BannerBlownupOpenSea.png" />
  </p>

  <p align="center">
    An NFT Monster collecting game. Collect, Trade, BATTLE!
    <br />
    <a href="https://www.battleslimes.com/"><strong>Website Link</strong></a>
    <br />
    <br />
    <a href="https://storage.googleapis.com/battleslimes_bucket/grpc.html">API Endpoint Documentation (gRPC)</a>
    ·
    <a href="https://storage.googleapis.com/battleslimes_bucket/rest.html">API Endpoint Documentation (REST)</a>
    ·
    <a href="https://endpointsportal.battleslimes.cloud.goog/">Endpoints Portal</a>
    ·
    <a href="https://opensea.io/collection/battleslimes">Opensea Collection</a>
    ·
    <a href="https://discord.gg/Rn2pCZF6DM">Discord</a>
    ·
    <a href="https://twitter.com/BattleSlimes">Twitter</a>
    ·
    <a href="https://www.instagram.com/battleslimesofficial/">Instagram</a>
    ·
    <a href="https://www.facebook.com/BattleSlimes-100147072549956">Facebook</a>
  </p>
</div>

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
    <li><a href="#acknowledgments">Acknowledgments</a></li>
  </ol>
</details>


<!-- ABOUT THE PROJECT -->
## About The Project

Pixel Art, Crypto, API development/design, Coding, GCP, and Gaming OH MY!

Features:
* Hand drawn pixel art of ADORABLE slime characters!
* gRPC API (With REST endpoints enabled), hosted on Google Cloud Platform. (Google Kubernetes Engine)
* Front End static website

<p align="right">(<a href="#top">back to top</a>)</p>


### Built With

Just some notable highlights!

* [Aseprite](https://www.aseprite.org/)
* [Springboot](https://spring.io/)
* [gRPC](https://grpc.io/)
* [MongoDB Atlas](https://www.mongodb.com/)
* [Google Cloud Platform](https://cloud.google.com/)
* [Docker](https://www.docker.com/)
* [Kubernetes](https://kubernetes.io/)


<p align="right">(<a href="#top">back to top</a>)</p>


<!-- GETTING STARTED -->
## Getting Started

`API` is where you will find additional API documentation and the source code for the Springboot gRPC API   
`Art` is where you will find images and raw art files  
`Website` is where you will find the static website  
`Notes` are just notes!

### Prerequisites

Java 17  

You can call the gRPC or REST API through `batleslimes-api.com` or use the Docker image/build yourself locally (Both of these require the credentials to connect to the DB). 

https://hub.docker.com/repository/docker/yourguyphil/battleslimes

## API Usage

**Example gRPC Request: BattleSlimeService.GetSlimes**

grpcui -plaintext battleslimes-api.com:90

<p align="center">
  <img src="https://github.com/yourguyphil/BattleSlimes/blob/main/API/battleslimes/documentation/Demo/gRPCGetSlimes.PNG" />
</p>

**Example HTTP Request: BattleSlimeService.GetSlimes**

GET battleslimes-api.com/v1/slimes

<p align="center">
  <img src="https://github.com/yourguyphil/BattleSlimes/blob/main/API/battleslimes/documentation/Demo/RestGetSlimes.PNG" />
</p>

Notice that the gRPC request is **35%** Faster than the HTTP request!  
Please see the README in the API/battleslimes directory for more detailed documentation.  

## Roadmap

- [x] Publish static website, socials, open sea collection, initial API
- [ ] Mint the Slimes!
- [ ] Create Battle Mechanic + inital game, interfacing with Metamask/Wallets
- [ ] GO LIVE SALE
- [ ] Multi-language Support
- [ ] Collection 2

Join us on socials and our discord for more roadmap discussion! 

<p align="right">(<a href="#top">back to top</a>)</p>


## Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

If you have a suggestion that would make this better, please fork the repo and create a pull request. You can also simply open an issue with the tag "enhancement".
Don't forget to give the project a star! Thanks again!

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

<p align="right">(<a href="#top">back to top</a>)</p>



<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE.txt` for more information.

<p align="right">(<a href="#top">back to top</a>)</p>


<!-- ACKNOWLEDGMENTS -->
## Acknowledgments


* [Choose an Open Source License](https://choosealicense.com)
* [GitHub Emoji Cheat Sheet](https://www.webpagefx.com/tools/emoji-cheat-sheet)
* [Malven's Flexbox Cheatsheet](https://flexbox.malven.co/)
* [Malven's Grid Cheatsheet](https://grid.malven.co/)
* [Img Shields](https://shields.io)
* [GitHub Pages](https://pages.github.com)
* [Font Awesome](https://fontawesome.com)
* [React Icons](https://react-icons.github.io/react-icons/search)

<p align="right">(<a href="#top">back to top</a>)</p>
