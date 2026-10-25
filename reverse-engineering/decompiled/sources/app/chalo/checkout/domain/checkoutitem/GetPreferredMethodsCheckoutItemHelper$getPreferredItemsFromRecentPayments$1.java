package app.chalo.checkout.domain.checkoutitem;

import androidx.media3.extractor.ts.TsExtractor;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.checkout.domain.checkoutitem.GetPreferredMethodsCheckoutItemHelper", f = "GetPreferredMethodsCheckoutItemHelper.kt", l = {67, 72, EACTags.INTEGRATED_CIRCUIT_MANUFACTURER_ID, 83, TsExtractor.TS_STREAM_TYPE_DVBSUBS, 95, 101, 107}, m = "getPreferredItemsFromRecentPayments", v = 1)
final class GetPreferredMethodsCheckoutItemHelper$getPreferredItemsFromRecentPayments$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetPreferredMethodsCheckoutItemHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPreferredMethodsCheckoutItemHelper$getPreferredItemsFromRecentPayments$1(GetPreferredMethodsCheckoutItemHelper getPreferredMethodsCheckoutItemHelper, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = getPreferredMethodsCheckoutItemHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, null, null, this);
    }
}
