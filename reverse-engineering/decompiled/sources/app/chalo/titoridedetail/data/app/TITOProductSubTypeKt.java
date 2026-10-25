package app.chalo.titoridedetail.data.app;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TITOProductSubTypeKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9670a;

        static {
            int[] iArr = new int[TITOProductSubType.values().length];
            try {
                iArr[TITOProductSubType.SINGLE_JOURNEY_TICKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TITOProductSubType.RIDE_BASED_PASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TITOProductSubType.MAGIC_PASS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TITOProductSubType.QUICK_PAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TITOProductSubType.INSTANT_TICKET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f9670a = iArr;
        }
    }

    public static final String a(TITOProductSubType tITOProductSubType) {
        int i = WhenMappings.f9670a[tITOProductSubType.ordinal()];
        if (i == 1) {
            return "singleJourneyTicket";
        }
        if (i == 2) {
            return "rideBasedPass";
        }
        if (i == 3) {
            return "magicPass";
        }
        if (i == 4) {
            return "quickpay";
        }
        if (i == 5) {
            return "instantTicket";
        }
        throw new NoWhenBranchMatchedException();
    }
}
