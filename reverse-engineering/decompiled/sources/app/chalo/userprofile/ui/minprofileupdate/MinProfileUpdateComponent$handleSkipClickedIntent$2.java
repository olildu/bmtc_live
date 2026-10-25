package app.chalo.userprofile.ui.minprofileupdate;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.constants.Source;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.LinkedHashMap;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.userprofile.ui.minprofileupdate.MinProfileUpdateComponent$handleSkipClickedIntent$2", f = "MinProfileUpdateComponent.kt", l = {}, m = "invokeSuspend", v = 1)
final class MinProfileUpdateComponent$handleSkipClickedIntent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MinProfileInputState $currentInputState;
    int label;
    final /* synthetic */ MinProfileUpdateComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MinProfileUpdateComponent$handleSkipClickedIntent$2(MinProfileUpdateComponent minProfileUpdateComponent, MinProfileInputState minProfileInputState, Continuation continuation) {
        super(2, continuation);
        this.this$0 = minProfileUpdateComponent;
        this.$currentInputState = minProfileInputState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MinProfileUpdateComponent$handleSkipClickedIntent$2(this.this$0, this.$currentInputState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        MinProfileUpdateComponent$handleSkipClickedIntent$2 minProfileUpdateComponent$handleSkipClickedIntent$2 = (MinProfileUpdateComponent$handleSkipClickedIntent$2) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        minProfileUpdateComponent$handleSkipClickedIntent$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        MinProfileUpdateComponent minProfileUpdateComponent = this.this$0;
        MinProfileInputState minProfileInputState = this.$currentInputState;
        LinkedHashMap linkedHashMapL0 = minProfileUpdateComponent.L0();
        linkedHashMapL0.putAll(MinProfileUpdateContractKt.a(minProfileInputState));
        linkedHashMapL0.put(FirebaseAnalytics.Param.INDEX, Integer.valueOf(((MinProfileUpdateDataState) minProfileUpdateComponent.f.getValue()).d));
        AnalyticsContractImplKt.b(minProfileUpdateComponent.y, "minProfile skip clicked", Source.MIN_PROFILE_UPDATE_SCREEN, linkedHashMapL0, false, 24);
        return Unit.f17538a;
    }
}
