public class Schoot {

    private String name;
    private int yearOfContruction;
    private int namberOfloors;

    public Schoot(){
    }

    public Schoot(String name,int yearOfContruction,int namberOfloors){
        this.name = name;
        this.yearOfContruction = yearOfContruction;
        this.namberOfloors = namberOfloors;
    }
    public String getName(){
        return name;
    }
    public int getYearOfContruction(){
        return yearOfContruction;
    }

    public int getNamberOfloors() {
        return namberOfloors;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearOfContruction(int yearOfContruction) {
        this.yearOfContruction = yearOfContruction;
    }

    public void setNamberOfloors(int namberOfloors) {
        this.namberOfloors = namberOfloors;
    }


}
