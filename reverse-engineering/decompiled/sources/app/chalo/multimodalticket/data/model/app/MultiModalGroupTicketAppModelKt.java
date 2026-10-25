package app.chalo.multimodalticket.data.model.app;

import app.chalo.multimodalticket.data.model.MultiModalGroupTicketStatus;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MultiModalGroupTicketAppModelKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5875a;

        static {
            int[] iArr = new int[MultiModalGroupTicketStatus.values().length];
            try {
                iArr[MultiModalGroupTicketStatus.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MultiModalGroupTicketStatus.PAYMENT_PROCESSING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MultiModalGroupTicketStatus.EXPIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MultiModalGroupTicketStatus.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MultiModalGroupTicketStatus.PUNCHED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f5875a = iArr;
        }
    }

    public static final boolean a(MultiModalGroupTicketAppModel multiModalGroupTicketAppModel, long j) {
        Intrinsics.i(multiModalGroupTicketAppModel, "<this>");
        int i = WhenMappings.f5875a[multiModalGroupTicketAppModel.g.ordinal()];
        if (i == 1) {
            return j <= multiModalGroupTicketAppModel.k;
        }
        if (i == 2) {
            return true;
        }
        if (i == 3 || i == 4 || i == 5) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
