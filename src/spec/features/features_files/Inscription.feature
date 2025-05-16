Feature: je cree un  compte utilisateur
   En tant que nouvel utilisateur je veux  creer un compte dinscription afin dacceder au site Mercury

  @inscription
  Scenario: je cree un  compte utilisateur
    Given  je me connecte sur la page Mercury
    When je clique sur le lien register
    When je saisie le First Name "Abir"
    And je saisie le Last Name "Be"
    And je saisie le Phone "54367876"
    And je saisie lEmail "abirBe@com"
    And je saisie lAddress "rue jasmin"
    And je saisie le City "paris"
    And je saisie le State "hjs"
    And je saisie le Postal Code "5678"
    And je selectionne le Country "FRANCE"
    And je saisie le Username  "Test"
    And je saisie le password "Test"
    And je saisie le  confirm password "Test"
    And je clique sur le bouton  envoyer
    Then je vois un message de confirmation de linscription " Dear Abir Be,"
    
