package defpackage;

import app.cash.sqldelight.db.SqlPreparedStatement;
import app.chalo.core.Ondc_ticket_table;
import app.chalo.core.Ondc_ticket_tableQueries;
import app.chalo.data.RefundInfoAppModel;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class co0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11357a;
    public final /* synthetic */ Ondc_ticket_table b;
    public final /* synthetic */ Ondc_ticket_tableQueries c;

    public /* synthetic */ co0(Ondc_ticket_table ondc_ticket_table, Ondc_ticket_tableQueries ondc_ticket_tableQueries, int i) {
        this.f11357a = i;
        this.b = ondc_ticket_table;
        this.c = ondc_ticket_tableQueries;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SqlPreparedStatement execute = (SqlPreparedStatement) obj;
        switch (this.f11357a) {
            case 0:
                Intrinsics.i(execute, "$this$execute");
                Ondc_ticket_table ondc_ticket_table = this.b;
                execute.bindString(0, ondc_ticket_table.f1976a);
                execute.bindString(1, ondc_ticket_table.b);
                execute.d(2, Long.valueOf(ondc_ticket_table.c));
                execute.d(3, Long.valueOf(ondc_ticket_table.d));
                Ondc_ticket_table.Adapter adapter = this.c.b;
                execute.bindString(4, (String) adapter.f1977a.encode(ondc_ticket_table.e));
                execute.d(5, ondc_ticket_table.f);
                execute.bindString(6, ondc_ticket_table.g);
                execute.bindString(7, ondc_ticket_table.h);
                execute.bindString(8, ondc_ticket_table.i);
                execute.d(9, ondc_ticket_table.j);
                Map map = ondc_ticket_table.k;
                execute.bindString(10, map != null ? (String) adapter.b.encode(map) : null);
                execute.bindString(11, ondc_ticket_table.l);
                execute.bindString(12, ondc_ticket_table.m);
                execute.bindString(13, ondc_ticket_table.n);
                RefundInfoAppModel refundInfoAppModel = ondc_ticket_table.o;
                execute.bindString(14, refundInfoAppModel != null ? (String) adapter.c.encode(refundInfoAppModel) : null);
                List list = ondc_ticket_table.p;
                execute.bindString(15, list != null ? (String) adapter.d.encode(list) : null);
                List list2 = ondc_ticket_table.q;
                execute.bindString(16, list2 != null ? (String) adapter.e.encode(list2) : null);
                execute.bindString(17, ondc_ticket_table.r);
                break;
            default:
                Intrinsics.i(execute, "$this$execute");
                Ondc_ticket_table ondc_ticket_table2 = this.b;
                execute.bindString(0, ondc_ticket_table2.f1976a);
                execute.bindString(1, ondc_ticket_table2.b);
                execute.d(2, Long.valueOf(ondc_ticket_table2.c));
                execute.d(3, Long.valueOf(ondc_ticket_table2.d));
                Ondc_ticket_table.Adapter adapter2 = this.c.b;
                execute.bindString(4, (String) adapter2.f1977a.encode(ondc_ticket_table2.e));
                execute.d(5, ondc_ticket_table2.f);
                execute.bindString(6, ondc_ticket_table2.g);
                execute.bindString(7, ondc_ticket_table2.h);
                execute.bindString(8, ondc_ticket_table2.i);
                execute.d(9, ondc_ticket_table2.j);
                Map map2 = ondc_ticket_table2.k;
                execute.bindString(10, map2 != null ? (String) adapter2.b.encode(map2) : null);
                execute.bindString(11, ondc_ticket_table2.l);
                execute.bindString(12, ondc_ticket_table2.m);
                execute.bindString(13, ondc_ticket_table2.n);
                RefundInfoAppModel refundInfoAppModel2 = ondc_ticket_table2.o;
                execute.bindString(14, refundInfoAppModel2 != null ? (String) adapter2.c.encode(refundInfoAppModel2) : null);
                List list3 = ondc_ticket_table2.p;
                execute.bindString(15, list3 != null ? (String) adapter2.d.encode(list3) : null);
                List list4 = ondc_ticket_table2.q;
                execute.bindString(16, list4 != null ? (String) adapter2.e.encode(list4) : null);
                execute.bindString(17, ondc_ticket_table2.r);
                break;
        }
        return Unit.f17538a;
    }
}
