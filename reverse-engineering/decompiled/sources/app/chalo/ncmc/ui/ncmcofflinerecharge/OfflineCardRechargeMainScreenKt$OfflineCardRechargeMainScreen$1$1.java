package app.chalo.ncmc.ui.ncmcofflinerecharge;

import androidx.compose.ui.platform.SoftwareKeyboardController;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeMainScreenKt$OfflineCardRechargeMainScreen$1$1", f = "OfflineCardRechargeMainScreen.kt", l = {44}, m = "invokeSuspend", v = 1)
final class OfflineCardRechargeMainScreenKt$OfflineCardRechargeMainScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OfflineCardRechargeComponent $component;
    final /* synthetic */ SoftwareKeyboardController $keyboardController;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfflineCardRechargeMainScreenKt$OfflineCardRechargeMainScreen$1$1(OfflineCardRechargeComponent offlineCardRechargeComponent, SoftwareKeyboardController softwareKeyboardController, Continuation continuation) {
        super(2, continuation);
        this.$component = offlineCardRechargeComponent;
        this.$keyboardController = softwareKeyboardController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OfflineCardRechargeMainScreenKt$OfflineCardRechargeMainScreen$1$1(this.$component, this.$keyboardController, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((OfflineCardRechargeMainScreenKt$OfflineCardRechargeMainScreen$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flowS0 = this.$component.s0();
            final SoftwareKeyboardController softwareKeyboardController = this.$keyboardController;
            FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeMainScreenKt$OfflineCardRechargeMainScreen$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    if (!Intrinsics.d((OfflineCardRechargeSideEffect) obj2, OfflineCardRechargeSideEffect.HideKeyboard.f6398a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    SoftwareKeyboardController softwareKeyboardController2 = softwareKeyboardController;
                    if (softwareKeyboardController2 != null) {
                        softwareKeyboardController2.hide();
                    }
                    return Unit.f17538a;
                }
            };
            this.label = 1;
            if (flowS0.collect(flowCollector, this) == coroutineSingletons) {
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
