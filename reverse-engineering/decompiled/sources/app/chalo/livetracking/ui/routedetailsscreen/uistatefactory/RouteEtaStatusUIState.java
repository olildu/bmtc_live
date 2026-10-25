package app.chalo.livetracking.ui.routedetailsscreen.uistatefactory;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.n21;
import defpackage.pk0;
import defpackage.py;
import defpackage.r30;
import defpackage.vo1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/RouteEtaStatusUIState;", "", "Text", "Shimmer", "NextScheduleTime", "NoLiveBusAvailable", "StopWithFixedEtas", "Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/RouteEtaStatusUIState$NextScheduleTime;", "Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/RouteEtaStatusUIState$NoLiveBusAvailable;", "Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/RouteEtaStatusUIState$Shimmer;", "Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/RouteEtaStatusUIState$StopWithFixedEtas;", "Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/RouteEtaStatusUIState$Text;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class RouteEtaStatusUIState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/RouteEtaStatusUIState$NextScheduleTime;", "Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/RouteEtaStatusUIState;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NextScheduleTime extends RouteEtaStatusUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextUIState.ChaloTextUIState f4925a;
        public final TextUIState.ChaloTextUIState b;

        public NextScheduleTime(TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2) {
            this.f4925a = chaloTextUIState;
            this.b = chaloTextUIState2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NextScheduleTime)) {
                return false;
            }
            NextScheduleTime nextScheduleTime = (NextScheduleTime) obj;
            return this.f4925a.equals(nextScheduleTime.f4925a) && this.b.equals(nextScheduleTime.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f4925a.hashCode() * 31);
        }

        public final String toString() {
            return "NextScheduleTime(title=" + this.f4925a + ", time=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/RouteEtaStatusUIState$NoLiveBusAvailable;", "Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/RouteEtaStatusUIState;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NoLiveBusAvailable extends RouteEtaStatusUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextUIState.ChaloTextUIState f4926a;
        public final TextUIState.ChaloTextUIState b;
        public final float c;

        public NoLiveBusAvailable(TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, float f) {
            this.f4926a = chaloTextUIState;
            this.b = chaloTextUIState2;
            this.c = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NoLiveBusAvailable)) {
                return false;
            }
            NoLiveBusAvailable noLiveBusAvailable = (NoLiveBusAvailable) obj;
            return this.f4926a.equals(noLiveBusAvailable.f4926a) && this.b.equals(noLiveBusAvailable.b) && Dp.m7283equalsimpl0(this.c, noLiveBusAvailable.c);
        }

        public final int hashCode() {
            return Dp.m7284hashCodeimpl(this.c) + r30.f(this.b, this.f4926a.hashCode() * 31, 31);
        }

        public final String toString() {
            return vo1.p(n21.j("NoLiveBusAvailable(title=", this.f4926a, ", viewTimeTable=", this.b, ", spaceBetween="), Dp.m7289toStringimpl(this.c), ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/RouteEtaStatusUIState$Shimmer;", "Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/RouteEtaStatusUIState;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Shimmer extends RouteEtaStatusUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f4927a;
        public final UIShape b;
        public final float c;

        public Shimmer() {
            float f = ChaloThemeHelper.a().i;
            UIShape.Rectangle shape = UIShape.c;
            Intrinsics.i(shape, "shape");
            this.f4927a = f;
            this.b = shape;
            this.c = 0.7f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Shimmer)) {
                return false;
            }
            Shimmer shimmer = (Shimmer) obj;
            return Dp.m7283equalsimpl0(this.f4927a, shimmer.f4927a) && Intrinsics.d(this.b, shimmer.b) && Float.compare(this.c, shimmer.c) == 0;
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.c) + pk0.b(this.b, Dp.m7284hashCodeimpl(this.f4927a) * 31, 31);
        }

        public final String toString() {
            String strM7289toStringimpl = Dp.m7289toStringimpl(this.f4927a);
            StringBuilder sb = new StringBuilder("Shimmer(height=");
            sb.append(strM7289toStringimpl);
            sb.append(", shape=");
            sb.append(this.b);
            sb.append(", widthFraction=");
            return py.g(sb, ")", this.c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/RouteEtaStatusUIState$StopWithFixedEtas;", "Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/RouteEtaStatusUIState;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StopWithFixedEtas extends RouteEtaStatusUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f4928a;
        public final DividerUIState b;
        public final float c;

        public StopWithFixedEtas(List etaList, DividerUIState dividerUIState) {
            float f = ChaloThemeHelper.a().g;
            Intrinsics.i(etaList, "etaList");
            this.f4928a = etaList;
            this.b = dividerUIState;
            this.c = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StopWithFixedEtas)) {
                return false;
            }
            StopWithFixedEtas stopWithFixedEtas = (StopWithFixedEtas) obj;
            return Intrinsics.d(this.f4928a, stopWithFixedEtas.f4928a) && Intrinsics.d(this.b, stopWithFixedEtas.b) && Dp.m7283equalsimpl0(this.c, stopWithFixedEtas.c);
        }

        public final int hashCode() {
            return Dp.m7284hashCodeimpl(this.c) + py.c(this.b, this.f4928a.hashCode() * 31, 31);
        }

        public final String toString() {
            String strM7289toStringimpl = Dp.m7289toStringimpl(this.c);
            StringBuilder sb = new StringBuilder("StopWithFixedEtas(etaList=");
            sb.append(this.f4928a);
            sb.append(", divider=");
            sb.append(this.b);
            sb.append(", spaceAroundDivider=");
            return vo1.p(sb, strM7289toStringimpl, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/RouteEtaStatusUIState$Text;", "Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/RouteEtaStatusUIState;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Text extends RouteEtaStatusUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextUIState.ChaloTextUIState f4929a;

        public Text(TextUIState.ChaloTextUIState chaloTextUIState) {
            this.f4929a = chaloTextUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Text) && this.f4929a.equals(((Text) obj).f4929a);
        }

        public final int hashCode() {
            return this.f4929a.hashCode();
        }

        public final String toString() {
            return "Text(text=" + this.f4929a + ")";
        }
    }
}
