package defpackage;

import app.cash.sqldelight.db.SqlCursor;
import app.chalo.core.Recent_stop_table;
import app.chalo.core.Recent_stop_tableQueries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c11 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11244a;
    public final /* synthetic */ Function7 b;
    public final /* synthetic */ Recent_stop_tableQueries c;

    public /* synthetic */ c11(Function7 function7, Recent_stop_tableQueries recent_stop_tableQueries, int i) {
        this.f11244a = i;
        this.b = function7;
        this.c = recent_stop_tableQueries;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SqlCursor sqlCursor = (SqlCursor) obj;
        switch (this.f11244a) {
            case 0:
                String strI = cb0.i(sqlCursor, "cursor", 0);
                String string = sqlCursor.getString(1);
                Intrinsics.f(string);
                Recent_stop_table.Adapter adapter = this.c.b;
                Object objF = cb0.f(sqlCursor, 2, adapter.f2001a);
                Object objG = cb0.g(sqlCursor, 3, adapter.b);
                Long l = sqlCursor.getLong(4);
                return this.b.invoke(strI, string, objF, objG, l, cb0.e(l, sqlCursor, 5), sqlCursor.getString(6));
            case 1:
                String strI2 = cb0.i(sqlCursor, "cursor", 0);
                String string2 = sqlCursor.getString(1);
                Intrinsics.f(string2);
                Recent_stop_table.Adapter adapter2 = this.c.b;
                Object objF2 = cb0.f(sqlCursor, 2, adapter2.f2001a);
                Object objG2 = cb0.g(sqlCursor, 3, adapter2.b);
                Long l2 = sqlCursor.getLong(4);
                return this.b.invoke(strI2, string2, objF2, objG2, l2, cb0.e(l2, sqlCursor, 5), sqlCursor.getString(6));
            case 2:
                String strI3 = cb0.i(sqlCursor, "cursor", 0);
                String string3 = sqlCursor.getString(1);
                Intrinsics.f(string3);
                Recent_stop_table.Adapter adapter3 = this.c.b;
                Object objF3 = cb0.f(sqlCursor, 2, adapter3.f2001a);
                Object objG3 = cb0.g(sqlCursor, 3, adapter3.b);
                Long l3 = sqlCursor.getLong(4);
                return this.b.invoke(strI3, string3, objF3, objG3, l3, cb0.e(l3, sqlCursor, 5), sqlCursor.getString(6));
            case 3:
                String strI4 = cb0.i(sqlCursor, "cursor", 0);
                String string4 = sqlCursor.getString(1);
                Intrinsics.f(string4);
                Recent_stop_table.Adapter adapter4 = this.c.b;
                Object objF4 = cb0.f(sqlCursor, 2, adapter4.f2001a);
                Object objG4 = cb0.g(sqlCursor, 3, adapter4.b);
                Long l4 = sqlCursor.getLong(4);
                return this.b.invoke(strI4, string4, objF4, objG4, l4, cb0.e(l4, sqlCursor, 5), sqlCursor.getString(6));
            default:
                String strI5 = cb0.i(sqlCursor, "cursor", 0);
                String string5 = sqlCursor.getString(1);
                Intrinsics.f(string5);
                Recent_stop_table.Adapter adapter5 = this.c.b;
                Object objF5 = cb0.f(sqlCursor, 2, adapter5.f2001a);
                Object objG5 = cb0.g(sqlCursor, 3, adapter5.b);
                Long l5 = sqlCursor.getLong(4);
                return this.b.invoke(strI5, string5, objF5, objG5, l5, cb0.e(l5, sqlCursor, 5), sqlCursor.getString(6));
        }
    }
}
