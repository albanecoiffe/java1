public class Out extends Exception{
    public Out(){
        this("your number is not between 1 and 10");
    }
    public Out(String message){
        super(message);
    }
}
