@login
Feature: je souhaite tester la page de connexion de site swag labs
  ETQ utilisateur je souhaite tester la page de connexion de site swag labs

  @login_cas_passant
  Scenario: je souhaite tester la page de connexion de site swag labs cas passant
    Given je me connecte a lapplication swag labs
    Then je me redirige vers la page d acceuil "Products"

  @login_cas_non_passant
  Scenario: je souhaite tester la page de connexion de site swag labs cas non passant
   Given je me connecte sur lapplication swag Labs avec des valeurs invalides
    Then le message d erreur s affiche "Epic sadface: Username and password do not match any user in this service"
