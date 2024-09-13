package com.seproject.buildmanager.entity;

import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

// 受注管理画面用のエンティティです 製作途中です

@Entity
@Data
@NoArgsConstructor
@Table(name = "mst_claim")
public class MstClaim {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "case_id")
  private Integer caseId;

  @Column(name = "con_end_date")
  private LocalDateTime conEndDate; // 工事完了日

  @Column(name = "total_amount")
  private Integer totalAmount; // 合計金額


}
