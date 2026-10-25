package defpackage;

import app.cash.sqldelight.db.SqlCursor;
import app.chalo.core.Metro_ticket_table;
import app.chalo.core.Metro_ticket_tableQueries;
import app.chalo.data.RefundInfoAppModel;
import app.chalo.metro.dao.MetroTicketStopDetailsEntity;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vi0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19839a;
    public final /* synthetic */ Function16 b;
    public final /* synthetic */ Metro_ticket_tableQueries c;

    public /* synthetic */ vi0(Function16 function16, Metro_ticket_tableQueries metro_ticket_tableQueries, int i) {
        this.f19839a = i;
        this.b = function16;
        this.c = metro_ticket_tableQueries;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19839a) {
            case 0:
                SqlCursor sqlCursor = (SqlCursor) obj;
                String strI = cb0.i(sqlCursor, "cursor", 0);
                String string = sqlCursor.getString(1);
                Long lJ = uf0.j(string, sqlCursor, 2);
                Long l = sqlCursor.getLong(3);
                Intrinsics.f(l);
                Metro_ticket_table.Adapter adapter = this.c.b;
                Object objG = cb0.g(sqlCursor, 4, adapter.f1967a);
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
                MetroTicketStopDetailsEntity metroTicketStopDetailsEntity = string8 != null ? (MetroTicketStopDetailsEntity) adapter.d.a(string8) : null;
                String string9 = sqlCursor.getString(14);
                MetroTicketStopDetailsEntity metroTicketStopDetailsEntity2 = string9 != null ? (MetroTicketStopDetailsEntity) adapter.e.a(string9) : null;
                String string10 = sqlCursor.getString(15);
                return this.b.invoke(strI, string, lJ, l, objG, l2, string2, string3, list, string5, l3, map, string7, metroTicketStopDetailsEntity, metroTicketStopDetailsEntity2, string10 != null ? (RefundInfoAppModel) adapter.f.a(string10) : null);
            case 1:
                SqlCursor sqlCursor2 = (SqlCursor) obj;
                String strI2 = cb0.i(sqlCursor2, "cursor", 0);
                String string11 = sqlCursor2.getString(1);
                Long lJ2 = uf0.j(string11, sqlCursor2, 2);
                Long l4 = sqlCursor2.getLong(3);
                Intrinsics.f(l4);
                Metro_ticket_table.Adapter adapter2 = this.c.b;
                Object objG2 = cb0.g(sqlCursor2, 4, adapter2.f1967a);
                Long l5 = sqlCursor2.getLong(5);
                String string12 = sqlCursor2.getString(6);
                Intrinsics.f(string12);
                String string13 = sqlCursor2.getString(7);
                String string14 = sqlCursor2.getString(8);
                List list2 = string14 != null ? (List) adapter2.b.a(string14) : null;
                String string15 = sqlCursor2.getString(9);
                Long l6 = sqlCursor2.getLong(10);
                String string16 = sqlCursor2.getString(11);
                Map map2 = string16 != null ? (Map) adapter2.c.a(string16) : null;
                String string17 = sqlCursor2.getString(12);
                String string18 = sqlCursor2.getString(13);
                MetroTicketStopDetailsEntity metroTicketStopDetailsEntity3 = string18 != null ? (MetroTicketStopDetailsEntity) adapter2.d.a(string18) : null;
                String string19 = sqlCursor2.getString(14);
                MetroTicketStopDetailsEntity metroTicketStopDetailsEntity4 = string19 != null ? (MetroTicketStopDetailsEntity) adapter2.e.a(string19) : null;
                String string20 = sqlCursor2.getString(15);
                return this.b.invoke(strI2, string11, lJ2, l4, objG2, l5, string12, string13, list2, string15, l6, map2, string17, metroTicketStopDetailsEntity3, metroTicketStopDetailsEntity4, string20 != null ? (RefundInfoAppModel) adapter2.f.a(string20) : null);
            case 2:
                SqlCursor sqlCursor3 = (SqlCursor) obj;
                String strI3 = cb0.i(sqlCursor3, "cursor", 0);
                String string21 = sqlCursor3.getString(1);
                Long lJ3 = uf0.j(string21, sqlCursor3, 2);
                Long l7 = sqlCursor3.getLong(3);
                Intrinsics.f(l7);
                Metro_ticket_table.Adapter adapter3 = this.c.b;
                Object objG3 = cb0.g(sqlCursor3, 4, adapter3.f1967a);
                Long l8 = sqlCursor3.getLong(5);
                String string22 = sqlCursor3.getString(6);
                Intrinsics.f(string22);
                String string23 = sqlCursor3.getString(7);
                String string24 = sqlCursor3.getString(8);
                List list3 = string24 != null ? (List) adapter3.b.a(string24) : null;
                String string25 = sqlCursor3.getString(9);
                Long l9 = sqlCursor3.getLong(10);
                String string26 = sqlCursor3.getString(11);
                Map map3 = string26 != null ? (Map) adapter3.c.a(string26) : null;
                String string27 = sqlCursor3.getString(12);
                String string28 = sqlCursor3.getString(13);
                MetroTicketStopDetailsEntity metroTicketStopDetailsEntity5 = string28 != null ? (MetroTicketStopDetailsEntity) adapter3.d.a(string28) : null;
                String string29 = sqlCursor3.getString(14);
                MetroTicketStopDetailsEntity metroTicketStopDetailsEntity6 = string29 != null ? (MetroTicketStopDetailsEntity) adapter3.e.a(string29) : null;
                String string30 = sqlCursor3.getString(15);
                return this.b.invoke(strI3, string21, lJ3, l7, objG3, l8, string22, string23, list3, string25, l9, map3, string27, metroTicketStopDetailsEntity5, metroTicketStopDetailsEntity6, string30 != null ? (RefundInfoAppModel) adapter3.f.a(string30) : null);
            default:
                SqlCursor sqlCursor4 = (SqlCursor) obj;
                String strI4 = cb0.i(sqlCursor4, "cursor", 0);
                String string31 = sqlCursor4.getString(1);
                Long lJ4 = uf0.j(string31, sqlCursor4, 2);
                Long l10 = sqlCursor4.getLong(3);
                Intrinsics.f(l10);
                Metro_ticket_table.Adapter adapter4 = this.c.b;
                Object objG4 = cb0.g(sqlCursor4, 4, adapter4.f1967a);
                Long l11 = sqlCursor4.getLong(5);
                String string32 = sqlCursor4.getString(6);
                Intrinsics.f(string32);
                String string33 = sqlCursor4.getString(7);
                String string34 = sqlCursor4.getString(8);
                List list4 = string34 != null ? (List) adapter4.b.a(string34) : null;
                String string35 = sqlCursor4.getString(9);
                Long l12 = sqlCursor4.getLong(10);
                String string36 = sqlCursor4.getString(11);
                Map map4 = string36 != null ? (Map) adapter4.c.a(string36) : null;
                String string37 = sqlCursor4.getString(12);
                String string38 = sqlCursor4.getString(13);
                MetroTicketStopDetailsEntity metroTicketStopDetailsEntity7 = string38 != null ? (MetroTicketStopDetailsEntity) adapter4.d.a(string38) : null;
                String string39 = sqlCursor4.getString(14);
                MetroTicketStopDetailsEntity metroTicketStopDetailsEntity8 = string39 != null ? (MetroTicketStopDetailsEntity) adapter4.e.a(string39) : null;
                String string40 = sqlCursor4.getString(15);
                return this.b.invoke(strI4, string31, lJ4, l10, objG4, l11, string32, string33, list4, string35, l12, map4, string37, metroTicketStopDetailsEntity7, metroTicketStopDetailsEntity8, string40 != null ? (RefundInfoAppModel) adapter4.f.a(string40) : null);
        }
    }
}
