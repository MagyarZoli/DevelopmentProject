from a import A
from b import B

a = A(2, 3)

print(a.function())
print(A.static_function(4, 5))

b = B(2, 3)

print(b.function())
print(B.static_function(4, 5))
