#Dark Tenary Test - Python
def getDayOfWeek(dayNumber):
    return "Sunday" if dayNumber == 0 else "Monday" if dayNumber == 1 else "Tuesday" if dayNumber == 2 else "Wednesday" if dayNumber == 3 else "Thursday" if dayNumber == 4 else "Friday" if dayNumber == 5 else "Saturday" if dayNumber == 6 else "Invalid Day Number"

print(getDayOfWeek(3))
print(getDayOfWeek(10)) 