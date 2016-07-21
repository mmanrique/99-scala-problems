package learning.traits.queues

import scala.collection.mutable.ArrayBuffer

class BasicIntQueue extends IntQueue {
  private val buf: ArrayBuffer[Int] = new ArrayBuffer[Int]()


  //As of Scala 2.10, we should always use the equals sign
  //If not used, the scala will fix the type of return to Unit either way
  override def put(x: Int): Unit = {
    buf += x
  }

  override def get(): Unit = buf remove 0
}
