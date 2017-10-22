package Papers.Model.Codes;

import java.util.Scanner;

public class DemoC3A {
        private int MCode;
        private String MName;
        private long MPop;
        private float Area;
        private float PopDens;
        public void callDen(){
            PopDens = MPop / Area;
        }
        public void enter(){
            try(Scanner s = new Scanner(System.in)){
                System.out.println("Enter value for MCode, MName, MPop and Area");
                MCode = s.nextInt();
                // add next line after nextFoo() if nextLine is after
                s.nextLine();
                MName = s.nextLine();
                MPop = s.nextLong();
                Area = s.nextFloat();
            }
        }
        public void viewAll(){
            callDen();
            StringBuilder s = new StringBuilder();
            s.append("Metropolis Statistic\n");
            s.append("MCode: ").append(MCode).append("\n");
            s.append("MName: ").append(MName).append("\n");
            s.append("Area: ").append(Area).append(" with the population of ").append(MPop).append("\n");
            if(Float.compare(PopDens, 1200f) > 0)
                s.append("High Populated Area with the Density of ").append(PopDens);
            else s.append("Low Populated Area with the Density of ").append(PopDens);
            System.out.println(s.toString());
        }
        public static void main(String args[]){
            DemoC3A m = new DemoC3A();
            m.enter();
            m.viewAll();
        }

}
