package defpackage;

import app.cash.sqldelight.db.SqlCursor;
import app.chalo.core.Recent_route_table;
import app.chalo.core.Recent_route_tableQueries;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class y01 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20065a;
    public final /* synthetic */ Function15 b;
    public final /* synthetic */ Recent_route_tableQueries c;

    public /* synthetic */ y01(Function15 function15, Recent_route_tableQueries recent_route_tableQueries, int i) {
        this.f20065a = i;
        this.b = function15;
        this.c = recent_route_tableQueries;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f20065a) {
            case 0:
                Recent_route_table.Adapter adapter = this.c.b;
                SqlCursor sqlCursor = (SqlCursor) obj;
                String strI = cb0.i(sqlCursor, "cursor", 0);
                String string = sqlCursor.getString(1);
                String strJ = cb0.j(string, sqlCursor, 2);
                String string2 = sqlCursor.getString(3);
                String strJ2 = cb0.j(string2, sqlCursor, 4);
                String string3 = sqlCursor.getString(5);
                Boolean bool = sqlCursor.getBoolean(6);
                Intrinsics.f(bool);
                String string4 = sqlCursor.getString(7);
                List list = string4 != null ? (List) adapter.f1995a.a(string4) : null;
                Boolean bool2 = sqlCursor.getBoolean(8);
                Intrinsics.f(bool2);
                Object objG = cb0.g(sqlCursor, 9, adapter.b);
                Object objG2 = cb0.g(sqlCursor, 10, adapter.c);
                Long l = sqlCursor.getLong(11);
                return this.b.invoke(strI, string, strJ, string2, strJ2, string3, bool, list, bool2, objG, objG2, l, cb0.e(l, sqlCursor, 12), sqlCursor.getString(13), cb0.g(sqlCursor, 14, adapter.d));
            case 1:
                Recent_route_table.Adapter adapter2 = this.c.b;
                SqlCursor sqlCursor2 = (SqlCursor) obj;
                String strI2 = cb0.i(sqlCursor2, "cursor", 0);
                String string5 = sqlCursor2.getString(1);
                String strJ3 = cb0.j(string5, sqlCursor2, 2);
                String string6 = sqlCursor2.getString(3);
                String strJ4 = cb0.j(string6, sqlCursor2, 4);
                String string7 = sqlCursor2.getString(5);
                Boolean bool3 = sqlCursor2.getBoolean(6);
                Intrinsics.f(bool3);
                String string8 = sqlCursor2.getString(7);
                List list2 = string8 != null ? (List) adapter2.f1995a.a(string8) : null;
                Boolean bool4 = sqlCursor2.getBoolean(8);
                Intrinsics.f(bool4);
                Object objG3 = cb0.g(sqlCursor2, 9, adapter2.b);
                Object objG4 = cb0.g(sqlCursor2, 10, adapter2.c);
                Long l2 = sqlCursor2.getLong(11);
                return this.b.invoke(strI2, string5, strJ3, string6, strJ4, string7, bool3, list2, bool4, objG3, objG4, l2, cb0.e(l2, sqlCursor2, 12), sqlCursor2.getString(13), cb0.g(sqlCursor2, 14, adapter2.d));
            case 2:
                Recent_route_table.Adapter adapter3 = this.c.b;
                SqlCursor sqlCursor3 = (SqlCursor) obj;
                String strI3 = cb0.i(sqlCursor3, "cursor", 0);
                String string9 = sqlCursor3.getString(1);
                String strJ5 = cb0.j(string9, sqlCursor3, 2);
                String string10 = sqlCursor3.getString(3);
                String strJ6 = cb0.j(string10, sqlCursor3, 4);
                String string11 = sqlCursor3.getString(5);
                Boolean bool5 = sqlCursor3.getBoolean(6);
                Intrinsics.f(bool5);
                String string12 = sqlCursor3.getString(7);
                List list3 = string12 != null ? (List) adapter3.f1995a.a(string12) : null;
                Boolean bool6 = sqlCursor3.getBoolean(8);
                Intrinsics.f(bool6);
                Object objG5 = cb0.g(sqlCursor3, 9, adapter3.b);
                Object objG6 = cb0.g(sqlCursor3, 10, adapter3.c);
                Long l3 = sqlCursor3.getLong(11);
                return this.b.invoke(strI3, string9, strJ5, string10, strJ6, string11, bool5, list3, bool6, objG5, objG6, l3, cb0.e(l3, sqlCursor3, 12), sqlCursor3.getString(13), cb0.g(sqlCursor3, 14, adapter3.d));
            case 3:
                Recent_route_table.Adapter adapter4 = this.c.b;
                SqlCursor sqlCursor4 = (SqlCursor) obj;
                String strI4 = cb0.i(sqlCursor4, "cursor", 0);
                String string13 = sqlCursor4.getString(1);
                String strJ7 = cb0.j(string13, sqlCursor4, 2);
                String string14 = sqlCursor4.getString(3);
                String strJ8 = cb0.j(string14, sqlCursor4, 4);
                String string15 = sqlCursor4.getString(5);
                Boolean bool7 = sqlCursor4.getBoolean(6);
                Intrinsics.f(bool7);
                String string16 = sqlCursor4.getString(7);
                List list4 = string16 != null ? (List) adapter4.f1995a.a(string16) : null;
                Boolean bool8 = sqlCursor4.getBoolean(8);
                Intrinsics.f(bool8);
                Object objG7 = cb0.g(sqlCursor4, 9, adapter4.b);
                Object objG8 = cb0.g(sqlCursor4, 10, adapter4.c);
                Long l4 = sqlCursor4.getLong(11);
                return this.b.invoke(strI4, string13, strJ7, string14, strJ8, string15, bool7, list4, bool8, objG7, objG8, l4, cb0.e(l4, sqlCursor4, 12), sqlCursor4.getString(13), cb0.g(sqlCursor4, 14, adapter4.d));
            case 4:
                Recent_route_table.Adapter adapter5 = this.c.b;
                SqlCursor sqlCursor5 = (SqlCursor) obj;
                String strI5 = cb0.i(sqlCursor5, "cursor", 0);
                String string17 = sqlCursor5.getString(1);
                String strJ9 = cb0.j(string17, sqlCursor5, 2);
                String string18 = sqlCursor5.getString(3);
                String strJ10 = cb0.j(string18, sqlCursor5, 4);
                String string19 = sqlCursor5.getString(5);
                Boolean bool9 = sqlCursor5.getBoolean(6);
                Intrinsics.f(bool9);
                String string20 = sqlCursor5.getString(7);
                List list5 = string20 != null ? (List) adapter5.f1995a.a(string20) : null;
                Boolean bool10 = sqlCursor5.getBoolean(8);
                Intrinsics.f(bool10);
                Object objG9 = cb0.g(sqlCursor5, 9, adapter5.b);
                Object objG10 = cb0.g(sqlCursor5, 10, adapter5.c);
                Long l5 = sqlCursor5.getLong(11);
                return this.b.invoke(strI5, string17, strJ9, string18, strJ10, string19, bool9, list5, bool10, objG9, objG10, l5, cb0.e(l5, sqlCursor5, 12), sqlCursor5.getString(13), cb0.g(sqlCursor5, 14, adapter5.d));
            case 5:
                Recent_route_table.Adapter adapter6 = this.c.b;
                SqlCursor sqlCursor6 = (SqlCursor) obj;
                String strI6 = cb0.i(sqlCursor6, "cursor", 0);
                String string21 = sqlCursor6.getString(1);
                String strJ11 = cb0.j(string21, sqlCursor6, 2);
                String string22 = sqlCursor6.getString(3);
                String strJ12 = cb0.j(string22, sqlCursor6, 4);
                String string23 = sqlCursor6.getString(5);
                Boolean bool11 = sqlCursor6.getBoolean(6);
                Intrinsics.f(bool11);
                String string24 = sqlCursor6.getString(7);
                List list6 = string24 != null ? (List) adapter6.f1995a.a(string24) : null;
                Boolean bool12 = sqlCursor6.getBoolean(8);
                Intrinsics.f(bool12);
                Object objG11 = cb0.g(sqlCursor6, 9, adapter6.b);
                Object objG12 = cb0.g(sqlCursor6, 10, adapter6.c);
                Long l6 = sqlCursor6.getLong(11);
                return this.b.invoke(strI6, string21, strJ11, string22, strJ12, string23, bool11, list6, bool12, objG11, objG12, l6, cb0.e(l6, sqlCursor6, 12), sqlCursor6.getString(13), cb0.g(sqlCursor6, 14, adapter6.d));
            case 6:
                Recent_route_table.Adapter adapter7 = this.c.b;
                SqlCursor sqlCursor7 = (SqlCursor) obj;
                String strI7 = cb0.i(sqlCursor7, "cursor", 0);
                String string25 = sqlCursor7.getString(1);
                String strJ13 = cb0.j(string25, sqlCursor7, 2);
                String string26 = sqlCursor7.getString(3);
                String strJ14 = cb0.j(string26, sqlCursor7, 4);
                String string27 = sqlCursor7.getString(5);
                Boolean bool13 = sqlCursor7.getBoolean(6);
                Intrinsics.f(bool13);
                String string28 = sqlCursor7.getString(7);
                List list7 = string28 != null ? (List) adapter7.f1995a.a(string28) : null;
                Boolean bool14 = sqlCursor7.getBoolean(8);
                Intrinsics.f(bool14);
                Object objG13 = cb0.g(sqlCursor7, 9, adapter7.b);
                Object objG14 = cb0.g(sqlCursor7, 10, adapter7.c);
                Long l7 = sqlCursor7.getLong(11);
                return this.b.invoke(strI7, string25, strJ13, string26, strJ14, string27, bool13, list7, bool14, objG13, objG14, l7, cb0.e(l7, sqlCursor7, 12), sqlCursor7.getString(13), cb0.g(sqlCursor7, 14, adapter7.d));
            default:
                Recent_route_table.Adapter adapter8 = this.c.b;
                SqlCursor sqlCursor8 = (SqlCursor) obj;
                String strI8 = cb0.i(sqlCursor8, "cursor", 0);
                String string29 = sqlCursor8.getString(1);
                String strJ15 = cb0.j(string29, sqlCursor8, 2);
                String string30 = sqlCursor8.getString(3);
                String strJ16 = cb0.j(string30, sqlCursor8, 4);
                String string31 = sqlCursor8.getString(5);
                Boolean bool15 = sqlCursor8.getBoolean(6);
                Intrinsics.f(bool15);
                String string32 = sqlCursor8.getString(7);
                List list8 = string32 != null ? (List) adapter8.f1995a.a(string32) : null;
                Boolean bool16 = sqlCursor8.getBoolean(8);
                Intrinsics.f(bool16);
                Object objG15 = cb0.g(sqlCursor8, 9, adapter8.b);
                Object objG16 = cb0.g(sqlCursor8, 10, adapter8.c);
                Long l8 = sqlCursor8.getLong(11);
                return this.b.invoke(strI8, string29, strJ15, string30, strJ16, string31, bool15, list8, bool16, objG15, objG16, l8, cb0.e(l8, sqlCursor8, 12), sqlCursor8.getString(13), cb0.g(sqlCursor8, 14, adapter8.d));
        }
    }
}
