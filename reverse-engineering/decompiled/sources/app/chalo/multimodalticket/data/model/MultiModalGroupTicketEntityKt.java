package app.chalo.multimodalticket.data.model;

import app.chalo.providers.iconassetprovider.IconType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MultiModalGroupTicketEntityKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5793a;

        static {
            int[] iArr = new int[MultiModalGroupTransportType.values().length];
            try {
                iArr[MultiModalGroupTransportType.BUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MultiModalGroupTransportType.METRO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f5793a = iArr;
        }
    }

    public static final IconType a(MultiModalGroupTransportType multiModalGroupTransportType) {
        Intrinsics.i(multiModalGroupTransportType, "<this>");
        int i = WhenMappings.f5793a[multiModalGroupTransportType.ordinal()];
        if (i == 1) {
            return IconType.IC_BUS_ALMOST_BLACK;
        }
        if (i == 2) {
            return IconType.IC_METRO_ALMOST_BLACK;
        }
        throw new NoWhenBranchMatchedException();
    }
}
