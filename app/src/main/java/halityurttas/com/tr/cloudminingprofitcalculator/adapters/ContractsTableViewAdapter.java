package halityurttas.com.tr.cloudminingprofitcalculator.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.evrencoskun.tableview.adapter.AbstractTableAdapter;
import com.evrencoskun.tableview.adapter.recyclerview.holder.AbstractViewHolder;

import halityurttas.com.tr.cloudminingprofitcalculator.R;
import halityurttas.com.tr.cloudminingprofitcalculator.components.viewmodels.Cell;
import halityurttas.com.tr.cloudminingprofitcalculator.components.viewmodels.ColumnHeader;
import halityurttas.com.tr.cloudminingprofitcalculator.components.viewmodels.RowHeader;

public class ContractsTableViewAdapter extends AbstractTableAdapter<ColumnHeader, RowHeader, Cell> {

    private final Context context;

    public ContractsTableViewAdapter(Context context) {
        super(context);
        this.context = context;
    }

    class CellViewHolder extends AbstractViewHolder {

        public final TextView cellTextView;

        public CellViewHolder(View itemView) {
            super(itemView);
            cellTextView = (TextView) itemView.findViewById(R.id.cell_data);
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateCellViewHolder(ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(context).inflate(R.layout.cell_layout, parent, false);
        return new CellViewHolder(layout);
    }

    @Override
    public void onBindCellViewHolder(AbstractViewHolder holder, Object cellItemModel, int columnPosition, int rowPosition) {
        Cell cell = (Cell) cellItemModel;
        CellViewHolder viewHolder = (CellViewHolder) holder;
        viewHolder.cellTextView.setText((String) cell.getData());

        viewHolder.itemView.getLayoutParams().width = LinearLayout.LayoutParams.WRAP_CONTENT;
        viewHolder.cellTextView.requestLayout();
    }

    class ColumnHeaderViewHolder extends AbstractViewHolder {

        public final TextView cellTextView;

        public ColumnHeaderViewHolder(View itemView) {
            super(itemView);
            cellTextView = (TextView) itemView.findViewById(R.id.column_header_textView);
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateColumnHeaderViewHolder(ViewGroup parent, int viewType) {

        View layout = LayoutInflater.from(context).inflate(R.layout.column_header_layout, parent, false);
        return new ColumnHeaderViewHolder(layout);
    }

    @Override
    public void onBindColumnHeaderViewHolder(AbstractViewHolder holder, Object columnHeaderItemModel, int columnPosition) {
        ColumnHeader columnHeader = (ColumnHeader) columnHeaderItemModel;

        ColumnHeaderViewHolder columnHeaderViewHolder = (ColumnHeaderViewHolder) holder;
        columnHeaderViewHolder.cellTextView.setText((String) columnHeader.getData());

        columnHeaderViewHolder.
    }
}
