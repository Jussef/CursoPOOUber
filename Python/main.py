from account import Account
from car import Car

if __name__ == "__main__":
    print("Hola mundo")
    car = Car("AMS123", Account("Daniel py", "INE: swsws"))
    print(vars(car))
    print(vars(car.driver))
    
    car2 = Car("ZZA123", Account("Jussef py", "INE: xsxsxs"))
    print(vars(car2))
    print(vars(car2.driver))