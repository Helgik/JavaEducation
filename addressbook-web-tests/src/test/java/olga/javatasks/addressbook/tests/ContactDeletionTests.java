package olga.javatasks.addressbook.tests;

import olga.javatasks.addressbook.model.NewContactData;
import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {

    @Test
    public void testDeleteContact() {
        app.getContactHelper().returnToAddressbookPage();
        if (!app.getContactHelper().isThereAContact()) {
            app.getNavigationHelper().goToNewContactCreationPage();
            app.getContactHelper().createContact(new NewContactData("New", "Changed", "none", "+12345", "email@gmail.com"));
        }
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteSelectedContact();
        app.getContactHelper().confirmDeletionPopup();
        app.getContactHelper().returnToAddressbookPage();
    }

}
