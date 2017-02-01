package by.tamp.module3.hierarhy;

abstract class Pillow {

    private int size;
    private String color;

    Pillow(int size){
        this.size = size;
    }

    Pillow(int size, String color){
        this.size = size;
        this.color = color;
    }

    public int getSize(){
        return size;
    }

    public String getColor() {
        return color;
    }

    public void  setSize(int size) {
        this.size = size;
    }

    public void  setColor(String size) {
        this.color = color;
    }

    public void cleanUp(String s){
        if(!s.isEmpty() && s.equals("Clean me!")) {
            System.out.println("by.tamp.module3.Pillow is cleaned");
        } else {
            System.out.println("by.tamp.module3.Pillow is not cleaned");
        }
    }

    abstract void dryUp(int c);
}
