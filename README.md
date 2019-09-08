### <카카오페이 관계사 과제전형> 특정 고객 거래내역 조회 서비스 개발

* 개발 환경
  * JDK 1.8
  * Spring boot 2.1.7
  * MySQL 8.0.17

* 문제해결 방법
  * 공통
    * Controller - Service - DAO 패턴으로 API 개발
    * 기능 명세에 따라 구현 
    * 단위 테스트 클래스 작성
    * 입/출력 확인은 Postman 툴을 이용하여 확인

  * API 기능 1~2
    * SQL문의 조건에 따라 결과를 출력
  * API 기능 3~4
    * SQL문의 조건에 따라 데이터 취득한 결과를 Service에서 가공 후 출력

* 빌드 및 실행 방법
  1. 소스 다운로드 후, STS4를 통해 메이븐 프로젝트로 Import
  2. Import 후 빌드(프로젝트 우클릭 → Maven → Update Project)
  3. 프로젝트 실행 (프로젝트 우클릭 → Run As → Spring Boot App)
  4. 각 api 기능의 url을 localhost에서 실행
      * 2018년, 2019년 각 연도별 합계 금액이 가장 많은 고객을 추출하는 API(GET, localhost:8080/api/mostSumCustomer)
      * 2018년 또는 2019년에 거래가 없는 고객을 추출하는 API(GET, localhost:8080/api/noDealingCustomer)
      * 연도별 관리점별 거래금액 합계를 구하고 합계금액이 큰 순서로 출력하는 API(GET, localhost:8080/api/sumPerYear)
      * 지점명을 입력하면 해당지점의 거래금액 합계를 출력하는 API(POST, localhost:8080/api/sumOfBranch)
