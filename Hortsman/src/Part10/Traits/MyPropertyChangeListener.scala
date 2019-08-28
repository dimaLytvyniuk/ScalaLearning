package src.Part10.Traits

import java.beans.PropertyChangeEvent
import java.beans.PropertyChangeListener

class MyPropertyChangeListener extends PropertyChangeListener {
  // This method is called every time the property value is changed
  override def propertyChange(evt: PropertyChangeEvent): Unit = {
    println("Name = " + evt.getPropertyName)
    println("Old Value = " + evt.getOldValue)
    println("New Value = " + evt.getNewValue)
    println("**********************************")
  }
}
