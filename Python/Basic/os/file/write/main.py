source: str = "write.txt"

def write_file():
  text = "Good bye"
  try:
    with open(source, "w") as f:
      f.write(text)
  except FileNotFoundError as e:
    print(e)

if __name__ == '__main__':
  write_file()