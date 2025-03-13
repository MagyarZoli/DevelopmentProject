consumer: any = lambda a: print(a)
function: any = lambda a: a
predicate: any = lambda a, b: a < b
supplier: any = lambda self: self

if __name__ == '__main__':
  consumer(1)
  (lambda a: print(a))(1)

  print(function(2))
  print((lambda a: a)(2))

  print(predicate(2, 3))
  print((lambda a, b: a < b)(2, 3))

  print(supplier(4))
  print((lambda self: self)(4))