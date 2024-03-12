package com.ernyka.testcontainer.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

class CustomerControllerIntegrationTest extends IntegrationTest {

  @Autowired private CustomerController customerController;

  /*
   * private ClinicResponse clinicResponse; private Principal caregiverPrincipal; private Long offset; private
   * CaregiverResponse caregiverResponse; private ClientResponse clientResponse; private ClinicAdminResponse
   * clinicAdminResponse;
   */

  /*
   * @BeforeAll public void setUp() throws Exception { SecurityContextHolder.getContext() .setAuthentication( new
   * TestingAuthenticationToken("", "", "INSTITUTE", "CLINIC", "CAREGIVER")); clinicResponse =
   * clinicHelper.createClinic().getBody(); String clinicAdminCode = clinicAdminHelper .create(
   * ClinicAdminFactory.getInstance().makeCreateRequest(), clinicResponse.getCode(), INSTITUTE_PRINCIPAL) .getCode();
   * clinicAdminResponse = clinicAdminHelper.getClinicAdminByInstitute(clinicAdminCode, INSTITUTE_PRINCIPAL);
   * caregiverResponse = caregiverHelper.createCaregiverByClinic( CaregiverFactory.getInstance().makeCreateRequest(),
   * clinicResponse.getCode(), () -> clinicAdminResponse.getOpttId()); caregiverPrincipal = () ->
   * caregiverResponse.getOpttId(); ClientCreateRequest createRequest =
   * ClientFactory.getInstance().makeClientRequest(clinicResponse); clientResponse =
   * clientHelper.createClient(createRequest, () -> clinicAdminResponse.getOpttId()); offset = 0L;
   * clientHelper.assignCaregiversToClient( clientResponse.getCode(), () -> clinicAdminResponse.getOpttId(),
   * Collections.singletonList(caregiverResponse.getCode())); SessionCreateRequest sessionCreateRequest =
   * SessionFactory.getInstance() .makeCreateRequest( clinicResponse.getCode(), clientResponse.getCode(),
   * caregiverResponse.getCode()); caregiverSessionController.createSession( caregiverPrincipal, offset,
   * clinicResponse.getCode(), sessionCreateRequest); }
   */

  /*
   * @Test void getLastMessageOfChats_CompleteTest() { // given Principal clientPrincipal = () ->
   * clientResponse.getOpttId(); ResponseEntity<Page<ChatMessageModel>> lastMessageOfChats =
   * chatController.getLastMessageOfChats(clientPrincipal, PageRequest.of(0, 10), 0L);
   *
   * BooleanExpression predicate = QSession.session .fromDate .loe(new Date()) .and(QSession.session.closed.isFalse())
   * .and(QSession.session.deleted.isFalse());
   *
   * // when ResponseEntity<Page<ClientSessionResponse>> listSessions =
   * clientSessionController.listSessions(clientPrincipal, 0L, predicate, PageRequest.of(0, 10));
   *
   * // then Page<ClientSessionResponse> listSessionsBody = listSessions.getBody(); for (ChatMessageModel
   * lastMessageModel : lastMessageOfChats.getBody().getContent()) { Optional<ClientSessionResponse> sessionResponse =
   * listSessionsBody.getContent().stream() .filter(s -> s.getCode().equals(lastMessageModel.getSessionCode()))
   * .findFirst();
   *
   * Assertions.assertTrue(sessionResponse.isPresent()); } }
   */

  @Test
  void getTestData() {
    // given

    // when
    ResponseEntity<String> responseEntity = customerController.getTestData();

    // then
    assertEquals("test 2", responseEntity.getBody());
  }
}
