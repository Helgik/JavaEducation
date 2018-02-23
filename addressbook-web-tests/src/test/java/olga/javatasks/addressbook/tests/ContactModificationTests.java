package olga.javatasks.addressbook.tests;

import olga.javatasks.addressbook.model.NewContactData;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {
    @Test

    public void testContactModification() {
        app.getContactHelper().returnToAddressbookPage();
        if (!app.getContactHelper().isThereAContact()) {
            app.getNavigationHelper().goToNewContactCreationPage();
            app.getContactHelper().createContact(new NewContactData("New", "Changed", "none", "+12345", "email@gmail.com"));
        }
        app.getContactHelper().selectContact();
        app.getContactHelper().clickEditContactButton();
        app.getContactHelper().fillNewContactForm(new NewContactData("Hello", "Contact", "new", "+1564464", "edited@gmail.com"));
        app.getContactHelper().clickUpdateContactButton();
        app.getContactHelper().returnToAddressbookPage();
    }
}
