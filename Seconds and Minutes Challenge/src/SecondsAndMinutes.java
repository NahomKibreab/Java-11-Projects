public class SecondsAndMinutes {
    public static void main(String[] args) {
        System.out.println(getDurationString(59,59));
        System.out.println(getDurationString(3600));

        String name = "Amen";
        switch (name){
            case "Amen":
                System.out.println("A is found");
                break;
            case "Jesus":
                System.out.println("B is found");
                break;
            default:
                System.out.println("C or D found");
                break;
        }
    }

    public static String getDurationString(int minutes, int seconds){
        if(minutes < 0 || (seconds < 0 || seconds > 59)){
            return "Invalid value";
        }
        int mHours = 0;
        int mMinutes = 0;
        if (minutes > 59){
            mHours = minutes / 60;
            mMinutes = minutes % 60;
        } else {
            mMinutes = minutes;
        }
        String result = mHours + "h" + mMinutes + "m" + seconds + "s";
        return result;
    }

    public static String getDurationString(int seconds){
        if (seconds < 0){
            return "Invalid value";
        }

        int mMintues = seconds / 60;
        int mSeconds = seconds % 60;
        return getDurationString(mMintues, mSeconds);

    }
}
