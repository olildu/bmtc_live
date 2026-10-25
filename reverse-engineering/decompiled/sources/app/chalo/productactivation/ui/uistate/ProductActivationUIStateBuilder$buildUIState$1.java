package app.chalo.productactivation.ui.uistate;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productactivation.ui.uistate.ProductActivationUIStateBuilder", f = "ProductActivationUIStateBuilder.kt", l = {102, FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION, 119, WebSocketProtocol.PAYLOAD_SHORT, 140}, m = "buildUIState", v = 1)
final class ProductActivationUIStateBuilder$buildUIState$1 extends ContinuationImpl {
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
    final /* synthetic */ ProductActivationUIStateBuilder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductActivationUIStateBuilder$buildUIState$1(ProductActivationUIStateBuilder productActivationUIStateBuilder, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = productActivationUIStateBuilder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, this);
    }
}
