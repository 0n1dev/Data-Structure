# ArrayList
---

- 일반 배열과 ArrayList는 인덱스로 객체를 관리한다는 점에서 동일
- ArrayList는 크기를 동적으로 늘릴 수 있다는 점에서 차이

## 배열과 ArrayList 차이
---

- 배열은 크기가 고정, ArrayList는 사이즈가 동적인 배열
- 배열은 primitive type과 Object를 모두 담을 수 있지만, ArrayList는 Object만 담을 수 있음
- 배열은 제네릭을 사용할 수 없지만, ArrayList는 타입 안정성을 보장해주는 제네릭 사용 가능
- 길이에 대해 배열은 length를 쓰고, ArrayList는 size() 메서드를 사용