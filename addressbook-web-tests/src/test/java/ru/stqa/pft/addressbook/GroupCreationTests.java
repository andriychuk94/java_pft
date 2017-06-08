package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

  @Test
  public void testCreatedGroups() {
    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("Test 1 groups", "Test 1 groups", "Test 1 groups"));
    submitGroupCreation();
    returnToGroupPage();
  }

}