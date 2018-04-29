package halityurttas.com.tr.greendaogenerator;

import org.greenrobot.greendao.generator.DaoGenerator;
import org.greenrobot.greendao.generator.Entity;
import org.greenrobot.greendao.generator.Schema;

public class AppGreenDaoGenerator {
    public static void main(String[] args) {
        Schema schema = new Schema(1, "halityurttas.com.tr.cloudminingprofitcalculator.entities");
        schema.enableKeepSectionsByDefault();

        addContractEntities(schema);

        try {
            new DaoGenerator().generateAll(schema, "./app/src/main/java");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static Entity addContractEntities(final Schema schema) {
        Entity contract = schema.addEntity("Contracts");
        contract.addIdProperty().primaryKey().autoincrement();
        contract.addIntProperty("ghs").notNull();
        contract.addDateProperty("startDate").notNull();
        contract.addIntProperty("expire");
        return contract;
    }
}
