/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author kevinjerke
 */
public class Messager {
     private Input input;
    private Output output;
    
    public Messager(Input reader, Output writer){
        this.input = reader;
        this.output = writer;
    }
    
    public void produceMessage(){
        output.writeln(input.readln());
    }
}
