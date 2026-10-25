package defpackage;

import app.cash.sqldelight.db.SqlCursor;
import app.chalo.core.Tito_validation_table;
import app.chalo.core.Tito_validation_tableQueries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.FunctionN;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wj1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19935a;
    public final /* synthetic */ FunctionN b;
    public final /* synthetic */ Tito_validation_tableQueries c;

    public /* synthetic */ wj1(FunctionN functionN, Tito_validation_tableQueries tito_validation_tableQueries, int i) {
        this.f19935a = i;
        this.b = functionN;
        this.c = tito_validation_tableQueries;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19935a) {
            case 0:
                SqlCursor sqlCursor = (SqlCursor) obj;
                String strI = cb0.i(sqlCursor, "cursor", 0);
                Long l = sqlCursor.getLong(1);
                Long lE = cb0.e(l, sqlCursor, 2);
                Long l2 = sqlCursor.getLong(3);
                String strN = uf0.n(l2, sqlCursor, 4);
                String string = sqlCursor.getString(5);
                String strJ = cb0.j(string, sqlCursor, 6);
                String string2 = sqlCursor.getString(7);
                Long lJ = uf0.j(string2, sqlCursor, 8);
                String string3 = sqlCursor.getString(9);
                Intrinsics.f(string3);
                String string4 = sqlCursor.getString(10);
                Tito_validation_table.Adapter adapter = this.c.b;
                Object objG = cb0.g(sqlCursor, 11, adapter.f2022a);
                String string5 = sqlCursor.getString(12);
                String strJ2 = cb0.j(string5, sqlCursor, 13);
                Object objG2 = cb0.g(sqlCursor, 14, adapter.b);
                Object objG3 = cb0.g(sqlCursor, 15, adapter.c);
                Long l3 = sqlCursor.getLong(16);
                Intrinsics.f(l3);
                return this.b.invoke(strI, l, lE, l2, strN, string, strJ, string2, lJ, string3, string4, objG, string5, strJ2, objG2, objG3, l3, sqlCursor.getLong(17), sqlCursor.getLong(18), sqlCursor.getString(19), sqlCursor.getString(20), sqlCursor.getString(21), sqlCursor.getLong(22));
            case 1:
                SqlCursor sqlCursor2 = (SqlCursor) obj;
                String strI2 = cb0.i(sqlCursor2, "cursor", 0);
                Long l4 = sqlCursor2.getLong(1);
                Long lE2 = cb0.e(l4, sqlCursor2, 2);
                Long l5 = sqlCursor2.getLong(3);
                String strN2 = uf0.n(l5, sqlCursor2, 4);
                String string6 = sqlCursor2.getString(5);
                String strJ3 = cb0.j(string6, sqlCursor2, 6);
                String string7 = sqlCursor2.getString(7);
                Long lJ2 = uf0.j(string7, sqlCursor2, 8);
                String string8 = sqlCursor2.getString(9);
                Intrinsics.f(string8);
                String string9 = sqlCursor2.getString(10);
                Tito_validation_table.Adapter adapter2 = this.c.b;
                Object objG4 = cb0.g(sqlCursor2, 11, adapter2.f2022a);
                String string10 = sqlCursor2.getString(12);
                String strJ4 = cb0.j(string10, sqlCursor2, 13);
                Object objG5 = cb0.g(sqlCursor2, 14, adapter2.b);
                Object objG6 = cb0.g(sqlCursor2, 15, adapter2.c);
                Long l6 = sqlCursor2.getLong(16);
                Intrinsics.f(l6);
                return this.b.invoke(strI2, l4, lE2, l5, strN2, string6, strJ3, string7, lJ2, string8, string9, objG4, string10, strJ4, objG5, objG6, l6, sqlCursor2.getLong(17), sqlCursor2.getLong(18), sqlCursor2.getString(19), sqlCursor2.getString(20), sqlCursor2.getString(21), sqlCursor2.getLong(22));
            default:
                SqlCursor sqlCursor3 = (SqlCursor) obj;
                String strI3 = cb0.i(sqlCursor3, "cursor", 0);
                Long l7 = sqlCursor3.getLong(1);
                Long lE3 = cb0.e(l7, sqlCursor3, 2);
                Long l8 = sqlCursor3.getLong(3);
                String strN3 = uf0.n(l8, sqlCursor3, 4);
                String string11 = sqlCursor3.getString(5);
                String strJ5 = cb0.j(string11, sqlCursor3, 6);
                String string12 = sqlCursor3.getString(7);
                Long lJ3 = uf0.j(string12, sqlCursor3, 8);
                String string13 = sqlCursor3.getString(9);
                Intrinsics.f(string13);
                String string14 = sqlCursor3.getString(10);
                Tito_validation_table.Adapter adapter3 = this.c.b;
                Object objG7 = cb0.g(sqlCursor3, 11, adapter3.f2022a);
                String string15 = sqlCursor3.getString(12);
                String strJ6 = cb0.j(string15, sqlCursor3, 13);
                Object objG8 = cb0.g(sqlCursor3, 14, adapter3.b);
                Object objG9 = cb0.g(sqlCursor3, 15, adapter3.c);
                Long l9 = sqlCursor3.getLong(16);
                Intrinsics.f(l9);
                return this.b.invoke(strI3, l7, lE3, l8, strN3, string11, strJ5, string12, lJ3, string13, string14, objG7, string15, strJ6, objG8, objG9, l9, sqlCursor3.getLong(17), sqlCursor3.getLong(18), sqlCursor3.getString(19), sqlCursor3.getString(20), sqlCursor3.getString(21), sqlCursor3.getLong(22));
        }
    }
}
