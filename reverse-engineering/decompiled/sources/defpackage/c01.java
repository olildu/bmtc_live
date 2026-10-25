package defpackage;

import app.cash.sqldelight.db.SqlPreparedStatement;
import app.chalo.vault.Quick_pay_table;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c01 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11241a;
    public final /* synthetic */ Quick_pay_table b;

    public /* synthetic */ c01(Quick_pay_table quick_pay_table, int i) {
        this.f11241a = i;
        this.b = quick_pay_table;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SqlPreparedStatement execute = (SqlPreparedStatement) obj;
        switch (this.f11241a) {
            case 0:
                Intrinsics.i(execute, "$this$execute");
                Quick_pay_table quick_pay_table = this.b;
                execute.bindString(0, quick_pay_table.f10749a);
                execute.bindString(1, quick_pay_table.b);
                execute.bindString(2, quick_pay_table.c);
                execute.bindString(3, quick_pay_table.d);
                execute.bindString(4, quick_pay_table.e);
                execute.d(5, Long.valueOf(quick_pay_table.f));
                execute.d(6, quick_pay_table.g);
                execute.d(7, Long.valueOf(quick_pay_table.h));
                execute.bindString(8, quick_pay_table.i);
                execute.d(9, quick_pay_table.j);
                execute.bindString(10, quick_pay_table.k);
                break;
            default:
                Intrinsics.i(execute, "$this$execute");
                Quick_pay_table quick_pay_table2 = this.b;
                execute.bindString(0, quick_pay_table2.f10749a);
                execute.bindString(1, quick_pay_table2.b);
                execute.bindString(2, quick_pay_table2.c);
                execute.bindString(3, quick_pay_table2.d);
                execute.bindString(4, quick_pay_table2.e);
                execute.d(5, Long.valueOf(quick_pay_table2.f));
                execute.d(6, quick_pay_table2.g);
                execute.d(7, Long.valueOf(quick_pay_table2.h));
                execute.bindString(8, quick_pay_table2.i);
                execute.d(9, quick_pay_table2.j);
                execute.bindString(10, quick_pay_table2.k);
                break;
        }
        return Unit.f17538a;
    }
}
