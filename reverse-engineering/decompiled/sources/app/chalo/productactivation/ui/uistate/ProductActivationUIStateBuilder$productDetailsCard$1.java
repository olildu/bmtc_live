package app.chalo.productactivation.ui.uistate;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.wallet.WalletConstants;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productactivation.ui.uistate.ProductActivationUIStateBuilder", f = "ProductActivationUIStateBuilder.kt", l = {348, 351, 353, 359, 364, 370, 385, 386, 387, WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION, 439, 450, 451, 474, 496, TypedValues.PositionType.TYPE_DRAWPATH, 512, 526, 542, 559, 562, 564, 567, 575, 576, 594, TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_TYPE, 623, 627, 632, 634, 655, 672, 676, 697, 714, 718, 742, 759, 763, 771, 775, 791, 794, 796, 802, 805, 845, 864, 868, 877, 889, 899, TypedValues.Custom.TYPE_STRING}, m = "productDetailsCard", v = 1)
final class ProductActivationUIStateBuilder$productDetailsCard$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ProductActivationUIStateBuilder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductActivationUIStateBuilder$productDetailsCard$1(ProductActivationUIStateBuilder productActivationUIStateBuilder, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = productActivationUIStateBuilder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A(null, null, null, null, false, null, this);
    }
}
