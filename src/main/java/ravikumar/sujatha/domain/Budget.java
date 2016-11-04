package ravikumar.sujatha.domain;

import javax.persistence.*;

/**
 * Created by sujatharavikumar on 11/1/16.
 */
@Entity
public class Budget {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private short housing;
    private short housingBudgetSpent;
    private short electricity;
    private short electricityBudgetSpent;
    private short water;
    private short waterBudgetSpent;
    private short phone;
    private short phoneBudgetSpent;
    private short heating;
    private short heatingBudgetSpent;
    private short groceries;
    private short groceriesBudgetSpent;
    private short restaurants;
    private short restaurantsBudgetSpent;
    private short clothing;
    private short clothingBudgetSpent;
    private short beauty;
    private short beautyBudgetSpent;
    private short automobile;
    private short automobileBudgetSpent;
    private short entertainment;
    private short entertainmentBudgetSpent;

    public Budget () {}




    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setHousing(short housing) {
        this.housing = housing;
    }

    public void setHousingBudgetSpent(short housingBudgetSpent) {
        this.housingBudgetSpent = housingBudgetSpent;
    }

    public void setElectricity(short electricity) {
        this.electricity = electricity;
    }

    public void setElectricityBudgetSpent(short electricityBudgetSpent) {
        this.electricityBudgetSpent = electricityBudgetSpent;
    }

    public void setWater(short water) {
        this.water = water;
    }

    public void setWaterBudgetSpent(short waterBudgetSpent) {
        this.waterBudgetSpent = waterBudgetSpent;
    }

    public void setPhone(short phone) {
        this.phone = phone;
    }

    public void setPhoneBudgetSpent(short phoneBudgetSpent) {
        this.phoneBudgetSpent = phoneBudgetSpent;
    }

    public void setHeating(short heating) {
        this.heating = heating;
    }

    public void setHeatingBudgetSpent(short heatingBudgetSpent) {
        this.heatingBudgetSpent = heatingBudgetSpent;
    }

    public void setGroceries(short groceries) {
        this.groceries = groceries;
    }

    public void setGroceriesBudgetSpent(short groceriesBudgetSpent) {
        this.groceriesBudgetSpent = groceriesBudgetSpent;
    }

    public void setRestaurants(short restaurants) {
        this.restaurants = restaurants;
    }

    public void setRestaurantsBudgetSpent(short restaurantsBudgetSpent) {
        this.restaurantsBudgetSpent = restaurantsBudgetSpent;
    }

    public void setClothing(short clothing) {
        this.clothing = clothing;
    }

    public void setClothingBudgetSpent(short clothingBudgetSpent) {
        this.clothingBudgetSpent = clothingBudgetSpent;
    }

    public void setBeauty(short beauty) {
        this.beauty = beauty;
    }

    public void setBeautyBudgetSpent(short beautyBudgetSpent) {
        this.beautyBudgetSpent = beautyBudgetSpent;
    }

    public void setAutomobile(short automobile) {
        this.automobile = automobile;
    }

    public void setAutomobileBudgetSpent(short automobileBudgetSpent) {
        this.automobileBudgetSpent = automobileBudgetSpent;
    }

    public void setEntertainment(short entertainment) {
        this.entertainment = entertainment;
    }

    public void setEntertainmentBudgetSpent(short entertainmentBudgetSpent) {
        this.entertainmentBudgetSpent = entertainmentBudgetSpent;
    }

    public String getUsername() {

        return username;
    }

    public short getHousing() {
        return housing;
    }

    public short getHousingBudgetSpent() {
        return housingBudgetSpent;
    }

    public short getElectricity() {
        return electricity;
    }

    public short getElectricityBudgetSpent() {
        return electricityBudgetSpent;
    }

    public short getWater() {
        return water;
    }

    public short getWaterBudgetSpent() {
        return waterBudgetSpent;
    }

    public short getPhone() {
        return phone;
    }

    public short getPhoneBudgetSpent() {
        return phoneBudgetSpent;
    }

    public short getHeating() {
        return heating;
    }

    public short getHeatingBudgetSpent() {
        return heatingBudgetSpent;
    }

    public short getGroceries() {
        return groceries;
    }

    public short getGroceriesBudgetSpent() {
        return groceriesBudgetSpent;
    }

    public short getRestaurants() {
        return restaurants;
    }

    public short getRestaurantsBudgetSpent() {
        return restaurantsBudgetSpent;
    }

    public short getClothing() {
        return clothing;
    }

    public short getClothingBudgetSpent() {
        return clothingBudgetSpent;
    }

    public short getBeauty() {
        return beauty;
    }

    public short getBeautyBudgetSpent() {
        return beautyBudgetSpent;
    }

    public short getAutomobile() {
        return automobile;
    }

    public short getAutomobileBudgetSpent() {
        return automobileBudgetSpent;
    }

    public short getEntertainment() {
        return entertainment;
    }

    public short getEntertainmentBudgetSpent() {
        return entertainmentBudgetSpent;
    }

    public Long getId() {

        return id;
    }
}
