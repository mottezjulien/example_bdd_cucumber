Feature: Set felling with the ordered icecream and the user wants

    Scenario: Little Bob is happy with chocolate
        Given Little Bob likes chocolate and don't like pistachio
        When this user orders an chocolate vanilla ice cream
        Then this user is happy

    Scenario: Little Bob is sad with pistachio
        Given Little Bob likes chocolate and don't like pistachio
        When this user orders an pistachio vanilla ice cream
        Then this user is sad

    Scenario: Little Bob is happy with chocolate even if pistachio
        Given Little Bob likes chocolate and don't like pistachio
        When this user orders an chocolate pistachio ice cream
        Then this user is happy