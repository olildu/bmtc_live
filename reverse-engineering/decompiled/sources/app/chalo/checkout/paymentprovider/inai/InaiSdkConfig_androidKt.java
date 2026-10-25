package app.chalo.checkout.paymentprovider.inai;

import io.inai.android_sdk.InaiExecuteStatus;
import io.inai.android_sdk.InaiPaymentStatus;
import io.inai.android_sdk.InaiValidateFieldsStatus;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"checkout_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class InaiSdkConfig_androidKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1410a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[InaiValidateFieldsStatus.values().length];
            try {
                iArr[InaiValidateFieldsStatus.Success.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InaiValidateFieldsStatus.Failed.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[InaiExecuteStatus.values().length];
            try {
                iArr2[InaiExecuteStatus.Success.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[InaiExecuteStatus.Failed.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[InaiExecuteStatus.Canceled.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f1410a = iArr2;
            int[] iArr3 = new int[InaiPaymentStatus.values().length];
            try {
                iArr3[InaiPaymentStatus.Success.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[InaiPaymentStatus.Failed.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[InaiPaymentStatus.Canceled.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            b = iArr3;
        }
    }
}
