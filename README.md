# README

## Guida

#### installzione server

```sh
npm install -g reveal-md
```

#### avvio server

```sh
reveal-md Documents/corso/slide.md --theme white -w --vertical-separator "___"
```

#### stampa pdf

avviare il server ed eseguire il comando
```sh
docker run --rm -t --net=host -v $OUTPUT_DIR:/slides astefanutti/decktape $URL $OUTPUT_FILENAME

esempio
docker run --rm -t --net=host -v /home/scatolone/Desktop:/slides astefanutti/decktape http://localhost:1948/slide.md#/ prova.pdf
```

#### esempio slide

```md
## This is an H2 Title

Description...

The horizontal slide separator characters are '---'

---

# This is second title

The vertical slide separator characters are '___'

___

## This is a third title

---

## This is a forth title
<!-- .slide: data-background="#f70000" data-transition="page" -->

You can add slide attributes like above.
```

### Anteprima
![anteprima](https://gitlab.tdnet.it/d.ginnasio/slide/-/wikis/uploads/f14240d6adb71d82b134d4921ea79599/Screenshot_from_2021-07-30_17-57-07.png)
