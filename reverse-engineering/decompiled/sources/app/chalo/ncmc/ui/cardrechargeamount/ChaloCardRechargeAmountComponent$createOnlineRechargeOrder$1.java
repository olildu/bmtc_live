package app.chalo.ncmc.ui.cardrechargeamount;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountComponent", f = "ChaloCardRechargeAmountComponent.kt", l = {342, 359}, m = "createOnlineRechargeOrder", v = 1)
final class ChaloCardRechargeAmountComponent$createOnlineRechargeOrder$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChaloCardRechargeAmountComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloCardRechargeAmountComponent$createOnlineRechargeOrder$1(ChaloCardRechargeAmountComponent chaloCardRechargeAmountComponent, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = chaloCardRechargeAmountComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ChaloCardRechargeAmountComponent.F0(this.this$0, this);
    }
}
