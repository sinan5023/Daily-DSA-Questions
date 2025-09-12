function groupScores(scores) {
  let result = {};

  for (let i = 0; i < scores.length; i++) {
    let student = scores[i].student;
    let score = scores[i].score;

    if (!result[student]) {
      result[student] = [];
    }
    result[student].push(score);
  }

  return result;
}
let scores = [
  { student: "Alice", score: 80 },
  { student: "Bob", score: 70 },
  { student: "Alice", score: 90 },
  { student: "Bob", score: 50 },
  { student: "Alice", score: 90 },
];

console.log(groupScores(scores));
