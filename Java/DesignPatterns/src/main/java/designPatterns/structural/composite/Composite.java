package designPatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
  private List<Component> components = new ArrayList<>();

  public void addComponent(Component component) {
    components.add(component);
  }

  public void removeComponent(Component component) {
    components.remove(component);
  }

  @Override
  public String show() {
    StringBuilder stringBuilder = new StringBuilder();
    for (Component component : components) {
      stringBuilder.append(component.show()).append("\n");
    }
    return stringBuilder.toString();
  }
}
