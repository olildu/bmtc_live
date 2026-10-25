package defpackage;

import app.cash.sqldelight.db.SqlCursor;
import app.chalo.core.Ondc_ticket_table;
import app.chalo.core.Ondc_ticket_tableQueries;
import app.chalo.data.RefundInfoAppModel;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bo0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11217a;
    public final /* synthetic */ Function18 b;
    public final /* synthetic */ Ondc_ticket_tableQueries c;

    public /* synthetic */ bo0(Function18 function18, Ondc_ticket_tableQueries ondc_ticket_tableQueries, int i) {
        this.f11217a = i;
        this.b = function18;
        this.c = ondc_ticket_tableQueries;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f11217a) {
            case 0:
                SqlCursor sqlCursor = (SqlCursor) obj;
                String strI = cb0.i(sqlCursor, "cursor", 0);
                String string = sqlCursor.getString(1);
                Long lJ = uf0.j(string, sqlCursor, 2);
                Long l = sqlCursor.getLong(3);
                Intrinsics.f(l);
                Ondc_ticket_table.Adapter adapter = this.c.b;
                Object objG = cb0.g(sqlCursor, 4, adapter.f1977a);
                Long l2 = sqlCursor.getLong(5);
                String string2 = sqlCursor.getString(6);
                Intrinsics.f(string2);
                String string3 = sqlCursor.getString(7);
                String string4 = sqlCursor.getString(8);
                Long l3 = sqlCursor.getLong(9);
                String string5 = sqlCursor.getString(10);
                Map map = string5 != null ? (Map) adapter.b.a(string5) : null;
                String string6 = sqlCursor.getString(11);
                String string7 = sqlCursor.getString(12);
                String string8 = sqlCursor.getString(13);
                String string9 = sqlCursor.getString(14);
                RefundInfoAppModel refundInfoAppModel = string9 != null ? (RefundInfoAppModel) adapter.c.a(string9) : null;
                String string10 = sqlCursor.getString(15);
                List list = string10 != null ? (List) adapter.d.a(string10) : null;
                String string11 = sqlCursor.getString(16);
                return this.b.invoke(strI, string, lJ, l, objG, l2, string2, string3, string4, l3, map, string6, string7, string8, refundInfoAppModel, list, string11 != null ? (List) adapter.e.a(string11) : null, sqlCursor.getString(17));
            case 1:
                SqlCursor sqlCursor2 = (SqlCursor) obj;
                String strI2 = cb0.i(sqlCursor2, "cursor", 0);
                String string12 = sqlCursor2.getString(1);
                Long lJ2 = uf0.j(string12, sqlCursor2, 2);
                Long l4 = sqlCursor2.getLong(3);
                Intrinsics.f(l4);
                Ondc_ticket_table.Adapter adapter2 = this.c.b;
                Object objG2 = cb0.g(sqlCursor2, 4, adapter2.f1977a);
                Long l5 = sqlCursor2.getLong(5);
                String string13 = sqlCursor2.getString(6);
                Intrinsics.f(string13);
                String string14 = sqlCursor2.getString(7);
                String string15 = sqlCursor2.getString(8);
                Long l6 = sqlCursor2.getLong(9);
                String string16 = sqlCursor2.getString(10);
                Map map2 = string16 != null ? (Map) adapter2.b.a(string16) : null;
                String string17 = sqlCursor2.getString(11);
                String string18 = sqlCursor2.getString(12);
                String string19 = sqlCursor2.getString(13);
                String string20 = sqlCursor2.getString(14);
                RefundInfoAppModel refundInfoAppModel2 = string20 != null ? (RefundInfoAppModel) adapter2.c.a(string20) : null;
                String string21 = sqlCursor2.getString(15);
                List list2 = string21 != null ? (List) adapter2.d.a(string21) : null;
                String string22 = sqlCursor2.getString(16);
                return this.b.invoke(strI2, string12, lJ2, l4, objG2, l5, string13, string14, string15, l6, map2, string17, string18, string19, refundInfoAppModel2, list2, string22 != null ? (List) adapter2.e.a(string22) : null, sqlCursor2.getString(17));
            case 2:
                SqlCursor sqlCursor3 = (SqlCursor) obj;
                String strI3 = cb0.i(sqlCursor3, "cursor", 0);
                String string23 = sqlCursor3.getString(1);
                Long lJ3 = uf0.j(string23, sqlCursor3, 2);
                Long l7 = sqlCursor3.getLong(3);
                Intrinsics.f(l7);
                Ondc_ticket_table.Adapter adapter3 = this.c.b;
                Object objG3 = cb0.g(sqlCursor3, 4, adapter3.f1977a);
                Long l8 = sqlCursor3.getLong(5);
                String string24 = sqlCursor3.getString(6);
                Intrinsics.f(string24);
                String string25 = sqlCursor3.getString(7);
                String string26 = sqlCursor3.getString(8);
                Long l9 = sqlCursor3.getLong(9);
                String string27 = sqlCursor3.getString(10);
                Map map3 = string27 != null ? (Map) adapter3.b.a(string27) : null;
                String string28 = sqlCursor3.getString(11);
                String string29 = sqlCursor3.getString(12);
                String string30 = sqlCursor3.getString(13);
                String string31 = sqlCursor3.getString(14);
                RefundInfoAppModel refundInfoAppModel3 = string31 != null ? (RefundInfoAppModel) adapter3.c.a(string31) : null;
                String string32 = sqlCursor3.getString(15);
                List list3 = string32 != null ? (List) adapter3.d.a(string32) : null;
                String string33 = sqlCursor3.getString(16);
                return this.b.invoke(strI3, string23, lJ3, l7, objG3, l8, string24, string25, string26, l9, map3, string28, string29, string30, refundInfoAppModel3, list3, string33 != null ? (List) adapter3.e.a(string33) : null, sqlCursor3.getString(17));
            default:
                SqlCursor sqlCursor4 = (SqlCursor) obj;
                String strI4 = cb0.i(sqlCursor4, "cursor", 0);
                String string34 = sqlCursor4.getString(1);
                Long lJ4 = uf0.j(string34, sqlCursor4, 2);
                Long l10 = sqlCursor4.getLong(3);
                Intrinsics.f(l10);
                Ondc_ticket_table.Adapter adapter4 = this.c.b;
                Object objG4 = cb0.g(sqlCursor4, 4, adapter4.f1977a);
                Long l11 = sqlCursor4.getLong(5);
                String string35 = sqlCursor4.getString(6);
                Intrinsics.f(string35);
                String string36 = sqlCursor4.getString(7);
                String string37 = sqlCursor4.getString(8);
                Long l12 = sqlCursor4.getLong(9);
                String string38 = sqlCursor4.getString(10);
                Map map4 = string38 != null ? (Map) adapter4.b.a(string38) : null;
                String string39 = sqlCursor4.getString(11);
                String string40 = sqlCursor4.getString(12);
                String string41 = sqlCursor4.getString(13);
                String string42 = sqlCursor4.getString(14);
                RefundInfoAppModel refundInfoAppModel4 = string42 != null ? (RefundInfoAppModel) adapter4.c.a(string42) : null;
                String string43 = sqlCursor4.getString(15);
                List list4 = string43 != null ? (List) adapter4.d.a(string43) : null;
                String string44 = sqlCursor4.getString(16);
                return this.b.invoke(strI4, string34, lJ4, l10, objG4, l11, string35, string36, string37, l12, map4, string39, string40, string41, refundInfoAppModel4, list4, string44 != null ? (List) adapter4.e.a(string44) : null, sqlCursor4.getString(17));
        }
    }
}
