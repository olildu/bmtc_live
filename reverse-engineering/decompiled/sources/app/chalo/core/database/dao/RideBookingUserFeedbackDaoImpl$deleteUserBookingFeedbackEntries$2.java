package app.chalo.core.database.dao;

import defpackage.t01;
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
@DebugMetadata(c = "app.chalo.core.database.dao.RideBookingUserFeedbackDaoImpl$deleteUserBookingFeedbackEntries$2", f = "RideBookingUserFeedbackDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class RideBookingUserFeedbackDaoImpl$deleteUserBookingFeedbackEntries$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ List<String> $bookingIdList;
    int label;
    final /* synthetic */ RideBookingUserFeedbackDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideBookingUserFeedbackDaoImpl$deleteUserBookingFeedbackEntries$2(RideBookingUserFeedbackDaoImpl rideBookingUserFeedbackDaoImpl, List list, Continuation continuation) {
        super(1, continuation);
        this.this$0 = rideBookingUserFeedbackDaoImpl;
        this.$bookingIdList = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new RideBookingUserFeedbackDaoImpl$deleteUserBookingFeedbackEntries$2(this.this$0, this.$bookingIdList, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        RideBookingUserFeedbackDaoImpl$deleteUserBookingFeedbackEntries$2 rideBookingUserFeedbackDaoImpl$deleteUserBookingFeedbackEntries$2 = (RideBookingUserFeedbackDaoImpl$deleteUserBookingFeedbackEntries$2) create((Continuation) obj);
        Unit unit = Unit.f17538a;
        rideBookingUserFeedbackDaoImpl$deleteUserBookingFeedbackEntries$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        RideBookingUserFeedbackDaoImpl rideBookingUserFeedbackDaoImpl = this.this$0;
        rideBookingUserFeedbackDaoImpl.f2077a.V(new t01(15, this.$bookingIdList, rideBookingUserFeedbackDaoImpl));
        return Unit.f17538a;
    }
}
