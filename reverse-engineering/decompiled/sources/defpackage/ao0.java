package defpackage;

import app.cash.sqldelight.db.SqlCursor;
import app.chalo.core.Ondc_metro_ticket_table;
import app.chalo.core.Ondc_metro_ticket_tableQueries;
import app.chalo.data.RefundInfoAppModel;
import app.chalo.productbooking.common.data.models.entity.PaymentInfoEntityModel;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ao0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f692a;
    public final /* synthetic */ Function20 b;
    public final /* synthetic */ Ondc_metro_ticket_tableQueries c;

    public /* synthetic */ ao0(Function20 function20, Ondc_metro_ticket_tableQueries ondc_metro_ticket_tableQueries, int i) {
        this.f692a = i;
        this.b = function20;
        this.c = ondc_metro_ticket_tableQueries;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f692a) {
            case 0:
                SqlCursor sqlCursor = (SqlCursor) obj;
                String strI = cb0.i(sqlCursor, "cursor", 0);
                String string = sqlCursor.getString(1);
                Long lJ = uf0.j(string, sqlCursor, 2);
                Long l = sqlCursor.getLong(3);
                Intrinsics.f(l);
                Ondc_metro_ticket_table.Adapter adapter = this.c.b;
                Object objG = cb0.g(sqlCursor, 4, adapter.f1973a);
                Long l2 = sqlCursor.getLong(5);
                String string2 = sqlCursor.getString(6);
                Intrinsics.f(string2);
                String string3 = sqlCursor.getString(7);
                String string4 = sqlCursor.getString(8);
                List list = string4 != null ? (List) adapter.b.a(string4) : null;
                String string5 = sqlCursor.getString(9);
                Long l3 = sqlCursor.getLong(10);
                String string6 = sqlCursor.getString(11);
                Map map = string6 != null ? (Map) adapter.c.a(string6) : null;
                String string7 = sqlCursor.getString(12);
                String string8 = sqlCursor.getString(13);
                String string9 = sqlCursor.getString(14);
                String string10 = sqlCursor.getString(15);
                RefundInfoAppModel refundInfoAppModel = string10 != null ? (RefundInfoAppModel) adapter.d.a(string10) : null;
                String string11 = sqlCursor.getString(16);
                List list2 = string11 != null ? (List) adapter.e.a(string11) : null;
                String string12 = sqlCursor.getString(17);
                return this.b.invoke(strI, string, lJ, l, objG, l2, string2, string3, list, string5, l3, map, string7, string8, string9, refundInfoAppModel, list2, string12 != null ? (PaymentInfoEntityModel) adapter.f.a(string12) : null, sqlCursor.getString(18), sqlCursor.getString(19));
            case 1:
                SqlCursor sqlCursor2 = (SqlCursor) obj;
                String strI2 = cb0.i(sqlCursor2, "cursor", 0);
                String string13 = sqlCursor2.getString(1);
                Long lJ2 = uf0.j(string13, sqlCursor2, 2);
                Long l4 = sqlCursor2.getLong(3);
                Intrinsics.f(l4);
                Ondc_metro_ticket_table.Adapter adapter2 = this.c.b;
                Object objG2 = cb0.g(sqlCursor2, 4, adapter2.f1973a);
                Long l5 = sqlCursor2.getLong(5);
                String string14 = sqlCursor2.getString(6);
                Intrinsics.f(string14);
                String string15 = sqlCursor2.getString(7);
                String string16 = sqlCursor2.getString(8);
                List list3 = string16 != null ? (List) adapter2.b.a(string16) : null;
                String string17 = sqlCursor2.getString(9);
                Long l6 = sqlCursor2.getLong(10);
                String string18 = sqlCursor2.getString(11);
                Map map2 = string18 != null ? (Map) adapter2.c.a(string18) : null;
                String string19 = sqlCursor2.getString(12);
                String string20 = sqlCursor2.getString(13);
                String string21 = sqlCursor2.getString(14);
                String string22 = sqlCursor2.getString(15);
                RefundInfoAppModel refundInfoAppModel2 = string22 != null ? (RefundInfoAppModel) adapter2.d.a(string22) : null;
                String string23 = sqlCursor2.getString(16);
                List list4 = string23 != null ? (List) adapter2.e.a(string23) : null;
                String string24 = sqlCursor2.getString(17);
                return this.b.invoke(strI2, string13, lJ2, l4, objG2, l5, string14, string15, list3, string17, l6, map2, string19, string20, string21, refundInfoAppModel2, list4, string24 != null ? (PaymentInfoEntityModel) adapter2.f.a(string24) : null, sqlCursor2.getString(18), sqlCursor2.getString(19));
            case 2:
                SqlCursor sqlCursor3 = (SqlCursor) obj;
                String strI3 = cb0.i(sqlCursor3, "cursor", 0);
                String string25 = sqlCursor3.getString(1);
                Long lJ3 = uf0.j(string25, sqlCursor3, 2);
                Long l7 = sqlCursor3.getLong(3);
                Intrinsics.f(l7);
                Ondc_metro_ticket_table.Adapter adapter3 = this.c.b;
                Object objG3 = cb0.g(sqlCursor3, 4, adapter3.f1973a);
                Long l8 = sqlCursor3.getLong(5);
                String string26 = sqlCursor3.getString(6);
                Intrinsics.f(string26);
                String string27 = sqlCursor3.getString(7);
                String string28 = sqlCursor3.getString(8);
                List list5 = string28 != null ? (List) adapter3.b.a(string28) : null;
                String string29 = sqlCursor3.getString(9);
                Long l9 = sqlCursor3.getLong(10);
                String string30 = sqlCursor3.getString(11);
                Map map3 = string30 != null ? (Map) adapter3.c.a(string30) : null;
                String string31 = sqlCursor3.getString(12);
                String string32 = sqlCursor3.getString(13);
                String string33 = sqlCursor3.getString(14);
                String string34 = sqlCursor3.getString(15);
                RefundInfoAppModel refundInfoAppModel3 = string34 != null ? (RefundInfoAppModel) adapter3.d.a(string34) : null;
                String string35 = sqlCursor3.getString(16);
                List list6 = string35 != null ? (List) adapter3.e.a(string35) : null;
                String string36 = sqlCursor3.getString(17);
                return this.b.invoke(strI3, string25, lJ3, l7, objG3, l8, string26, string27, list5, string29, l9, map3, string31, string32, string33, refundInfoAppModel3, list6, string36 != null ? (PaymentInfoEntityModel) adapter3.f.a(string36) : null, sqlCursor3.getString(18), sqlCursor3.getString(19));
            default:
                SqlCursor sqlCursor4 = (SqlCursor) obj;
                String strI4 = cb0.i(sqlCursor4, "cursor", 0);
                String string37 = sqlCursor4.getString(1);
                Long lJ4 = uf0.j(string37, sqlCursor4, 2);
                Long l10 = sqlCursor4.getLong(3);
                Intrinsics.f(l10);
                Ondc_metro_ticket_table.Adapter adapter4 = this.c.b;
                Object objG4 = cb0.g(sqlCursor4, 4, adapter4.f1973a);
                Long l11 = sqlCursor4.getLong(5);
                String string38 = sqlCursor4.getString(6);
                Intrinsics.f(string38);
                String string39 = sqlCursor4.getString(7);
                String string40 = sqlCursor4.getString(8);
                List list7 = string40 != null ? (List) adapter4.b.a(string40) : null;
                String string41 = sqlCursor4.getString(9);
                Long l12 = sqlCursor4.getLong(10);
                String string42 = sqlCursor4.getString(11);
                Map map4 = string42 != null ? (Map) adapter4.c.a(string42) : null;
                String string43 = sqlCursor4.getString(12);
                String string44 = sqlCursor4.getString(13);
                String string45 = sqlCursor4.getString(14);
                String string46 = sqlCursor4.getString(15);
                RefundInfoAppModel refundInfoAppModel4 = string46 != null ? (RefundInfoAppModel) adapter4.d.a(string46) : null;
                String string47 = sqlCursor4.getString(16);
                List list8 = string47 != null ? (List) adapter4.e.a(string47) : null;
                String string48 = sqlCursor4.getString(17);
                return this.b.invoke(strI4, string37, lJ4, l10, objG4, l11, string38, string39, list7, string41, l12, map4, string43, string44, string45, refundInfoAppModel4, list8, string48 != null ? (PaymentInfoEntityModel) adapter4.f.a(string48) : null, sqlCursor4.getString(18), sqlCursor4.getString(19));
        }
    }
}
