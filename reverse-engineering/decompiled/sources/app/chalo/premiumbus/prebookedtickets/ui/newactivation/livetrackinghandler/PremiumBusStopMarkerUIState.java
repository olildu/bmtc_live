package app.chalo.premiumbus.prebookedtickets.ui.newactivation.livetrackinghandler;

import app.chalo.compose.components.chalomap.ChaloMapInfoWindowData;
import app.chalo.compose.components.chalomap.ChaloMapMarkerIconType;
import app.chalo.compose.components.chalomap.ChaloMapMarkerInfoWindow;
import app.chalo.compose.components.chalomap.ChaloMapMarkerInfoWindowProvider;
import app.chalo.compose.components.chalomap.ChaloMapMarkerUIEventHandler;
import app.chalo.compose.components.chalomap.ChaloMapMarkerUIState;
import app.chalo.compose.components.chalomap.MapOffset;
import app.chalo.livetracking.provider.tracking.model.StopLiveEtaUiModel;
import app.chalo.location.LatLng;
import app.chalo.providers.iconassetprovider.IconType;
import defpackage.dd;
import defpackage.i71;
import defpackage.nf1;
import defpackage.qv0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/livetrackinghandler/PremiumBusStopMarkerUIState;", "Lapp/chalo/compose/components/chalomap/ChaloMapMarkerUIState;", "PBStopMarkerInfoWindowData", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusStopMarkerUIState implements ChaloMapMarkerUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7409a;
    public final String b;
    public final LatLng c;
    public final StopLiveEtaUiModel d;
    public final boolean e;
    public final IconType f;
    public final PremiumBusStopType g;
    public final ChaloMapMarkerInfoWindowProvider h;
    public final ChaloMapMarkerUIEventHandler i;
    public final Lazy j;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/livetrackinghandler/PremiumBusStopMarkerUIState$PBStopMarkerInfoWindowData;", "Lapp/chalo/compose/components/chalomap/ChaloMapInfoWindowData;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PBStopMarkerInfoWindowData implements ChaloMapInfoWindowData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StopLiveEtaUiModel f7410a;
        public final PremiumBusStopType b;

        public PBStopMarkerInfoWindowData(StopLiveEtaUiModel stopLiveEtaUiModel, PremiumBusStopType premiumBusStopType) {
            Intrinsics.i(premiumBusStopType, "premiumBusStopType");
            this.f7410a = stopLiveEtaUiModel;
            this.b = premiumBusStopType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PBStopMarkerInfoWindowData)) {
                return false;
            }
            PBStopMarkerInfoWindowData pBStopMarkerInfoWindowData = (PBStopMarkerInfoWindowData) obj;
            return Intrinsics.d(this.f7410a, pBStopMarkerInfoWindowData.f7410a) && this.b == pBStopMarkerInfoWindowData.b;
        }

        public final int hashCode() {
            StopLiveEtaUiModel stopLiveEtaUiModel = this.f7410a;
            return this.b.hashCode() + ((stopLiveEtaUiModel == null ? 0 : stopLiveEtaUiModel.hashCode()) * 31);
        }

        public final String toString() {
            return "PBStopMarkerInfoWindowData(etaUiModel=" + this.f7410a + ", premiumBusStopType=" + this.b + ")";
        }
    }

    public PremiumBusStopMarkerUIState(String name, String stopId, LatLng location, StopLiveEtaUiModel stopLiveEtaUiModel, boolean z, IconType markerIcon, PremiumBusStopType premiumBusStopType, ChaloMapMarkerInfoWindowProvider chaloMapMarkerInfoWindowProvider, ChaloMapMarkerUIEventHandler chaloMapMarkerUIEventHandler) {
        Intrinsics.i(name, "name");
        Intrinsics.i(stopId, "stopId");
        Intrinsics.i(location, "location");
        Intrinsics.i(markerIcon, "markerIcon");
        Intrinsics.i(premiumBusStopType, "premiumBusStopType");
        this.f7409a = name;
        this.b = stopId;
        this.c = location;
        this.d = stopLiveEtaUiModel;
        this.e = z;
        this.f = markerIcon;
        this.g = premiumBusStopType;
        this.h = chaloMapMarkerInfoWindowProvider;
        this.i = chaloMapMarkerUIEventHandler;
        this.j = LazyKt.b(new qv0(this, 4));
    }

    public static PremiumBusStopMarkerUIState f(PremiumBusStopMarkerUIState premiumBusStopMarkerUIState, StopLiveEtaUiModel stopLiveEtaUiModel, boolean z, int i) {
        String name = premiumBusStopMarkerUIState.f7409a;
        String stopId = premiumBusStopMarkerUIState.b;
        LatLng location = premiumBusStopMarkerUIState.c;
        if ((i & 8) != 0) {
            stopLiveEtaUiModel = premiumBusStopMarkerUIState.d;
        }
        StopLiveEtaUiModel stopLiveEtaUiModel2 = stopLiveEtaUiModel;
        if ((i & 16) != 0) {
            z = premiumBusStopMarkerUIState.e;
        }
        IconType markerIcon = premiumBusStopMarkerUIState.f;
        PremiumBusStopType premiumBusStopType = premiumBusStopMarkerUIState.g;
        ChaloMapMarkerInfoWindowProvider chaloMapMarkerInfoWindowProvider = premiumBusStopMarkerUIState.h;
        ChaloMapMarkerUIEventHandler chaloMapMarkerUIEventHandler = premiumBusStopMarkerUIState.i;
        Intrinsics.i(name, "name");
        Intrinsics.i(stopId, "stopId");
        Intrinsics.i(location, "location");
        Intrinsics.i(markerIcon, "markerIcon");
        Intrinsics.i(premiumBusStopType, "premiumBusStopType");
        return new PremiumBusStopMarkerUIState(name, stopId, location, stopLiveEtaUiModel2, z, markerIcon, premiumBusStopType, chaloMapMarkerInfoWindowProvider, chaloMapMarkerUIEventHandler);
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: a */
    public final ChaloMapMarkerUIEventHandler getF() {
        return (ChaloMapMarkerUIEventHandler) this.j.getValue();
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    public final ChaloMapMarkerInfoWindow b() {
        return this.h.a(new PBStopMarkerInfoWindowData(this.d, this.g));
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    public final /* bridge */ MapOffset c() {
        return ChaloMapMarkerUIState.DefaultImpls.a();
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    public final MapOffset d() {
        return new MapOffset(0.5f, 1.0f);
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: e */
    public final /* bridge */ boolean getG() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusStopMarkerUIState)) {
            return false;
        }
        PremiumBusStopMarkerUIState premiumBusStopMarkerUIState = (PremiumBusStopMarkerUIState) obj;
        return Intrinsics.d(this.f7409a, premiumBusStopMarkerUIState.f7409a) && Intrinsics.d(this.b, premiumBusStopMarkerUIState.b) && Intrinsics.d(this.c, premiumBusStopMarkerUIState.c) && Intrinsics.d(this.d, premiumBusStopMarkerUIState.d) && this.e == premiumBusStopMarkerUIState.e && this.f == premiumBusStopMarkerUIState.f && this.g == premiumBusStopMarkerUIState.g && Intrinsics.d(this.h, premiumBusStopMarkerUIState.h) && Intrinsics.d(this.i, premiumBusStopMarkerUIState.i);
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    public final ChaloMapMarkerIconType getIcon() {
        return new ChaloMapMarkerIconType.DrawableRes(this.f);
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getB() {
        return this.b;
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: getPosition, reason: from getter */
    public final LatLng getC() {
        return this.c;
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    public final /* bridge */ float getZIndex() {
        return 0.0f;
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((((this.d.hashCode() + i71.d(this.c, nf1.e(this.f7409a.hashCode() * 31, 31, this.b), 31)) * 31) + (this.e ? 1231 : 1237)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PremiumBusStopMarkerUIState(name=", this.f7409a, ", stopId=", this.b, ", location=");
        sbE.append(this.c);
        sbE.append(", etaUiModel=");
        sbE.append(this.d);
        sbE.append(", isSelectedToShowEta=");
        sbE.append(this.e);
        sbE.append(", markerIcon=");
        sbE.append(this.f);
        sbE.append(", premiumBusStopType=");
        sbE.append(this.g);
        sbE.append(", infoWindowProvider=");
        sbE.append(this.h);
        sbE.append(", premiumMarkerEventHandler=");
        sbE.append(this.i);
        sbE.append(")");
        return sbE.toString();
    }
}
