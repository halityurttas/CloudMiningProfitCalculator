package halityurttas.com.tr.cloudminingprofitcalculator.components.viewmodels;

import com.evrencoskun.tableview.filter.IFilterableModel;
import com.evrencoskun.tableview.sort.ISortableModel;

public class Cell implements ISortableModel, IFilterableModel {

    private String id;
    private Object data;
    private String filterKeyword;

    public Cell(String id) {
        this.id = id;
    }

    public Cell(String id, Object data) {
        this.id = id;
        this.data = data;
        this.filterKeyword = String.valueOf(data);
    }

    public Cell(String id, Object data, String filterKeyword) {
        this.id = id;
        this.data = data;
        this.filterKeyword = filterKeyword;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public Object getContent() {
        return data;
    }

    public Object getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setFilterKeyword(String filterKeyword) {
        this.filterKeyword = filterKeyword;
    }

    @Override
    public String getFilterableKeyword() {
        return this.filterKeyword;
    }
}
