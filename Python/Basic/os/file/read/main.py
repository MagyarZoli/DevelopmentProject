source: str = "read.txt"

def read_file():
  try:
    with open(source) as f:
      print(f.read())
  except OSError as e:
    print(e)

if __name__ == '__main__':
  read_file()