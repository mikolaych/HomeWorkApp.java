package ExamCloud;

public class MassWeek {
    static  String[] mass = new String[7];

    public static void main(String[] args) {
        Mass.dayToMassive();
    }
    private static class Mass{
        public static void dayToMassive(){
            String mo = "Понедельник";
            String tu = "Вторник";
            String we = "Среда";
            String th = "Четверг";
            String fr = "Пятница";
            String sa = "Суббота";
            String su = "Воскресенье";
            mass[0] = mo;
            mass[1] = tu;
            mass[2] = we;
            mass[3] = th;
            mass[4] = fr;
            mass[5] = sa;
            mass[6] = su;
            System.out.println(mass[0]);

        }
    }
}
