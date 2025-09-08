// Write a function that, given a list of words and a prefix, returns all words that start with that prefix.

// Example:
// Input: words = ["facebook", "face", "factory", "fast", "dog"], prefix = "fa"
// Output: ["facebook", "face", "factory", "fast"]
let arr = ["facebook", "face", "factory", "fast", "dog"]
let prefix = 'fac'

let firstTwo = arr.map(str => str.slice(0,prefix.length));
for (let i = 0; i < arr.length; i++) {
    if(firstTwo[i]==prefix){
        console.log(arr[i])
    }
}
