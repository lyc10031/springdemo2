package com.example.springdemo2.dao.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description: TransportRuleDetail
 * @Author leiyongcheng
 * @Date: 2022年02月04日 4:12 下午
 * @Version 1.0
 */
@NoArgsConstructor
@Data
public class TransportRuleDetail {
    /**
     * id
     */
    @JSONField(name = "id")
    private Integer id;
    /**
     * protocolId
     */
    @JSONField(name = "protocol_id")
    private Integer protocolId;
    /**
     * srcPoiCode
     */
    @JSONField(name = "src_poi_code")
    private String srcPoiCode;
    /**
     * srcPoiName
     */
    @JSONField(name = "src_poi_name")
    private String srcPoiName;
    /**
     * valid
     */
    @JSONField(name = "valid")
    private Integer valid;
    /**
     * createTime
     */
    @JSONField(name = "create_time")
    private Long createTime;
    /**
     * createBy
     */
    @JSONField(name = "create_by")
    private String createBy;
    /**
     * updateTime
     */
    @JSONField(name = "update_time")
    private Integer updateTime;
    /**
     * updateBy
     */
    @JSONField(name = "update_by")
    private String updateBy;
    /**
     * remark
     */
    @JSONField(name = "remark")
    private String remark;
    /**
     * destCityId
     */
    @JSONField(name = "dest_city_id")
    private Integer destCityId;
    /**
     * destCityName
     */
    @JSONField(name = "dest_city_name")
    private String destCityName;
    /**
     * content
     */
    @JSONField(name = "content")
    private String content;
}
