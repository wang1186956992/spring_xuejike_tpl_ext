package com.example.demo.yewu;

import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;

public class Page<T> {
    private List<T> list;
    private int pageCurrent = 1;
    private int pageSize = 30;
    private Long total = 0L;
    private int pageCount = 0;
    private Float avgScore = 0.0F;

    public Page() {
    }

    @JSONField(
            name = "rows"
    )
    public List<T> getList() {
        return this.list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public int getPageCurrent() {
        return this.pageCurrent;
    }

    public void setPageCurrent(int pageCurrent) {
        this.pageCurrent = pageCurrent;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public Long getTotal() {
        return this.total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Float getAvgScore() {
        return this.avgScore;
    }

    public void setAvgScore(Float avgScore) {
        this.avgScore = avgScore;
    }

    public int getPageCount() {
        if ((long)this.pageSize >= this.total) {
            this.pageCount = 1;
            return this.pageCount;
        } else {
            if (this.pageCount == 0 && this.total > 0L && this.pageSize > 0) {
                this.pageCount = (int)(this.total / (long)this.pageSize) + 1;
            }

            return this.pageCount;
        }
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}
