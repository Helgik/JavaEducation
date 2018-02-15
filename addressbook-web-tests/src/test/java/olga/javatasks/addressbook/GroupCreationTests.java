package olga.javatasks.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        goToGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("some info", "blabla", "more info"));
        submitGroupForm();
        returnToGroupPage();
    }

}
