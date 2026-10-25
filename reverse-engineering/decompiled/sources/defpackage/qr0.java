package defpackage;

import app.cash.sqldelight.db.SqlCursor;
import app.chalo.core.Pending_super_pass_table;
import app.chalo.core.Pending_super_pass_tableQueries;
import app.chalo.productbooking.common.data.models.entity.RefundInfoEntityModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.FunctionN;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qr0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19148a;
    public final /* synthetic */ FunctionN b;
    public final /* synthetic */ Pending_super_pass_tableQueries c;

    public /* synthetic */ qr0(FunctionN functionN, Pending_super_pass_tableQueries pending_super_pass_tableQueries, int i) {
        this.f19148a = i;
        this.b = functionN;
        this.c = pending_super_pass_tableQueries;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19148a) {
            case 0:
                SqlCursor cursor = (SqlCursor) obj;
                Intrinsics.i(cursor, "cursor");
                Pending_super_pass_table.Adapter adapter = this.c.b;
                Object objG = cb0.g(cursor, 0, adapter.f1979a);
                String string = cursor.getString(1);
                String strJ = cb0.j(string, cursor, 2);
                Object objG2 = cb0.g(cursor, 3, adapter.b);
                String string2 = cursor.getString(4);
                String strJ2 = cb0.j(string2, cursor, 5);
                Double d = cursor.getDouble(6);
                Intrinsics.f(d);
                String string3 = cursor.getString(7);
                Long l = cursor.getLong(8);
                Intrinsics.f(l);
                Object objF = cb0.f(cursor, 9, adapter.c);
                Object objF2 = cb0.f(cursor, 10, adapter.d);
                Long l2 = cursor.getLong(11);
                String strN = uf0.n(l2, cursor, 12);
                String string4 = cursor.getString(13);
                String strJ3 = cb0.j(string4, cursor, 14);
                String string5 = cursor.getString(15);
                String strJ4 = cb0.j(string5, cursor, 16);
                String string6 = cursor.getString(17);
                Intrinsics.f(string6);
                Object objG3 = cb0.g(cursor, 18, adapter.e);
                String string7 = cursor.getString(19);
                String strJ5 = cb0.j(string7, cursor, 20);
                String string8 = cursor.getString(21);
                Intrinsics.f(string8);
                Double d2 = cursor.getDouble(22);
                Intrinsics.f(d2);
                Double d3 = cursor.getDouble(23);
                Intrinsics.f(d3);
                Boolean bool = cursor.getBoolean(24);
                Intrinsics.f(bool);
                Double d4 = cursor.getDouble(25);
                Intrinsics.f(d4);
                Object objF3 = cb0.f(cursor, 26, adapter.f);
                Boolean bool2 = cursor.getBoolean(27);
                Intrinsics.f(bool2);
                String string9 = cursor.getString(28);
                Intrinsics.f(string9);
                String string10 = cursor.getString(29);
                Long lJ = uf0.j(string10, cursor, 30);
                Long l3 = cursor.getLong(31);
                Long lE = cb0.e(l3, cursor, 32);
                Boolean bool3 = cursor.getBoolean(33);
                Intrinsics.f(bool3);
                String string11 = cursor.getString(34);
                Intrinsics.f(string11);
                String string12 = cursor.getString(35);
                Intrinsics.f(string12);
                String string13 = cursor.getString(36);
                String string14 = cursor.getString(37);
                return this.b.invoke(objG, string, strJ, objG2, string2, strJ2, d, string3, l, objF, objF2, l2, strN, string4, strJ3, string5, strJ4, string6, objG3, string7, strJ5, string8, d2, d3, bool, d4, objF3, bool2, string9, string10, lJ, l3, lE, bool3, string11, string12, string13, string14 != null ? (RefundInfoEntityModel) adapter.g.a(string14) : null);
            default:
                SqlCursor cursor2 = (SqlCursor) obj;
                Intrinsics.i(cursor2, "cursor");
                Pending_super_pass_table.Adapter adapter2 = this.c.b;
                Object objG4 = cb0.g(cursor2, 0, adapter2.f1979a);
                String string15 = cursor2.getString(1);
                String strJ6 = cb0.j(string15, cursor2, 2);
                Object objG5 = cb0.g(cursor2, 3, adapter2.b);
                String string16 = cursor2.getString(4);
                String strJ7 = cb0.j(string16, cursor2, 5);
                Double d5 = cursor2.getDouble(6);
                Intrinsics.f(d5);
                String string17 = cursor2.getString(7);
                Long l4 = cursor2.getLong(8);
                Intrinsics.f(l4);
                Object objF4 = cb0.f(cursor2, 9, adapter2.c);
                Object objF5 = cb0.f(cursor2, 10, adapter2.d);
                Long l5 = cursor2.getLong(11);
                String strN2 = uf0.n(l5, cursor2, 12);
                String string18 = cursor2.getString(13);
                String strJ8 = cb0.j(string18, cursor2, 14);
                String string19 = cursor2.getString(15);
                String strJ9 = cb0.j(string19, cursor2, 16);
                String string20 = cursor2.getString(17);
                Intrinsics.f(string20);
                Object objG6 = cb0.g(cursor2, 18, adapter2.e);
                String string21 = cursor2.getString(19);
                String strJ10 = cb0.j(string21, cursor2, 20);
                String string22 = cursor2.getString(21);
                Intrinsics.f(string22);
                Double d6 = cursor2.getDouble(22);
                Intrinsics.f(d6);
                Double d7 = cursor2.getDouble(23);
                Intrinsics.f(d7);
                Boolean bool4 = cursor2.getBoolean(24);
                Intrinsics.f(bool4);
                Double d8 = cursor2.getDouble(25);
                Intrinsics.f(d8);
                Object objF6 = cb0.f(cursor2, 26, adapter2.f);
                Boolean bool5 = cursor2.getBoolean(27);
                Intrinsics.f(bool5);
                String string23 = cursor2.getString(28);
                Intrinsics.f(string23);
                String string24 = cursor2.getString(29);
                Long lJ2 = uf0.j(string24, cursor2, 30);
                Long l6 = cursor2.getLong(31);
                Long lE2 = cb0.e(l6, cursor2, 32);
                Boolean bool6 = cursor2.getBoolean(33);
                Intrinsics.f(bool6);
                String string25 = cursor2.getString(34);
                Intrinsics.f(string25);
                String string26 = cursor2.getString(35);
                Intrinsics.f(string26);
                String string27 = cursor2.getString(36);
                String string28 = cursor2.getString(37);
                return this.b.invoke(objG4, string15, strJ6, objG5, string16, strJ7, d5, string17, l4, objF4, objF5, l5, strN2, string18, strJ8, string19, strJ9, string20, objG6, string21, strJ10, string22, d6, d7, bool4, d8, objF6, bool5, string23, string24, lJ2, l6, lE2, bool6, string25, string26, string27, string28 != null ? (RefundInfoEntityModel) adapter2.g.a(string28) : null);
        }
    }
}
