package jboos.common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		// creates an input stream for the file to be parsed
        FileInputStream in = new FileInputStream("C:/GitRepo/Proyek-3_ECR/src/main/java/jboos/common/HelloWorld.java");

        // parse it
        CompilationUnit cu = JavaParser.parse(in);

        // visit and print the methods names
        new MethodVisitor().visit(cu, null);
	}

}
