package app.chalo.onboarding.cityselection.ui;

import androidx.compose.runtime.State;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import app.chalo.compose.utils.SafeFocusRequester;
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
@DebugMetadata(c = "app.chalo.onboarding.cityselection.ui.CitySelectionScreenKt$CitySelectionScreen$2$1", f = "CitySelectionScreen.kt", l = {}, m = "invokeSuspend", v = 1)
final class CitySelectionScreenKt$CitySelectionScreen$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SoftwareKeyboardController $keyboardController;
    final /* synthetic */ SafeFocusRequester $safeFocusRequester;
    final /* synthetic */ State<CitySelectionUIState> $viewState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CitySelectionScreenKt$CitySelectionScreen$2$1(SafeFocusRequester safeFocusRequester, SoftwareKeyboardController softwareKeyboardController, State state, Continuation continuation) {
        super(2, continuation);
        this.$safeFocusRequester = safeFocusRequester;
        this.$keyboardController = softwareKeyboardController;
        this.$viewState$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CitySelectionScreenKt$CitySelectionScreen$2$1(this.$safeFocusRequester, this.$keyboardController, this.$viewState$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CitySelectionScreenKt$CitySelectionScreen$2$1 citySelectionScreenKt$CitySelectionScreen$2$1 = (CitySelectionScreenKt$CitySelectionScreen$2$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        citySelectionScreenKt$CitySelectionScreen$2$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        if (CitySelectionScreenKt.i(this.$viewState$delegate.getValue().f)) {
            this.$safeFocusRequester.a();
            SoftwareKeyboardController softwareKeyboardController = this.$keyboardController;
            if (softwareKeyboardController != null) {
                softwareKeyboardController.show();
            }
        } else {
            SoftwareKeyboardController softwareKeyboardController2 = this.$keyboardController;
            if (softwareKeyboardController2 != null) {
                softwareKeyboardController2.hide();
            }
        }
        return Unit.f17538a;
    }
}
