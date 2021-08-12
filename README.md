# README

## Guida

#### installzione server

```sh
npm install -g reveal-md
```

#### avvio server

```sh
npm start
```

#### export static

```sh
npm run build
```

#### stampa pdf

avviare il server ed eseguire il comando
```sh
docker run --rm -t --net=host -v $OUTPUT_DIR:/slides astefanutti/decktape $URL $OUTPUT_FILENAME

esempio
docker run --rm -t --net=host -v /home/scatolone/Desktop:/slides astefanutti/decktape http://localhost:1948/slide.md#/ prova.pdf
```


### Link
https://github.com/webpro/reveal-md#reveal-md-options
https://blog.hanklu.tw/post/2021/use-reveal-md-to-generate-multiple-slides-and-host-them-on-github-page/