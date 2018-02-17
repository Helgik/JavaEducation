package olga.javatasks.addressbook.tests;

import olga.javatasks.addressbook.model.NewContactData;
import org.testng.annotations.Test;

public class AddNewContact extends TestBase {

    @Test
    public void AddNewContact() {
        app.goToNewContactCreationPage();
        app.fillNewContactForm(new NewContactData("Jason", "Statham", "LA", "+00449794648", "jason@statham.com"));
        app.getContactHelper().submitNewContactCreationForm();
        app.getContactHelper().returnToAddressbookPage();
    }

}
