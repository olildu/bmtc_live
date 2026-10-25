package app.chalo.premiumbus.ui.changestop;

import app.chalo.premiumbus.data.models.app.EligibleStopChangesAppModel;
import app.chalo.premiumbus.domain.FetchEligibleStopChangesUseCase;
import app.chalo.premiumbus.domain.FetchEligibleStopsFailureReason;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lapp/chalo/utils/ChaloUseCaseResult;", "Lapp/chalo/premiumbus/data/models/app/EligibleStopChangesAppModel;", "Lapp/chalo/premiumbus/domain/FetchEligibleStopsFailureReason;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.ui.changestop.PremiumBusChangeStopComponent$fetchEligibleStopsAndRouteInfo$1$eligibleStopsResultDeferred$1", f = "PremiumBusChangeStopComponent.kt", l = {137}, m = "invokeSuspend", v = 1)
final class PremiumBusChangeStopComponent$fetchEligibleStopsAndRouteInfo$1$eligibleStopsResultDeferred$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChaloUseCaseResult<EligibleStopChangesAppModel, FetchEligibleStopsFailureReason>>, Object> {
    final /* synthetic */ String $bookingId;
    int label;
    final /* synthetic */ PremiumBusChangeStopComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusChangeStopComponent$fetchEligibleStopsAndRouteInfo$1$eligibleStopsResultDeferred$1(PremiumBusChangeStopComponent premiumBusChangeStopComponent, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumBusChangeStopComponent;
        this.$bookingId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumBusChangeStopComponent$fetchEligibleStopsAndRouteInfo$1$eligibleStopsResultDeferred$1(this.this$0, this.$bookingId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumBusChangeStopComponent$fetchEligibleStopsAndRouteInfo$1$eligibleStopsResultDeferred$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        FetchEligibleStopChangesUseCase fetchEligibleStopChangesUseCase = this.this$0.l;
        String str = this.$bookingId;
        this.label = 1;
        Object objA = fetchEligibleStopChangesUseCase.a(str, this);
        return objA == coroutineSingletons ? coroutineSingletons : objA;
    }
}
