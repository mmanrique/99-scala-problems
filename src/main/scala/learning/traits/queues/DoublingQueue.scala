package learning.traits.queues

trait DoublingQueue extends IntQueue {
  override def put(x: Int) {
    super.put(x * 2)
  }

}
