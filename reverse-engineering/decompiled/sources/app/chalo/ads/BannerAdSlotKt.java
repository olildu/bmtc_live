package app.chalo.ads;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BannerAdSlotKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f750a;

        static {
            int[] iArr = new int[BannerAdSlot.values().length];
            try {
                iArr[BannerAdSlot.HOME_SCREEN_INLINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BannerAdSlot.REGULAR_BUS_SCREEN_INLINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f750a = iArr;
        }
    }

    public static final String a(BannerAdSlot bannerAdSlot) {
        Intrinsics.i(bannerAdSlot, "<this>");
        int i = WhenMappings.f750a[bannerAdSlot.ordinal()];
        if (i == 1) {
            return "home screen";
        }
        if (i == 2) {
            return "regular bus screen";
        }
        throw new NoWhenBranchMatchedException();
    }
}
