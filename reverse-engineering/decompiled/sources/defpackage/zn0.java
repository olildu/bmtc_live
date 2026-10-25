package defpackage;

import app.cash.sqldelight.db.SqlPreparedStatement;
import app.chalo.core.Ondc_metro_ticket_table;
import app.chalo.core.Ondc_metro_ticket_tableQueries;
import app.chalo.data.RefundInfoAppModel;
import app.chalo.productbooking.common.data.models.entity.PaymentInfoEntityModel;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zn0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20215a;
    public final /* synthetic */ Ondc_metro_ticket_table b;
    public final /* synthetic */ Ondc_metro_ticket_tableQueries c;

    public /* synthetic */ zn0(Ondc_metro_ticket_table ondc_metro_ticket_table, Ondc_metro_ticket_tableQueries ondc_metro_ticket_tableQueries, int i) {
        this.f20215a = i;
        this.b = ondc_metro_ticket_table;
        this.c = ondc_metro_ticket_tableQueries;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SqlPreparedStatement execute = (SqlPreparedStatement) obj;
        switch (this.f20215a) {
            case 0:
                Intrinsics.i(execute, "$this$execute");
                Ondc_metro_ticket_table ondc_metro_ticket_table = this.b;
                execute.bindString(0, ondc_metro_ticket_table.f1972a);
                execute.bindString(1, ondc_metro_ticket_table.b);
                execute.d(2, Long.valueOf(ondc_metro_ticket_table.c));
                execute.d(3, Long.valueOf(ondc_metro_ticket_table.d));
                Ondc_metro_ticket_table.Adapter adapter = this.c.b;
                execute.bindString(4, (String) adapter.f1973a.encode(ondc_metro_ticket_table.e));
                execute.d(5, ondc_metro_ticket_table.f);
                execute.bindString(6, ondc_metro_ticket_table.g);
                execute.bindString(7, ondc_metro_ticket_table.h);
                List list = ondc_metro_ticket_table.i;
                execute.bindString(8, list != null ? (String) adapter.b.encode(list) : null);
                execute.bindString(9, ondc_metro_ticket_table.j);
                execute.d(10, ondc_metro_ticket_table.k);
                Map map = ondc_metro_ticket_table.l;
                execute.bindString(11, map != null ? (String) adapter.c.encode(map) : null);
                execute.bindString(12, ondc_metro_ticket_table.m);
                execute.bindString(13, ondc_metro_ticket_table.n);
                execute.bindString(14, ondc_metro_ticket_table.o);
                RefundInfoAppModel refundInfoAppModel = ondc_metro_ticket_table.p;
                execute.bindString(15, refundInfoAppModel != null ? (String) adapter.d.encode(refundInfoAppModel) : null);
                List list2 = ondc_metro_ticket_table.q;
                execute.bindString(16, list2 != null ? (String) adapter.e.encode(list2) : null);
                PaymentInfoEntityModel paymentInfoEntityModel = ondc_metro_ticket_table.r;
                execute.bindString(17, paymentInfoEntityModel != null ? (String) adapter.f.encode(paymentInfoEntityModel) : null);
                execute.bindString(18, ondc_metro_ticket_table.s);
                execute.bindString(19, ondc_metro_ticket_table.t);
                break;
            default:
                Intrinsics.i(execute, "$this$execute");
                Ondc_metro_ticket_table ondc_metro_ticket_table2 = this.b;
                execute.bindString(0, ondc_metro_ticket_table2.f1972a);
                execute.bindString(1, ondc_metro_ticket_table2.b);
                execute.d(2, Long.valueOf(ondc_metro_ticket_table2.c));
                execute.d(3, Long.valueOf(ondc_metro_ticket_table2.d));
                Ondc_metro_ticket_table.Adapter adapter2 = this.c.b;
                execute.bindString(4, (String) adapter2.f1973a.encode(ondc_metro_ticket_table2.e));
                execute.d(5, ondc_metro_ticket_table2.f);
                execute.bindString(6, ondc_metro_ticket_table2.g);
                execute.bindString(7, ondc_metro_ticket_table2.h);
                List list3 = ondc_metro_ticket_table2.i;
                execute.bindString(8, list3 != null ? (String) adapter2.b.encode(list3) : null);
                execute.bindString(9, ondc_metro_ticket_table2.j);
                execute.d(10, ondc_metro_ticket_table2.k);
                Map map2 = ondc_metro_ticket_table2.l;
                execute.bindString(11, map2 != null ? (String) adapter2.c.encode(map2) : null);
                execute.bindString(12, ondc_metro_ticket_table2.m);
                execute.bindString(13, ondc_metro_ticket_table2.n);
                execute.bindString(14, ondc_metro_ticket_table2.o);
                RefundInfoAppModel refundInfoAppModel2 = ondc_metro_ticket_table2.p;
                execute.bindString(15, refundInfoAppModel2 != null ? (String) adapter2.d.encode(refundInfoAppModel2) : null);
                List list4 = ondc_metro_ticket_table2.q;
                execute.bindString(16, list4 != null ? (String) adapter2.e.encode(list4) : null);
                PaymentInfoEntityModel paymentInfoEntityModel2 = ondc_metro_ticket_table2.r;
                execute.bindString(17, paymentInfoEntityModel2 != null ? (String) adapter2.f.encode(paymentInfoEntityModel2) : null);
                execute.bindString(18, ondc_metro_ticket_table2.s);
                execute.bindString(19, ondc_metro_ticket_table2.t);
                break;
        }
        return Unit.f17538a;
    }
}
