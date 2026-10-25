package app.chalo.core.database.dao;

import app.chalo.citydata.data.model.app.RouteStopsInfo;
import app.chalo.core.database.mappers.TicketTableMapper;
import app.chalo.models.mticketing.MTicket;
import app.chalo.models.mticketing.MTicketConfiguration;
import app.chalo.models.mticketing.MTicketTripReceipt;
import app.chalo.models.userprofile.UserProfile;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.FunctionN;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "Lapp/chalo/models/mticketing/MTicket;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.core.database.dao.TicketDaoImpl$getTicketFromBookingId$2", f = "TicketDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class TicketDaoImpl$getTicketFromBookingId$2 extends SuspendLambda implements Function1<Continuation<? super MTicket>, Object> {
    final /* synthetic */ String $id;
    int label;
    final /* synthetic */ TicketDaoImpl this$0;

    /* JADX INFO: renamed from: app.chalo.core.database.dao.TicketDaoImpl$getTicketFromBookingId$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements FunctionN<MTicket> {
        @Override // kotlin.jvm.functions.FunctionN
        public final Object invoke(Object[] objArr) {
            if (objArr.length != 28) {
                throw new IllegalArgumentException("Expected 28 arguments");
            }
            String p0 = (String) objArr[0];
            String p1 = (String) objArr[1];
            String str = (String) objArr[2];
            String str2 = (String) objArr[3];
            String p4 = (String) objArr[4];
            String p5 = (String) objArr[5];
            RouteStopsInfo p6 = (RouteStopsInfo) objArr[6];
            RouteStopsInfo routeStopsInfo = (RouteStopsInfo) objArr[7];
            Map p8 = (Map) objArr[8];
            long jLongValue = ((Number) objArr[9]).longValue();
            long jLongValue2 = ((Number) objArr[10]).longValue();
            boolean zBooleanValue = ((Boolean) objArr[11]).booleanValue();
            long jLongValue3 = ((Number) objArr[12]).longValue();
            boolean zBooleanValue2 = ((Boolean) objArr[13]).booleanValue();
            Long l = (Long) objArr[14];
            UserProfile userProfile = (UserProfile) objArr[15];
            String str3 = (String) objArr[16];
            String str4 = (String) objArr[17];
            MTicketConfiguration p18 = (MTicketConfiguration) objArr[18];
            Boolean bool = (Boolean) objArr[19];
            boolean zBooleanValue3 = ((Boolean) objArr[20]).booleanValue();
            String str5 = (String) objArr[21];
            String str6 = (String) objArr[22];
            String str7 = (String) objArr[23];
            String str8 = (String) objArr[24];
            String str9 = (String) objArr[25];
            String str10 = (String) objArr[26];
            MTicketTripReceipt mTicketTripReceipt = (MTicketTripReceipt) objArr[27];
            Intrinsics.i(p0, "p0");
            Intrinsics.i(p1, "p1");
            Intrinsics.i(p4, "p4");
            Intrinsics.i(p5, "p5");
            Intrinsics.i(p6, "p6");
            Intrinsics.i(p8, "p8");
            Intrinsics.i(p18, "p18");
            ((TicketTableMapper) this.receiver).getClass();
            return TicketTableMapper.a(p0, p1, str, str2, p4, p5, p6, routeStopsInfo, p8, jLongValue, jLongValue2, zBooleanValue, jLongValue3, zBooleanValue2, l, userProfile, str3, str4, p18, bool, zBooleanValue3, str5, str6, str7, str8, str9, str10, mTicketTripReceipt);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TicketDaoImpl$getTicketFromBookingId$2(TicketDaoImpl ticketDaoImpl, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = ticketDaoImpl;
        this.$id = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new TicketDaoImpl$getTicketFromBookingId$2(this.this$0, this.$id, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((TicketDaoImpl$getTicketFromBookingId$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        return this.this$0.f2084a.Z(this.$id, new AnonymousClass1(28, TicketTableMapper.f2112a, TicketTableMapper.class, "mapper", "mapper(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/citydata/data/model/app/RouteStopsInfo;Lapp/chalo/citydata/data/model/app/RouteStopsInfo;Ljava/util/Map;JJZJZLjava/lang/Long;Lapp/chalo/models/userprofile/UserProfile;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/models/mticketing/MTicketConfiguration;Ljava/lang/Boolean;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/models/mticketing/MTicketTripReceipt;)Lapp/chalo/models/mticketing/MTicket;", 0)).d();
    }
}
