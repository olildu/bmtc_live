package app.chalo.nearbytrips.ui.mapscreen;

import android.content.Context;
import app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapMarkerIconHelper;
import app.chalo.home.nearbytrips.ui.mapscreen.ZoomLevel;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/nearbytrips/ui/mapscreen/NearbyStopsMapMarkerIconHelperAndroid;", "Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapMarkerIconHelper;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NearbyStopsMapMarkerIconHelperAndroid implements NearbyStopsMapMarkerIconHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6450a;
    public final CoroutineContextProvider b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6451a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[ZoomLevel.values().length];
            try {
                iArr[ZoomLevel.ZOOMED_OUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ZoomLevel.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ZoomLevel.ZOOMED_IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f6451a = iArr;
            int[] iArr2 = new int[ChaloTransitMode.values().length];
            try {
                iArr2[ChaloTransitMode.BUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ChaloTransitMode.TRAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ChaloTransitMode.METRO.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ChaloTransitMode.MONORAIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ChaloTransitMode.FERRY.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ChaloTransitMode.CAB.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[ChaloTransitMode.ALL.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[ChaloTransitMode.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            b = iArr2;
        }
    }

    public NearbyStopsMapMarkerIconHelperAndroid(Context context, CoroutineContextProvider coroutineContextProvider) {
        Intrinsics.i(coroutineContextProvider, "coroutineContextProvider");
        this.f6450a = context;
        this.b = coroutineContextProvider;
    }

    @Override // app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapMarkerIconHelper
    public final Object a(boolean z, ChaloTransitMode chaloTransitMode, float f, String str, Continuation continuation) {
        return BuildersKt.g(this.b.a(), new NearbyStopsMapMarkerIconHelperAndroid$getNearbyStopMarker$2(this, z, chaloTransitMode, f, str, null), continuation);
    }
}
