package com.chenhui.domain;

import java.util.Objects;

/**
 * ClassName : Car
 * Package : com.chenhui.domain
 * Description :
 *
 * @author : chenhui@xvco.com
 */
public class Car {
    private String name;
    private String address;

    public Car(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Car() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) &&
                Objects.equals(address, car.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
