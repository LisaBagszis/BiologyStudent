package org.example;

import java.util.Objects;

public class ComputerScienceStudent implements Citizen{


    private String name;

    private String adress;

    private int identityCardNumber;

    public ComputerScienceStudent() {}


    public ComputerScienceStudent(String name, String adress, int identityCardNumber) {
        this.name = name;
        this.adress = adress;
        this.identityCardNumber = identityCardNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setIdentityCardNumber(int identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }

    @Override
    public void getAdress(String adress) {
        return adress;
    }

    @Override
    public void getIdentityCardNumber(int number) {
            return identityCardNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ComputerScienceStudent that = (ComputerScienceStudent) o;

        if (identityCardNumber != that.identityCardNumber) return false;
        if (!Objects.equals(name, that.name)) return false;
        return Objects.equals(adress, that.adress);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (adress != null ? adress.hashCode() : 0);
        result = 31 * result + identityCardNumber;
        return result;
    }

    @Override
    public String toString() {
        return "ComputerScienceStudent{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", identityCardNumber=" + identityCardNumber +
                '}';
    }


}

