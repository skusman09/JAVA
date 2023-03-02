interface Sports { // parent1 interface

    public void homeTeam(String name);

    public void team(int noOfPlayers);
}

interface Event { // parent2 Interface

    public void eventName(String ename);

    public void eventDate(String edate);

    public void eventPlace(String place);
}

class FootBall implements Sports, Event { // child class implments parent interface

    public void homeTeam(String name) {
        System.out.println("Our team is representing :" + name);
    }

    public void team(int noOfPlayers) {
        System.out.println("total no of players :" + noOfPlayers);
    }

    public void goals(int score) {
        System.out.println("total goals of team : " + score);
    }

    public void eventName(String ename) {
        System.out.println("Event Company Name  : " + ename);
    }

    public void eventDate(String edate) {
        System.out.println("Sport match date : " + edate);
    }

    public void eventPlace(String place) {
        System.out.println("Sport at : " + place);
    }
}

class Cricket implements Sports, Event {

    public void homeTeam(String name) {
        System.out.println("Our team is representing :" + name);
    }

    public void team(int noOfPlayers) {
        System.out.println("total no of players :" + noOfPlayers);
    }

    public void eventName(String ename) {
        System.out.println("Event Company Name  : " + ename);
    }

    public void eventDate(String edate) {
        System.out.println("Sport match date : " + edate);
    }

    public void eventPlace(String place) {
        System.out.println("Sport at : " + place);
    }
}

class MultipleInheritance {
    public static void main(String args[]) {
        FootBall b = new FootBall();
        b.homeTeam("Maharashtra");
        b.team(11);
        b.goals(2);
        b.eventName("FIFA");
        b.eventDate("1st Mar,2023");
        b.eventPlace("London");

        Cricket c = new Cricket();
        c.homeTeam("India");
        c.team(11);
        c.eventName("BCCI");
        c.eventDate("21st Apr,2023");
        c.eventPlace("DY London, Navi Mumbai");
    }
}
