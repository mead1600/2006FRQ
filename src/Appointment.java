public class Appointment {
    private TimeInterval point;

    public Appointment(TimeInterval point){
        this.point = point;
    }

    public TimeInterval getTime(){
        return this.point;
    }

    public boolean conflictsWith(Appointment other){
        if(this.point == other.getTime()){
            return true;
        }
        return false;
    }
}
