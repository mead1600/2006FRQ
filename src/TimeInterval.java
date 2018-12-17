public class TimeInterval {

    private String Time;

    public String getTime() {
        return Time;
    }

    public TimeInterval(String Time){
        this.Time = Time;
    }

    public boolean overlapsWith(TimeInterval interval)
    {
        if(this.Time.equals(interval.getTime())){
            return true;
        }
        return false;
    }

}
