package defpackage;

import app.cash.sqldelight.db.SqlCursor;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ed0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15542a;
    public final /* synthetic */ Function4 b;

    public /* synthetic */ ed0(Function4 function4, int i) {
        this.f15542a = i;
        this.b = function4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SqlCursor sqlCursor = (SqlCursor) obj;
        switch (this.f15542a) {
            case 0:
                Long lI = uf0.i(sqlCursor, "cursor", 0);
                Long l = sqlCursor.getLong(1);
                String strN = uf0.n(l, sqlCursor, 2);
                String string = sqlCursor.getString(3);
                Intrinsics.f(string);
                return this.b.invoke(lI, l, strN, string);
            case 1:
                Long lI2 = uf0.i(sqlCursor, "cursor", 0);
                Long l2 = sqlCursor.getLong(1);
                String strN2 = uf0.n(l2, sqlCursor, 2);
                String string2 = sqlCursor.getString(3);
                Intrinsics.f(string2);
                return this.b.invoke(lI2, l2, strN2, string2);
            default:
                String strI = cb0.i(sqlCursor, "cursor", 0);
                String string3 = sqlCursor.getString(1);
                Long lJ = uf0.j(string3, sqlCursor, 2);
                Boolean bool = sqlCursor.getBoolean(3);
                Intrinsics.f(bool);
                return this.b.invoke(strI, string3, lJ, bool);
        }
    }
}
