package defpackage;

import app.cash.sqldelight.db.SqlCursor;
import app.chalo.citydata.data.model.app.RouteStopsInfo;
import app.chalo.core.Ticket;
import app.chalo.core.TicketQueries;
import app.chalo.models.mticketing.MTicketTripReceipt;
import app.chalo.models.userprofile.UserProfile;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.FunctionN;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ui1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19750a;
    public final /* synthetic */ FunctionN b;
    public final /* synthetic */ TicketQueries c;

    public /* synthetic */ ui1(FunctionN functionN, TicketQueries ticketQueries, int i) {
        this.f19750a = i;
        this.b = functionN;
        this.c = ticketQueries;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19750a) {
            case 0:
                SqlCursor sqlCursor = (SqlCursor) obj;
                String strI = cb0.i(sqlCursor, "cursor", 0);
                String string = sqlCursor.getString(1);
                Intrinsics.f(string);
                String string2 = sqlCursor.getString(2);
                String string3 = sqlCursor.getString(3);
                String string4 = sqlCursor.getString(4);
                String strJ = cb0.j(string4, sqlCursor, 5);
                Ticket.Adapter adapter = this.c.b;
                Object objF = cb0.f(sqlCursor, 6, adapter.f2020a);
                String string5 = sqlCursor.getString(7);
                RouteStopsInfo routeStopsInfo = string5 != null ? (RouteStopsInfo) adapter.b.a(string5) : null;
                Object objF2 = cb0.f(sqlCursor, 8, adapter.c);
                Long l = sqlCursor.getLong(9);
                Long lE = cb0.e(l, sqlCursor, 10);
                Boolean bool = sqlCursor.getBoolean(11);
                Intrinsics.f(bool);
                Long l2 = sqlCursor.getLong(12);
                Intrinsics.f(l2);
                Boolean bool2 = sqlCursor.getBoolean(13);
                Intrinsics.f(bool2);
                Long l3 = sqlCursor.getLong(14);
                String string6 = sqlCursor.getString(15);
                UserProfile userProfile = string6 != null ? (UserProfile) adapter.d.a(string6) : null;
                String string7 = sqlCursor.getString(16);
                String string8 = sqlCursor.getString(17);
                Object objF3 = cb0.f(sqlCursor, 18, adapter.e);
                Boolean bool3 = sqlCursor.getBoolean(19);
                Boolean bool4 = sqlCursor.getBoolean(20);
                Intrinsics.f(bool4);
                String string9 = sqlCursor.getString(21);
                String string10 = sqlCursor.getString(22);
                String string11 = sqlCursor.getString(23);
                String string12 = sqlCursor.getString(24);
                String string13 = sqlCursor.getString(25);
                String string14 = sqlCursor.getString(26);
                String string15 = sqlCursor.getString(27);
                return this.b.invoke(strI, string, string2, string3, string4, strJ, objF, routeStopsInfo, objF2, l, lE, bool, l2, bool2, l3, userProfile, string7, string8, objF3, bool3, bool4, string9, string10, string11, string12, string13, string14, string15 != null ? (MTicketTripReceipt) adapter.f.a(string15) : null);
            case 1:
                SqlCursor sqlCursor2 = (SqlCursor) obj;
                String strI2 = cb0.i(sqlCursor2, "cursor", 0);
                String string16 = sqlCursor2.getString(1);
                Intrinsics.f(string16);
                String string17 = sqlCursor2.getString(2);
                String string18 = sqlCursor2.getString(3);
                String string19 = sqlCursor2.getString(4);
                String strJ2 = cb0.j(string19, sqlCursor2, 5);
                Ticket.Adapter adapter2 = this.c.b;
                Object objF4 = cb0.f(sqlCursor2, 6, adapter2.f2020a);
                String string20 = sqlCursor2.getString(7);
                RouteStopsInfo routeStopsInfo2 = string20 != null ? (RouteStopsInfo) adapter2.b.a(string20) : null;
                Object objF5 = cb0.f(sqlCursor2, 8, adapter2.c);
                Long l4 = sqlCursor2.getLong(9);
                Long lE2 = cb0.e(l4, sqlCursor2, 10);
                Boolean bool5 = sqlCursor2.getBoolean(11);
                Intrinsics.f(bool5);
                Long l5 = sqlCursor2.getLong(12);
                Intrinsics.f(l5);
                Boolean bool6 = sqlCursor2.getBoolean(13);
                Intrinsics.f(bool6);
                Long l6 = sqlCursor2.getLong(14);
                String string21 = sqlCursor2.getString(15);
                UserProfile userProfile2 = string21 != null ? (UserProfile) adapter2.d.a(string21) : null;
                String string22 = sqlCursor2.getString(16);
                String string23 = sqlCursor2.getString(17);
                Object objF6 = cb0.f(sqlCursor2, 18, adapter2.e);
                Boolean bool7 = sqlCursor2.getBoolean(19);
                Boolean bool8 = sqlCursor2.getBoolean(20);
                Intrinsics.f(bool8);
                String string24 = sqlCursor2.getString(21);
                String string25 = sqlCursor2.getString(22);
                String string26 = sqlCursor2.getString(23);
                String string27 = sqlCursor2.getString(24);
                String string28 = sqlCursor2.getString(25);
                String string29 = sqlCursor2.getString(26);
                String string30 = sqlCursor2.getString(27);
                return this.b.invoke(strI2, string16, string17, string18, string19, strJ2, objF4, routeStopsInfo2, objF5, l4, lE2, bool5, l5, bool6, l6, userProfile2, string22, string23, objF6, bool7, bool8, string24, string25, string26, string27, string28, string29, string30 != null ? (MTicketTripReceipt) adapter2.f.a(string30) : null);
            default:
                SqlCursor sqlCursor3 = (SqlCursor) obj;
                String strI3 = cb0.i(sqlCursor3, "cursor", 0);
                String string31 = sqlCursor3.getString(1);
                Intrinsics.f(string31);
                String string32 = sqlCursor3.getString(2);
                String string33 = sqlCursor3.getString(3);
                String string34 = sqlCursor3.getString(4);
                String strJ3 = cb0.j(string34, sqlCursor3, 5);
                Ticket.Adapter adapter3 = this.c.b;
                Object objF7 = cb0.f(sqlCursor3, 6, adapter3.f2020a);
                String string35 = sqlCursor3.getString(7);
                RouteStopsInfo routeStopsInfo3 = string35 != null ? (RouteStopsInfo) adapter3.b.a(string35) : null;
                Object objF8 = cb0.f(sqlCursor3, 8, adapter3.c);
                Long l7 = sqlCursor3.getLong(9);
                Long lE3 = cb0.e(l7, sqlCursor3, 10);
                Boolean bool9 = sqlCursor3.getBoolean(11);
                Intrinsics.f(bool9);
                Long l8 = sqlCursor3.getLong(12);
                Intrinsics.f(l8);
                Boolean bool10 = sqlCursor3.getBoolean(13);
                Intrinsics.f(bool10);
                Long l9 = sqlCursor3.getLong(14);
                String string36 = sqlCursor3.getString(15);
                UserProfile userProfile3 = string36 != null ? (UserProfile) adapter3.d.a(string36) : null;
                String string37 = sqlCursor3.getString(16);
                String string38 = sqlCursor3.getString(17);
                Object objF9 = cb0.f(sqlCursor3, 18, adapter3.e);
                Boolean bool11 = sqlCursor3.getBoolean(19);
                Boolean bool12 = sqlCursor3.getBoolean(20);
                Intrinsics.f(bool12);
                String string39 = sqlCursor3.getString(21);
                String string40 = sqlCursor3.getString(22);
                String string41 = sqlCursor3.getString(23);
                String string42 = sqlCursor3.getString(24);
                String string43 = sqlCursor3.getString(25);
                String string44 = sqlCursor3.getString(26);
                RouteStopsInfo routeStopsInfo4 = routeStopsInfo3;
                String string45 = sqlCursor3.getString(27);
                return this.b.invoke(strI3, string31, string32, string33, string34, strJ3, objF7, routeStopsInfo4, objF8, l7, lE3, bool9, l8, bool10, l9, userProfile3, string37, string38, objF9, bool11, bool12, string39, string40, string41, string42, string43, string44, string45 != null ? (MTicketTripReceipt) adapter3.f.a(string45) : null);
        }
    }
}
