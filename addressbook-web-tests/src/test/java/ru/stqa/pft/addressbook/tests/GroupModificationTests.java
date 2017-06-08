package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

/**
 * Created by Boris on 08.06.2017.
 */
public class GroupModificationTests extends TestBase {

  @Test
  public void testGroupModificati(){
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModefication();
    app.getGroupHelper().fillGroupForm(new GroupData("Test 1 groups", "Test 1 groups", "Test 1 groups"));
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returnToGroupPage();
  }
}
