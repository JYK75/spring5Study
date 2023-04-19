# spring5 study


## 스피링 DI

---

### 1. 의존이란?

DI는 Dependency Injection의 약자로 우리말로는 '의존 주입'이다. 

여기서 의존이란? 
>변경에 의해 영향을 받는 관계 

### 2. DI를 통한 의존 처리

```java
public class MemberRegisterService {
    // 의존 객체를 직접 생성
    private MemberDao memberDao = new MemberDao();
    
    // DI를 통한 의존 처리
    private MemberDao memberDao;
    public MemberRegisterService(MemberDao memberDao) {
        this.memberDao = memberDao;
    }
}
```

그냥 직접 의존 객체를 생성하면 되는데 왜 굳이 생성자를 통해서 의존 객체를 주입하는 걸까?

`변경의 유연함을 위해`
