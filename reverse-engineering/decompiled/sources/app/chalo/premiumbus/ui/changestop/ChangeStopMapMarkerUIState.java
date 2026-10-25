package app.chalo.premiumbus.ui.changestop;

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
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.gf;
import defpackage.i71;
import defpackage.n21;
import defpackage.r30;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/premiumbus/ui/changestop/ChangeStopMapMarkerUIState;", "Lapp/chalo/compose/components/chalomap/ChaloMapMarkerUIState;", "ChangeStopStopMarkerInfoWindowUIState", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChangeStopMapMarkerUIState implements ChaloMapMarkerUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7511a;
    public final LatLng b;
    public final ChaloMapMarkerIconType c;
    public final ChaloMapMarkerInfoWindow d;
    public final ChaloMapMarkerUIEventHandler e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/changestop/ChangeStopMapMarkerUIState$ChangeStopStopMarkerInfoWindowUIState;", "Lapp/chalo/compose/components/chalomap/ChaloMapInfoWindowData;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ChangeStopStopMarkerInfoWindowUIState implements ChaloMapInfoWindowData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextUIState.ChaloTextUIState f7512a;
        public final TextUIState.ChaloTextUIState b;
        public final ImageUIState c;
        public final TextUIState.ChaloTextUIState d;
        public final UiEventHandler$Companion$fromLambda$1 e;
        public final float f;
        public final float g;
        public final ChaloPadding h;

        public ChangeStopStopMarkerInfoWindowUIState(TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState stopName, ImageUIState directionsIcon, TextUIState.ChaloTextUIState chaloTextUIState2, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
            float f = ChaloThemeHelper.a().d;
            float f2 = ChaloThemeHelper.a().c;
            float f3 = ChaloThemeHelper.a().g;
            ChaloPadding chaloPadding = new ChaloPadding(f3, f3, f3, f3);
            Intrinsics.i(stopName, "stopName");
            Intrinsics.i(directionsIcon, "directionsIcon");
            this.f7512a = chaloTextUIState;
            this.b = stopName;
            this.c = directionsIcon;
            this.d = chaloTextUIState2;
            this.e = uiEventHandler$Companion$fromLambda$1;
            this.f = f;
            this.g = f2;
            this.h = chaloPadding;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChangeStopStopMarkerInfoWindowUIState)) {
                return false;
            }
            ChangeStopStopMarkerInfoWindowUIState changeStopStopMarkerInfoWindowUIState = (ChangeStopStopMarkerInfoWindowUIState) obj;
            return Intrinsics.d(this.f7512a, changeStopStopMarkerInfoWindowUIState.f7512a) && Intrinsics.d(this.b, changeStopStopMarkerInfoWindowUIState.b) && Intrinsics.d(this.c, changeStopStopMarkerInfoWindowUIState.c) && Intrinsics.d(this.d, changeStopStopMarkerInfoWindowUIState.d) && Intrinsics.d(this.e, changeStopStopMarkerInfoWindowUIState.e) && Dp.m7283equalsimpl0(this.f, changeStopStopMarkerInfoWindowUIState.f) && Dp.m7283equalsimpl0(this.g, changeStopStopMarkerInfoWindowUIState.g) && Intrinsics.d(this.h, changeStopStopMarkerInfoWindowUIState.h);
        }

        public final int hashCode() {
            TextUIState.ChaloTextUIState chaloTextUIState = this.f7512a;
            return this.h.hashCode() + uf0.a(this.g, uf0.a(this.f, gf.a(this.e, r30.f(this.d, r30.e(this.c, r30.f(this.b, (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode()) * 31, 31), 31), 31), 31), 31), 31);
        }

        public final String toString() {
            String strM7289toStringimpl = Dp.m7289toStringimpl(this.f);
            String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.g);
            StringBuilder sbJ = n21.j("ChangeStopStopMarkerInfoWindowUIState(title=", this.f7512a, ", stopName=", this.b, ", directionsIcon=");
            sbJ.append(this.c);
            sbJ.append(", directionsText=");
            sbJ.append(this.d);
            sbJ.append(", onDirectionsClick=");
            sbJ.append(this.e);
            sbJ.append(", spaceBetween=");
            sbJ.append(strM7289toStringimpl);
            sbJ.append(", iconAndTextSpacing=");
            sbJ.append(strM7289toStringimpl2);
            sbJ.append(", internalPadding=");
            sbJ.append(this.h);
            sbJ.append(")");
            return sbJ.toString();
        }
    }

    public ChangeStopMapMarkerUIState(String id, LatLng position, ChaloMapMarkerIconType icon, ChaloMapMarkerInfoWindow chaloMapMarkerInfoWindow, ChaloMapMarkerUIEventHandler eventHandler) {
        Intrinsics.i(id, "id");
        Intrinsics.i(position, "position");
        Intrinsics.i(icon, "icon");
        Intrinsics.i(eventHandler, "eventHandler");
        this.f7511a = id;
        this.b = position;
        this.c = icon;
        this.d = chaloMapMarkerInfoWindow;
        this.e = eventHandler;
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ChaloMapMarkerUIEventHandler getF() {
        return this.e;
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: b, reason: from getter */
    public final ChaloMapMarkerInfoWindow getF() {
        return this.d;
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
        if (!(obj instanceof ChangeStopMapMarkerUIState)) {
            return false;
        }
        ChangeStopMapMarkerUIState changeStopMapMarkerUIState = (ChangeStopMapMarkerUIState) obj;
        return Intrinsics.d(this.f7511a, changeStopMapMarkerUIState.f7511a) && Intrinsics.d(this.b, changeStopMapMarkerUIState.b) && Intrinsics.d(this.c, changeStopMapMarkerUIState.c) && Intrinsics.d(this.d, changeStopMapMarkerUIState.d) && Intrinsics.d(this.e, changeStopMapMarkerUIState.e);
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: getIcon, reason: from getter */
    public final ChaloMapMarkerIconType getC() {
        return this.c;
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getF4901a() {
        return this.f7511a;
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: getPosition, reason: from getter */
    public final LatLng getB() {
        return this.b;
    }

    @Override // app.chalo.compose.components.chalomap.ChaloMapMarkerUIState
    /* JADX INFO: renamed from: getZIndex */
    public final /* bridge */ float getH() {
        return 0.0f;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + i71.d(this.b, this.f7511a.hashCode() * 31, 31)) * 31;
        ChaloMapMarkerInfoWindow chaloMapMarkerInfoWindow = this.d;
        return this.e.hashCode() + ((iHashCode + (chaloMapMarkerInfoWindow == null ? 0 : chaloMapMarkerInfoWindow.hashCode())) * 31);
    }

    public final String toString() {
        return "ChangeStopMapMarkerUIState(id=" + this.f7511a + ", position=" + this.b + ", icon=" + this.c + ", infoWindow=" + this.d + ", eventHandler=" + this.e + ")";
    }
}
