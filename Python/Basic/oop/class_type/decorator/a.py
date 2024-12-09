def a(value=0):
  def decorator(cls):
    cls._a_value = value
    return cls
  return decorator