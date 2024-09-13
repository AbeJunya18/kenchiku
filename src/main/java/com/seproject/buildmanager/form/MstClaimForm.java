package com.seproject.buildmanager.form;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class MstClaimForm {
  private String id;
  private String caseId;
  private LocalDateTime conEndDate;
  private int totalAmount;

  private String caseKind;
  private String caseName;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
  private String caseTenantBranchName;
  private String transactionToken;

}
