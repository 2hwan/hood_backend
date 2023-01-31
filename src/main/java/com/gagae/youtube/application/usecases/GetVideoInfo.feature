@GetVideo
  Feature: 영상정보를 가져올 수 있는가

    Scenario: 유튜브에서 영상정보를 가져온다
      Given 영상 id가 있다 (DB에 해당 영상 id가 있어야함)
      And 영상 id로 유튜브에 조회 요청을한다
      Then 유튜브에서 영상정보를 가져온다

    Scenario: 가져온 정보를 DB 에 insert or update 한다
      Given 유튜브에서 가져온 영상정보가 있다
      Then DB 에 update 한다