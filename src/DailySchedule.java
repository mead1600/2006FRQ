import java.util.ArrayList;

public class DailySchedule {
    private ArrayList apptList;

    public DailySchedule(){
        apptList = new ArrayList();
    }

    public void clearConflicts(Appointment appt){
        int i = apptList.size();
        int amount = 0;
        while(i > 0){
            if(appt.conflictsWith(apptList.get(i)));
        }
    }

    public boolean addAppt
}
