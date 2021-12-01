Feature: Infection of a city

    Scenario: First infection
    Given Paris has not been infected
    When Paris is infected
    Then Paris' infection level should be increse to 1

