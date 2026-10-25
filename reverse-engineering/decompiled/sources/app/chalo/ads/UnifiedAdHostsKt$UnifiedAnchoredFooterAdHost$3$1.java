package app.chalo.ads;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ads.UnifiedAdHostsKt$UnifiedAnchoredFooterAdHost$3$1", f = "UnifiedAdHosts.kt", l = {}, m = "invokeSuspend", v = 1)
final class UnifiedAdHostsKt$UnifiedAnchoredFooterAdHost$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UnifiedAdHostValidationError $hostValidationError;
    final /* synthetic */ State<Function1<Integer, Unit>> $latestOnAdFailedToLoad$delegate;
    final /* synthetic */ State<Function1<UnifiedAdHostValidationError, Unit>> $latestOnHostValidationFailed$delegate;
    final /* synthetic */ MutableIntState $loadedHeightDp$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnifiedAdHostsKt$UnifiedAnchoredFooterAdHost$3$1(UnifiedAdHostValidationError unifiedAdHostValidationError, MutableIntState mutableIntState, State state, State state2, Continuation continuation) {
        super(2, continuation);
        this.$hostValidationError = unifiedAdHostValidationError;
        this.$loadedHeightDp$delegate = mutableIntState;
        this.$latestOnAdFailedToLoad$delegate = state;
        this.$latestOnHostValidationFailed$delegate = state2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UnifiedAdHostsKt$UnifiedAnchoredFooterAdHost$3$1(this.$hostValidationError, this.$loadedHeightDp$delegate, this.$latestOnAdFailedToLoad$delegate, this.$latestOnHostValidationFailed$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        UnifiedAdHostsKt$UnifiedAnchoredFooterAdHost$3$1 unifiedAdHostsKt$UnifiedAnchoredFooterAdHost$3$1 = (UnifiedAdHostsKt$UnifiedAnchoredFooterAdHost$3$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        unifiedAdHostsKt$UnifiedAnchoredFooterAdHost$3$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        this.$loadedHeightDp$delegate.setIntValue(0);
        UnifiedAdHostsKt.c(this.$hostValidationError, "AnchoredFooterUnifiedAdHost", this.$latestOnAdFailedToLoad$delegate.getValue(), this.$latestOnHostValidationFailed$delegate.getValue());
        return Unit.f17538a;
    }
}
