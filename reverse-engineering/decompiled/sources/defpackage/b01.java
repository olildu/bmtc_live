package defpackage;

import app.cash.sqldelight.db.SqlCursor;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b01 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11158a;
    public final /* synthetic */ Function11 b;

    public /* synthetic */ b01(Function11 function11, int i) {
        this.f11158a = i;
        this.b = function11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SqlCursor sqlCursor = (SqlCursor) obj;
        switch (this.f11158a) {
            case 0:
                String strI = cb0.i(sqlCursor, "cursor", 0);
                String string = sqlCursor.getString(1);
                String strJ = cb0.j(string, sqlCursor, 2);
                String string2 = sqlCursor.getString(3);
                String string3 = sqlCursor.getString(4);
                Long l = sqlCursor.getLong(5);
                Intrinsics.f(l);
                Long l2 = sqlCursor.getLong(6);
                Long l3 = sqlCursor.getLong(7);
                String strN = uf0.n(l3, sqlCursor, 8);
                Long l4 = sqlCursor.getLong(9);
                String string4 = sqlCursor.getString(10);
                Intrinsics.f(string4);
                return this.b.invoke(strI, string, strJ, string2, string3, l, l2, l3, strN, l4, string4);
            case 1:
                String strI2 = cb0.i(sqlCursor, "cursor", 0);
                String string5 = sqlCursor.getString(1);
                String strJ2 = cb0.j(string5, sqlCursor, 2);
                String string6 = sqlCursor.getString(3);
                String string7 = sqlCursor.getString(4);
                Long l5 = sqlCursor.getLong(5);
                Intrinsics.f(l5);
                Long l6 = sqlCursor.getLong(6);
                Long l7 = sqlCursor.getLong(7);
                String strN2 = uf0.n(l7, sqlCursor, 8);
                Long l8 = sqlCursor.getLong(9);
                String string8 = sqlCursor.getString(10);
                Intrinsics.f(string8);
                return this.b.invoke(strI2, string5, strJ2, string6, string7, l5, l6, l7, strN2, l8, string8);
            case 2:
                String strI3 = cb0.i(sqlCursor, "cursor", 0);
                String string9 = sqlCursor.getString(1);
                String strJ3 = cb0.j(string9, sqlCursor, 2);
                String string10 = sqlCursor.getString(3);
                String string11 = sqlCursor.getString(4);
                Long l9 = sqlCursor.getLong(5);
                Intrinsics.f(l9);
                Long l10 = sqlCursor.getLong(6);
                Long l11 = sqlCursor.getLong(7);
                String strN3 = uf0.n(l11, sqlCursor, 8);
                Long l12 = sqlCursor.getLong(9);
                String string12 = sqlCursor.getString(10);
                Intrinsics.f(string12);
                return this.b.invoke(strI3, string9, strJ3, string10, string11, l9, l10, l11, strN3, l12, string12);
            default:
                String strI4 = cb0.i(sqlCursor, "cursor", 0);
                String string13 = sqlCursor.getString(1);
                String strJ4 = cb0.j(string13, sqlCursor, 2);
                String string14 = sqlCursor.getString(3);
                String strJ5 = cb0.j(string14, sqlCursor, 4);
                Long l13 = sqlCursor.getLong(5);
                String string15 = sqlCursor.getString(6);
                String string16 = sqlCursor.getString(7);
                Intrinsics.f(string16);
                String string17 = sqlCursor.getString(8);
                Long l14 = sqlCursor.getLong(9);
                return this.b.invoke(strI4, string13, strJ4, string14, strJ5, l13, string15, string16, string17, l14, cb0.e(l14, sqlCursor, 10));
        }
    }
}
