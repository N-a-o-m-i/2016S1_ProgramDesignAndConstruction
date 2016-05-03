package question3;

public class PrintNums implements Runnable{
    
    int num;
    
    public PrintNums(int n){
        this.num=n;        
    }
    public synchronized void printNumbers(){
        
        try
        {
            for(int i=1; i<=5; i++)
            {
                System.out.println((2*i-this.num) + "......" + Thread.currentThread().getName());
                if(Thread.currentThread().getName().equals("Thread-1"))
                {
                    Thread.yield();
                }
            } 
        }
        catch(Exception e){}
    }        

    @Override
    public void run() {
        printNumbers();
    }    
    
    public static void main(String[] args){
        PrintNums oddPrint=new PrintNums(1);
        PrintNums evenPrint=new PrintNums(0);
        System.out.println("Odd numbers: ");
        oddPrint.printNumbers();
        System.out.println("Even numbers: ");
        evenPrint.printNumbers();
        
        Thread oddThread = new Thread(oddPrint);
        Thread evenThread = new Thread(evenPrint);

        oddThread.start();
        evenThread.start();
    }
}