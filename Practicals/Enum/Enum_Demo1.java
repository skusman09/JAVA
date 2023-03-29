enum Directions{
    NORTH,
    WEST,
    EAST,
    SOUTH;
    
}
class EnumExample{
    Directions direction;
    void checkDirection(){
        switch(direction){
            case NORTH: System.out.println("North is the direction");
                break;
            case WEST: System.out.println("West is the direction");
                break;
             case SOUTH: System.out.println("South is the direction");
                break;
            case EAST: System.out.println("EAST is the direction");
                break;
        }
    }
    
    
    public static void main(String args[]){
        String str="Monday";
        EnumExample e=new EnumExample(Directions.valueOf(str));//will Show error
        e.checkDirection();
    }
}