package designPatterns.behavioral.iterator;

public class Repository implements Container {
  private String[] values;

  public Repository(String[] values) {
    this.values = values;
  }

  @Override
  public Iterator getIterator() {
    return new ValueIterator(values);
  }

  private class ValueIterator implements Iterator {
    private String[] values;
    private int index;

    public ValueIterator(String[] values) {
      this.values = values;
    }

    @Override
    public boolean hasNext() {
      return index < values.length;
    }

    @Override
    public Object next() {
      if (this.hasNext()) {
        return values[index++];
      }
      return null;
    }
  }
}
