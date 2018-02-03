/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smpro;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 *
 * @author 1412625
 * this class contains the main method of the application
 */
public class SMProTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SMPro smp = new SMPro();
        Random r = new Random();
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for(char c = 'A'; c <'K'; c++){
            executorService.submit(new Terminal(""+c, smp, r)); 
        }
        executorService.shutdown();
    }
  
}
/**the terminal class act as terminal(external company) that sends messages to the application 
 * the message sent are generated from Transaction Message class
 * the terminal thread runs in a while loop until a condition is met 
 * it prints out "we are pausing"
 * 
 * *
 * @author 1412625
 */
class Terminal implements Callable<Void>{
 private final String name;
 private  boolean flagger = false;
    private SMPro smp;
    private Random r;
    public Terminal(String name, SMPro smp, Random r) { 
        this.name = "Terminal" + name;
        this.smp = smp;
        this.r = r;
    }

    
    @Override
    public Void call() {
        do{
            try {
                Thread.sleep(r.nextInt(2500));
                if(smp.isFlag()){
                    //RegExer.main(TransactionMessages.createTransactionMessage());
                    String sr = TransactionMessages.createTransactionMessage(r);
                    System.out.println(name+": sending ... "+sr);
                    smp.setMessage(sr);
                    
                }else{
                    flagger = true;
                    System.out.println(name+": we are pausing...");
                }   } catch (InterruptedException ex) { 
                    ex.printStackTrace();
            }       
        }while(!flagger);
        return null;
    }
 @Override
    public String toString(){
    return name;
    }
}