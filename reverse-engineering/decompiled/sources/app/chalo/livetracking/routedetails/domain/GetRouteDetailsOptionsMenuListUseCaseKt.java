package app.chalo.livetracking.routedetails.domain;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class GetRouteDetailsOptionsMenuListUseCaseKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4435a;

        static {
            int[] iArr = new int[RouteDetailsOptionsMenu.values().length];
            try {
                iArr[RouteDetailsOptionsMenu.ViewTimeTable.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RouteDetailsOptionsMenu.AddFavorite.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RouteDetailsOptionsMenu.RemoveFavorite.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RouteDetailsOptionsMenu.SearchStop.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RouteDetailsOptionsMenu.CheckIn.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f4435a = iArr;
        }
    }
}
