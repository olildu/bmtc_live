package app.chalo.features.productsync.model.api;

import app.chalo.features.productsync.constants.SuperPassStatus;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BookingHistoryDataApiModelKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2747a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[PassType.values().length];
            try {
                iArr[PassType.BOOKED_PASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PassType.PASS_APPLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PassType.PENDING_SUPER_PASS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PassType.UNKNOWN_OR_INVALID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f2747a = iArr;
            int[] iArr2 = new int[SuperPassStatus.values().length];
            try {
                iArr2[SuperPassStatus.PAYMENT_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[SuperPassStatus.PAYMENT_PROCESSING.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[SuperPassStatus.UNUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[SuperPassStatus.USED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[SuperPassStatus.EXPIRED.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[SuperPassStatus.INACTIVE.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[SuperPassStatus.CANCELLED.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[SuperPassStatus.FAILED.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            b = iArr2;
        }
    }
}
