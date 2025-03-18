import os

source: str = "rename.txt"

def rename_file():
  os.rename(source, f"new{source}")

if __name__ == '__main__':
  rename_file()