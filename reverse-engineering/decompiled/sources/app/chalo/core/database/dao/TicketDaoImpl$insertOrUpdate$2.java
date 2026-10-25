package app.chalo.core.database.dao;

import app.cash.sqldelight.db.QueryResult;
import app.chalo.citydata.data.model.app.RouteStopsInfo;
import app.chalo.core.Ticket;
import app.chalo.core.TicketQueries;
import app.chalo.models.CardDetails;
import app.chalo.models.RecentPaymentMethod;
import app.chalo.models.mticketing.MTicket;
import app.chalo.models.mticketing.MTicketConfiguration;
import app.chalo.models.userprofile.UserProfile;
import app.chalo.network.config.ChaloJson;
import defpackage.hi1;
import defpackage.pg1;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lapp/cash/sqldelight/db/QueryResult;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.core.database.dao.TicketDaoImpl$insertOrUpdate$2", f = "TicketDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class TicketDaoImpl$insertOrUpdate$2 extends SuspendLambda implements Function1<Continuation<? super QueryResult<Long>>, Object> {
    final /* synthetic */ MTicket $ticket;
    int label;
    final /* synthetic */ TicketDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TicketDaoImpl$insertOrUpdate$2(TicketDaoImpl ticketDaoImpl, MTicket mTicket, Continuation continuation) {
        super(1, continuation);
        this.this$0 = ticketDaoImpl;
        this.$ticket = mTicket;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new TicketDaoImpl$insertOrUpdate$2(this.this$0, this.$ticket, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((TicketDaoImpl$insertOrUpdate$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String strA;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        TicketQueries ticketQueries = this.this$0.f2084a;
        MTicket mTicket = this.$ticket;
        Intrinsics.i(mTicket, "<this>");
        String str = mTicket.f5615a;
        String str2 = mTicket.b;
        String str3 = mTicket.c;
        String str4 = mTicket.d;
        String str5 = mTicket.e;
        RouteStopsInfo routeStopsInfo = mTicket.f;
        RouteStopsInfo routeStopsInfo2 = mTicket.g;
        Map map = mTicket.h;
        long j = mTicket.i;
        long j2 = mTicket.j;
        boolean z = mTicket.k;
        long j3 = mTicket.l;
        boolean z2 = mTicket.m;
        Long l = mTicket.n;
        UserProfile userProfile = mTicket.o;
        String str6 = mTicket.p;
        String str7 = mTicket.q;
        MTicketConfiguration mTicketConfiguration = mTicket.r;
        Boolean bool = mTicket.s;
        boolean z3 = mTicket.t;
        List list = mTicket.u;
        String strA2 = null;
        if (list != null) {
            Json json = ChaloJson.b;
            json.getClass();
            strA = json.a(new ArrayListSerializer(RecentPaymentMethod.INSTANCE.serializer()), list);
        } else {
            strA = null;
        }
        List list2 = mTicket.v;
        if (list2 != null) {
            Json json2 = ChaloJson.b;
            json2.getClass();
            strA2 = json2.a(new ArrayListSerializer(CardDetails.INSTANCE.serializer()), list2);
        }
        Ticket ticket = new Ticket(str, str, str2, str3, str4, str5, routeStopsInfo, routeStopsInfo2, map, j, j2, z, j3, z2, l, userProfile, str6, str7, mTicketConfiguration, bool, z3, strA, strA2, mTicket.w, mTicket.x, mTicket.y, mTicket.z, mTicket.A);
        ticketQueries.getClass();
        QueryResult queryResultA0 = ticketQueries.f697a.A0(-1208226722, "INSERT OR REPLACE INTO Ticket (ticketId, mticket__mTicketId, mticket__userId, mticket__deviceId, mticket__cityName, mticket__agency, mticket__upTripRouteStopsInfo, mticket__upTripRouteStopsStageInfo, mticket__passengerDetails, mticket__bookingTime, mticket__expirationTime, mticket__isExpired, mticket__upTripActivationTime, mticket__isUpTripActivated, mticket__upTripPunchingTime, mticket__userProfile, mticket__qrCode, mticket__tone, mticket__mTicketConfiguration, mticket__isFreeRide, mticket__isPaymentRequired, mticket__recentPaymentMethod, mticket__cardDetails, mticket__customerId, mticket__orderId, mticket__status, mticket__paymentMode, mticket__mticketTripReceipt) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new pg1(13, ticket, ticketQueries));
        ticketQueries.T(-1208226722, new hi1(10));
        return queryResultA0;
    }
}
