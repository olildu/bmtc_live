package app.chalo.productsummary.ui.domain;

import androidx.media3.extractor.ts.TsExtractor;
import com.google.android.gms.wallet.WalletConstants;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productsummary.ui.domain.GetProductStatusUIForSummaryScreen", f = "GetProductStatusUIForSummaryScreen.kt", l = {51, 60, 64, 91, 107, 122, 131, TsExtractor.TS_STREAM_TYPE_DTS_HD, 165, 170, 196, 213, 218, 359, 364, 394, WalletConstants.ERROR_CODE_INVALID_TRANSACTION, WalletConstants.ERROR_CODE_APP_LABEL_UNAVAILABLE, 525, 530, 556, 573, 578, 689, 694, 720, 737, 742, 763, 835, 854, 859, 885, 986, 991, 1017, 1118, 1135, 1140, 1236, 1253, 1270, 1285, 1303, 1388, 1393, 1419, 1436, 1441, 1535, 1553, 1573, 1578, 1596, 1605, 1610}, m = "invoke", v = 1)
final class GetProductStatusUIForSummaryScreen$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetProductStatusUIForSummaryScreen this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetProductStatusUIForSummaryScreen$invoke$1(GetProductStatusUIForSummaryScreen getProductStatusUIForSummaryScreen, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = getProductStatusUIForSummaryScreen;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(null, null, null, this);
    }
}
