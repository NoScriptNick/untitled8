import java.util.ArrayList;

public class TrackTeam {
    public static void main(String[] args){
        ArrayList <Coach> coaches = new ArrayList<Coach>();
        ArrayList <Thrower> throwers = new ArrayList<Thrower>();

        //Create Coach Objects
        Coach c1 = new Coach("John", "Jarvis", "Distance", true);
        Coach c2 = new Coach("Emory", "George", "Throws", false);

        //Add Coach objects to coaches ArrayLists
        coaches.add(c1);
        coaches.add(c2);

        //Display Coaches
        for (Coach c: coaches) {
            System.out.println(c);
            System.out.println();
        }

        //Create Thrower objects
        Thrower t1 = new Thrower("Jason", "Ocampo", 12, 0, 31, 97);
        Thrower t2 = new Thrower("Dalton", "Sali", 12, 0, 27, 86);

        //Add Thrower objects to throwers ArrayList
        throwers.add(t1);
        throwers.add(t2);

        t1.setShotPR(36);
        t2.setDiscusPR(105);

        //Display Throwers
        for (Thrower t: throwers) {
            System.out.println(t);
            System.out.println();
        }
    }
}
