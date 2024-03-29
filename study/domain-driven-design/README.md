<!-- {"key":"domain-driven-design","bookName":"DDD Start! - 도메인 주도 설계 구현과 핵심개념 익히기","bookDescription":"DDD(도메인 주도 설계)를 처음 접하는 개발자를 위한 책. DDD를 실제 업무에 적용할 수 있도록 기본적인 이론을 설명하고 이를 구현한 코드를 바탕으로 입문자가 헤매지 않고 DDD를 학습할 수 있도록 했다. 애그리거트, 엔티티, 리포지토리 등 DDD의 핵심 패턴을 이용해서 도메인 모델을 구현하는 방법을 설명한다. 도메인 모델의 트랜잭션 충돌을 처리하는 기법(선점 잠금, 비선점 잠금)을 살펴보고, 도메인 이벤트를 이용해서 도메인 영역 간의 의존을 낮추는 방법과 명령 모델과 조회 모델을 나누는 기법에 대해서도 배운다.\n\n이 책 예제 코드에서 사용하는 언어는 자바이다. 예제에서 사용한 기술로는 스프링 MVC와 JPA(ORM)가 있다. 이 두 기술 자체를 잘 몰라도 책에서 설명하는 내용을 따라가는데 어려움은 없지만 기술에 대한 개요 정도를 알고 있다면 책을 더 잘 이해하는데 도움이 된다. 특히 SQL에만 익숙하다면 JPA가 뭔지 정도는 학습을 하고 이 책을 읽기를 바란다.","tableOfContents":"### 1. 도메인 모델 시작\n- **도메인**\n- **도메인 모델**\n- **도메인 모델 패턴**\n- **도메인 모델 도출**\n- **엔티티와 밸류**\n- **엔티티**\n- **엔티티의 식별자 생성**\n- **밸류 타입**\n- **엔티티 식별자와 밸류 타입**\n- **도메인 모델에 set 메서드 넣지 않기**\n- **도메인 용어**\n### 2. 아키텍쳐 개요\n- **네 개의 영역**\n- **계층 구조 아키텍처**\n- **DIP**\n- **DIP 주의사항**\n- **DIP와 아키텍처**\n- **도메인 영역의 주요 구성요소**\n- **엔티티와 밸류**\n- **애그리거트**\n- **리포지터리**\n- **요청 처리 흐름**\n- **인프라스트럭처 개요**\n- **모듈 구성**\n### 3. 애그리거트\n- **애그리거트**\n- **애그리거트 루트**\n- **도메인 규칙과 일관성**\n- **애그리거트 루트의 기능 구현**\n- **트랜잭션 범위**\n- **리포지터리와 애그리거트**\n- **ID를 이용한 애그리거트 참조**\n- **ID를 이용한 참조와 조회 성능**\n- **애그리거트 간 집합 연관**\n- **애그리거트를 팩토리로 사용하기**\n### 4. 리포지터리와 모델 구현 (JPA 중심)\n- **JPA를 이용한 리포지터리 구현**\n- **모듈 위치**\n- **리포지터리 기본 기능 구현**\n- **매핑 구현**\n- **엔티티와 밸류 기본 매핑 구현**\n- **기본 생성자**\n- **필드 접근 방식 사용**\n- **AttributeConverter를 이용한 밸류 매핑 처리**\n- **밸류 컬렉션: 별도 테이블 매핑**\n- **밸류 컬렉션: 한 개 칼럼 매핑**\n- **밸류를 이용한 아이디 매핑**\n- **별도 테이블에 저장하는 밸류 매핑**\n- **밸류 컬렉션을 @Entity로 매핑하기**\n- **ID 참조와 조인 테이블을 이용한 단방향 M-N 매핑**\n- **애그리거트 로딩 전략**\n- **애그리거트의 영속성 전파**\n- **식별자 생성 기능**\n### 5. 리포지터리와 조회 기능 (JPA 중심)\n- **검색을 위한 스펙**\n- **스펙 조합**\n- **JPA를 위한 스펙 구현**\n- **JPA 스펙 구현**\n- **AND/OR 스펙 조합을 위한 구현**\n- **스펙을 사용하는 JPA 리포지터리 구현**\n- **정렬 구현**\n- **페이징과 개수 구하기 구현**\n- **조회 전용 기능 구현**\n- **동적 인스턴스 생성**\n- **하이버네이트 @Subselect 사용**\n### 6. 응용 서비스와 표현 영역\n- **표현 영역과 응용 영역**\n- **응용 서비스의 역할**\n- **도메인 로직 넣지 않기**\n- **응용 서비스의 구현**\n- **응용 서비스의 크기**\n- **응용 서비스의 인터페이스와 클래스**\n- **메서드 파라미터와 값 리턴**\n- **표현 영역에 의존하지 않기**\n- **트랜잭션 처리**\n- **도메인 이벤트 처리**\n- **표현 영역**\n- **값 검증**\n- **권한 검사**\n- **조회 전용 기능과 응용 서비스**\n### 7. 도메인 서비스\n- **여러 애그리거트가 필요한 기능**\n- **도메인 서비스**\n- **도메인 서비스의 패키지 위치**\n- **도메인 서비스의 인터페이스와 클래스**\n### 8. 애그리거트 트랜잭션 관리\n- **애그리거트와 트랜잭션**\n- **선점 잠금**\n- **선전 잠금과 교착 상태**\n- **비선점 잠금**\n- **강제 버전 증가**\n- **오프라인 선점 잠금**\n- **오프라인 선점 잠금을 위한 LockManager 인터페이스와 관련 클래스**\n- **DB를 이용한 LockManager 구현**\n### 9. 도메인 모델과 BOUNDED CONTEXT\n- **도메인 모델과 경계**\n- **BOUNDED CONTEXT**\n- **BOUNDED CONTEXT의 구현**\n- **BOUNDED CONTEXT 간 통합**\n- **BOUNDED CONTEXT 간 관계**\n- **컨텍스트 맵**\n### 10. 이벤트\n- **시스템 간 강결합의 문제**\n- **이벤트 개요**\n- **이벤트 관련 구성요소**\n- **이벤트의 구성**\n- **이벤트 용도**\n- **이벤트 장점**\n- **이벤트, 핸들러, 디스패처 구현**\n- **이벤트 클래스**\n- **EventHandler 인터페이스**\n- **이벤트 디스패처인 Events 구현**\n- **흐름 정리**\n- **AOP를 이용한 Events.reset() 실행**\n- **동기 이벤트 처리 문제**\n- **비동기 이벤트 처리**\n- **로컬 핸들러의 비동기 실행**\n- **메시징 시스템을 이용한 비동기 구현**\n- **이벤트 저장소를 이용한 비동기 처리**\n- **이벤트 저장소 구현**\n- **이벤트 저장을 위한 이벤트 핸들러 구현**\n- **REST API 구현**\n- **포워더 구현**\n- **이벤트 적용 시 추가 고려사항**\n### 11. CQRS\n- **단일 모델의 단점**\n- **CQRS**\n- **웹과 CQRS**\n- **CQRS 장단점**"} -->
# DDD Start! - 도메인 주도 설계 구현과 핵심개념 익히기

