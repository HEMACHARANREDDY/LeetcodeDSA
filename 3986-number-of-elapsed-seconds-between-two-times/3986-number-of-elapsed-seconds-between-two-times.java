class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
      int s = t(startTime);
      int e=t(endTime);
        return e-s;
    }
    private int t(String ti){
        String[] parts=ti.split(":");
        int h=Integer.parseInt(parts[0]);
        int m=Integer.parseInt(parts[1]);
        int s=Integer.parseInt(parts[2]);
        return h*3600+m*60+s;
    }
}