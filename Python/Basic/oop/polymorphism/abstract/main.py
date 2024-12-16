from b import B
from c import C

def change_a_field(a_class, a):
  a_class.a = a

def ab_function(a_class):
  a_class.a_function()
  a_class.b_function()

b = B()
c = C()

change_a_field(b, "b field")
change_a_field(c, "c field")

b.b = "b field"
c.b = "c field"

print(b.a)
print(c.a)
print(b.b)
print(c.b)

ab_function(b)
ab_function(c)