var x = document.getElementById("demo")
      var y = x.innerHTML = Math.floor((Math.random() * 5) + 1);
      var number = prompt("pick a number 1-5");
      if (number == y) {
      alert ("you were right! after " + total + "attempts")
     }
     else {
      alert ("You were wrong. The answer was " + y)
      var number = prompt("pick a number 1-5");
      total = 0
      total = total + x
     }
