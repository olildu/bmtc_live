package app.chalo.home.ui.regularbus;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RegularBusUnifiedAdUiStateKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3636a;

        static {
            int[] iArr = new int[RegularBusPageSectionDisplayType.values().length];
            try {
                iArr[RegularBusPageSectionDisplayType.PLOTLINE_WIDGET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RegularBusPageSectionDisplayType.NEARBY_BUS_STOPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RegularBusPageSectionDisplayType.GAM_BANNER_AD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RegularBusPageSectionDisplayType.REGULAR_BUS_UNIFIED_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RegularBusPageSectionDisplayType.DIVIDER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f3636a = iArr;
        }
    }

    public static final boolean a(RegularBusPageDisplayItemData regularBusPageDisplayItemData, Map shouldShowUnifiedAdDividerMap) {
        Intrinsics.i(shouldShowUnifiedAdDividerMap, "shouldShowUnifiedAdDividerMap");
        if ((regularBusPageDisplayItemData != null ? regularBusPageDisplayItemData.h : null) != RegularBusPageSectionDisplayType.REGULAR_BUS_UNIFIED_AD) {
            return false;
        }
        String str = regularBusPageDisplayItemData.s;
        if (str == null) {
            str = "";
        }
        return Intrinsics.d(shouldShowUnifiedAdDividerMap.get(str), Boolean.TRUE);
    }
}
