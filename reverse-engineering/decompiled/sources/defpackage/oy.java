package defpackage;

import app.cash.sqldelight.BaseTransacterImpl;
import app.cash.sqldelight.db.SqlDriver;
import app.chalo.core.Product_activation_details_tableQueries;
import app.chalo.core.database.dao.DigitalTripReceiptDaoImpl;
import app.chalo.core.database.mappers.SuperPassTripReceiptMappers;
import app.chalo.superpass.data.models.entities.SuperPassTripReceipt;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class oy implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18986a = 0;
    public final /* synthetic */ List b;
    public final /* synthetic */ DigitalTripReceiptDaoImpl c;

    public /* synthetic */ oy(DigitalTripReceiptDaoImpl digitalTripReceiptDaoImpl, List list) {
        this.c = digitalTripReceiptDaoImpl;
        this.b = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f18986a) {
            case 0:
                Product_activation_details_tableQueries product_activation_details_tableQueries = this.c.f2050a;
                List activation_time_stamp = this.b;
                product_activation_details_tableQueries.getClass();
                Intrinsics.i(activation_time_stamp, "activation_time_stamp");
                String strS = BaseTransacterImpl.S(activation_time_stamp.size());
                SqlDriver sqlDriver = product_activation_details_tableQueries.f697a;
                String strConcat = "DELETE FROM product_activation_details_table WHERE activation_time_stamp IN ".concat(strS);
                activation_time_stamp.size();
                sqlDriver.A0(null, strConcat, new l(activation_time_stamp, 5));
                product_activation_details_tableQueries.T(-1995998880, new ux0(0));
                break;
            default:
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    this.c.f2050a.X(SuperPassTripReceiptMappers.b((SuperPassTripReceipt) it.next()));
                }
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ oy(List list, DigitalTripReceiptDaoImpl digitalTripReceiptDaoImpl) {
        this.b = list;
        this.c = digitalTripReceiptDaoImpl;
    }
}
