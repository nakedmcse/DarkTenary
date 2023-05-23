//Dark Tenary Test - Javascript
const getDayOfWeek = (dayNumber) =>
    dayNumber === 0
        ? "Sunday"
        : dayNumber === 1
        ? "Monday"
        : dayNumber === 2
        ? "Tuesday"
        : dayNumber === 3
        ? "Wednesday"
        : dayNumber === 4
        ? "Thursday"
        : dayNumber === 5
        ? "Friday"
        : dayNumber === 6
        ? "Saturday"
        : "Invalid day number";

console.log(getDayOfWeek(3));
console.log(getDayOfWeek(10));