def tryWithResource():
  try:
    with open("text.txt") as file:
      print(file.read())
  except FileNotFoundError as e:
    print(e)

tryWithResource()