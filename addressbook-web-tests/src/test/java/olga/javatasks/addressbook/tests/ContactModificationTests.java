package olga.javatasks.addressbook.tests;

import olga.javatasks.addressbook.model.NewContactData;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {
    @Test

    public void testContactModification() {
        app.getContactHelper().returnToAddressbookPage();
        app.getContactHelper().selectContact();
        app.getContactHelper().clickEditContactButton();
        app.getContactHelper().fillNewContactForm(new NewContactData("Edited", "Contact", "new", "+1564464", "edited@gmail.com"));
        app.getContactHelper().clickUpdateContactButton();
        app.getContactHelper().returnToAddressbookPage();
    }
}
