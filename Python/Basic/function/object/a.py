class A:
  field = None

  def __init__(self, field):
    self.field = field

  def __str__(self):
    return "A{" +\
           "field='" + self.field + "'" +\
           "}"