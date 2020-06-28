
##用 add first 或 add last 这套新的 API 改写 Deque 的代码 

### 原来实现： 
```java
/**
 * @author wangqp
 * @desc double end queue test
 * @date 2020年06月28日17:00:51
 */
public class DequeTest {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<String>();
        deque.push("a");
        deque.push("b");
        deque.push("c");
        System.out.println(deque);
        String str = deque.peek();
        System.out.println(str);
        System.out.println(deque);
        while (deque.size() > 0) {
            System.out.println(deque.pop());
        }
        System.out.println(deque);
    }
}

```

### 改写后的实现
```java
/**
 * @author wangqp
 * @desc double end queue test
 * @date 2020年06月28日17:00:51
 */
public class DequeTest {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<String>();
        deque.push("a");
        deque.push("b");
        deque.push("c");
        System.out.println(deque);
        String str = deque.peek();
        System.out.println(str);
        System.out.println(deque);
        while (deque.size() > 0) {
            System.out.println(deque.pop());
        }
        System.out.println(deque);
    }
}

```

