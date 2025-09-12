// Replace every element with product of its previous and next element (first and last handled separately).

// Input: [2, 3, 4, 5, 6]
// Output: [6, 8, 15, 24, 30]
let arr = [10, 20, 20];
let newarr = [];
for (let i = 0; i < arr.length; i++) {
  if (i == 0) {
    newarr.push(arr[i] * arr[i + 1]);
  } else if (i == arr.length - 1) {
    newarr.push(arr[i] * arr[arr.length - 2]);
  } else {
    newarr.push(arr[i - 1] * arr[i + 1]);
  }
}
console.log(newarr);
