package app.chalo.premiumbus.ui.slotselection;

import app.chalo.premiumbus.data.models.app.PremiumBusBookingAvailableOptionType;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusPurchaseOptionUiModelKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7852a;

        static {
            int[] iArr = new int[PremiumBusBookingAvailableOptionType.values().length];
            try {
                iArr[PremiumBusBookingAvailableOptionType.SUPER_PASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PremiumBusBookingAvailableOptionType.OTHERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PremiumBusBookingAvailableOptionType.CUSTOMER_SUPPORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f7852a = iArr;
        }
    }
}
