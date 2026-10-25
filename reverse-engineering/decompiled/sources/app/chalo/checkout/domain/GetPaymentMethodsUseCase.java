package app.chalo.checkout.domain;

import app.chalo.checkout.analytics.ICheckoutAnalyticsHelper;
import app.chalo.checkout.data.repository.ICheckoutRepository;
import app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver;
import app.chalo.checkout.data.resolver.product.ICheckoutProductDataResolver;
import app.chalo.models.CheckoutPaymentProvider;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/domain/GetPaymentMethodsUseCase;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetPaymentMethodsUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ICheckoutRepository f1377a;
    public final CheckoutPaymentDataResolver b;
    public final ICheckoutProductDataResolver c;
    public final ConvertPaymentMethodsApiToAppModelForRazorpayUseCase d;
    public final ConvertPaymentMethodsApiModelToAppModelForInaiUseCase e;
    public final ConvertPaymentMethodsApiToAppModelForPhonePeUseCase f;
    public final ICheckoutAnalyticsHelper g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1378a;

        static {
            int[] iArr = new int[CheckoutPaymentProvider.values().length];
            try {
                iArr[CheckoutPaymentProvider.RAZORPAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CheckoutPaymentProvider.INAI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CheckoutPaymentProvider.PHONEPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CheckoutPaymentProvider.CHALOPAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CheckoutPaymentProvider.CLDW.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CheckoutPaymentProvider.YES_BANK.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CheckoutPaymentProvider.CUSTOM_URL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CheckoutPaymentProvider.NO_PAYMENT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CheckoutPaymentProvider.UNKNOWN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f1378a = iArr;
        }
    }

    public GetPaymentMethodsUseCase(ICheckoutRepository iCheckoutRepository, CheckoutPaymentDataResolver checkoutPaymentDataResolver, ICheckoutProductDataResolver iCheckoutProductDataResolver, ConvertPaymentMethodsApiToAppModelForRazorpayUseCase convertPaymentMethodsApiToAppModelForRazorpayUseCase, ConvertPaymentMethodsApiModelToAppModelForInaiUseCase convertPaymentMethodsApiModelToAppModelForInaiUseCase, ConvertPaymentMethodsApiToAppModelForPhonePeUseCase convertPaymentMethodsApiToAppModelForPhonePeUseCase, ICheckoutAnalyticsHelper iCheckoutAnalyticsHelper) {
        this.f1377a = iCheckoutRepository;
        this.b = checkoutPaymentDataResolver;
        this.c = iCheckoutProductDataResolver;
        this.d = convertPaymentMethodsApiToAppModelForRazorpayUseCase;
        this.e = convertPaymentMethodsApiModelToAppModelForInaiUseCase;
        this.f = convertPaymentMethodsApiToAppModelForPhonePeUseCase;
        this.g = iCheckoutAnalyticsHelper;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x011d A[Catch: Exception -> 0x0032, TryCatch #0 {Exception -> 0x0032, blocks: (B:13:0x002d, B:34:0x0104, B:41:0x011d, B:43:0x0123, B:19:0x003d, B:39:0x0119, B:20:0x0042, B:26:0x00a5, B:27:0x00ee, B:28:0x00f1, B:29:0x00f6, B:31:0x00f9, B:35:0x0107, B:36:0x010e, B:23:0x0049), top: B:71:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0123 A[Catch: Exception -> 0x0032, TRY_LEAVE, TryCatch #0 {Exception -> 0x0032, blocks: (B:13:0x002d, B:34:0x0104, B:41:0x011d, B:43:0x0123, B:19:0x003d, B:39:0x0119, B:20:0x0042, B:26:0x00a5, B:27:0x00ee, B:28:0x00f1, B:29:0x00f6, B:31:0x00f9, B:35:0x0107, B:36:0x010e, B:23:0x0049), top: B:71:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0116, code lost:
    
        if (r15 == r1) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r13, java.lang.String r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.checkout.domain.GetPaymentMethodsUseCase.a(java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
