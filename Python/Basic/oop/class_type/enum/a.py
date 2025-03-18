from enum import Enum

class A(Enum):
  A1 = 1
  B2 = 2
  C3 = 3

  field = "field"

name = {
  A.A1: "a",
  A.B2: "bb",
  A.C3: "ccc"
}