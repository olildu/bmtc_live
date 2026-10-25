package defpackage;

import app.cash.sqldelight.db.SqlCursor;
import app.chalo.core.Recent_location_pair_table;
import app.chalo.core.Recent_location_pair_tableQueries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class w01 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19882a;
    public final /* synthetic */ Function6 b;
    public final /* synthetic */ Recent_location_pair_tableQueries c;

    public /* synthetic */ w01(Function6 function6, Recent_location_pair_tableQueries recent_location_pair_tableQueries, int i) {
        this.f19882a = i;
        this.b = function6;
        this.c = recent_location_pair_tableQueries;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SqlCursor sqlCursor = (SqlCursor) obj;
        switch (this.f19882a) {
            case 0:
                String strI = cb0.i(sqlCursor, "cursor", 0);
                String string = sqlCursor.getString(1);
                Intrinsics.f(string);
                Recent_location_pair_table.Adapter adapter = this.c.b;
                Object objF = cb0.f(sqlCursor, 2, adapter.f1991a);
                Object objF2 = cb0.f(sqlCursor, 3, adapter.b);
                Long l = sqlCursor.getLong(4);
                return this.b.invoke(strI, string, objF, objF2, l, cb0.e(l, sqlCursor, 5));
            case 1:
                String strI2 = cb0.i(sqlCursor, "cursor", 0);
                String string2 = sqlCursor.getString(1);
                Intrinsics.f(string2);
                Recent_location_pair_table.Adapter adapter2 = this.c.b;
                Object objF3 = cb0.f(sqlCursor, 2, adapter2.f1991a);
                Object objF4 = cb0.f(sqlCursor, 3, adapter2.b);
                Long l2 = sqlCursor.getLong(4);
                return this.b.invoke(strI2, string2, objF3, objF4, l2, cb0.e(l2, sqlCursor, 5));
            case 2:
                String strI3 = cb0.i(sqlCursor, "cursor", 0);
                String string3 = sqlCursor.getString(1);
                Intrinsics.f(string3);
                Recent_location_pair_table.Adapter adapter3 = this.c.b;
                Object objF5 = cb0.f(sqlCursor, 2, adapter3.f1991a);
                Object objF6 = cb0.f(sqlCursor, 3, adapter3.b);
                Long l3 = sqlCursor.getLong(4);
                return this.b.invoke(strI3, string3, objF5, objF6, l3, cb0.e(l3, sqlCursor, 5));
            default:
                String strI4 = cb0.i(sqlCursor, "cursor", 0);
                String string4 = sqlCursor.getString(1);
                Intrinsics.f(string4);
                Recent_location_pair_table.Adapter adapter4 = this.c.b;
                Object objF7 = cb0.f(sqlCursor, 2, adapter4.f1991a);
                Object objF8 = cb0.f(sqlCursor, 3, adapter4.b);
                Long l4 = sqlCursor.getLong(4);
                return this.b.invoke(strI4, string4, objF7, objF8, l4, cb0.e(l4, sqlCursor, 5));
        }
    }
}
