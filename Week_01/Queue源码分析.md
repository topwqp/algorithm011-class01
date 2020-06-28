
## Queue源码分析

### Queue源码分析

```java
package java.util;

public interface Queue<E> extends Collection<E> {
    /**
     * @throws IllegalArgumentException if some property of this element
     *         prevents it from being added to this queue
     */
    /**
     *  将指定元素e插入到队列时：
     *  当队列中没有容量限制时,插入后直接返回true代表成功
     *  如果队列有容量限制，没有足够的空间可以使用的时候，返回IllegalStateException异常
     *  可能抛出的异常说明：
     *  1、 IllegalStateException 对于有容量限制的队列，没有足够的空间可以使用的时候
     *  2、 ClassCastException 如果添加元素和队列指定的类型E不匹配时抛出 
     *  3、 NullPointerException 当队列不允许为空时，但是 add(null)时，抛出
     *  4、 IllegalArgumentException 取决于实现类对输入参数e的属性的自定义校验 
     */ 
    boolean add(E e);

   
    /**
     *  插入指定的元素到队列中，在没有违反容量限制的情况下立刻插入返回
     *  当使用有容量限制的队列时，更倾向于使用add(E e)方法，因为当插入失败时
     *  能够抛出异常
     *  如果元素能够增加到队列返回 true，否则返回false，该方法不会抛出异常，这是和
     *  add(E e)方法的最大区别
     *  可能抛出的异常： 
     *  1、ClassCastException  指定的类型不能够添加到队列时
     *  2、NullPointerException 插入的指定元素为空时，队列的实现不允许插入为空时，抛出异常
     *  3、IllegalArgumentException 插入的元素不符合实现类的校验属性时抛出 
     */
    boolean offer(E e);

    
    /**
     *  移除队列头部的元素
     *  该方法和poll方法区别是： 当队列为空时，该方法会抛出异常，但是poll方法会返回null
     *  如果队列为空： 抛出： NoSuchElementException
     */
    E remove();

    /**
     * Retrieves and removes the head of this queue,
     * or returns {@code null} if this queue is empty.
     *
     * @return the head of this queue, or {@code null} if this queue is empty
     */
    /**
     * 查看并移除队首元素 
     * 返回队首元素，如果队列为空，返回null
     */ 
    E poll();

    /**
     * 检索队首元素，但是不移除， 返回队首元素
     * 方法不同于peek的区别之处是：  当队列为空时，该方法会抛出
     *  NoSuchElementException
     */   
    E element();

    /**
     * 检索 但不移除 队首元素
      *  如果队列是空，返回null
     */
    E peek();
}

```



