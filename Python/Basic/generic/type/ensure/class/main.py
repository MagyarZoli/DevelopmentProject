from a import A
from b import B
from c import C
from d import D
from e import E

if __name__ == '__main__':
    a: A[C] = A()

    b: B = B()
    c: C = C()
    d: D = D()
    e: E = E()

    a.generic_function(b)
    print(a.generic_return_function(b))

    a.generic_function(c)
    print(a.generic_return_function(c))

    a.generic_function(d)
    print(a.generic_return_function(d))

    a.generic_function(e)
    print(a.generic_return_function(e))

