package defpackage;

import app.cash.sqldelight.db.SqlCursor;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class nn implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18527a;
    public final /* synthetic */ Function8 b;

    public /* synthetic */ nn(Function8 function8, int i) {
        this.f18527a = i;
        this.b = function8;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SqlCursor sqlCursor = (SqlCursor) obj;
        switch (this.f18527a) {
            case 0:
                String strI = cb0.i(sqlCursor, "cursor", 0);
                Long l = sqlCursor.getLong(1);
                String strN = uf0.n(l, sqlCursor, 2);
                Long l2 = sqlCursor.getLong(3);
                String strN2 = uf0.n(l2, sqlCursor, 4);
                String string = sqlCursor.getString(5);
                String string2 = sqlCursor.getString(6);
                String string3 = sqlCursor.getString(7);
                Intrinsics.f(string3);
                return this.b.invoke(strI, l, strN, l2, strN2, string, string2, string3);
            case 1:
                String strI2 = cb0.i(sqlCursor, "cursor", 0);
                Long l3 = sqlCursor.getLong(1);
                String strN3 = uf0.n(l3, sqlCursor, 2);
                Long l4 = sqlCursor.getLong(3);
                String strN4 = uf0.n(l4, sqlCursor, 4);
                String string4 = sqlCursor.getString(5);
                String string5 = sqlCursor.getString(6);
                String string6 = sqlCursor.getString(7);
                Intrinsics.f(string6);
                return this.b.invoke(strI2, l3, strN3, l4, strN4, string4, string5, string6);
            case 2:
                String strI3 = cb0.i(sqlCursor, "cursor", 0);
                Long l5 = sqlCursor.getLong(1);
                Long lE = cb0.e(l5, sqlCursor, 2);
                String string7 = sqlCursor.getString(3);
                String strJ = cb0.j(string7, sqlCursor, 4);
                String string8 = sqlCursor.getString(5);
                String string9 = sqlCursor.getString(6);
                return this.b.invoke(strI3, l5, lE, string7, strJ, string8, string9, cb0.j(string9, sqlCursor, 7));
            case 3:
                String strI4 = cb0.i(sqlCursor, "cursor", 0);
                String string10 = sqlCursor.getString(1);
                String strJ2 = cb0.j(string10, sqlCursor, 2);
                String string11 = sqlCursor.getString(3);
                String strJ3 = cb0.j(string11, sqlCursor, 4);
                Long l6 = sqlCursor.getLong(5);
                return this.b.invoke(strI4, string10, strJ2, string11, strJ3, l6, cb0.e(l6, sqlCursor, 6), sqlCursor.getLong(7));
            default:
                String strI5 = cb0.i(sqlCursor, "cursor", 0);
                String string12 = sqlCursor.getString(1);
                String strJ4 = cb0.j(string12, sqlCursor, 2);
                String string13 = sqlCursor.getString(3);
                String strJ5 = cb0.j(string13, sqlCursor, 4);
                Long l7 = sqlCursor.getLong(5);
                return this.b.invoke(strI5, string12, strJ4, string13, strJ5, l7, cb0.e(l7, sqlCursor, 6), sqlCursor.getLong(7));
        }
    }
}
