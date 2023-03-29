enum TrafficSignal{
    RED("stop"),
    GREEN("Go"),
    YELLOW("Slow Down");
    String action;
    public String getAction(){
        return action;
    }
    TrafficSignal(String action){
        this.action=action;
    }
}




class EnumEx{
     public static void main(String args[]){
         TrafficSignal ts=TrafficSignal.YELLOW;
         System.out.println(ts.getAction());
     }
    
}