## 책 소개
DDD(도메인 주도 설계)를 처음 접하는 개발자를 위한 책. DDD를 실제 업무에 적용할 수 있도록 기본적인 이론을 설명하고 이를 구현한 코드를 바탕으로 입문자가 헤매지 않고 DDD를 학습할 수 있도록 했다. 애그리거트, 엔티티, 리포지토리 등 DDD의 핵심 패턴을 이용해서 도메인 모델을 구현하는 방법을 설명한다. 도메인 모델의 트랜잭션 충돌을 처리하는 기법(선점 잠금, 비선점 잠금)을 살펴보고, 도메인 이벤트를 이용해서 도메인 영역 간의 의존을 낮추는 방법과 명령 모델과 조회 모델을 나누는 기법에 대해서도 배운다.

이 책 예제 코드에서 사용하는 언어는 자바이다. 예제에서 사용한 기술로는 스프링 MVC와 JPA(ORM)가 있다. 이 두 기술 자체를 잘 몰라도 책에서 설명하는 내용을 따라가는데 어려움은 없지만 기술에 대한 개요 정도를 알고 있다면 책을 더 잘 이해하는데 도움이 된다. 특히 SQL에만 익숙하다면 JPA가 뭔지 정도는 학습을 하고 이 책을 읽기를 바란다.

