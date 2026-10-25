package defpackage;

import app.cash.sqldelight.db.SqlCursor;
import app.chalo.core.Recent_stop_and_route_based_trip_table;
import app.chalo.core.Recent_stop_and_route_based_trip_tableQueries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a11 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f152a;
    public final /* synthetic */ Function10 b;
    public final /* synthetic */ Recent_stop_and_route_based_trip_tableQueries c;

    public /* synthetic */ a11(Function10 function10, Recent_stop_and_route_based_trip_tableQueries recent_stop_and_route_based_trip_tableQueries, int i) {
        this.f152a = i;
        this.b = function10;
        this.c = recent_stop_and_route_based_trip_tableQueries;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SqlCursor sqlCursor = (SqlCursor) obj;
        switch (this.f152a) {
            case 0:
                String strI = cb0.i(sqlCursor, "cursor", 0);
                String string = sqlCursor.getString(1);
                String strJ = cb0.j(string, sqlCursor, 2);
                String string2 = sqlCursor.getString(3);
                Intrinsics.f(string2);
                Recent_stop_and_route_based_trip_table.Adapter adapter = this.c.b;
                Object objF = cb0.f(sqlCursor, 4, adapter.f1997a);
                Object objF2 = cb0.f(sqlCursor, 5, adapter.b);
                Object objF3 = cb0.f(sqlCursor, 6, adapter.c);
                Object objG = cb0.g(sqlCursor, 7, adapter.d);
                Long l = sqlCursor.getLong(8);
                return this.b.invoke(strI, string, strJ, string2, objF, objF2, objF3, objG, l, cb0.e(l, sqlCursor, 9));
            case 1:
                String strI2 = cb0.i(sqlCursor, "cursor", 0);
                String string3 = sqlCursor.getString(1);
                String strJ2 = cb0.j(string3, sqlCursor, 2);
                String string4 = sqlCursor.getString(3);
                Intrinsics.f(string4);
                Recent_stop_and_route_based_trip_table.Adapter adapter2 = this.c.b;
                Object objF4 = cb0.f(sqlCursor, 4, adapter2.f1997a);
                Object objF5 = cb0.f(sqlCursor, 5, adapter2.b);
                Object objF6 = cb0.f(sqlCursor, 6, adapter2.c);
                Object objG2 = cb0.g(sqlCursor, 7, adapter2.d);
                Long l2 = sqlCursor.getLong(8);
                return this.b.invoke(strI2, string3, strJ2, string4, objF4, objF5, objF6, objG2, l2, cb0.e(l2, sqlCursor, 9));
            default:
                String strI3 = cb0.i(sqlCursor, "cursor", 0);
                String string5 = sqlCursor.getString(1);
                String strJ3 = cb0.j(string5, sqlCursor, 2);
                String string6 = sqlCursor.getString(3);
                Intrinsics.f(string6);
                Recent_stop_and_route_based_trip_table.Adapter adapter3 = this.c.b;
                Object objF7 = cb0.f(sqlCursor, 4, adapter3.f1997a);
                Object objF8 = cb0.f(sqlCursor, 5, adapter3.b);
                Object objF9 = cb0.f(sqlCursor, 6, adapter3.c);
                Object objG3 = cb0.g(sqlCursor, 7, adapter3.d);
                Long l3 = sqlCursor.getLong(8);
                return this.b.invoke(strI3, string5, strJ3, string6, objF7, objF8, objF9, objG3, l3, cb0.e(l3, sqlCursor, 9));
        }
    }
}
