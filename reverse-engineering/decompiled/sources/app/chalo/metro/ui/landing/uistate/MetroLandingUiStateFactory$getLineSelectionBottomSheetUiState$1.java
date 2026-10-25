package app.chalo.metro.ui.landing.uistate;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.metro.ui.landing.uistate.MetroLandingUiStateFactory", f = "MetroLandingUiStateFactory.kt", l = {140, 170}, m = "getLineSelectionBottomSheetUiState", v = 1)
final class MetroLandingUiStateFactory$getLineSelectionBottomSheetUiState$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MetroLandingUiStateFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetroLandingUiStateFactory$getLineSelectionBottomSheetUiState$1(MetroLandingUiStateFactory metroLandingUiStateFactory, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = metroLandingUiStateFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, null, this);
    }
}
