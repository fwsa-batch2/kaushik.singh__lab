
// var a;
// a=prompt("Enter a Number");
// if(a%2==0);
// document.write(a+" Is Even");
// else
// document.write(a+" Is odd");

let oddeven =prompt("Enter the number:");
let a=Number(oddeven);
if (a%2==0 && a>0){
document.write("The number ",a," is an even number");
} else if(a%2!=0 && a>0) {
document.write("The number ",a," is an odd number");
};
