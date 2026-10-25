package app.chalo.walletframework.chalopay;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.walletframework.chalopay.ChaloPayManagerImpl", f = "ChaloPayManagerImpl.kt", l = {EACTags.HISTORICAL_BYTES, 84, 104, 114}, m = "fetchChaloPayWalletStateInternal", v = 1)
final class ChaloPayManagerImpl$fetchChaloPayWalletStateInternal$1 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    boolean Z$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChaloPayManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloPayManagerImpl$fetchChaloPayWalletStateInternal$1(ChaloPayManagerImpl chaloPayManagerImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = chaloPayManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.g(false, false, false, null, this);
    }
}
