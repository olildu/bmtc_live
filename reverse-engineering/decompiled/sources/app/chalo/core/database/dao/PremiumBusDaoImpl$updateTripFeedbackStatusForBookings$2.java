package app.chalo.core.database.dao;

import defpackage.b5;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.core.database.dao.PremiumBusDaoImpl$updateTripFeedbackStatusForBookings$2", f = "PremiumBusDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class PremiumBusDaoImpl$updateTripFeedbackStatusForBookings$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ List<String> $bookingIdList;
    final /* synthetic */ boolean $isTripFeedbackCollected;
    final /* synthetic */ String $userId;
    int label;
    final /* synthetic */ PremiumBusDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusDaoImpl$updateTripFeedbackStatusForBookings$2(PremiumBusDaoImpl premiumBusDaoImpl, List list, boolean z, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = premiumBusDaoImpl;
        this.$bookingIdList = list;
        this.$isTripFeedbackCollected = z;
        this.$userId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PremiumBusDaoImpl$updateTripFeedbackStatusForBookings$2(this.this$0, this.$bookingIdList, this.$isTripFeedbackCollected, this.$userId, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        PremiumBusDaoImpl$updateTripFeedbackStatusForBookings$2 premiumBusDaoImpl$updateTripFeedbackStatusForBookings$2 = (PremiumBusDaoImpl$updateTripFeedbackStatusForBookings$2) create((Continuation) obj);
        Unit unit = Unit.f17538a;
        premiumBusDaoImpl$updateTripFeedbackStatusForBookings$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        PremiumBusDaoImpl premiumBusDaoImpl = this.this$0;
        premiumBusDaoImpl.f2069a.V(new b5(this.$bookingIdList, premiumBusDaoImpl, this.$isTripFeedbackCollected, this.$userId, 2));
        return Unit.f17538a;
    }
}
