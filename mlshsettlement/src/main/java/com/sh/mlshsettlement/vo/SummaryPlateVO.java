package com.sh.mlshsettlement.vo;

import com.sh.mlshcommon.util.DateUtil;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

@Data
public class SummaryPlateVO implements Serializable {
    /**
     * 易宝商编
     **/
    private String ybMchId;

    /**
     * 汇总日期
     **/
    private LocalDate summaryDay;

    /**
     * 结算金额
     **/
    private BigDecimal settleAmount;

    /**
     * 结算手续费
     **/
    private BigDecimal settleFee;

    /**
     * 结算状态
     **/
    private Integer settleStatus;

    /**
     * tradeinfo 主键
     */
    private String tradeInfoId;

    /**
     * 订单数
     **/
    private Integer orderNum;

}
