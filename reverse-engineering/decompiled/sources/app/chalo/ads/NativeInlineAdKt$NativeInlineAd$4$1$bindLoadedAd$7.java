package app.chalo.ads;

import com.google.android.gms.wallet.WalletConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ads.NativeInlineAdKt$NativeInlineAd$4$1$bindLoadedAd$7", f = "NativeInlineAd.kt", l = {WalletConstants.ERROR_CODE_UNKNOWN}, m = "invokeSuspend", v = 1)
final class NativeInlineAdKt$NativeInlineAd$4$1$bindLoadedAd$7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $adUnitId;
    final /* synthetic */ Map<String, String> $normalizedTargeting;
    final /* synthetic */ NativeInlineAdPrefetchDependencies $prefetchDependencies;
    final /* synthetic */ long $requestId;
    final /* synthetic */ NativeInlineAdSlot $slot;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeInlineAdKt$NativeInlineAd$4$1$bindLoadedAd$7(long j, String str, NativeInlineAdSlot nativeInlineAdSlot, Map map, NativeInlineAdPrefetchDependencies nativeInlineAdPrefetchDependencies, Continuation continuation) {
        super(2, continuation);
        this.$requestId = j;
        this.$adUnitId = str;
        this.$slot = nativeInlineAdSlot;
        this.$normalizedTargeting = map;
        this.$prefetchDependencies = nativeInlineAdPrefetchDependencies;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NativeInlineAdKt$NativeInlineAd$4$1$bindLoadedAd$7(this.$requestId, this.$adUnitId, this.$slot, this.$normalizedTargeting, this.$prefetchDependencies, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((NativeInlineAdKt$NativeInlineAd$4$1$bindLoadedAd$7) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            NativeInlineAdKt.c("prefetch_schedule_next", this.$requestId, this.$adUnitId, this.$slot, null, null, "delayMs=500 targetingKeys=" + this.$normalizedTargeting.keySet(), 112);
            this.label = 1;
            if (DelayKt.b(500L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        this.$prefetchDependencies.a().c(this.$adUnitId, this.$normalizedTargeting);
        return Unit.f17538a;
    }
}
