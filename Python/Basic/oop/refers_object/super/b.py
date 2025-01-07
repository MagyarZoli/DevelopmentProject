from a import A

class B(A):
    def __init__(self, a, b):
        super().__init__(a)
        self.b = b

    def b_function(self):
        return self.a + self.b