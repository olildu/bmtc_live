package defpackage;

import app.cash.sqldelight.db.SqlCursor;
import app.chalo.core.Recent_place_table;
import app.chalo.core.Recent_place_tableQueries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class x01 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19976a;
    public final /* synthetic */ Function10 b;
    public final /* synthetic */ Recent_place_tableQueries c;

    public /* synthetic */ x01(Function10 function10, Recent_place_tableQueries recent_place_tableQueries, int i) {
        this.f19976a = i;
        this.b = function10;
        this.c = recent_place_tableQueries;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SqlCursor sqlCursor = (SqlCursor) obj;
        switch (this.f19976a) {
            case 0:
                String strI = cb0.i(sqlCursor, "cursor", 0);
                String string = sqlCursor.getString(1);
                String strJ = cb0.j(string, sqlCursor, 2);
                String string2 = sqlCursor.getString(3);
                String string3 = sqlCursor.getString(4);
                Intrinsics.f(string3);
                Recent_place_table.Adapter adapter = this.c.b;
                Object objF = cb0.f(sqlCursor, 5, adapter.f1993a);
                Object objG = cb0.g(sqlCursor, 6, adapter.b);
                Long l = sqlCursor.getLong(7);
                return this.b.invoke(strI, string, strJ, string2, string3, objF, objG, l, cb0.e(l, sqlCursor, 8), sqlCursor.getString(9));
            case 1:
                String strI2 = cb0.i(sqlCursor, "cursor", 0);
                String string4 = sqlCursor.getString(1);
                String strJ2 = cb0.j(string4, sqlCursor, 2);
                String string5 = sqlCursor.getString(3);
                String string6 = sqlCursor.getString(4);
                Intrinsics.f(string6);
                Recent_place_table.Adapter adapter2 = this.c.b;
                Object objF2 = cb0.f(sqlCursor, 5, adapter2.f1993a);
                Object objG2 = cb0.g(sqlCursor, 6, adapter2.b);
                Long l2 = sqlCursor.getLong(7);
                return this.b.invoke(strI2, string4, strJ2, string5, string6, objF2, objG2, l2, cb0.e(l2, sqlCursor, 8), sqlCursor.getString(9));
            case 2:
                String strI3 = cb0.i(sqlCursor, "cursor", 0);
                String string7 = sqlCursor.getString(1);
                String strJ3 = cb0.j(string7, sqlCursor, 2);
                String string8 = sqlCursor.getString(3);
                String string9 = sqlCursor.getString(4);
                Intrinsics.f(string9);
                Recent_place_table.Adapter adapter3 = this.c.b;
                Object objF3 = cb0.f(sqlCursor, 5, adapter3.f1993a);
                Object objG3 = cb0.g(sqlCursor, 6, adapter3.b);
                Long l3 = sqlCursor.getLong(7);
                return this.b.invoke(strI3, string7, strJ3, string8, string9, objF3, objG3, l3, cb0.e(l3, sqlCursor, 8), sqlCursor.getString(9));
            default:
                String strI4 = cb0.i(sqlCursor, "cursor", 0);
                String string10 = sqlCursor.getString(1);
                String strJ4 = cb0.j(string10, sqlCursor, 2);
                String string11 = sqlCursor.getString(3);
                String string12 = sqlCursor.getString(4);
                Intrinsics.f(string12);
                Recent_place_table.Adapter adapter4 = this.c.b;
                Object objF4 = cb0.f(sqlCursor, 5, adapter4.f1993a);
                Object objG4 = cb0.g(sqlCursor, 6, adapter4.b);
                Long l4 = sqlCursor.getLong(7);
                return this.b.invoke(strI4, string10, strJ4, string11, string12, objF4, objG4, l4, cb0.e(l4, sqlCursor, 8), sqlCursor.getString(9));
        }
    }
}
