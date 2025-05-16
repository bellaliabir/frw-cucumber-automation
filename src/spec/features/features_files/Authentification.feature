Feature: je verifie la page d Authentification
  I want to use this template for my feature file
      en tant que utilisateur je veux me connecter  au site Mercury

  @connexion
  Scenario: je verifie la page d Authentification
    Given je me connecte sur lapplication Mercury
    When je saisie le Username  "Test"
    And je saisie le password "Test"
    And je clique sur le bouton submit
    Then je me redirige vers la page dacceuil "Login Successfully"
