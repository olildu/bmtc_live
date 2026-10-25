package app.chalo.livetracking.routedetails.data.model.ui;

import app.chalo.compose.components.chalomap.MapCameraUpdate;
import app.chalo.compose.components.chalomap.MapCameraViewState;
import app.chalo.livetracking.ui.routedetailsscreen.routemap.RouteDetailsMapStopMarkerInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RouteDetailsMapUiModelKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4409a;

        static {
            int[] iArr = new int[MarkerStopType.values().length];
            try {
                iArr[MarkerStopType.FirstStop.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MarkerStopType.LastStop.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MarkerStopType.IntermediateStop.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MarkerStopType.CurrentSelectedStopInStopList.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MarkerStopType.DisabledStop.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MarkerStopType.PremiumBusPickupStop.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[MarkerStopType.PremiumBusDropStop.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[MarkerStopType.BoardingStop.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[MarkerStopType.DeboardingStop.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f4409a = iArr;
        }
    }

    public static final ArrayList a(List list, StopEtaStatus etaStatus, StopEtaUiModel etaModel) {
        StopEtaStatus stopEtaStatus;
        StopEtaUiModel stopEtaUiModel;
        Intrinsics.i(list, "<this>");
        Intrinsics.i(etaStatus, "etaStatus");
        Intrinsics.i(etaModel, "etaModel");
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            RouteDetailsMapStopMarkerInfo routeDetailsMapStopMarkerInfoA = (RouteDetailsMapStopMarkerInfo) obj;
            if (routeDetailsMapStopMarkerInfoA.h) {
                stopEtaStatus = etaStatus;
                stopEtaUiModel = etaModel;
                routeDetailsMapStopMarkerInfoA = RouteDetailsMapStopMarkerInfo.a(routeDetailsMapStopMarkerInfoA, stopEtaStatus, stopEtaUiModel, null, false, 2035);
            } else {
                stopEtaStatus = etaStatus;
                stopEtaUiModel = etaModel;
            }
            arrayList.add(routeDetailsMapStopMarkerInfoA);
            i = i2;
            etaStatus = stopEtaStatus;
            etaModel = stopEtaUiModel;
        }
        return arrayList;
    }

    public static final RouteDetailsMapUiModel b(RouteDetailsMapUiModel routeDetailsMapUiModel, MapCameraUpdate mapCameraUpdate) {
        return mapCameraUpdate != null ? RouteDetailsMapUiModel.a(routeDetailsMapUiModel, null, false, new MapCameraViewState.InitialState.CustomCameraUpdate(mapCameraUpdate), 3) : routeDetailsMapUiModel;
    }
}
