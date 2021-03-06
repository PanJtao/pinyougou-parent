package entity;

import java.io.Serializable;
import java.util.List;

/**
 * @author PanJtao
 * @date 2019/2/14 14:47
 */
public class PageResult implements Serializable{

    private static final long serialVersionUID = 123456789L;

    private long total;
    private List rows;

    public PageResult(long total, List rows) {
        this.total = total;
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }
}
