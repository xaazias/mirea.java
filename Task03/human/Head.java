package ru.mirea.java.task03.human;

public class Head {

    private String size, hair, hairColor;

    Head(String size, String hair, String hairColor) {
        this.size = size;
        this.hair = hair;
        this.hairColor = hairColor;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getHair() {
        return hair;
    }

    public String getHairColor() {
        return hairColor;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Head{" +
                "size='" + size + '\'' +
                ", hair='" + hair + '\'' +
                ", hairColor='" + hairColor + '\'' +
                '}';
    }
}
