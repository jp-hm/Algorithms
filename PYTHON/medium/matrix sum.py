# soma_matriz.py
rows = int(input("Enter number of rows: "))
cols = int(input("Enter number of columns: "))
matrix = []
for i in range(rows):
    row = [int(x) for x in input(f"Enter elements of row {i + 1} separated by space: ").split()]
    matrix.append(row)
total_sum = sum(sum(row) for row in matrix)
print("Sum of all elements:", total_sum)
