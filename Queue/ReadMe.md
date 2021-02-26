# 큐 (Queue)
---

- 선형 자료구조
- FIFO(First In First Out) 구조
- 최근 사용 문서, 인쇄 작업 대기 목록, 버퍼 등의 기능을 구현할 때 사용
- BFS 또는 캐시를 구현할 때 사용

## 1. Java에서 Queue 사용

```java
import java.util.LinkedList; // Queue 사용시 LinkedList 필요
import java.util.Queue;

Queue<Integer> q = new LinkedList<Integer>();
```