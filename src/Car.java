public class Car {

    private String name;
    private String stamp;
    private int yearOfRelease;
    private float voIume;


    public Car (){

    }
    public Car(String name, String stamp,int yearOfReIease,float voIume){
        this.name = name;
        this.stamp = stamp;
        this.yearOfRelease = yearOfReIease;
        this.voIume = voIume;

    }
    public String getName(){
        return name;
    }

    public String getStamp() {
        return stamp;
    }
    public int getYearOfRelease() {
        return yearOfRelease;
    }
    public double getVoIume(){
        return voIume;

    }
    public void setName (String name){
        this.name = name;
    }
    public void setStamp(String setamp){
      this .stamp = stamp;

    }
    public void setYearOfReIease(int yearOfReIease){
        this.yearOfRelease = yearOfReIease;
    }

    public void setVoIume(float voIume){
        this.voIume = voIume;
    }

}
