package defpackage;

import app.cash.sqldelight.db.SqlCursor;
import app.chalo.core.Premium_reserve_ticket_table;
import app.chalo.core.Premium_reserve_ticket_tableQueries;
import app.chalo.data.RefundInfoAppModel;
import app.chalo.premiumbus.data.models.app.FirstBookingAppModel;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.FunctionN;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xw0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20057a = 1;
    public final /* synthetic */ FunctionReferenceImpl b;
    public final /* synthetic */ Premium_reserve_ticket_tableQueries c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ xw0(Function7 function7, Premium_reserve_ticket_tableQueries premium_reserve_ticket_tableQueries) {
        this.b = (FunctionReferenceImpl) function7;
        this.c = premium_reserve_ticket_tableQueries;
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [kotlin.jvm.functions.Function7, kotlin.jvm.internal.FunctionReferenceImpl] */
    /* JADX WARN: Type inference failed for: r2v21, types: [kotlin.jvm.functions.FunctionN, kotlin.jvm.internal.FunctionReferenceImpl] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f20057a;
        Premium_reserve_ticket_tableQueries premium_reserve_ticket_tableQueries = this.c;
        switch (i) {
            case 0:
                SqlCursor sqlCursor = (SqlCursor) obj;
                String strI = cb0.i(sqlCursor, "cursor", 0);
                Long l = sqlCursor.getLong(1);
                Long lE = cb0.e(l, sqlCursor, 2);
                Premium_reserve_ticket_table.Adapter adapter = premium_reserve_ticket_tableQueries.b;
                Object objG = cb0.g(sqlCursor, 3, adapter.f1986a);
                String string = sqlCursor.getString(4);
                Intrinsics.f(string);
                String string2 = sqlCursor.getString(5);
                String string3 = sqlCursor.getString(6);
                String string4 = sqlCursor.getString(7);
                String strJ = cb0.j(string4, sqlCursor, 8);
                String string5 = sqlCursor.getString(9);
                String strJ2 = cb0.j(string5, sqlCursor, 10);
                String string6 = sqlCursor.getString(11);
                Long lJ = uf0.j(string6, sqlCursor, 12);
                Long l2 = sqlCursor.getLong(13);
                Long lE2 = cb0.e(l2, sqlCursor, 14);
                String string7 = sqlCursor.getString(15);
                String strJ3 = cb0.j(string7, sqlCursor, 16);
                String string8 = sqlCursor.getString(17);
                String strJ4 = cb0.j(string8, sqlCursor, 18);
                String string9 = sqlCursor.getString(19);
                Intrinsics.f(string9);
                Object objF = cb0.f(sqlCursor, 20, adapter.b);
                Object objF2 = cb0.f(sqlCursor, 21, adapter.c);
                Boolean bool = sqlCursor.getBoolean(22);
                Intrinsics.f(bool);
                Object objF3 = cb0.f(sqlCursor, 23, adapter.d);
                String string10 = sqlCursor.getString(24);
                Long l3 = sqlCursor.getLong(25);
                Long l4 = sqlCursor.getLong(26);
                Long lE3 = cb0.e(l4, sqlCursor, 27);
                String string11 = sqlCursor.getString(28);
                FirstBookingAppModel firstBookingAppModel = string11 != null ? (FirstBookingAppModel) adapter.e.a(string11) : null;
                String string12 = sqlCursor.getString(29);
                FirstBookingAppModel firstBookingAppModel2 = firstBookingAppModel;
                PremiumReserveTicketStatus premiumReserveTicketStatus = string12 != null ? (PremiumReserveTicketStatus) adapter.f.a(string12) : null;
                String string13 = sqlCursor.getString(30);
                PremiumReserveTicketStatus premiumReserveTicketStatus2 = premiumReserveTicketStatus;
                RefundInfoAppModel refundInfoAppModel = string13 != null ? (RefundInfoAppModel) adapter.g.a(string13) : null;
                String string14 = sqlCursor.getString(31);
                return this.b.invoke(strI, l, lE, objG, string, string2, string3, string4, strJ, string5, strJ2, string6, lJ, l2, lE2, string7, strJ3, string8, strJ4, string9, objF, objF2, bool, objF3, string10, l3, l4, lE3, firstBookingAppModel2, premiumReserveTicketStatus2, refundInfoAppModel, string14 != null ? (List) adapter.h.a(string14) : null);
            default:
                SqlCursor sqlCursor2 = (SqlCursor) obj;
                String strI2 = cb0.i(sqlCursor2, "cursor", 0);
                String string15 = sqlCursor2.getString(1);
                String strJ5 = cb0.j(string15, sqlCursor2, 2);
                String string16 = sqlCursor2.getString(3);
                Intrinsics.f(string16);
                Object objG2 = cb0.g(sqlCursor2, 4, premium_reserve_ticket_tableQueries.c.f1982a);
                Boolean bool2 = sqlCursor2.getBoolean(5);
                Intrinsics.f(bool2);
                return this.b.invoke(strI2, string15, strJ5, string16, objG2, bool2, sqlCursor2.getString(6));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ xw0(FunctionN functionN, Premium_reserve_ticket_tableQueries premium_reserve_ticket_tableQueries) {
        this.b = (FunctionReferenceImpl) functionN;
        this.c = premium_reserve_ticket_tableQueries;
    }
}
