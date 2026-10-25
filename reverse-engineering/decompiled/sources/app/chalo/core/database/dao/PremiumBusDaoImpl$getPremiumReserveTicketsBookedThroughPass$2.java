package app.chalo.core.database.dao;

import app.chalo.core.database.mappers.PremiumBusMappers;
import app.chalo.data.RefundInfoAppModel;
import app.chalo.premiumbus.data.models.app.FirstBookingAppModel;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketEntity;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import app.chalo.premiumbus.data.models.entity.PremiumStopDetailsInfo;
import java.util.List;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lapp/chalo/premiumbus/data/models/entity/PremiumReserveTicketEntity;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.core.database.dao.PremiumBusDaoImpl$getPremiumReserveTicketsBookedThroughPass$2", f = "PremiumBusDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class PremiumBusDaoImpl$getPremiumReserveTicketsBookedThroughPass$2 extends SuspendLambda implements Function1<Continuation<? super List<? extends PremiumReserveTicketEntity>>, Object> {
    final /* synthetic */ String $city;
    final /* synthetic */ String $passId;
    final /* synthetic */ long $startTs;
    final /* synthetic */ String $userId;
    int label;
    final /* synthetic */ PremiumBusDaoImpl this$0;

    /* JADX INFO: renamed from: app.chalo.core.database.dao.PremiumBusDaoImpl$getPremiumReserveTicketsBookedThroughPass$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements FunctionN<PremiumReserveTicketEntity> {
        @Override // kotlin.jvm.functions.FunctionN
        public final Object invoke(Object[] objArr) {
            if (objArr.length != 32) {
                throw new IllegalArgumentException("Expected 32 arguments");
            }
            String p0 = (String) objArr[0];
            long jLongValue = ((Number) objArr[1]).longValue();
            long jLongValue2 = ((Number) objArr[2]).longValue();
            PremiumReserveTicketStatus p3 = (PremiumReserveTicketStatus) objArr[3];
            String p4 = (String) objArr[4];
            String str = (String) objArr[5];
            String str2 = (String) objArr[6];
            String p7 = (String) objArr[7];
            String p8 = (String) objArr[8];
            String p9 = (String) objArr[9];
            String p10 = (String) objArr[10];
            String p11 = (String) objArr[11];
            long jLongValue3 = ((Number) objArr[12]).longValue();
            long jLongValue4 = ((Number) objArr[13]).longValue();
            long jLongValue5 = ((Number) objArr[14]).longValue();
            String p15 = (String) objArr[15];
            String p16 = (String) objArr[16];
            String p17 = (String) objArr[17];
            String p18 = (String) objArr[18];
            String p19 = (String) objArr[19];
            PremiumStopDetailsInfo p20 = (PremiumStopDetailsInfo) objArr[20];
            PremiumStopDetailsInfo p21 = (PremiumStopDetailsInfo) objArr[21];
            boolean zBooleanValue = ((Boolean) objArr[22]).booleanValue();
            List p23 = (List) objArr[23];
            String str3 = (String) objArr[24];
            Long l = (Long) objArr[25];
            long jLongValue6 = ((Number) objArr[26]).longValue();
            long jLongValue7 = ((Number) objArr[27]).longValue();
            FirstBookingAppModel firstBookingAppModel = (FirstBookingAppModel) objArr[28];
            PremiumReserveTicketStatus premiumReserveTicketStatus = (PremiumReserveTicketStatus) objArr[29];
            RefundInfoAppModel refundInfoAppModel = (RefundInfoAppModel) objArr[30];
            List list = (List) objArr[31];
            Intrinsics.i(p0, "p0");
            Intrinsics.i(p3, "p3");
            Intrinsics.i(p4, "p4");
            Intrinsics.i(p7, "p7");
            Intrinsics.i(p8, "p8");
            Intrinsics.i(p9, "p9");
            Intrinsics.i(p10, "p10");
            Intrinsics.i(p11, "p11");
            Intrinsics.i(p15, "p15");
            Intrinsics.i(p16, "p16");
            Intrinsics.i(p17, "p17");
            Intrinsics.i(p18, "p18");
            Intrinsics.i(p19, "p19");
            Intrinsics.i(p20, "p20");
            Intrinsics.i(p21, "p21");
            Intrinsics.i(p23, "p23");
            ((PremiumBusMappers) this.receiver).getClass();
            return PremiumBusMappers.b(p0, jLongValue, jLongValue2, p3, p4, str, str2, p7, p8, p9, p10, p11, jLongValue3, jLongValue4, jLongValue5, p15, p16, p17, p18, p19, p20, p21, zBooleanValue, p23, str3, l, jLongValue6, jLongValue7, firstBookingAppModel, premiumReserveTicketStatus, refundInfoAppModel, list);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusDaoImpl$getPremiumReserveTicketsBookedThroughPass$2(PremiumBusDaoImpl premiumBusDaoImpl, String str, String str2, long j, String str3, Continuation continuation) {
        super(1, continuation);
        this.this$0 = premiumBusDaoImpl;
        this.$city = str;
        this.$userId = str2;
        this.$startTs = j;
        this.$passId = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PremiumBusDaoImpl$getPremiumReserveTicketsBookedThroughPass$2(this.this$0, this.$city, this.$userId, this.$startTs, this.$passId, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((PremiumBusDaoImpl$getPremiumReserveTicketsBookedThroughPass$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        return this.this$0.f2069a.f0(this.$city, this.$userId, this.$startTs, this.$passId, new AnonymousClass1(32, PremiumBusMappers.f2096a, PremiumBusMappers.class, "toEntity", "toEntity(Ljava/lang/String;JJLapp/chalo/premiumbus/data/models/entity/PremiumReserveTicketStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/premiumbus/data/models/entity/PremiumStopDetailsInfo;Lapp/chalo/premiumbus/data/models/entity/PremiumStopDetailsInfo;ZLjava/util/List;Ljava/lang/String;Ljava/lang/Long;JJLapp/chalo/premiumbus/data/models/app/FirstBookingAppModel;Lapp/chalo/premiumbus/data/models/entity/PremiumReserveTicketStatus;Lapp/chalo/data/RefundInfoAppModel;Ljava/util/List;)Lapp/chalo/premiumbus/data/models/entity/PremiumReserveTicketEntity;", 0)).b();
    }
}
