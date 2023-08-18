$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/ADMIN/eclipse-workspace/BDDcucumberframework/src/test/resources/Feature/login.feature");
formatter.feature({
  "name": "To  validate login functionality in fb",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user have to be in fb login page",
  "keyword": "Given "
});
formatter.match({
  "location": "loginsteps.user_have_to_be_in_fb_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to maximize screen",
  "keyword": "And "
});
formatter.match({
  "location": "loginsteps.user_have_to_maximize_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate login using valid email and invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@sanity"
    },
    {
      "name": "@reg"
    }
  ]
});
formatter.step({
  "name": "user have to enter valid Email and invalid password",
  "rows": [
    {
      "cells": [
        "Watch",
        "Mobile"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "loginsteps.user_have_to_enter_valid_Email_and_invalid_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to click login button",
  "keyword": "And "
});
formatter.match({
  "location": "loginsteps.user_have_to_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to be in password incorrect page",
  "keyword": "Then "
});
formatter.match({
  "location": "loginsteps.user_have_to_be_in_password_incorrect_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user have to be in fb login page",
  "keyword": "Given "
});
formatter.match({
  "location": "loginsteps.user_have_to_be_in_fb_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to maximize screen",
  "keyword": "And "
});
formatter.match({
  "location": "loginsteps.user_have_to_maximize_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate login using invalid email and invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user have to enter invalid Email and invalid password",
  "rows": [
    {
      "cells": [
        "srimahe",
        "mahe",
        "darshika"
      ]
    },
    {
      "cells": [
        "mahe@123",
        "poornisha",
        "sugan123"
      ]
    },
    {
      "cells": [
        "chennai",
        "Tambaram",
        "sanatorium"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "loginsteps.user_have_to_enter_invalid_Email_and_invalid_password(DataTable)"
});
formatter.result({
  "error_message": "java.lang.IndexOutOfBoundsException: Index: 3, Size: 3\r\n\tat java.util.ArrayList.rangeCheck(Unknown Source)\r\n\tat java.util.ArrayList.get(Unknown Source)\r\n\tat java.util.Collections$UnmodifiableList.get(Unknown Source)\r\n\tat org.stepsdefiniton.loginsteps.user_have_to_enter_invalid_Email_and_invalid_password(loginsteps.java:57)\r\n\tat ✽.user have to enter invalid Email and invalid password(C:/Users/ADMIN/eclipse-workspace/BDDcucumberframework/src/test/resources/Feature/login.feature:19)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user have to click login button",
  "keyword": "And "
});
formatter.match({
  "location": "loginsteps.user_have_to_click_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user have to be in password incorrect page",
  "keyword": "Then "
});
formatter.match({
  "location": "loginsteps.user_have_to_be_in_password_incorrect_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user have to be in fb login page",
  "keyword": "Given "
});
formatter.match({
  "location": "loginsteps.user_have_to_be_in_fb_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to maximize screen",
  "keyword": "And "
});
formatter.match({
  "location": "loginsteps.user_have_to_maximize_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate login using Invalid email and invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "user have to enter Invalid email and invalid password",
  "rows": [
    {
      "cells": [
        "Email",
        "mahendransri97@gmail.com"
      ]
    },
    {
      "cells": [
        "phoneno",
        "9843113158"
      ]
    },
    {
      "cells": [
        "Name",
        "sridarshika"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "loginsteps.user_have_to_enter_Invalid_email_and_invalid_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to click login button",
  "keyword": "And "
});
formatter.match({
  "location": "loginsteps.user_have_to_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to be in password incorrect page",
  "keyword": "Then "
});
formatter.match({
  "location": "loginsteps.user_have_to_be_in_password_incorrect_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user have to be in fb login page",
  "keyword": "Given "
});
formatter.match({
  "location": "loginsteps.user_have_to_be_in_fb_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to maximize screen",
  "keyword": "And "
});
formatter.match({
  "location": "loginsteps.user_have_to_maximize_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate login using Invalid email and invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@sri"
    }
  ]
});
formatter.step({
  "name": "user have to Enter Invalid Email and invalid Password",
  "rows": [
    {
      "cells": [
        "Name",
        "phoneno",
        "Email"
      ]
    },
    {
      "cells": [
        "dev",
        "arun",
        "mahend"
      ]
    },
    {
      "cells": [
        "jeeve",
        "anitha",
        "vishva"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "loginsteps.user_have_to_Enter_Invalid_Email_and_invalid_Password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to click login button",
  "keyword": "And "
});
formatter.match({
  "location": "loginsteps.user_have_to_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to be in password incorrect page",
  "keyword": "Then "
});
formatter.match({
  "location": "loginsteps.user_have_to_be_in_password_incorrect_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("C:/Users/ADMIN/eclipse-workspace/BDDcucumberframework/src/test/resources/Feature/page2.feature");
formatter.feature({
  "name": "To  validate forgotten password functionality in fb",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@mahe"
    }
  ]
});
formatter.scenarioOutline({
  "name": "To validate Forgottenpassword link in fb",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "user have to be in fb Login page",
  "keyword": "Given "
});
formatter.step({
  "name": "user have to Maximize screen",
  "keyword": "And "
});
formatter.step({
  "name": "user have to click Forgotten password link and enter \"\u003cEmail or password\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user have to click search button",
  "keyword": "And "
});
formatter.examples({
  "name": "|",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Email or password"
      ]
    },
    {
      "cells": [
        "mahendran"
      ]
    },
    {
      "cells": [
        "srimahe"
      ]
    },
    {
      "cells": [
        "gethaa"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To validate Forgottenpassword link in fb",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@mahe"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user have to be in fb Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "fb.user_have_to_be_in_fb_Login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to Maximize screen",
  "keyword": "And "
});
formatter.match({
  "location": "fb.user_have_to_Maximize_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to click Forgotten password link and enter \"mahendran\"",
  "keyword": "When "
});
formatter.match({
  "location": "fb.user_have_to_click_Forgotten_password_link_and_enter(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to click search button",
  "keyword": "And "
});
formatter.match({
  "location": "fb.user_have_to_click_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate Forgottenpassword link in fb",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@mahe"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user have to be in fb Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "fb.user_have_to_be_in_fb_Login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to Maximize screen",
  "keyword": "And "
});
formatter.match({
  "location": "fb.user_have_to_Maximize_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to click Forgotten password link and enter \"srimahe\"",
  "keyword": "When "
});
formatter.match({
  "location": "fb.user_have_to_click_Forgotten_password_link_and_enter(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to click search button",
  "keyword": "And "
});
formatter.match({
  "location": "fb.user_have_to_click_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate Forgottenpassword link in fb",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@mahe"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user have to be in fb Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "fb.user_have_to_be_in_fb_Login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to Maximize screen",
  "keyword": "And "
});
formatter.match({
  "location": "fb.user_have_to_Maximize_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to click Forgotten password link and enter \"gethaa\"",
  "keyword": "When "
});
formatter.match({
  "location": "fb.user_have_to_click_Forgotten_password_link_and_enter(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to click search button",
  "keyword": "And "
});
formatter.match({
  "location": "fb.user_have_to_click_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});