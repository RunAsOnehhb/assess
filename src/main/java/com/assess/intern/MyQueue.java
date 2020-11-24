package com.assess.intern;


/**
 * @Author: RunAsOne
 * @Date: 2020/11/23 10:42
 */


import java.util.ArrayList;
import java.util.List;

/**
 * 请你仅使用两个栈实现先入先出队列。队列应当支持一般队列的支持的所有操作（push、pop、peek、empty）：
 * <p>
 * 实现 MyQueue 类：
 * <p>
 * void push(int x) 将元素 x 推到队列的末尾
 * int pop() 从队列的开头移除并返回元素
 * int peek() 返回队列开头的元素
 * boolean empty() 如果队列为空，返回 true ；否则，返回 false
 * 说明：
 * <p>
 * 你只能使用标准的栈操作 —— 也就是只有 push to top, peek/pop from top, size, 和 is empty 操作是合法的。
 * 你所使用的语言也许不支持栈。你可以使用 list 或者 deque（双端队列）来模拟一个栈，只要是标准的栈操作即可。
 */
class MyQueue {
    private List<Integer> list;

    public MyQueue() {
        list = new ArrayList<>();
    }

    public void push(int x) {
        list.add(x);

    }

    public int pop() {
        if (list.isEmpty()){
            return -1;
        }
        int first = list.get(0);
        list.remove(0);
        return first;
    }

    public int peek() {
        if (list.isEmpty()){
            return -1;
        }
        return list.get(0);
    }

    public boolean empty() {
        return list.isEmpty();
    }
}
