package app.chalo.checkout.paymentprovider.razorpay;

import android.app.Activity;
import com.razorpay.Razorpay;
import defpackage.qv0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/checkout/paymentprovider/razorpay/RazorpaySdk;", "", "Companion", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RazorpaySdk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f1427a;
    public final Lazy b = LazyKt.b(new qv0(this, 11));
    public final MutableStateFlow c = StateFlowKt.a(Unit.f17538a);

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lapp/chalo/checkout/paymentprovider/razorpay/RazorpaySdk$Companion;", "", "", "VALIDATION_ERROR_KEY", "Ljava/lang/String;", "VALIDATION_ERROR_DESCRIPTION_KEY", "VPA_VALIDATION_SUCCESS_KEY", "VPA_VALIDATION_ERROR_KEY", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public RazorpaySdk(Activity activity) {
        this.f1427a = activity;
    }

    public final Razorpay a() {
        return (Razorpay) this.b.getValue();
    }
}
