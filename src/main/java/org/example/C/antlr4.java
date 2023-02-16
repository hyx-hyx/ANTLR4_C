package org.example.C;

import org.example.C.C_grammars.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


import java.io.*;

public class antlr4
{
    public static void main(String[] args) throws IOException
    {
        InputStream inputStream=new FileInputStream("src\\main\\java\\org\\example\\input.txt");
        CharStream charStream= CharStreams.fromStream(inputStream);
        CLexer=new CLexer(charStream);
        CommonTokenStream commonTokenStream=new CommonTokenStream(Clexer);
        CParser Cparser=new CParser(commonTokenStream);
        ParseTree parseTree=Cparser.debug();
        System.out.println(parseTree.toStringTree(Cparser));
    }

}
