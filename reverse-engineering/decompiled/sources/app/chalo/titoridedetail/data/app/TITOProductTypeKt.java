package app.chalo.titoridedetail.data.app;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TITOProductTypeKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9671a;

        static {
            int[] iArr = new int[TITOProductType.values().length];
            try {
                iArr[TITOProductType.SUPER_PASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TITOProductType.SINGLE_JOURNEY_TICKET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TITOProductType.QUICK_PAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TITOProductType.INSTANT_TICKET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f9671a = iArr;
        }
    }

    public static final String a(TITOProductType tITOProductType) {
        int i = WhenMappings.f9671a[tITOProductType.ordinal()];
        if (i == 1) {
            return "superPass";
        }
        if (i == 2) {
            return "singleJourneyTicket";
        }
        if (i == 3) {
            return "quickpay";
        }
        if (i == 4) {
            return "mobileTicket";
        }
        throw new NoWhenBranchMatchedException();
    }
}
