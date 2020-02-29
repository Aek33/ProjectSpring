package com.main;
import java.util.ArrayList;

public abstract class Appliances {

    private String Type, Manufacturer;
    private int Price;
    private ArrayList<Refrigerator> Refrigerators = new ArrayList<>();
    private ArrayList<SimpleFreezer> SimpleFreezers = new ArrayList<>();
    private ArrayList<SimpleWasher> SimpleWashers = new ArrayList<>();
    private ArrayList<Dryer> Dryers = new ArrayList<>();
    private ArrayList<ElectricKettle> ElectricKettles = new ArrayList<>();
    private ArrayList<TeaPot> TeaPots = new ArrayList<>();
    private ArrayList<Microwave> Microwaves = new ArrayList<>();
    //Getters and Setters
    public String getType() {

        return Type;
    }

    public String getManufacturer() {

        return Manufacturer;
    }

    public int getPrice(){

        return Price;
    }

    public void setType(String Type){

        this.Type = Type;
    }

    public void setManufacturer(String Manufacturer){

        this.Manufacturer = Manufacturer;
    }

    public void setPrice(int Price){

        this.Price = Price;
    }
    //Getters for Arrays
    public ArrayList<Refrigerator> getRefrigerators(){
        return Refrigerators;
    }

    public ArrayList<SimpleFreezer> getSimpleFreezers(){
        return SimpleFreezers;
    }

    public ArrayList<SimpleWasher> getSimpleWashers(){
        return SimpleWashers;
    }

    public ArrayList<Dryer> getDryerss(){
        return Dryers;
    }

    public ArrayList<ElectricKettle> getElectricKettles(){
        return ElectricKettles;
    }

    public ArrayList<TeaPot> getTeaPots(){
        return TeaPots;
    }

    public ArrayList<Microwave> getMicrowaves(){
        return Microwaves;
    }
    //Constructor
    public Appliances(String Type, String Manufacturer, int Price){
        this.Type = Type;
        this.Manufacturer = Manufacturer;
        this.Price = Price;
    }
    //Abstract method
    public abstract void show();
    //add methods for Arrays
    public void addRefrigirator(Refrigerator Type){
        Refrigerators.add(Type);
    }

    public void addSimpleFreeser(SimpleFreezer Type){
        SimpleFreezers.add(Type);
    }

    public void addSimpleWasher(SimpleWasher Type){
        SimpleWashers.add(Type);
    }

    public void addDryer(Dryer Type){
        Dryers.add(Type);
    }

    public void addElectricKettle(ElectricKettle Type){
        ElectricKettles.add(Type);
    }

    public void addTeapot(TeaPot Type){
        TeaPots.add(Type);
    }

    public void addMicrowave(Microwave Type){
        Microwaves.add(Type);
    }

}
