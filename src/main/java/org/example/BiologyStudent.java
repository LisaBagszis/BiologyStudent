package org.example;

import java.util.Objects;

public class BiologyStudent implements Citizen {

    private String name;

    private String adress;

    private int identityCardNumber;

    public BiologyStudent() {}

    public BiologyStudent(String name, String adress, int identityCardNumber) {
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
    public String getAdress(String adress) {
        return adress;
    }

    @Override
    public int getIdentityCardNumber(int number) {
        return number;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BiologyStudent that = (BiologyStudent) o;

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
        return "BiologyStudent{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", identityCardNumber=" + identityCardNumber +
                '}';
    }



}
