package fr.lapausedev;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class IceCreamFlavorSteps {

    private IceCreamEater user;

    @Given("Little Bob likes chocolate and don't like pistachio")
    public void littleBob() {
        user = new IceCreamEater();
        user.getLikes().add(IceCreamFlavour.CHOCOLATE);
        user.getDislikes().add(IceCreamFlavour.PISTACHIO);
    }

    @When("this user orders an chocolate vanilla ice cream")
    public void orderChocolateVanillaIceCream() {
        IceCream iceCream = new IceCream();
        iceCream.getScoops().add(new IceCreamScoop(IceCreamFlavour.CHOCOLATE));
        iceCream.getScoops().add(new IceCreamScoop(IceCreamFlavour.VANILLA));
        user.take(iceCream);
    }

    @When("this user orders an pistachio vanilla ice cream")
    public void orderPistachioVanillaIceCream() {
        IceCream iceCream = new IceCream();
        iceCream.getScoops().add(new IceCreamScoop(IceCreamFlavour.PISTACHIO));
        iceCream.getScoops().add(new IceCreamScoop(IceCreamFlavour.VANILLA));
        user.take(iceCream);
    }

    @When("this user orders an chocolate pistachio ice cream")
    public void orderChocolatePistachioIceCream() {
        IceCream iceCream = new IceCream();
        iceCream.getScoops().add(new IceCreamScoop(IceCreamFlavour.PISTACHIO));
        iceCream.getScoops().add(new IceCreamScoop(IceCreamFlavour.CHOCOLATE));
        user.take(iceCream);
    }

    @Then("this user is happy")
    public void isHappy() {
        assertEquals(Feeling.HAPPY, user.getFeeling());
    }


    @Then("this user is sad")
    public void isSad() {
        assertEquals(Feeling.SAD, user.getFeeling());
    }


    @Then("this user is OK")
    public void isOK() {
        assertEquals(Feeling.OK, user.getFeeling());
    }

}