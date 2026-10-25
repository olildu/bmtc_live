package app.chalo.productbooking.pickstop.ui;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusRequester;
import app.chalo.utils.PlatformFeature;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productbooking.pickstop.ui.PickStopScreenKt$PickStopScreen$2$1", f = "PickStopScreen.kt", l = {EACTags.HISTORICAL_BYTES}, m = "invokeSuspend", v = 1)
final class PickStopScreenKt$PickStopScreen$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Boolean> $focusOnSearchField$delegate;
    final /* synthetic */ FocusRequester $focusRequester;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PickStopScreenKt$PickStopScreen$2$1(FocusRequester focusRequester, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$focusRequester = focusRequester;
        this.$focusOnSearchField$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PickStopScreenKt$PickStopScreen$2$1(this.$focusRequester, this.$focusOnSearchField$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        PickStopScreenKt$PickStopScreen$2$1 pickStopScreenKt$PickStopScreen$2$1 = (PickStopScreenKt$PickStopScreen$2$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        pickStopScreenKt$PickStopScreen$2$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            if (this.$focusOnSearchField$delegate.getValue().booleanValue()) {
                float f = PlatformFeature.f10436a;
            }
            return Unit.f17538a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        FocusRequester.m4269requestFocus3ESFkO8$default(this.$focusRequester, 0, 1, null);
        this.$focusOnSearchField$delegate.setValue(Boolean.FALSE);
        return Unit.f17538a;
    }
}
