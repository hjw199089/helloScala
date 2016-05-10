

val symbols = Array("[", "-", "]")
val counts = Array(2,5,2)
val pairs = symbols.zip(counts)
for ((x,y) <- pairs) Console.print(x*y)
