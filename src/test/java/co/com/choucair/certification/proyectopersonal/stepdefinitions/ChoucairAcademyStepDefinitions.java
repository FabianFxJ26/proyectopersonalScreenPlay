package co.com.choucair.certification.proyectopersonal.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairAcademyStepDefinitions {
    @Before
    public void setStage()
    {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("than Fabian wants to learn automation at the Academy Choucair")
    public void thanFabianWantsToLearnAutomationAtTheAcademyChoucair() {
        // Write code here that turns the phrase above into concrete actions

    }
    @When("he search for the course Guías Técnicas - Analista Funcional on the Choucair Academy platform")
    public void heSearchForTheCourseGuiasTecnicasAnalistaFuncionalOnTheChoucairAcademyPlatform() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("he finds the course called resources Cursos y Certificaciones")
    public void heFindsTheCourseCalledResourcesCursosYCertificaciones() {
        // Write code here that turns the phrase above into concrete actions

    }
}
