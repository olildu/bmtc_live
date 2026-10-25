package app.chalo.homescreen.data.model.app;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BottomNavTabAppModelKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3718a;

        static {
            int[] iArr = new int[BottomNavTabType.values().length];
            try {
                iArr[BottomNavTabType.HOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BottomNavTabType.REGULAR_BUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BottomNavTabType.CHALO_BUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BottomNavTabType.MY_TICKETS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BottomNavTabType.SEARCH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BottomNavTabType.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f3718a = iArr;
        }
    }

    public static final BottomNavTabType a(NavigationTabAppModel navigationTabAppModel) {
        Intrinsics.i(navigationTabAppModel, "<this>");
        if (navigationTabAppModel instanceof NavigationTabAppModel.ChaloBusTab) {
            return ((NavigationTabAppModel.ChaloBusTab) navigationTabAppModel).d.d;
        }
        if (navigationTabAppModel instanceof NavigationTabAppModel.HomeTab) {
            return ((NavigationTabAppModel.HomeTab) navigationTabAppModel).d.d;
        }
        if (navigationTabAppModel instanceof NavigationTabAppModel.MyTicketsTab) {
            return ((NavigationTabAppModel.MyTicketsTab) navigationTabAppModel).d.d;
        }
        if (navigationTabAppModel instanceof NavigationTabAppModel.RegularBusTab) {
            return ((NavigationTabAppModel.RegularBusTab) navigationTabAppModel).d.d;
        }
        if (navigationTabAppModel instanceof NavigationTabAppModel.SearchTab) {
            return ((NavigationTabAppModel.SearchTab) navigationTabAppModel).c.d;
        }
        throw new NoWhenBranchMatchedException();
    }
}
