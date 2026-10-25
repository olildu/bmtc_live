package defpackage;

import app.cash.sqldelight.db.SqlPreparedStatement;
import app.chalo.core.Instant_ticket_table;
import app.chalo.core.Instant_ticket_tableQueries;
import app.chalo.productbooking.common.data.models.entity.RefundInfoEntityModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class lb0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18298a;
    public final /* synthetic */ Instant_ticket_table b;
    public final /* synthetic */ Instant_ticket_tableQueries c;

    public /* synthetic */ lb0(Instant_ticket_table instant_ticket_table, Instant_ticket_tableQueries instant_ticket_tableQueries, int i) {
        this.f18298a = i;
        this.b = instant_ticket_table;
        this.c = instant_ticket_tableQueries;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SqlPreparedStatement execute = (SqlPreparedStatement) obj;
        switch (this.f18298a) {
            case 0:
                Intrinsics.i(execute, "$this$execute");
                Instant_ticket_table instant_ticket_table = this.b;
                execute.bindString(0, instant_ticket_table.f1960a);
                execute.bindString(1, instant_ticket_table.b);
                execute.bindString(2, instant_ticket_table.c);
                execute.d(3, Long.valueOf(instant_ticket_table.d));
                execute.d(4, Long.valueOf(instant_ticket_table.e));
                Instant_ticket_table.Adapter adapter = this.c.b;
                execute.bindString(5, (String) adapter.f1961a.encode(instant_ticket_table.f));
                execute.d(6, instant_ticket_table.g);
                execute.bindString(7, instant_ticket_table.h);
                execute.bindString(8, instant_ticket_table.i);
                execute.bindString(9, instant_ticket_table.j);
                execute.d(10, instant_ticket_table.k);
                execute.bindString(11, instant_ticket_table.l);
                execute.bindString(12, instant_ticket_table.m);
                execute.bindString(13, instant_ticket_table.n);
                execute.bindString(14, instant_ticket_table.o);
                execute.bindString(15, instant_ticket_table.p);
                execute.bindString(16, instant_ticket_table.q);
                List list = instant_ticket_table.r;
                execute.bindString(17, list != null ? (String) adapter.b.encode(list) : null);
                RefundInfoEntityModel refundInfoEntityModel = instant_ticket_table.s;
                execute.bindString(18, refundInfoEntityModel != null ? (String) adapter.c.encode(refundInfoEntityModel) : null);
                break;
            default:
                Intrinsics.i(execute, "$this$execute");
                Instant_ticket_table instant_ticket_table2 = this.b;
                execute.bindString(0, instant_ticket_table2.f1960a);
                execute.bindString(1, instant_ticket_table2.b);
                execute.bindString(2, instant_ticket_table2.c);
                execute.d(3, Long.valueOf(instant_ticket_table2.d));
                execute.d(4, Long.valueOf(instant_ticket_table2.e));
                Instant_ticket_table.Adapter adapter2 = this.c.b;
                execute.bindString(5, (String) adapter2.f1961a.encode(instant_ticket_table2.f));
                execute.d(6, instant_ticket_table2.g);
                execute.bindString(7, instant_ticket_table2.h);
                execute.bindString(8, instant_ticket_table2.i);
                execute.bindString(9, instant_ticket_table2.j);
                execute.d(10, instant_ticket_table2.k);
                execute.bindString(11, instant_ticket_table2.l);
                execute.bindString(12, instant_ticket_table2.m);
                execute.bindString(13, instant_ticket_table2.n);
                execute.bindString(14, instant_ticket_table2.o);
                execute.bindString(15, instant_ticket_table2.p);
                execute.bindString(16, instant_ticket_table2.q);
                List list2 = instant_ticket_table2.r;
                execute.bindString(17, list2 != null ? (String) adapter2.b.encode(list2) : null);
                RefundInfoEntityModel refundInfoEntityModel2 = instant_ticket_table2.s;
                execute.bindString(18, refundInfoEntityModel2 != null ? (String) adapter2.c.encode(refundInfoEntityModel2) : null);
                break;
        }
        return Unit.f17538a;
    }
}
