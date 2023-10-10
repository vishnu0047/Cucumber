$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Login.feature");
formatter.feature({
  "name": "To Checking Login Functionality of Facebook",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To Check in UserName and Invalid Password to Login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User have enter the Valid Email and Invalid Password",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password",
        "PhneNo",
        "Email"
      ]
    },
    {
      "cells": [
        "Arafath",
        "ara6754321",
        "1234563214",
        "arafa123@gmail.com"
      ]
    },
    {
      "cells": [
        "Selenium",
        "7896541sel",
        "9632587418",
        "selenium123@gmail.com"
      ]
    },
    {
      "cells": [
        "Java",
        "9632856jav",
        "8521478963",
        "java123@gmail.com"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionFile.user_have_enter_the_Valid_Email_and_Invalid_Password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Have Click the Login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionFile.user_Have_Click_the_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Have Enter Invalid Credential Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionFile.user_Have_Enter_Invalid_Credential_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To Check login function UserName and Password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User have Enter the Valid Email and Valid Password",
  "rows": [
    {
      "cells": [
        "email",
        "selenium123@gmail.com"
      ]
    },
    {
      "cells": [
        "password",
        "245672sel"
      ]
    },
    {
      "cells": [
        "userName",
        "vishnu"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionFile.user_have_Enter_the_Valid_Email_and_Valid_Password(DataTable)"
});
formatter.result({
  "error_message": "java.lang.IllegalArgumentException: Keys to send should be a not null CharSequence\r\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:97)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy18.sendKeys(Unknown Source)\r\n\tat org.base.BaseClass.fillText(BaseClass.java:88)\r\n\tat org.step.StepDefinitionFile.user_have_Enter_the_Valid_Email_and_Valid_Password(StepDefinitionFile.java:51)\r\n\tat ✽.User have Enter the Valid Email and Valid Password(file:src/test/resources/Features/Login.feature:15)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User Have Click the Login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionFile.user_Have_Click_the_Login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User Have Enter Invalid Credential Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionFile.user_Have_Enter_Invalid_Credential_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});