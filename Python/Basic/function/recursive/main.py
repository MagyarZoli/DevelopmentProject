def factorial(n):
  if n >= 1:
    print(n)
    factorial(n - 1)

def return_factorial(n):
  if n == 1:
    return 1
  return n * return_factorial(n - 1)

factorial(5)
print(return_factorial(5))