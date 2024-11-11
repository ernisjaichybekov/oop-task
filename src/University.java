public class University {

     private String name;
     private int inWhatYearWasTheUniversityBuilt;
     private int numberOfFloors;

     public University(){
     }
     public University(String name,int inWhatYearWasTheUniversityBuilt,int numberOfFloors){
          this.name = name;
          this.inWhatYearWasTheUniversityBuilt = inWhatYearWasTheUniversityBuilt;
          this.numberOfFloors = numberOfFloors;

     }
     public String getName(){
          return name;
     }

     public int getInWhatYearWasTheUniversityBuilt() {
          return inWhatYearWasTheUniversityBuilt;
     }

     public int setNumberOfFloors() {
     return numberOfFloors ;
     }

     public int getNumberOfFloors() {
          return numberOfFloors;
     }

     public void setName(String name) {
          this.name = name;
     }

     public void setInWhatYearWasTheUniversityBuilt(int inWhatYearWasTheUniversityBuilt) {
          this.inWhatYearWasTheUniversityBuilt = inWhatYearWasTheUniversityBuilt;
     }

     public void setNumberOfFloors(int numberOfFloors) {
          this.numberOfFloors = numberOfFloors;
     }

}
