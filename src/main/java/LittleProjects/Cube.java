package LittleProjects;

public class Cube {
    public static void main(String[] args) {
        System.out.println(ninthDegree(2));
    }

    public static long cube(long a){
        return a*a*a;
    }
    public static long ninthDegree(long a){
        return cube(cube(a));
    }
}
