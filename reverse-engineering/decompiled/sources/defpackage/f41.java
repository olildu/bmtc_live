package defpackage;

import app.cash.sqldelight.db.SqlCursor;
import app.chalo.core.Routes_table;
import app.chalo.core.Routes_tableQueries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function14;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class f41 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15610a;
    public final /* synthetic */ Function14 b;
    public final /* synthetic */ Routes_tableQueries c;

    public /* synthetic */ f41(Function14 function14, Routes_tableQueries routes_tableQueries, int i) {
        this.f15610a = i;
        this.b = function14;
        this.c = routes_tableQueries;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15610a) {
            case 0:
                SqlCursor sqlCursor = (SqlCursor) obj;
                Long lI = uf0.i(sqlCursor, "cursor", 0);
                String string = sqlCursor.getString(1);
                String strJ = cb0.j(string, sqlCursor, 2);
                String string2 = sqlCursor.getString(3);
                String strJ2 = cb0.j(string2, sqlCursor, 4);
                String string3 = sqlCursor.getString(5);
                String strJ3 = cb0.j(string3, sqlCursor, 6);
                Routes_tableQueries routes_tableQueries = this.c;
                Object objF = cb0.f(sqlCursor, 7, routes_tableQueries.b.f2012a);
                Long l = sqlCursor.getLong(8);
                Long lE = cb0.e(l, sqlCursor, 9);
                Routes_table.Adapter adapter = routes_tableQueries.b;
                return this.b.invoke(lI, string, strJ, string2, strJ2, string3, strJ3, objF, l, lE, cb0.f(sqlCursor, 10, adapter.b), cb0.f(sqlCursor, 11, adapter.c), sqlCursor.getString(12), cb0.g(sqlCursor, 13, adapter.d));
            case 1:
                SqlCursor sqlCursor2 = (SqlCursor) obj;
                Long lI2 = uf0.i(sqlCursor2, "cursor", 0);
                String string4 = sqlCursor2.getString(1);
                String strJ4 = cb0.j(string4, sqlCursor2, 2);
                String string5 = sqlCursor2.getString(3);
                String strJ5 = cb0.j(string5, sqlCursor2, 4);
                String string6 = sqlCursor2.getString(5);
                String strJ6 = cb0.j(string6, sqlCursor2, 6);
                Routes_table.Adapter adapter2 = this.c.b;
                Object objF2 = cb0.f(sqlCursor2, 7, adapter2.f2012a);
                Long l2 = sqlCursor2.getLong(8);
                return this.b.invoke(lI2, string4, strJ4, string5, strJ5, string6, strJ6, objF2, l2, cb0.e(l2, sqlCursor2, 9), cb0.f(sqlCursor2, 10, adapter2.b), cb0.f(sqlCursor2, 11, adapter2.c), sqlCursor2.getString(12), cb0.g(sqlCursor2, 13, adapter2.d));
            case 2:
                SqlCursor sqlCursor3 = (SqlCursor) obj;
                Long lI3 = uf0.i(sqlCursor3, "cursor", 0);
                String string7 = sqlCursor3.getString(1);
                String strJ7 = cb0.j(string7, sqlCursor3, 2);
                String string8 = sqlCursor3.getString(3);
                String strJ8 = cb0.j(string8, sqlCursor3, 4);
                String string9 = sqlCursor3.getString(5);
                String strJ9 = cb0.j(string9, sqlCursor3, 6);
                Routes_table.Adapter adapter3 = this.c.b;
                Object objF3 = cb0.f(sqlCursor3, 7, adapter3.f2012a);
                Long l3 = sqlCursor3.getLong(8);
                return this.b.invoke(lI3, string7, strJ7, string8, strJ8, string9, strJ9, objF3, l3, cb0.e(l3, sqlCursor3, 9), cb0.f(sqlCursor3, 10, adapter3.b), cb0.f(sqlCursor3, 11, adapter3.c), sqlCursor3.getString(12), cb0.g(sqlCursor3, 13, adapter3.d));
            default:
                SqlCursor sqlCursor4 = (SqlCursor) obj;
                Long lI4 = uf0.i(sqlCursor4, "cursor", 0);
                String string10 = sqlCursor4.getString(1);
                String strJ10 = cb0.j(string10, sqlCursor4, 2);
                String string11 = sqlCursor4.getString(3);
                String strJ11 = cb0.j(string11, sqlCursor4, 4);
                String string12 = sqlCursor4.getString(5);
                String strJ12 = cb0.j(string12, sqlCursor4, 6);
                Routes_table.Adapter adapter4 = this.c.b;
                Object objF4 = cb0.f(sqlCursor4, 7, adapter4.f2012a);
                Long l4 = sqlCursor4.getLong(8);
                return this.b.invoke(lI4, string10, strJ10, string11, strJ11, string12, strJ12, objF4, l4, cb0.e(l4, sqlCursor4, 9), cb0.f(sqlCursor4, 10, adapter4.b), cb0.f(sqlCursor4, 11, adapter4.c), sqlCursor4.getString(12), cb0.g(sqlCursor4, 13, adapter4.d));
        }
    }
}
