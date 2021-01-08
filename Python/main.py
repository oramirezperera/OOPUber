from account import Account
from car import Car

if __name__ == "__main__":
    print("hello world")

    car = Car("AMS235", Account("Andres Herrera", "ANDA876"))
    print(vars(car))
    print(vars(car.driver))