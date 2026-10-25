package app.chalo.metro.ui.regular.uistate;

import com.google.android.gms.wallet.WalletConstants;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.metro.ui.regular.uistate.StopBasedMetroLandingUiStateFactory", f = "StopBasedMetroLandingUiStateFactory.kt", l = {366, 381, 395, WalletConstants.ERROR_CODE_AUTHENTICATION_FAILURE, 427}, m = "getBenefitContainerUIState", v = 1)
final class StopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StopBasedMetroLandingUiStateFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1(StopBasedMetroLandingUiStateFactory stopBasedMetroLandingUiStateFactory, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = stopBasedMetroLandingUiStateFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
