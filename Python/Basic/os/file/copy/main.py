import shutil

source: str = "copy.txt"
target: str = "pack/copy.txt"

def copy_file():
  shutil.copyfile(source, target)

if __name__ == '__main__':
  copy_file()