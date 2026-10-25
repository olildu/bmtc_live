package defpackage;

import app.cash.sqldelight.db.SqlCursor;
import app.chalo.core.Premium_reserve_trip_tableQueries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ax0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11150a;
    public final /* synthetic */ Function5 b;
    public final /* synthetic */ Premium_reserve_trip_tableQueries c;

    public /* synthetic */ ax0(Function5 function5, Premium_reserve_trip_tableQueries premium_reserve_trip_tableQueries, int i) {
        this.f11150a = i;
        this.b = function5;
        this.c = premium_reserve_trip_tableQueries;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SqlCursor sqlCursor = (SqlCursor) obj;
        switch (this.f11150a) {
            case 0:
                String strI = cb0.i(sqlCursor, "cursor", 0);
                String string = sqlCursor.getString(1);
                String strJ = cb0.j(string, sqlCursor, 2);
                Object objG = cb0.g(sqlCursor, 3, this.c.b.f1988a);
                Boolean bool = sqlCursor.getBoolean(4);
                Intrinsics.f(bool);
                return this.b.invoke(strI, string, strJ, objG, bool);
            case 1:
                String strI2 = cb0.i(sqlCursor, "cursor", 0);
                String string2 = sqlCursor.getString(1);
                String strJ2 = cb0.j(string2, sqlCursor, 2);
                Object objG2 = cb0.g(sqlCursor, 3, this.c.b.f1988a);
                Boolean bool2 = sqlCursor.getBoolean(4);
                Intrinsics.f(bool2);
                return this.b.invoke(strI2, string2, strJ2, objG2, bool2);
            default:
                String strI3 = cb0.i(sqlCursor, "cursor", 0);
                String string3 = sqlCursor.getString(1);
                String strJ3 = cb0.j(string3, sqlCursor, 2);
                Object objG3 = cb0.g(sqlCursor, 3, this.c.b.f1988a);
                Boolean bool3 = sqlCursor.getBoolean(4);
                Intrinsics.f(bool3);
                return this.b.invoke(strI3, string3, strJ3, objG3, bool3);
        }
    }
}
