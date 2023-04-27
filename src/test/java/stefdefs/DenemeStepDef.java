package stefdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class DenemeStepDef {
    int sum;
    @Given("user starts mathmaticks")
    public void userStartsMathmaticks() {
        System.out.println("math starts");
    }

    @When("user add {int} and {int}")
    public void userAddAnd(int num1, int num2) {
        sum=num1+num2;
    }

    @Then("result should be {int}")
    public void resultShouldBe(int num) {
        Assert.assertEquals(num,sum);
    }
}
