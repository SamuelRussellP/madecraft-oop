package exercises;

public class Minion {
    private String name;
    private Integer eyes;
    private String color;
    private String master;

    Minion(String name, Integer eyes, String color, String master) {
        this.name = name;
        this.eyes = eyes;
        this.color = color;
        this.master = master;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(Integer eyes){
        this.eyes = eyes;
    }

    public Integer getEyes(){
        return this.eyes;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

    public void setMaster(String master) {
        this.master = master;
    }

        public String getMaster () {
            return this.master;
        }
    }