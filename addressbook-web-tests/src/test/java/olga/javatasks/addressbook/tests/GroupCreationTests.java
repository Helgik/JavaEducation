package olga.javatasks.addressbook.tests;

import olga.javatasks.addressbook.model.GroupData;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        app.goToGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("some info", "blabla", "more info"));
        app.getGroupHelper().submitGroupForm();
        app.getGroupHelper().returnToGroupPage();
    }

}
