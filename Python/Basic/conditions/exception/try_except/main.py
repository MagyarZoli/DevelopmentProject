x = 5
y = 0
result = None

def tryException():
  try:
    result = x / y
  except ZeroDivisionError as e:
    print("You can't divide by zero!")
    print(e)
  except Exception as e:
    print("Something went wrong")
    print(e)
  else:
    print(result)
  finally:
    print("This will always execute")

tryException()