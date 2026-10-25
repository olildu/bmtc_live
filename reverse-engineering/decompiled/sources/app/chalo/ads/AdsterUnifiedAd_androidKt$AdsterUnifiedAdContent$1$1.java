package app.chalo.ads;

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
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ads.AdsterUnifiedAd_androidKt$AdsterUnifiedAdContent$1$1", f = "AdsterUnifiedAd.android.kt", l = {}, m = "invokeSuspend", v = 1)
final class AdsterUnifiedAd_androidKt$AdsterUnifiedAdContent$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AdsterSdkInitializer $adsterSdkInitializer;
    final /* synthetic */ UnifiedAdDebugFixtureSelection $debugFixtureSelection;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsterUnifiedAd_androidKt$AdsterUnifiedAdContent$1$1(UnifiedAdDebugFixtureSelection unifiedAdDebugFixtureSelection, AdsterSdkInitializer adsterSdkInitializer, Continuation continuation) {
        super(2, continuation);
        this.$debugFixtureSelection = unifiedAdDebugFixtureSelection;
        this.$adsterSdkInitializer = adsterSdkInitializer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AdsterUnifiedAd_androidKt$AdsterUnifiedAdContent$1$1(this.$debugFixtureSelection, this.$adsterSdkInitializer, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        AdsterUnifiedAd_androidKt$AdsterUnifiedAdContent$1$1 adsterUnifiedAd_androidKt$AdsterUnifiedAdContent$1$1 = (AdsterUnifiedAd_androidKt$AdsterUnifiedAdContent$1$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        adsterUnifiedAd_androidKt$AdsterUnifiedAdContent$1$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        if (this.$debugFixtureSelection instanceof UnifiedAdDebugFixtureSelection.Off) {
            this.$adsterSdkInitializer.a();
        }
        return Unit.f17538a;
    }
}
