from a import A
from b import B

Anonymous = type(
  "Anonymous",
  (A,),
  {
    "abstract_function": lambda self: self.a * self.a - self.b,
    "function": lambda self: self.a + self.b
  }
)
a = Anonymous(2, 3)

print(a.abstract_function())
print(a.function())
print(A.static_function(4, 5))

b = B(2, 3)

print(b.abstract_function())
print(b.function())
print(B.static_function(4, 5))