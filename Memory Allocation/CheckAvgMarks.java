class CheckAvgMarks {

    public static String Check(String Name,int ... a)
    {
        float avg=0;
        for (int i = 0; i <a.length; i++) {
            avg+=a[i];
        }
        avg=avg/a.length;
        return (Name+" got average of "+avg);
    }
    public static String Check(String Name)
    {
        return (Name+" got average of 0");
    }

    public static void main(String[] args) {
        System.out.println(Check("John",10,20,30));
        System.out.println(Check("Alice"));
    }
}