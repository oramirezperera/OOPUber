from account import Account
from car import Car
from uberBlack import UberBlack
from uberPool import UberPool
from uberVan import UberVan
from uberX import UberX


if __name__ == "__main__":
    print("hello world")

    car = Car("AMS235", Account("Andres Herrera", "ANDA876"))
    print(vars(car))
    print(vars(car.driver))

    uberX = UberX("AKSD", Account("Angie", 12356), "Chevrolet", "Spark")
    print(vars(uberX))
    print(vars(uberX.driver))