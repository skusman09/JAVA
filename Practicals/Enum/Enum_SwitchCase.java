enum Cars{
    BMW,
    TATA,
    GTR,
    TESLA;
}
class EnumSwtchCase{
    public static void main(String args[]){
        Cars car = Cars.GTR;
        switch(car){
            case BMW: System.out.println(" BMW... ");
                break;
            case TATA: System.out.println(" TATA... ");
                break;
            case GTR: System.out.println("GTR...");
                break;
            case TESLA: System.out.println(" TESLA... ");
                break;  
        }
    }
}