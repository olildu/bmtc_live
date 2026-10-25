package app.chalo.livetracking.ui.routedetailsscreen;

import app.chalo.providers.stringprovider.StringEnum;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RouteDetailsDataStateKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4835a;

        static {
            int[] iArr = new int[RouteFavouriteActionType.values().length];
            try {
                iArr[RouteFavouriteActionType.ADDITION_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RouteFavouriteActionType.REMOVAL_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f4835a = iArr;
        }
    }

    public static final StringEnum a(RouteFavouriteActionType routeFavouriteActionType) {
        Intrinsics.i(routeFavouriteActionType, "<this>");
        int i = WhenMappings.f4835a[routeFavouriteActionType.ordinal()];
        if (i == 1) {
            return StringEnum.FAV_ADDED;
        }
        if (i == 2) {
            return StringEnum.FAV_REMOVED;
        }
        throw new NoWhenBranchMatchedException();
    }
}
