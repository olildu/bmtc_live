package app.chalo.compose.components.chalomap.iconprovider;

import app.chalo.compose.components.chalomap.LiveBusDelayedState;
import app.chalo.providers.iconassetprovider.IconType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/compose/components/chalomap/iconprovider/ChaloMapMarkerIconProviderImpl;", "Lapp/chalo/compose/components/chalomap/iconprovider/ChaloMapMarkerIconProvider;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloMapMarkerIconProviderImpl implements ChaloMapMarkerIconProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloMapLiveBusMarkerHelper f1886a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1887a;

        static {
            int[] iArr = new int[ChaloMapMarkerType.values().length];
            try {
                iArr[ChaloMapMarkerType.START_STOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChaloMapMarkerType.END_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChaloMapMarkerType.STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ChaloMapMarkerType.BUS_INTERMEDIATE_STOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ChaloMapMarkerType.METRO_INTERMEDIATE_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ChaloMapMarkerType.STOP_SELECTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ChaloMapMarkerType.STOP_DISABLED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ChaloMapMarkerType.PREMIUM_BUS_PICKUP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ChaloMapMarkerType.PREMIUM_BUS_DROP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ChaloMapMarkerType.BUS_START_STOP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ChaloMapMarkerType.AUTO_START_STOP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ChaloMapMarkerType.WALK_START_STOP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ChaloMapMarkerType.TAXI_START_STOP.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ChaloMapMarkerType.FERRY_START_STOP.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ChaloMapMarkerType.METRO_START_STOP.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ChaloMapMarkerType.MONORAIL_START_STOP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ChaloMapMarkerType.RAILWAY_START_STOP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[ChaloMapMarkerType.TRAFFIC_SIGNAL.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            f1887a = iArr;
        }
    }

    public ChaloMapMarkerIconProviderImpl(ChaloMapLiveBusMarkerHelper chaloMapLiveBusMarkerHelper) {
        this.f1886a = chaloMapLiveBusMarkerHelper;
    }

    @Override // app.chalo.compose.components.chalomap.iconprovider.ChaloMapMarkerIconProvider
    public final Object a(float f, LiveBusDelayedState liveBusDelayedState, boolean z, boolean z2, ContinuationImpl continuationImpl) {
        return this.f1886a.a(f, liveBusDelayedState, z, z2, continuationImpl);
    }

    @Override // app.chalo.compose.components.chalomap.iconprovider.ChaloMapMarkerIconProvider
    public final IconType b(ChaloMapMarkerType markerType) {
        Intrinsics.i(markerType, "markerType");
        switch (WhenMappings.f1887a[markerType.ordinal()]) {
            case 1:
                return IconType.START;
            case 2:
                return IconType.END;
            case 3:
            case 4:
            case 5:
                return IconType.STOP_MARKER_ROUTE_DETAILS;
            case 6:
                return IconType.BUS_NEARBY_SELECTED;
            case 7:
                return IconType.STOP_MARKER_ROUTE_DETAILS_DISABLED;
            case 8:
                return IconType.BUS_NEARBY_SELECTED;
            case 9:
                return IconType.BUS_NEARBY_SELECTED;
            case 10:
                return IconType.BUS_NEARBY;
            case 11:
                return IconType.AUTO_NEARBY;
            case 12:
                return IconType.WALK_NEARBY;
            case 13:
                return IconType.CAB_NEARBY;
            case 14:
                return IconType.FERRY_NEARBY_SELECTED;
            case 15:
                return IconType.METRO_NEARBY;
            case 16:
                return IconType.MONORAIL_NEARBY;
            case 17:
                return IconType.TRAIN_NEARBY;
            case 18:
                return IconType.TRAFFIC_SIGNAL;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
