source: str = "create.txt"

def create_file():
  try:
    with open(source, "w") as f:
      pass
  except FileNotFoundError as e:
    print(e)

if __name__ == '__main__':
  create_file()