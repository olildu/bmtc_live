package app.chalo.premiumbus.prebookedtickets;

import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.prebookedtickets.PremiumBusBookingsTripPollingManager$addMultipleRequests$1", f = "PremiumBusBookingsTripPollingManager.kt", l = {219}, m = "invokeSuspend", v = 1)
final class PremiumBusBookingsTripPollingManager$addMultipleRequests$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<String> $bookingIdsList;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ PremiumBusBookingsTripPollingManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusBookingsTripPollingManager$addMultipleRequests$1(PremiumBusBookingsTripPollingManager premiumBusBookingsTripPollingManager, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumBusBookingsTripPollingManager;
        this.$bookingIdsList = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumBusBookingsTripPollingManager$addMultipleRequests$1(this.this$0, this.$bookingIdsList, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumBusBookingsTripPollingManager$addMultipleRequests$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PremiumBusBookingsTripPollingManager premiumBusBookingsTripPollingManager;
        Mutex mutex;
        List<String> list;
        Object value;
        LinkedHashSet linkedHashSetF0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            premiumBusBookingsTripPollingManager = this.this$0;
            mutex = premiumBusBookingsTripPollingManager.e;
            List<String> list2 = this.$bookingIdsList;
            this.L$0 = mutex;
            this.L$1 = premiumBusBookingsTripPollingManager;
            this.L$2 = list2;
            this.label = 1;
            if (mutex.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            list = list2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) this.L$2;
            premiumBusBookingsTripPollingManager = (PremiumBusBookingsTripPollingManager) this.L$1;
            mutex = (Mutex) this.L$0;
            ResultKt.b(obj);
        }
        try {
            MutableStateFlow mutableStateFlow = premiumBusBookingsTripPollingManager.g;
            do {
                value = mutableStateFlow.getValue();
                linkedHashSetF0 = CollectionsKt.F0(((PremiumBusTripDetailsPollingRequestWrapper) value).f7286a);
                linkedHashSetF0.addAll(list);
            } while (!mutableStateFlow.c(value, new PremiumBusTripDetailsPollingRequestWrapper(linkedHashSetF0, true)));
            return Unit.f17538a;
        } finally {
            mutex.e(null);
        }
    }
}
