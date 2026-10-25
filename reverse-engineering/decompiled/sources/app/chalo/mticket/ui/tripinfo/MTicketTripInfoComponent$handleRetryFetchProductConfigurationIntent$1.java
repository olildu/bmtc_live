package app.chalo.mticket.ui.tripinfo;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.math.Primes;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.mticket.ui.tripinfo.MTicketTripInfoComponent$handleRetryFetchProductConfigurationIntent$1", f = "MTicketTripInfoComponent.kt", l = {Primes.SMALL_FACTOR_LIMIT}, m = "invokeSuspend", v = 1)
final class MTicketTripInfoComponent$handleRetryFetchProductConfigurationIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MTicketTripInfoIntent.RetryFetchProductConfigurationIntent $intent;
    int label;
    final /* synthetic */ MTicketTripInfoComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MTicketTripInfoComponent$handleRetryFetchProductConfigurationIntent$1(MTicketTripInfoComponent mTicketTripInfoComponent, MTicketTripInfoIntent.RetryFetchProductConfigurationIntent retryFetchProductConfigurationIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mTicketTripInfoComponent;
        this.$intent = retryFetchProductConfigurationIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MTicketTripInfoComponent$handleRetryFetchProductConfigurationIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MTicketTripInfoComponent$handleRetryFetchProductConfigurationIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            MTicketTripInfoComponent mTicketTripInfoComponent = this.this$0;
            boolean z = this.$intent.f5770a;
            this.label = 1;
            if (mTicketTripInfoComponent.J0(true, z, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f17538a;
    }
}
