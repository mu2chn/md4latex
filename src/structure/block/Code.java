package src.structure.block;

public class Code extends Block{

    public Code(){
        super();
    }

    @Override
    public String prevDump(){
        return "\n\\begin{lstlisting}\n";
    }

    @Override
    public String nextDump(){
        return "\n\\end{lstlisting}\n";
    }
}