# 线性表
        线性表是最简单最常用的一种数据结构。简言之，一个线性表是n个数据元素的有序列表（集合内的元素类型一致）。
    至于每个元素的具体含义，在不同情况下各不相同，它可以是一个数字或者一个符号，也可以是一页书，甚至更复杂的东西。
    
1. 数组实现

	[MyList](#https://github.com/425324438/dataStructure-java/blob/master/src/main/java/com/line/MyList.java) 实现的功能并没有那么多，只是为了练习。一切功能都可以扩展
 
2. 链表实现

    1.  线性链表
    
        [MyLinkedList](#https://github.com/425324438/dataStructure/blob/master/src/com/line/MyLinkedList.java) 线性链表，也称单向链表，一些简单的实现

    2.  循环链表
            
        ![循环链表][https://raw.githubusercontent.com/425324438/dataStructure/master/src/com/line/img/%E5%8F%8C%E5%90%91%E9%93%BE%E8%A1%A8.jpg]
            
            循环链表：尾部元素指向头部

    3.  双向链表
           
         ![双向链表][https://raw.githubusercontent.com/425324438/dataStructure/master/src/com/line/img/%E5%8F%8C%E5%90%91%E9%93%BE%E8%A1%A8.jpg]
            
            每个节点都包含了上一个节点的指针和下一个节点的指针

3. 一元多项式的表示及相加    