# LaTeX to markdown compiler

**convert extended markdown syntax to compilable latex file.**

```tex:input.tex

# hello!

>Hirkoki
Niceto Meet you!

$$
f(x) = x^2
$$

```
is converted to 

```tex:output.tex

\section{hello!}

\begin{quote}
Hirkoki
Niceto Meet you!
\end{quote}

\begin{gather}
f(x) = x^2
\end{gather}

```

## compile(How to use)
```
$ javac -sourcepath ./ -d classes src/Main.java
$ jar cvfm md4tex.jar MATE-INFO/MANIFEST.MF -C classes .
$ java -jar md4tex.jar path/to/yourfile
```

## usage

### Headline
| md     | tex              |
|--------|------------------|
| \#     | \section{}       |
| \##    | \subsection{}    |
| \###   | \subsubsection{} |
| \####  | \paragraph{}     |
| \##### | \subparagraph{}  |

### Math
| md         | tex                              |
|------------|----------------------------------|
|   \$f(x)$   | \$f(x)$                           |
| \$\$f(x)$$   | \begin{gather} f(x) \end{gather} |
| \$\$\$f(x)$$$ | \begin{align} f(x) \end{align}   |

### Quote
| md         | tex                              |
|------------|----------------------------------|
|   \>Hello  | \begin{quote} Hello \end{quote}  |


### Code
| md         | tex                              |
|------------|----------------------------------|
| \``` print("Hello") \``` | \\begin{lstlisting} print("Hello") \end{lstlisting} |

### Image
| md                    | tex                                                                                                       |
|-----------------------|-----------------------------------------------------------------------------------------------------------|
| \![great](img/src.jpg_lab) | \begin{figure}[H]   \centering   \includegraphics[width=8cm]{img/src.jpg}   \caption{great!} \label{lab} \end{figure} |

### Table 

**not been suppported** :cry:

## Other function

- auto dependency injection
- auto include partial tex file(see example)

