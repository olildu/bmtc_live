package app.chalo.ncmc.ui.entercarddetails;

import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ncmc.ui.entercarddetails.EnterCardDetailsMainScreenKt$EnterCardDetailsMainScreen$1$1", f = "EnterCardDetailsMainScreen.kt", l = {41}, m = "invokeSuspend", v = 1)
final class EnterCardDetailsMainScreenKt$EnterCardDetailsMainScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ EnterCardDetailsComponent $component;
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ SoftwareKeyboardController $keyboardController;
    final /* synthetic */ FocusRequester $reEnterCardFocusRequester;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterCardDetailsMainScreenKt$EnterCardDetailsMainScreen$1$1(EnterCardDetailsComponent enterCardDetailsComponent, SoftwareKeyboardController softwareKeyboardController, CoroutineScope coroutineScope, FocusRequester focusRequester, Continuation continuation) {
        super(2, continuation);
        this.$component = enterCardDetailsComponent;
        this.$keyboardController = softwareKeyboardController;
        this.$coroutineScope = coroutineScope;
        this.$reEnterCardFocusRequester = focusRequester;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EnterCardDetailsMainScreenKt$EnterCardDetailsMainScreen$1$1(this.$component, this.$keyboardController, this.$coroutineScope, this.$reEnterCardFocusRequester, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((EnterCardDetailsMainScreenKt$EnterCardDetailsMainScreen$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flowS0 = this.$component.s0();
            final SoftwareKeyboardController softwareKeyboardController = this.$keyboardController;
            final CoroutineScope coroutineScope = this.$coroutineScope;
            final FocusRequester focusRequester = this.$reEnterCardFocusRequester;
            FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.ncmc.ui.entercarddetails.EnterCardDetailsMainScreenKt$EnterCardDetailsMainScreen$1$1.1

                /* JADX INFO: renamed from: app.chalo.ncmc.ui.entercarddetails.EnterCardDetailsMainScreenKt$EnterCardDetailsMainScreen$1$1$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.ncmc.ui.entercarddetails.EnterCardDetailsMainScreenKt$EnterCardDetailsMainScreen$1$1$1$1", f = "EnterCardDetailsMainScreen.kt", l = {ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX}, m = "invokeSuspend", v = 1)
                final class C01281 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ FocusRequester $reEnterCardFocusRequester;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C01281(FocusRequester focusRequester, Continuation continuation) {
                        super(2, continuation);
                        this.$reEnterCardFocusRequester = focusRequester;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        return new C01281(this.$reEnterCardFocusRequester, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ((C01281) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.b(obj);
                            this.label = 1;
                            if (DelayKt.b(100L, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.b(obj);
                        }
                        FocusRequester.m4269requestFocus3ESFkO8$default(this.$reEnterCardFocusRequester, 0, 1, null);
                        return Unit.f17538a;
                    }
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    EnterCardDetailsSideEffect enterCardDetailsSideEffect = (EnterCardDetailsSideEffect) obj2;
                    if (Intrinsics.d(enterCardDetailsSideEffect, EnterCardDetailsSideEffect.HideKeyboard.f6335a)) {
                        SoftwareKeyboardController softwareKeyboardController2 = softwareKeyboardController;
                        if (softwareKeyboardController2 != null) {
                            softwareKeyboardController2.hide();
                        }
                    } else {
                        if (!Intrinsics.d(enterCardDetailsSideEffect, EnterCardDetailsSideEffect.FocusOnReEnterEnterCardNumberField.f6334a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        BuildersKt.d(coroutineScope, null, null, new C01281(focusRequester, null), 3);
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
