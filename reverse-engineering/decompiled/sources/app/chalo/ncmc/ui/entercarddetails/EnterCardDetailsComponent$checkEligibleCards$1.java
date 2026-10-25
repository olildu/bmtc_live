package app.chalo.ncmc.ui.entercarddetails;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ncmc.ui.entercarddetails.EnterCardDetailsComponent", f = "EnterCardDetailsComponent.kt", l = {394}, m = "checkEligibleCards", v = 1)
final class EnterCardDetailsComponent$checkEligibleCards$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ EnterCardDetailsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterCardDetailsComponent$checkEligibleCards$1(EnterCardDetailsComponent enterCardDetailsComponent, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = enterCardDetailsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return EnterCardDetailsComponent.F0(this.this$0, this);
    }
}
