package app.chalo.checkout.domain.razorpay;

import app.chalo.checkout.domain.error.RazorpayVPAValidation;
import app.chalo.checkout.utility.IRazorPayHelper;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/domain/razorpay/ValidateVPAUseCase;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ValidateVPAUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IRazorPayHelper f1401a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1402a;

        static {
            int[] iArr = new int[RazorpayVPAValidation.values().length];
            try {
                iArr[RazorpayVPAValidation.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RazorpayVPAValidation.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RazorpayVPAValidation.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f1402a = iArr;
        }
    }

    public ValidateVPAUseCase(IRazorPayHelper iRazorPayHelper) {
        this.f1401a = iRazorPayHelper;
    }
}
