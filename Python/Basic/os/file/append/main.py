source: str = "append.txt"

def append_file():
  text = "Good bye"
  try:
    with open(source, "a") as f:
      f.write(text)
  except FileNotFoundError as e:
    print(e)

if __name__ == '__main__':
  append_file()