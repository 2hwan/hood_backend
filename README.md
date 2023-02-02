# hood_backend
Spring Boot, JPA, Hexagonal Architecture

#
1. 도메인 헥사곤

    1-1 문제 영역 이해
    
    1-2 VO 객체 정의
    
    1-3 Entity와 명세 정의
    
    1-4 도메인 서비스 정의
    
    1-5 도메인 헥사곤 테스트 코드 작성
    
2. 어플리케이션 헥사곤

    2-1 유즈케이스 정의
    
        2-1-1 디스크립션 작성
    2-2 유즈케이스와 입력 포트 구현
    
    2-3 어플리케이션 헥사곤 테스트
    
3. 프레임워크 헥사곤
    
    3-1 출력 어댑터 구현
    
    3-2 입력 어댑터 구현
    
    3-3 프레임워크 헥사곤 테스트
    
        
# 서비스 흐름
input Adapter -> UseCase(interface) -> input port -> output port(interface) -> output Adapter
