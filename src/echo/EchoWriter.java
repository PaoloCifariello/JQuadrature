package echo;

/*
 * @(#)EchoWriter.java	1.0, 07/04/02
 *
 * Copyright 2002 Francesco Romani.
 * 
 * 
 */

import java.io.*;

/**
 * This class allows to mirror the output on the console and on a file
 *
 * @author  Francesco Romani
 * @version 1.0, 07/04/02
 */
public class EchoWriter {     
    /**
     * The internal PrintWriter
     */    
    private PrintWriter out = null;
    
    private boolean console = true;
    
    /**
     * Constructor from a filename
     * @param fileName the string representing the file to write onto
     *  if fileName==null no mirroring is done and the output is written on System.out only
     * @throws IOException in case of i/o error.
     */
  	public EchoWriter(String fileName) throws IOException{
  		if(fileName!=null) out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)), true);
 	}
 
    /**
     * Constructor from a file
     * @param file the File representing the file to write onto
     *  if file==null no mirroring is done and the output is written on System.out only
     * @throws IOException in case of i/o error.
     */
  	public EchoWriter(File file) throws IOException{
  		if(file!=null) out = new PrintWriter(new BufferedWriter(new FileWriter(file, true)), true);
 	}
 
    /**
     * activate or deactivate the console writing
     * @param console a boolean to say whether to write on System.out
     */
 	public void consoleEcho(boolean console){
     	this.console = console;
    }
 	
 	/**
     * print a String and then finish the line
     * @param line the String to print
     */
 	public void println(String line){
     	if(console)System.out.println(line);
     	if(out!=null) out.println(line);
    }
    
    /**
     * finish the line
     * @param line the String to print
     */
 	public void println(){
     	if(console)System.out.println();
     	if(out!=null) out.println();
 	}
    
    /**
     * print a String
     * @param line the String to print
     */
 	public void print(String line){
     	if(console)System.out.print(line);
      	if(out!=null) out.print(line);
    }
    
    /**
     * print an integer
     * @param i the int to print
     */
 	public void println(int i){
     	if(console)System.out.println(i);
     	if(out!=null) out.println(i);
    }
    
    /**
     * print an integer and then finish the line
     * @param i the int to print
     */
 	public void print(int i){
     	if(console)System.out.print(i);
      	if(out!=null) out.print(i);
    }
    
    /**
     * print a short
     * @param i the short to print
     */
 	public void println(short i){
     	if(console)System.out.println(i);
     	if(out!=null) out.println(i);
    }
    
    /**
     * print a short and then finish the line
     * @param i the short to print
     */
 	public void print(short i){
     	if(console)System.out.print(i);
      	if(out!=null) out.print(i);
    }
    
    /**
     * print a long
     * @param i the long to print
     */
 	public void println(long i){
     	if(console)System.out.println(i);
     	if(out!=null) out.println(i);
    }
    
    /**
     * print a long and then finish the line
     * @param i the long to print
     */
 	public void print(long i){
     	if(console)System.out.print(i);
      	if(out!=null) out.print(i);
    }
    
    /**
     * print a double and then finish the line
     * @param d the double to print
     */
 	public void println(double d){
     	if(console)System.out.println(d);
     	if(out!=null) out.println(d);
    }
    
    /**
     * print a double
     * @param d the double to print
     */
 	public void print(double d){
     	if(console)System.out.print(d);
      	if(out!=null) out.print(d);
    }
    
    /**
     * print a float and then finish the line
     * @param x the float to print
     */
 	public void println(float x){
     	if(console)System.out.println(x);
     	if(out!=null) out.println(x);
    }
    
    /**
     * print a float
     * @param x the float to print
     */
 	public void print(float x){
     	if(console)System.out.print(x);
      	if(out!=null) out.print(x);
    }
    
    /**
     * print a boolean and then finish the line
     * @param x the boolean to print
     */
 	public void println(boolean x){
     	if(console)System.out.println(x);
     	if(out!=null) out.println(x);
    }
    
    
    /**
     * print a boolean
     * @param x the boolean to print
     */
 	public void print(boolean x){
     	if(console)System.out.print(x);
      	if(out!=null) out.print(x);
    }

    /**
     *  Flush the stream and check its error state. Errors are cumulative; once the
     *  stream encounters an error, this routine will return true on all successive calls. 
     *  @return true if the print stream has encountered an error, either on the
     *  underlying output stream or during a format conversion, if the file is not opened return false. 
     */
 	public boolean checkError(){
 		if(out!=null) return out.checkError();
 		return false;
 	}
 	
    /**
     *  Flush the stream
     */
 	public void flush(){
 		if(out!=null) out.flush();
 	}
 	
 	
    /**
     * print an array of char and then finish the line
     * @param a the array to print
     */
 	public void println(char[] a){
 		if(console)System.out.println(a);
     	if(out!=null) out.println(a);
    }
    
    /**
     * print an array of char
     * @param a the array to print
     */
 	public void print(char[] a){
     	if(console)System.out.print(a);
      	if(out!=null) out.print(a);
    }
    
    /**
     * print an Object and then finish the line
     * @param x the float to print
     */
 	public void println(Object x){
     	if(console)System.out.println(x);
     	if(out!=null) out.println(x);
    }
    
    /**
     * print an Object
     * @param x the float to print
     */
 	public void print(Object x){
     	if(console)System.out.print(x);
      	if(out!=null) out.print(x);
    }
    
    /**
     * close the file
     */
 	public void close(){
      	if(out!=null) out.close();
      	out = null;
    }
}
