package app.chalo.metro.ui.landing.compose;

import androidx.compose.material3.SheetState;
import androidx.media3.extractor.ts.TsExtractor;
import app.chalo.metro.ui.landing.uistate.MetroLandingScreenBottomSheetUiStateType;
import app.chalo.metro.ui.landing.uistate.MetroLandingScreenViewState;
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

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.metro.ui.landing.compose.MetroLandingScreenUIKt$MetroLandingScreenUI$4$1", f = "MetroLandingScreenUI.kt", l = {TsExtractor.TS_STREAM_TYPE_DVBSUBS, 94}, m = "invokeSuspend", v = 1)
final class MetroLandingScreenUIKt$MetroLandingScreenUI$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SheetState $modalBottomSheetState;
    final /* synthetic */ MetroLandingScreenViewState $viewState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetroLandingScreenUIKt$MetroLandingScreenUI$4$1(MetroLandingScreenViewState metroLandingScreenViewState, SheetState sheetState, Continuation continuation) {
        super(2, continuation);
        this.$viewState = metroLandingScreenViewState;
        this.$modalBottomSheetState = sheetState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MetroLandingScreenUIKt$MetroLandingScreenUI$4$1(this.$viewState, this.$modalBottomSheetState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MetroLandingScreenUIKt$MetroLandingScreenUI$4$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0054 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            MetroLandingScreenBottomSheetUiStateType metroLandingScreenBottomSheetUiStateType = this.$viewState.f;
            if (metroLandingScreenBottomSheetUiStateType instanceof MetroLandingScreenBottomSheetUiStateType.LineSelectionBottomSheet) {
                if (this.$modalBottomSheetState.isVisible()) {
                    return unit;
                }
                SheetState sheetState = this.$modalBottomSheetState;
                this.label = 1;
                if (sheetState.show(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (!Intrinsics.d(metroLandingScreenBottomSheetUiStateType, MetroLandingScreenBottomSheetUiStateType.None.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (this.$modalBottomSheetState.isVisible()) {
                    SheetState sheetState2 = this.$modalBottomSheetState;
                    this.label = 2;
                    if (sheetState2.hide(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return unit;
    }
}
