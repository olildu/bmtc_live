package app.chalo.core.database.dao;

import app.chalo.core.database.mappers.PremiumBusMappers;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketTripProperties;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lapp/chalo/premiumbus/data/models/entity/PremiumReserveTicketTripProperties;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.core.database.dao.PremiumBusDaoImpl$getUniqueOriginDestinationPairs$2", f = "PremiumBusDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class PremiumBusDaoImpl$getUniqueOriginDestinationPairs$2 extends SuspendLambda implements Function1<Continuation<? super List<? extends PremiumReserveTicketTripProperties>>, Object> {
    final /* synthetic */ String $city;
    int label;
    final /* synthetic */ PremiumBusDaoImpl this$0;

    /* JADX INFO: renamed from: app.chalo.core.database.dao.PremiumBusDaoImpl$getUniqueOriginDestinationPairs$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements FunctionN<PremiumReserveTicketTripProperties> {
        @Override // kotlin.jvm.functions.FunctionN
        public final Object invoke(Object[] objArr) {
            if (objArr.length != 32) {
                throw new IllegalArgumentException("Expected 32 arguments");
            }
            String p0 = (String) objArr[0];
            ((Number) objArr[1]).longValue();
            ((Number) objArr[2]).longValue();
            PremiumReserveTicketStatus p3 = (PremiumReserveTicketStatus) objArr[3];
            String p4 = (String) objArr[4];
            String p7 = (String) objArr[7];
            String p8 = (String) objArr[8];
            String p9 = (String) objArr[9];
            String p10 = (String) objArr[10];
            String p11 = (String) objArr[11];
            long jLongValue = ((Number) objArr[12]).longValue();
            long jLongValue2 = ((Number) objArr[13]).longValue();
            long jLongValue3 = ((Number) objArr[14]).longValue();
            String p15 = (String) objArr[15];
            String p16 = (String) objArr[16];
            String p17 = (String) objArr[17];
            String p18 = (String) objArr[18];
            String p19 = (String) objArr[19];
            PremiumStopDetailsInfo p20 = (PremiumStopDetailsInfo) objArr[20];
            PremiumStopDetailsInfo p21 = (PremiumStopDetailsInfo) objArr[21];
            boolean zBooleanValue = ((Boolean) objArr[22]).booleanValue();
            List p23 = (List) objArr[23];
            ((Number) objArr[26]).longValue();
            ((Number) objArr[27]).longValue();
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
            return new PremiumReserveTicketTripProperties(p11, jLongValue, jLongValue2, jLongValue3, p15, p16, p20, p21, zBooleanValue);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusDaoImpl$getUniqueOriginDestinationPairs$2(PremiumBusDaoImpl premiumBusDaoImpl, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = premiumBusDaoImpl;
        this.$city = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PremiumBusDaoImpl$getUniqueOriginDestinationPairs$2(this.this$0, this.$city, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((PremiumBusDaoImpl$getUniqueOriginDestinationPairs$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        return this.this$0.f2069a.g0(this.$city, new AnonymousClass1(32, PremiumBusMappers.f2096a, PremiumBusMappers.class, "toTripProperties", "toTripProperties(Ljava/lang/String;JJLapp/chalo/premiumbus/data/models/entity/PremiumReserveTicketStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/premiumbus/data/models/entity/PremiumStopDetailsInfo;Lapp/chalo/premiumbus/data/models/entity/PremiumStopDetailsInfo;ZLjava/util/List;Ljava/lang/String;Ljava/lang/Long;JJLapp/chalo/premiumbus/data/models/app/FirstBookingAppModel;Lapp/chalo/premiumbus/data/models/entity/PremiumReserveTicketStatus;Lapp/chalo/data/RefundInfoAppModel;Ljava/util/List;)Lapp/chalo/premiumbus/data/models/entity/PremiumReserveTicketTripProperties;", 0)).b();
    }
}
