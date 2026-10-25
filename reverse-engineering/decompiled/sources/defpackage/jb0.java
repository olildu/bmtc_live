package defpackage;

import app.cash.sqldelight.db.SqlCursor;
import app.chalo.core.Instant_ticket_table;
import app.chalo.core.Instant_ticket_tableQueries;
import app.chalo.productbooking.common.data.models.entity.RefundInfoEntityModel;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jb0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17389a;
    public final /* synthetic */ Function19 b;
    public final /* synthetic */ Instant_ticket_tableQueries c;

    public /* synthetic */ jb0(Function19 function19, Instant_ticket_tableQueries instant_ticket_tableQueries, int i) {
        this.f17389a = i;
        this.b = function19;
        this.c = instant_ticket_tableQueries;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f17389a) {
            case 0:
                SqlCursor sqlCursor = (SqlCursor) obj;
                String strI = cb0.i(sqlCursor, "cursor", 0);
                String string = sqlCursor.getString(1);
                String strJ = cb0.j(string, sqlCursor, 2);
                Long l = sqlCursor.getLong(3);
                Long lE = cb0.e(l, sqlCursor, 4);
                Instant_ticket_table.Adapter adapter = this.c.b;
                Object objG = cb0.g(sqlCursor, 5, adapter.f1961a);
                Long l2 = sqlCursor.getLong(6);
                String string2 = sqlCursor.getString(7);
                Intrinsics.f(string2);
                String string3 = sqlCursor.getString(8);
                String string4 = sqlCursor.getString(9);
                Long l3 = sqlCursor.getLong(10);
                String string5 = sqlCursor.getString(11);
                String string6 = sqlCursor.getString(12);
                String string7 = sqlCursor.getString(13);
                String string8 = sqlCursor.getString(14);
                String string9 = sqlCursor.getString(15);
                String string10 = sqlCursor.getString(16);
                String string11 = sqlCursor.getString(17);
                List list = string11 != null ? (List) adapter.b.a(string11) : null;
                String string12 = sqlCursor.getString(18);
                return this.b.invoke(strI, string, strJ, l, lE, objG, l2, string2, string3, string4, l3, string5, string6, string7, string8, string9, string10, list, string12 != null ? (RefundInfoEntityModel) adapter.c.a(string12) : null);
            case 1:
                SqlCursor sqlCursor2 = (SqlCursor) obj;
                String strI2 = cb0.i(sqlCursor2, "cursor", 0);
                String string13 = sqlCursor2.getString(1);
                String strJ2 = cb0.j(string13, sqlCursor2, 2);
                Long l4 = sqlCursor2.getLong(3);
                Long lE2 = cb0.e(l4, sqlCursor2, 4);
                Instant_ticket_table.Adapter adapter2 = this.c.b;
                Object objG2 = cb0.g(sqlCursor2, 5, adapter2.f1961a);
                Long l5 = sqlCursor2.getLong(6);
                String string14 = sqlCursor2.getString(7);
                Intrinsics.f(string14);
                String string15 = sqlCursor2.getString(8);
                String string16 = sqlCursor2.getString(9);
                Long l6 = sqlCursor2.getLong(10);
                String string17 = sqlCursor2.getString(11);
                String string18 = sqlCursor2.getString(12);
                String string19 = sqlCursor2.getString(13);
                String string20 = sqlCursor2.getString(14);
                String string21 = sqlCursor2.getString(15);
                String string22 = sqlCursor2.getString(16);
                String string23 = sqlCursor2.getString(17);
                List list2 = string23 != null ? (List) adapter2.b.a(string23) : null;
                String string24 = sqlCursor2.getString(18);
                return this.b.invoke(strI2, string13, strJ2, l4, lE2, objG2, l5, string14, string15, string16, l6, string17, string18, string19, string20, string21, string22, list2, string24 != null ? (RefundInfoEntityModel) adapter2.c.a(string24) : null);
            case 2:
                SqlCursor sqlCursor3 = (SqlCursor) obj;
                String strI3 = cb0.i(sqlCursor3, "cursor", 0);
                String string25 = sqlCursor3.getString(1);
                String strJ3 = cb0.j(string25, sqlCursor3, 2);
                Long l7 = sqlCursor3.getLong(3);
                Long lE3 = cb0.e(l7, sqlCursor3, 4);
                Instant_ticket_table.Adapter adapter3 = this.c.b;
                Object objG3 = cb0.g(sqlCursor3, 5, adapter3.f1961a);
                Long l8 = sqlCursor3.getLong(6);
                String string26 = sqlCursor3.getString(7);
                Intrinsics.f(string26);
                String string27 = sqlCursor3.getString(8);
                String string28 = sqlCursor3.getString(9);
                Long l9 = sqlCursor3.getLong(10);
                String string29 = sqlCursor3.getString(11);
                String string30 = sqlCursor3.getString(12);
                String string31 = sqlCursor3.getString(13);
                String string32 = sqlCursor3.getString(14);
                String string33 = sqlCursor3.getString(15);
                String string34 = sqlCursor3.getString(16);
                String string35 = sqlCursor3.getString(17);
                List list3 = string35 != null ? (List) adapter3.b.a(string35) : null;
                String string36 = sqlCursor3.getString(18);
                return this.b.invoke(strI3, string25, strJ3, l7, lE3, objG3, l8, string26, string27, string28, l9, string29, string30, string31, string32, string33, string34, list3, string36 != null ? (RefundInfoEntityModel) adapter3.c.a(string36) : null);
            case 3:
                SqlCursor sqlCursor4 = (SqlCursor) obj;
                String strI4 = cb0.i(sqlCursor4, "cursor", 0);
                String string37 = sqlCursor4.getString(1);
                String strJ4 = cb0.j(string37, sqlCursor4, 2);
                Long l10 = sqlCursor4.getLong(3);
                Long lE4 = cb0.e(l10, sqlCursor4, 4);
                Instant_ticket_table.Adapter adapter4 = this.c.b;
                Object objG4 = cb0.g(sqlCursor4, 5, adapter4.f1961a);
                Long l11 = sqlCursor4.getLong(6);
                String string38 = sqlCursor4.getString(7);
                Intrinsics.f(string38);
                String string39 = sqlCursor4.getString(8);
                String string40 = sqlCursor4.getString(9);
                Long l12 = sqlCursor4.getLong(10);
                String string41 = sqlCursor4.getString(11);
                String string42 = sqlCursor4.getString(12);
                String string43 = sqlCursor4.getString(13);
                String string44 = sqlCursor4.getString(14);
                String string45 = sqlCursor4.getString(15);
                String string46 = sqlCursor4.getString(16);
                String string47 = sqlCursor4.getString(17);
                List list4 = string47 != null ? (List) adapter4.b.a(string47) : null;
                String string48 = sqlCursor4.getString(18);
                return this.b.invoke(strI4, string37, strJ4, l10, lE4, objG4, l11, string38, string39, string40, l12, string41, string42, string43, string44, string45, string46, list4, string48 != null ? (RefundInfoEntityModel) adapter4.c.a(string48) : null);
            default:
                SqlCursor sqlCursor5 = (SqlCursor) obj;
                String strI5 = cb0.i(sqlCursor5, "cursor", 0);
                String string49 = sqlCursor5.getString(1);
                String strJ5 = cb0.j(string49, sqlCursor5, 2);
                Long l13 = sqlCursor5.getLong(3);
                Long lE5 = cb0.e(l13, sqlCursor5, 4);
                Instant_ticket_table.Adapter adapter5 = this.c.b;
                Object objG5 = cb0.g(sqlCursor5, 5, adapter5.f1961a);
                Long l14 = sqlCursor5.getLong(6);
                String string50 = sqlCursor5.getString(7);
                Intrinsics.f(string50);
                String string51 = sqlCursor5.getString(8);
                String string52 = sqlCursor5.getString(9);
                Long l15 = sqlCursor5.getLong(10);
                String string53 = sqlCursor5.getString(11);
                String string54 = sqlCursor5.getString(12);
                String string55 = sqlCursor5.getString(13);
                String string56 = sqlCursor5.getString(14);
                String string57 = sqlCursor5.getString(15);
                String string58 = sqlCursor5.getString(16);
                String string59 = sqlCursor5.getString(17);
                List list5 = string59 != null ? (List) adapter5.b.a(string59) : null;
                String string60 = sqlCursor5.getString(18);
                return this.b.invoke(strI5, string49, strJ5, l13, lE5, objG5, l14, string50, string51, string52, l15, string53, string54, string55, string56, string57, string58, list5, string60 != null ? (RefundInfoEntityModel) adapter5.c.a(string60) : null);
        }
    }
}
