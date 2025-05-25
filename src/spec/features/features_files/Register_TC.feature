Feature: je cree un  compte utilisateur
   En tant que nouvel utilisateur je veux  creer un compte dinscription afin dacceder au site Mercury

  @register
  Scenario Outline: je cree un  compte utilisateur
    Given je me connecte sur lapplication Mercury
    When je clique sur le lien register
    When je saisie le First Name "<FirstName>"
    When je saisie le Last Name "<LastName>"
    When je saisie le Phone "<phone>"
    When je saisie lEmail "<email>"
    When je saisie lAddress "<Address>"
    When je saisie le City "<city>"
    When je saisie le State "<state>"
    When je saisie le Postal Code "<PostalCode>"
    When je selectionne le Country "<country>"
    When je saisie le Username  "<UserName>"
    When je saisie le password "<password>"
    When je saisie le  confirm password "<confirmPassword>"
    When je clique sur le bouton  envoyer
    Then je vois un message de confirmation de linscription "<message>"

    Examples: 
     | FirstName | LastName | phone     | email         | Address     | city  | state | PostalCode | country | UserName | password | confirmPassword | message           |
      | Abir      | Be       | 54367876  | abirBe@com    | rue jasmin | Paris | HJS   | 5678       | FRANCE  | Test    | Test      | Test            | Dear Abir Be,     |
      | Marwa     | D        | 51234567  | marwaD@com    | av. bourguiba | Tunis | TUN   | 1001       | TUNISIA | Test   | Test    | Test            | Dear Marwa D,         |