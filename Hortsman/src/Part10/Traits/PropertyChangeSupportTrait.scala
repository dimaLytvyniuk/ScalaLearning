package src.Part10.Traits

import java.beans.{PropertyChangeListener, PropertyChangeSupport}

trait PropertyChangeSupportTrait {
  val pcs = new PropertyChangeSupport(this)

  def addPropertyChangeListener(listener: PropertyChangeListener): Unit = {
    pcs.addPropertyChangeListener(listener)
  }

  def removePropertyChangeListener(listener: PropertyChangeListener): Unit = {
    pcs.removePropertyChangeListener(listener)
  }
}
