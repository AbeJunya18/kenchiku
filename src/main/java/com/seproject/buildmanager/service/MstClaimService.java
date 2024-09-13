package com.seproject.buildmanager.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.seproject.buildmanager.common.MstCodeEnums;
import com.seproject.buildmanager.entity.MstClaim;
import com.seproject.buildmanager.entity.MstMatter;
import com.seproject.buildmanager.repository.MstClaimRepository;
import com.seproject.buildmanager.repository.MstMatterRepository;

@Service
public class MstClaimService {

  private final MstClaimRepository mstClaimRepository;

  private final MstMatterRepository mstmatterRepository;

  private final MstCodeService mstCodeService;

  // Enumから種別を取得するためののcode_kindの値を取得
  private static final int TASK_SUBSTANCE = MstCodeEnums.TASK_SUBSTANCE.getValue();

  private MstClaimService(MstClaimRepository mstClaimRepository,
      MstMatterRepository mstmatterRepository, MstCodeService mstCodeService) {
    this.mstClaimRepository = mstClaimRepository;
    this.mstmatterRepository = mstmatterRepository;
    this.mstCodeService = mstCodeService;
  }

  public List<MstClaim> findDisplay() {
    List<MstClaim> OrderInfoList = mstClaimRepository.findAll();
    return OrderInfoList;
  }

  public List<MstMatter> findmatterDisplay() {
    List<MstMatter> matterInfoList = mstmatterRepository.findAll();
    return matterInfoList;
  }


  // public List<MstClaimForm> viewOrderForm() {
  // List<MstClaim> mstOrder = findDisplay();
  // List<MstClaimForm> mstOrderForm = new ArrayList<MstClaimForm>();
  // for (MstClaim orderNum : mstOrder) {
  // mstOrderForm.add(updateOrderForm(orderNum));
  // }
  // return mstOrderForm;
  // }
  //
  // public List<MstmatterForm> viewmatterForm() {
  // List<Mstmatter> mstmatter = findmatterDisplay();
  // List<MstmatterForm> mstmatterForm = new ArrayList<MstmatterForm>();
  // for (Mstmatter matterNum : mstmatter) {
  // mstmatterForm.add(updatematterForm(matterNum));
  // }
  //
  // return mstmatterForm;
  //
  // }

  // public MstClaimForm updateOrderForm(MstClaim mstOrder) {
  // MstClaimForm tmp = new MstClaimForm();
  //
  // // MstCode mstCode = mstCodeService.getCodeByKindAndBranch(TASK_SUBSTANCE,
  // // mstmatter.getmatterKind());
  //
  // tmp.setId(String.valueOf(mstOrder.getId()));
  // tmp.setmatterId(String.valueOf(mstOrder.getmatterId()));
  // tmp.setConStartDate(mstOrder.getConStartDate());
  // tmp.setConEndDate(mstOrder.getConEndDate());
  //
  // return tmp;
  // }
  //
  // public MstmatterForm updatematterForm(Mstmatter mstmatter) {
  //
  // MstmatterForm tmp = new MstmatterForm();
  //
  // MstCode mstCode = mstCodeService.getCodeByKindAndBranch(TASK_SUBSTANCE,
  // mstmatter.getmatterKind());
  //
  // tmp.setmatterKind(mstCode.getCodeName());
  // tmp.setmatterName(mstmatter.getmatterName());
  // tmp.setCustomerName(mstmatter.getCustomerName());
  // tmp.setFloorName(mstmatter.getFloorName());
  // tmp.setmatterTenantAddress(mstmatter.getmatterTenantAddress());
  // tmp.setmatterTenantBuilding(mstmatter.getmatterTenantBuilding());
  // tmp.setmatterTenantName(mstmatter.getmatterTenantName());
  // tmp.setmatterVisitDate(mstmatter.getmatterVisitDate());
  // tmp.setCreatedAt(mstmatter.getCreatedAt());
  // tmp.setUpdatedAt(mstmatter.getUpdatedAt());
  // tmp.setmatterTenantBranchName(mstmatter.getmatterTenantBranchName());
  //
  // return tmp;
  // }
}
