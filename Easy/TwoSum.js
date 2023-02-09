/**
 Notes:
 Array of numbers and a target are passed in to function. 
 Function decides what numbers what numbers from that array can add up to the target.
 */
function twoSums(nums, target) {
  for (let a = 0; a < nums.length; a++) {
    for (let b = 0; b < nums.length; b++) {
      if (a === b) {
        b++;
      }
      if (nums[a] + nums[b] === target) {
        return [a, b];
      }
    }
  }
}
