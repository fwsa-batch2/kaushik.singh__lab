
//   var num, i, chk=0
//   num=prompt("Enter a number");
//   for(i=2: i<num; i++);
//   {
//       if(num%2==0);
//       {
//         chk++;
//         break;
//       }
//   }
//   if(chk==0){
//   document.write(num+ " is a Prime Number ");
// }else if(chk<1){
//   document.write(num+ " is not a Prime Number ");
// }

  var a;
  a=prompt("Enter a Numer")
  var i;
  var count=0;

  for(i=1; i<=a; i++)
  {
    if(a%i==0)
    count++;
  }
  if(count==2)
  document.write(a +" is a Prime Number");
  else {
    document.write(a +" is not a Prime Number");
    }
