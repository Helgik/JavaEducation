package olga.javatasks.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        app.goToGroupPage();
        app.initGroupCreation();
        app.fillGroupForm(new GroupData("some info", "blabla", "more info"));
        app.submitGroupForm();
        app.returnToGroupPage();
    }

}
