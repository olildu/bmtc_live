package defpackage;

import app.cash.sqldelight.db.SqlCursor;
import app.chalo.core.Recent_trip_table;
import app.chalo.core.Recent_trip_tableQueries;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d11 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15419a;
    public final /* synthetic */ Function7 b;
    public final /* synthetic */ Recent_trip_tableQueries c;

    public /* synthetic */ d11(Function7 function7, Recent_trip_tableQueries recent_trip_tableQueries, int i) {
        this.f15419a = i;
        this.b = function7;
        this.c = recent_trip_tableQueries;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SqlCursor sqlCursor = (SqlCursor) obj;
        switch (this.f15419a) {
            case 0:
                String strI = cb0.i(sqlCursor, "cursor", 0);
                String string = sqlCursor.getString(1);
                Intrinsics.f(string);
                Recent_trip_table.Adapter adapter = this.c.b;
                Object objF = cb0.f(sqlCursor, 2, adapter.f2003a);
                Object objF2 = cb0.f(sqlCursor, 3, adapter.b);
                String string2 = sqlCursor.getString(4);
                ChaloTransitMode chaloTransitMode = string2 != null ? (ChaloTransitMode) adapter.c.a(string2) : null;
                Long l = sqlCursor.getLong(5);
                return this.b.invoke(strI, string, objF, objF2, chaloTransitMode, l, cb0.e(l, sqlCursor, 6));
            case 1:
                String strI2 = cb0.i(sqlCursor, "cursor", 0);
                String string3 = sqlCursor.getString(1);
                Intrinsics.f(string3);
                Recent_trip_table.Adapter adapter2 = this.c.b;
                Object objF3 = cb0.f(sqlCursor, 2, adapter2.f2003a);
                Object objF4 = cb0.f(sqlCursor, 3, adapter2.b);
                String string4 = sqlCursor.getString(4);
                ChaloTransitMode chaloTransitMode2 = string4 != null ? (ChaloTransitMode) adapter2.c.a(string4) : null;
                Long l2 = sqlCursor.getLong(5);
                return this.b.invoke(strI2, string3, objF3, objF4, chaloTransitMode2, l2, cb0.e(l2, sqlCursor, 6));
            case 2:
                String strI3 = cb0.i(sqlCursor, "cursor", 0);
                String string5 = sqlCursor.getString(1);
                Intrinsics.f(string5);
                Recent_trip_table.Adapter adapter3 = this.c.b;
                Object objF5 = cb0.f(sqlCursor, 2, adapter3.f2003a);
                Object objF6 = cb0.f(sqlCursor, 3, adapter3.b);
                String string6 = sqlCursor.getString(4);
                ChaloTransitMode chaloTransitMode3 = string6 != null ? (ChaloTransitMode) adapter3.c.a(string6) : null;
                Long l3 = sqlCursor.getLong(5);
                return this.b.invoke(strI3, string5, objF5, objF6, chaloTransitMode3, l3, cb0.e(l3, sqlCursor, 6));
            case 3:
                String strI4 = cb0.i(sqlCursor, "cursor", 0);
                String string7 = sqlCursor.getString(1);
                Intrinsics.f(string7);
                Recent_trip_table.Adapter adapter4 = this.c.b;
                Object objF7 = cb0.f(sqlCursor, 2, adapter4.f2003a);
                Object objF8 = cb0.f(sqlCursor, 3, adapter4.b);
                String string8 = sqlCursor.getString(4);
                ChaloTransitMode chaloTransitMode4 = string8 != null ? (ChaloTransitMode) adapter4.c.a(string8) : null;
                Long l4 = sqlCursor.getLong(5);
                return this.b.invoke(strI4, string7, objF7, objF8, chaloTransitMode4, l4, cb0.e(l4, sqlCursor, 6));
            default:
                String strI5 = cb0.i(sqlCursor, "cursor", 0);
                String string9 = sqlCursor.getString(1);
                Intrinsics.f(string9);
                Recent_trip_table.Adapter adapter5 = this.c.b;
                Object objF9 = cb0.f(sqlCursor, 2, adapter5.f2003a);
                Object objF10 = cb0.f(sqlCursor, 3, adapter5.b);
                String string10 = sqlCursor.getString(4);
                ChaloTransitMode chaloTransitMode5 = string10 != null ? (ChaloTransitMode) adapter5.c.a(string10) : null;
                Long l5 = sqlCursor.getLong(5);
                return this.b.invoke(strI5, string9, objF9, objF10, chaloTransitMode5, l5, cb0.e(l5, sqlCursor, 6));
        }
    }
}
