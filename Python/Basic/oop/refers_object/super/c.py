from a import A

class C(A):
    def __init__(self, a):
        super().__init__(a)

    def c_function(self):
        return self.a * self.a