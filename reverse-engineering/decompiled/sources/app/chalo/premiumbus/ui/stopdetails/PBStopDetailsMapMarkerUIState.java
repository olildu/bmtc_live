package app.chalo.premiumbus.ui.stopdetails;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.components.chalomap.ChaloMapInfoWindowData;
import app.chalo.compose.components.chalomap.ChaloMapMarkerIconType;
import app.chalo.compose.components.chalomap.ChaloMapMarkerInfoWindow;
import app.chalo.compose.components.chalomap.ChaloMapMarkerUIEventHandler;
import app.chalo.compose.components.chalomap.ChaloMapMarkerUIState;
import app.chalo.compose.components.chalomap.MapOffset;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.location.LatLng;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.text.TextUIState;
import defpackage.dd;
import defpackage.i71;
import defpackage.n21;
import defpackage.nf1;
import defpackage.to0;
import defpackage.uf0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/premiumbus/ui/stopdetails/PBStopDetailsMapMarkerUIState;", "Lapp/chalo/compose/components/chalomap/ChaloMapMarkerUIState;", "PBStopDetailMapMarkerInfoWindowUIState", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PBStopDetailsMapMarkerUIState implements ChaloMapMarkerUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7935a;
    public final String b;
    public final LatLng c;
    public final String d;
    public final ChaloMapMarkerInfoWindow e;
    public final LatLng f;
    public final Lazy g = LazyKt.b(new to0(1));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/stopdetails/PBStopDetailsMapMarkerUIState$PBStopDetailMapMarkerInfoWindowUIState;", "Lapp/chalo/compose/components/chalomap/ChaloMapInfoWindowData;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PBStopDetailMapMarkerInfoWindowUIState implements ChaloMapInfoWindowData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextUIState.ChaloTextUIState f7936a;
        public final TextUIState.ChaloTextUIState b;
        public final float c;
        public final ChaloPadding d;

        public PBStopDetailMapMarkerInfoWindowUIState(TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2) {
            float f = ChaloThemeHelper.a().d;
            float f2 = ChaloThemeHelper.a().g;
            ChaloPadding chaloPadding = new ChaloPadding(f2, f2, f2, f2);
            this.f7936a = chaloTextUIState;
            this.b = chaloTextUIState2;
            this.c = f;
            this.d = chaloPadding;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PBStopDetailMapMarkerInfoWindowUIState)) {
                return false;
            }
            PBStopDetailMapMarkerInfoWindowUIState pBStopDetailMapMarkerInfoWindowUIState = (PBStopDetailMapMarkerInfoWindowUIState) obj;
            return Intrinsics.d(this.f7936a, pBStopDetailMapMarkerInfoWindowUIState.f7936a) && Intrinsics.d(this.b, pBStopDetailMapMarkerInfoWindowUIState.b) && Dp.m7283equalsimpl0(this.c, pBStopDetailMapMarkerInfoWindowUIState.c) && Intrinsics.d(this.d, pBStopDetailMapMarkerInfoWindowUIState.d);
        }

        public final int hashCode() {
            int iHashCode = this.f7936a.hashCode() * 31;
            TextUIState.ChaloTextUIState chaloTextUIState = this.b;
            return this.d.hashCode() + uf0.a(this.c, (iHashCode + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31, 31);
        }

        public final String toString() {
            String strM7289toStringimpl = Dp.m7289toStringimpl(this.c);
            StringBuilder sbJ = n21.j("PBStopDetailMapMarkerInfoWindowUIState(stopName=", this.f7936a, ", stopTag=", this.b, ", spaceBetween=");
            sbJ.append(strM7289toStringimpl);
            sbJ.append(", internalPadding=");
            sbJ.append(this.d);
            sbJ.append(")");
            return sbJ.toString();
        }
    }

    public PBStopDetailsMapMarkerUIState(String str, String str2, LatLng latLng, String str3, ChaloMapMarkerInfoWindow chaloMapMarkerInfoWindow) {
        this.f7935a = str;
        this.b = str2;
        this.c = latLng;
        this.d = str3;
        this.e = chaloMapMarkerInfoWindow;
        this.f = latLng;
    }

    public static PBStopDetailsMapMarkerUIState f(PBStopDetailsMapMarkerUIState pBStopDetailsMapMarkerUIState, ChaloMapMarkerInfoWindow chaloMapMarkerInfoWindow) {
        return new PBStopDetailsMapMarkerUIState(pBStopDetailsMapMarkerUIState.f7935a, pBStopDetailsMapMarkerUIState.b, pBStopDetailsMapMarkerUIState.c, pBStopDetailsMapMarkerUIState.d, chaloMapMarkerInfoWindow);
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: a */
    public final ChaloMapMarkerUIEventHandler getF() {
        return (ChaloMapMarkerUIEventHandler) this.g.getValue();
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: b, reason: from getter */
    public final ChaloMapMarkerInfoWindow getF() {
        return this.e;
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: c */
    public final /* bridge */ MapOffset getG() {
        return ChaloMapMarkerUIState.DefaultImpls.a();
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: d */
    public final MapOffset getD() {
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
        if (!(obj instanceof PBStopDetailsMapMarkerUIState)) {
            return false;
        }
        PBStopDetailsMapMarkerUIState pBStopDetailsMapMarkerUIState = (PBStopDetailsMapMarkerUIState) obj;
        return Intrinsics.d(this.f7935a, pBStopDetailsMapMarkerUIState.f7935a) && Intrinsics.d(this.b, pBStopDetailsMapMarkerUIState.b) && Intrinsics.d(this.c, pBStopDetailsMapMarkerUIState.c) && Intrinsics.d(this.d, pBStopDetailsMapMarkerUIState.d) && Intrinsics.d(this.e, pBStopDetailsMapMarkerUIState.e);
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: getIcon */
    public final ChaloMapMarkerIconType getC() {
        return new ChaloMapMarkerIconType.DrawableRes(IconType.BUS_NEARBY_SELECTED);
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getF4901a() {
        return this.f7935a;
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: getPosition, reason: from getter */
    public final LatLng getB() {
        return this.f;
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: getZIndex */
    public final /* bridge */ float getH() {
        return 0.0f;
    }

    public final int hashCode() {
        int iD = i71.d(this.c, nf1.e(this.f7935a.hashCode() * 31, 31, this.b), 31);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        ChaloMapMarkerInfoWindow chaloMapMarkerInfoWindow = this.e;
        return iHashCode + (chaloMapMarkerInfoWindow != null ? chaloMapMarkerInfoWindow.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PBStopDetailsMapMarkerUIState(stopId=", this.f7935a, ", stopName=", this.b, ", location=");
        sbE.append(this.c);
        sbE.append(", stopTag=");
        sbE.append(this.d);
        sbE.append(", infoWindow=");
        sbE.append(this.e);
        sbE.append(")");
        return sbE.toString();
    }
}
