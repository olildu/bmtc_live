package app.chalo.productpurchase.passpurchase.ui.verificationstatus;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productpurchase.passpurchase.ui.verificationstatus.SuperPassVerificationStatusComponent", f = "SuperPassVerificationStatusComponent.kt", l = {149, 151, 153, 210, 237}, m = "convertToUiState", v = 1)
final class SuperPassVerificationStatusComponent$convertToUiState$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SuperPassVerificationStatusComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperPassVerificationStatusComponent$convertToUiState$1(SuperPassVerificationStatusComponent superPassVerificationStatusComponent, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = superPassVerificationStatusComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.p0(null, this);
    }
}
