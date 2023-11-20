// Function to sort an array in descending order
function sortDescendingStrings(arr) {
    return arr.sort(function(a, b) {
        return b.localeCompare(a); // Compare strings in descending order
    });
}

// Example usage
let words = ["apple", "banana", "orange", "kiwi"];
let sortedWords = sortDescendingStrings(words);

console.log(sortedWords);
