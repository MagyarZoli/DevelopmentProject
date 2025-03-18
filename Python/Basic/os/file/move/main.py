import os

source: str = "move.txt"
target: str = "pack/move.txt"

def move_file():
  try:
    if os.path.exists(target):
      print("There is already a file there")
    else:
      os.replace(source, target)
      print("source was moved")
  except FileNotFoundError:
    print("source was not found")

if __name__ == '__main__':
  move_file()