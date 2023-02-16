package org.example.C;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.example.C.C_grammars.antlr.preprocessLexer;
import org.example.C_grammars.antlr.preprocessParser;

import java.io.*;

public class antlr4
{
    public static void main(String[] args) throws IOException
    {
        InputStream inputStream=new FileInputStream("src\\main\\java\\org\\example\\input.txt");
        CharStream charStream= CharStreams.fromStream(inputStream);
        preprocessLexer preprocesslexer=new preprocessLexer(charStream);
        CommonTokenStream commonTokenStream=new CommonTokenStream(preprocesslexer);
        preprocessParser preprocessparser=new preprocessParser(commonTokenStream);
        ParseTree parseTree=preprocessparser.debug();
        System.out.println(parseTree.toStringTree(preprocessparser));
    }

}