## 목차
### 1. 도메인 모델 시작
- **도메인**
- **도메인 모델**
- **도메인 모델 패턴**
- **도메인 모델 도출**
- **엔티티와 밸류**
- **엔티티**
- **엔티티의 식별자 생성**
- **밸류 타입**
- **엔티티 식별자와 밸류 타입**
- **도메인 모델에 set 메서드 넣지 않기**
- **도메인 용어**
### 2. 아키텍쳐 개요
- **네 개의 영역**
- **계층 구조 아키텍처**
- **DIP**
- **DIP 주의사항**
- **DIP와 아키텍처**
- **도메인 영역의 주요 구성요소**
- **엔티티와 밸류**
- **애그리거트**
- **리포지터리**
- **요청 처리 흐름**
- **인프라스트럭처 개요**
- **모듈 구성**
### 3. 애그리거트
- **애그리거트**
- **애그리거트 루트**
- **도메인 규칙과 일관성**
- **애그리거트 루트의 기능 구현**
- **트랜잭션 범위**
- **리포지터리와 애그리거트**
- **ID를 이용한 애그리거트 참조**
- **ID를 이용한 참조와 조회 성능**
- **애그리거트 간 집합 연관**
- **애그리거트를 팩토리로 사용하기**
### 4. 리포지터리와 모델 구현 (JPA 중심)
- **JPA를 이용한 리포지터리 구현**
- **모듈 위치**
- **리포지터리 기본 기능 구현**
- **매핑 구현**
- **엔티티와 밸류 기본 매핑 구현**
- **기본 생성자**
- **필드 접근 방식 사용**
- **AttributeConverter를 이용한 밸류 매핑 처리**
- **밸류 컬렉션: 별도 테이블 매핑**
- **밸류 컬렉션: 한 개 칼럼 매핑**
- **밸류를 이용한 아이디 매핑**
- **별도 테이블에 저장하는 밸류 매핑**
- **밸류 컬렉션을 @Entity로 매핑하기**
- **ID 참조와 조인 테이블을 이용한 단방향 M-N 매핑**
- **애그리거트 로딩 전략**
- **애그리거트의 영속성 전파**
- **식별자 생성 기능**
### 5. 리포지터리와 조회 기능 (JPA 중심)
- **검색을 위한 스펙**
- **스펙 조합**
- **JPA를 위한 스펙 구현**
- **JPA 스펙 구현**
- **AND/OR 스펙 조합을 위한 구현**
- **스펙을 사용하는 JPA 리포지터리 구현**
- **정렬 구현**
- **페이징과 개수 구하기 구현**
- **조회 전용 기능 구현**
- **동적 인스턴스 생성**
- **하이버네이트 @Subselect 사용**
### 6. 응용 서비스와 표현 영역
- **표현 영역과 응용 영역**
- **응용 서비스의 역할**
- **도메인 로직 넣지 않기**
- **응용 서비스의 구현**
- **응용 서비스의 크기**
- **응용 서비스의 인터페이스와 클래스**
- **메서드 파라미터와 값 리턴**
- **표현 영역에 의존하지 않기**
- **트랜잭션 처리**
- **도메인 이벤트 처리**
- **표현 영역**
- **값 검증**
- **권한 검사**
- **조회 전용 기능과 응용 서비스**
### 7. 도메인 서비스
- **여러 애그리거트가 필요한 기능**
- **도메인 서비스**
- **도메인 서비스의 패키지 위치**
- **도메인 서비스의 인터페이스와 클래스**
### 8. 애그리거트 트랜잭션 관리
- **애그리거트와 트랜잭션**
- **선점 잠금**
- **선전 잠금과 교착 상태**
- **비선점 잠금**
- **강제 버전 증가**
- **오프라인 선점 잠금**
- **오프라인 선점 잠금을 위한 LockManager 인터페이스와 관련 클래스**
- **DB를 이용한 LockManager 구현**
### 9. 도메인 모델과 BOUNDED CONTEXT
- **도메인 모델과 경계**
- **BOUNDED CONTEXT**
- **BOUNDED CONTEXT의 구현**
- **BOUNDED CONTEXT 간 통합**
- **BOUNDED CONTEXT 간 관계**
- **컨텍스트 맵**
### 10. 이벤트
- **시스템 간 강결합의 문제**
- **이벤트 개요**
- **이벤트 관련 구성요소**
- **이벤트의 구성**
- **이벤트 용도**
- **이벤트 장점**
- **이벤트, 핸들러, 디스패처 구현**
- **이벤트 클래스**
- **EventHandler 인터페이스**
- **이벤트 디스패처인 Events 구현**
- **흐름 정리**
- **AOP를 이용한 Events.reset() 실행**
- **동기 이벤트 처리 문제**
- **비동기 이벤트 처리**
- **로컬 핸들러의 비동기 실행**
- **메시징 시스템을 이용한 비동기 구현**
- **이벤트 저장소를 이용한 비동기 처리**
- **이벤트 저장소 구현**
- **이벤트 저장을 위한 이벤트 핸들러 구현**
- **REST API 구현**
- **포워더 구현**
- **이벤트 적용 시 추가 고려사항**
### 11. CQRS
- **단일 모델의 단점**
- **CQRS**
- **웹과 CQRS**
- **CQRS 장단점**
