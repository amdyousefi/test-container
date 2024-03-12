package com.ernyka.testcontainer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/customer")
// @RequiredArgsConstructor
public class CustomerController {

  // private final CustomerService customerService;

  // @ApiOperation(value = "create tag by caregiver", httpMethod = "POST")
  /*
   * @PostMapping // @PreAuthorize(CAREGIVER) public ResponseEntity<Void> createTag( Principal principal,
   *
   * @Valid @RequestBody TagCreateRequest tagCreateRequest,
   *
   * @PathVariable(name = "clinic-code") String clinicCode) { log.info( "createTag by: {}, clinicCode: {}, model: {}",
   * principal.getName(), clinicCode, tagCreateRequest);
   *
   * String tagId = customerService.createCustomer( prepareTagOwnerDto(principal, clinicCode), tagCreateRequest,
   * TagCategoryEnum.CLIENT_TAG); URI uri = URI.create("/caregiver/clinic/" + clinicCode + "/tag/" + tagId);
   *
   * return ResponseEntity.created(uri).build(); }
   */

  @GetMapping
  public ResponseEntity<String> getTestData() {
    // ModelAndView mv = new ModelAndView();
    // mv.setViewName("welcome");
    // mv.getModel().put("data", "Welcome home man");

    return ResponseEntity.ok("test 2"); // .build();
  }
}
