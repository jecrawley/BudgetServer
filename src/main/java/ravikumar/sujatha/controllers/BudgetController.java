package ravikumar.sujatha.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ravikumar.sujatha.domain.Budget;
import ravikumar.sujatha.domain.Payment;
import ravikumar.sujatha.repository.BudgetRepository;

import java.util.Iterator;
import java.util.List;

/**
 * Created by sujatharavikumar on 11/1/16.
 */

@RestController
//@CrossOrigin(origins = "http://localhost:8100")
public class BudgetController {


    @Autowired
    BudgetRepository repo;

    @RequestMapping(value = "/allbudgets", method = RequestMethod.GET)
    public Iterable<Budget> getAllBudgets () {
        return repo.findAll();
    }

    @RequestMapping(value = "/budget/{id}", method = RequestMethod.GET)
    public Budget getBudgetById(@PathVariable Long id) {
        return repo.findOne(id);
    }

    @RequestMapping(value = "/updatephonebudget", method = RequestMethod.PUT)
    public @ResponseBody Budget updatePhoneBudget (@RequestBody Payment payment) {

        Budget res = repo.findOne(payment.getId());
        res.setPhone(payment.getAmount());
        repo.saveAndFlush(res);
        return res;
    }

    @RequestMapping(value = "/updateelectricitybudget", method = RequestMethod.PUT)
    public @ResponseBody Budget updateElectricityBudget (@RequestBody Payment payment) {

        Budget res = repo.findOne(payment.getId());
        res.setElectricity(payment.getAmount());
        repo.saveAndFlush(res);
        return res;
    }

    @RequestMapping(value = "/updatehousingbudget", method = RequestMethod.PUT)
    public @ResponseBody Budget updateHousingBudget (@RequestBody Payment payment) {

        Budget res = repo.findOne(payment.getId());
        res.setHousing(payment.getAmount());
        repo.saveAndFlush(res);
        return res;
    }

    @RequestMapping(value = "/updateheatingbudget", method = RequestMethod.PUT)
    public @ResponseBody Budget updateHeatingBudget (@RequestBody Payment payment) {

        Budget res = repo.findOne(payment.getId());
        res.setHeating(payment.getAmount());
        repo.saveAndFlush(res);
        return res;
    }

    @RequestMapping(value = "/updatewaterbudget", method = RequestMethod.PUT)
    public @ResponseBody Budget updateWaterBudget (@RequestBody Payment payment) {

        Budget res = repo.findOne(payment.getId());
        res.setWater(payment.getAmount());
        repo.saveAndFlush(res);
        return res;
    }

    @RequestMapping(value = "/updateautomobilebudget", method = RequestMethod.PUT)
    public @ResponseBody Budget updateAutomobileBudget (@RequestBody Payment payment) {

        Budget res = repo.findOne(payment.getId());
        res.setAutomobile(payment.getAmount());
        repo.saveAndFlush(res);
        return res;
    }

    @RequestMapping(value = "/updategroceriesbudget", method = RequestMethod.PUT)
    public @ResponseBody Budget updateGroceriesBudget (@RequestBody Payment payment) {

        Budget res = repo.findOne(payment.getId());
        res.setGroceries(payment.getAmount());
        repo.saveAndFlush(res);
        return res;
    }

    @RequestMapping(value = "/updaterestaurantsbudget", method = RequestMethod.PUT)
    public @ResponseBody Budget updateRestaurantsBudget (@RequestBody Payment payment) {

        Budget res = repo.findOne(payment.getId());
        res.setRestaurants(payment.getAmount());
        repo.saveAndFlush(res);
        return res;
    }

    @RequestMapping(value = "/updateclothingbudget", method = RequestMethod.PUT)
    public @ResponseBody Budget updateClothingBudget (@RequestBody Payment payment) {

        Budget res = repo.findOne(payment.getId());
        res.setClothing(payment.getAmount());
        repo.saveAndFlush(res);
        return res;
    }

    @RequestMapping(value = "/updatebeautybudget", method = RequestMethod.PUT)
    public @ResponseBody Budget updateBeautyBudget (@RequestBody Payment payment) {

        Budget res = repo.findOne(payment.getId());
        res.setBeauty(payment.getAmount());
        repo.saveAndFlush(res);
        return res;
    }

    @RequestMapping(value = "/updateentertainmentbudget", method = RequestMethod.PUT)
    public @ResponseBody Budget updateEntertainmentBudget (@RequestBody Payment payment) {

        Budget res = repo.findOne(payment.getId());
        res.setEntertainment(payment.getAmount());
        repo.saveAndFlush(res);
        return res;
    }


    @RequestMapping(value = "/makephonepayment", method = RequestMethod.PUT)
    public @ResponseBody Short[] makePhonePayment (@RequestBody Payment payment) {

        Budget res = repo.findOne(payment.getId());
        short current = res.getPhoneBudgetSpent();
        res.setPhoneBudgetSpent((short)(payment.getAmount() + current));
        repo.saveAndFlush(res);
        return new Short[] {res.getPhone(), res.getPhoneBudgetSpent()};
    }

