//Dark Tenary Test - C#
using System;

string getDayOfWeek(int dayNumber) {
    return dayNumber == 0 
        ? "Sunday"
        : dayNumber == 1
        ? "Monday"
        : dayNumber == 2
        ? "Tuesday"
        : dayNumber == 3
        ? "Wednesday"
        : dayNumber == 4
        ? "Thursday"
        : dayNumber == 5
        ? "Friday"
        : dayNumber == 6
        ? "Saturday"
        : "Invalid Day Number";
}

Console.WriteLine(getDayOfWeek(3));
Console.WriteLine(getDayOfWeek(10));