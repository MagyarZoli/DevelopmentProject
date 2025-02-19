import os
import shutil

source: str = "delete.txt"

def delete_empty_folder(folder: str):
  try:
    os.rmdir("empty_folder")
  except PermissionError:
    print("You do not have permission to delete that")

def delete_folder(folder: str):
  try:
    shutil.rmtree("folder")
  except OSError:
    print("You cannot delete that using that function")

def delete_file():
  try:
    os.remove(source)
  except FileNotFoundError:
    print("That file was not found")

if __name__ == '__main__':
  delete_file()