    @RequestMapping(value = "/makeelectricitypayment", method = RequestMethod.PUT)
    public @ResponseBody Short[] makeElectricityPayment (@RequestBody Payment payment) {

        Budget res = repo.findOne(payment.getId());
        short current = res.getElectricityBudgetSpent();
        res.setElectricityBudgetSpent((short)(payment.getAmount() + current));
        repo.saveAndFlush(res);
        return new Short[] {res.getElectricity(), res.getElectricityBudgetSpent()};
    }

    @RequestMapping(value = "/makehousingpayment", method = RequestMethod.PUT)
    public @ResponseBody Short[] makeHousingPayment (@RequestBody Payment payment) {

        Budget res = repo.findOne(payment.getId());
        short current = res.getHousingBudgetSpent();
        res.setHousingBudgetSpent((short)(payment.getAmount() + current));
        repo.saveAndFlush(res);
        return new Short[] {res.getHousing(), res.getHousingBudgetSpent()};
    }

    @RequestMapping(value = "/makeheatingpayment", method = RequestMethod.PUT)
    public @ResponseBody Short[] makeHeatingPayment (@RequestBody Payment payment) {

        Budget res = repo.findOne(payment.getId());
        short current = res.getHeatingBudgetSpent();
        res.setHeatingBudgetSpent((short)(payment.getAmount() + current));
        repo.saveAndFlush(res);
        return new Short[] {res.getHeating(), res.getHeatingBudgetSpent()};
    }

    @RequestMapping(value = "/makewaterpayment", method = RequestMethod.PUT)
    public @ResponseBody Short[] makeWaterPayment (@RequestBody Payment payment) {

        Budget res = repo.findOne(payment.getId());
        short current = res.getWaterBudgetSpent();
        res.setWaterBudgetSpent((short)(payment.getAmount() + current));
        repo.saveAndFlush(res);
        return new Short[] {res.getWater(), res.getWaterBudgetSpent()};
    }

    @RequestMapping(value = "/makeautomobilepayment", method = RequestMethod.PUT)
    public @ResponseBody Short[] makePayment (@RequestBody Payment payment) {

        Budget res = repo.findOne(payment.getId());
        short current = res.getAutomobileBudgetSpent();
        res.setAutomobileBudgetSpent((short)(payment.getAmount() + current));
        repo.saveAndFlush(res);
        return new Short[] {res.getAutomobile(), res.getAutomobileBudgetSpent()};
    }

    @RequestMapping(value = "/makegroceriespayment", method = RequestMethod.PUT)
    public @ResponseBody Short[] makeGroceriesPayment (@RequestBody Payment payment) {

        Budget res = repo.findOne(payment.getId());
        short current = res.getGroceriesBudgetSpent();
        res.setGroceriesBudgetSpent((short)(payment.getAmount() + current));
        repo.saveAndFlush(res);
        return new Short[] {res.getGroceries(), res.getGroceriesBudgetSpent()};
    }

    @RequestMapping(value = "/makerestaurantspayment", method = RequestMethod.PUT)
    public @ResponseBody Short[] makeRestaurantsPayment (@RequestBody Payment payment) {

        Budget res = repo.findOne(payment.getId());
        short current = res.getRestaurantsBudgetSpent();
        res.setRestaurantsBudgetSpent((short)(payment.getAmount() + current));
        repo.saveAndFlush(res);
        return new Short[] {res.getRestaurants(), res.getRestaurantsBudgetSpent()};
    }

    @RequestMapping(value = "/makeclothingpayment", method = RequestMethod.PUT)
    public @ResponseBody Short[] makeClothingPayment (@RequestBody Payment payment) {

        Budget res = repo.findOne(payment.getId());
        short current = res.getClothingBudgetSpent();
        res.setClothingBudgetSpent((short)(payment.getAmount() + current));
        repo.saveAndFlush(res);
        return new Short[] {res.getClothing(), res.getClothingBudgetSpent()};
    }

    @RequestMapping(value = "/makebeautypayment", method = RequestMethod.PUT)
    public @ResponseBody Short[] makeBeautyPayment (@RequestBody Payment payment) {

        Budget res = repo.findOne(payment.getId());
        short current = res.getBeautyBudgetSpent();
        res.setBeautyBudgetSpent((short)(payment.getAmount() + current));
        repo.saveAndFlush(res);
        return new Short[] {res.getBeauty(), res.getBeautyBudgetSpent()};
    }

    @RequestMapping(value = "/makeentertainmentpayment", method = RequestMethod.PUT)
    public @ResponseBody Short[] makeEntertainmentPayment (@RequestBody Payment payment) {

        Budget res = repo.findOne(payment.getId());
        short current = res.getEntertainmentBudgetSpent();
        res.setEntertainmentBudgetSpent((short)(payment.getAmount() + current));
        repo.saveAndFlush(res);
        return new Short[] {res.getEntertainment(), res.getEntertainmentBudgetSpent()};
    }

}
