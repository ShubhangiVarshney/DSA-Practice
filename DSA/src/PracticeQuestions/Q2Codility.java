package PracticeQuestions;


import java.util.ArrayList;
import java.util.List;

public class Q2Codility {

    public String[] solution(String[] driversArray) {
          List<Driver> drivers= createDrivers(driversArray);
          int index=0;
          String[] result=new String[drivers.size()];
          for (Driver driver:drivers){
              String driverData=driver.getDriverName()+",";
              driverData += driver.getDriverAge()>=19 && driver.getSafetyCourseTaken();
              driverData += ",";
              driverData += driver.getMonthsSinceLastAccident()==-1 || driver.getMonthsSinceLastAccident()>60;
              driverData += "," ;
              driverData +=  (driver.getCurrentOdometer()-driver.getOdometeFrom6MonthsPrior())<5000 && driver.getOdometeFrom6MonthsPrior()>0;
              System.out.println("mileage: "+ driver.getCurrentOdometer()+" "+driver.getOdometeFrom6MonthsPrior());
              driverData += "," ;
              driverData += driver.getDriverAge()>55;
              result[index]=driverData;
              index++;
          }
          return result;
    }


    List<Driver> createDrivers(String[] driversArray) {
        List<Driver> drivers = new ArrayList<Driver>();
        for (String driverString : driversArray) {
            String[] splitDriver = driverString.split(",");
            drivers.add(new Driver(splitDriver));
        }
        return drivers;
    }
}

class Driver {
    private String driverName;
    private Integer driverAge;
    private Long odometeFrom6MonthsPrior;
    private Long currentOdometer;
    private Integer monthsSinceLastAccident;
    private Boolean safetyCourseTaken;

    Driver(String[] input) {
        if (input.length == 6) {
            this.driverName = input[0];
            this.driverAge = Integer.parseInt(input[1]);
            if (input[2] == null || input[2].equals(""))
                this.odometeFrom6MonthsPrior = 0L;
            else
                this.odometeFrom6MonthsPrior = Long.parseLong(input[2]);
            this.currentOdometer = Long.parseLong(input[3]);
            this.monthsSinceLastAccident = Integer.parseInt(input[4]);
            this.safetyCourseTaken = input[5].equalsIgnoreCase("true");
        }

    }

    public String getDriverName() {
        return this.driverName;
    }

    public Integer getDriverAge() {
        return this.driverAge;
    }

    public Long getOdometeFrom6MonthsPrior() {
        return this.odometeFrom6MonthsPrior;
    }

    public Long getCurrentOdometer() {
        return this.currentOdometer;
    }

    public Integer getMonthsSinceLastAccident() {
        return this.monthsSinceLastAccident;
    }

    public Boolean getSafetyCourseTaken() {
        return this.safetyCourseTaken;
    }
    public static void main (String[] args){
        Q2Codility q2=new Q2Codility();
         String[] arr={"Alpha,15,0,3000,-1,true", "Beta,22,0,3500,0,FALSE", "Gamma,88,1,50000,60,FALSE", "Delta,75,,175,4,FALSE"};
        String[] res=q2.solution(arr);
        for(int i=0; i<arr.length; i++){
            System.out.println(res[i]);
        }

    }
}


