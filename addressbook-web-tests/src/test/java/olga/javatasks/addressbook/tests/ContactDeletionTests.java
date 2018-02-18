package olga.javatasks.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {

        @Test
        public void testDeleteContact() {
            app.getContactHelper().returnToAddressbookPage();
            app.getContactHelper().selectContact();
            app.getContactHelper().deleteSelectedContact();
            app.getContactHelper().confirmDeletionPopup();
            app.getContactHelper().returnToAddressbookPage();
        }

    }
