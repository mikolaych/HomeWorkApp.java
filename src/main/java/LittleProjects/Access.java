package LittleProjects;

public class Access {
    public static  class Solution {
        public String name = "Amigo";
        public String position = "Java developer";
        public int salary = 10_000;

        public void setPosition(String position) {
            this.position = position;
        }

        public void setSalary(int salary) {
            this.salary = salary;

        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.setPosition("Udod");
        solution.setSalary(2000);
        System.out.println(solution.position + solution.salary);
    }
    int a1 = 1;

}

