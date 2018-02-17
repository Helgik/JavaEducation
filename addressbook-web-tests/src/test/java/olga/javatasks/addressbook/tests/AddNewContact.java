package olga.javatasks.addressbook.tests;

import olga.javatasks.addressbook.model.NewContactData;
import org.testng.annotations.Test;

public class AddNewContact extends TestBase {

    @Test
    public void AddNewContact() {
        app.getNavigationHelper().goToNewContactCreationPage();
        app.getContactHelper().fillNewContactForm(new NewContactData("Arnold", "Schvarzenegger", "LA", "+00449794648", "arni@schvarz.com"));
        app.getContactHelper().submitNewContactCreationForm();
        app.getContactHelper().returnToAddressbookPage();
    }

}
