num = int(input("Enter a number: "))
a, b = 0, 1
while a < num:
    a, b = b, a + b
if a == num:
    print("The number is in the Fibonacci sequence.")
else:
    print("The number is not in the Fibonacci sequence.")