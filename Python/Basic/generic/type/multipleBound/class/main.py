from a import A
from b import B
from c import C
from d import D
from e import E
from f import F
from g import G
from h import H
from i import I

if __name__ == '__main__':
    a = A()

    b: B = B()
    c: C = C()
    d: D = D()
    e: E = E()
    F_anonymous = type(
        "F_anonymous",
        (F,), {
            "void_function": lambda self: print("f function"),
            "return_function": lambda self: "f function",
        }
    )
    f: F = F_anonymous()
    g: G = G()
    h: H = H()
    i: I = I()

    a.generic_function(b)
    print(a.generic_return_function(b))

    a.generic_function(c)
    print(a.generic_return_function(c))

    a.generic_function(d)
    print(a.generic_return_function(d))

    a.generic_function(e)
    print(a.generic_return_function(e))

    a.generic_function(f)
    print(a.generic_return_function(f))

    a.generic_function(g)
    print(a.generic_return_function(g))

    a.generic_function(h)
    print(a.generic_return_function(h))

    a.generic_function(i)
    print(a.generic_return_function(i))

