package app.chalo.livetracking.ui.routedetailsscreen.uistatefactory;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.pk0;
import defpackage.r30;
import defpackage.vo1;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/StopsListBusIconUIState;", "", "OnlyIcon", "IconWithBusNumber", "Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/StopsListBusIconUIState$IconWithBusNumber;", "Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/StopsListBusIconUIState$OnlyIcon;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class StopsListBusIconUIState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/StopsListBusIconUIState$IconWithBusNumber;", "Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/StopsListBusIconUIState;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IconWithBusNumber extends StopsListBusIconUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageUIState f4958a;
        public final TextUIState b;
        public final ChaloColorToken c;
        public final UIShape d;
        public final ChaloPadding e;
        public final BorderUISpec f;
        public final float g;

        public IconWithBusNumber(ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState, ChaloColorToken chaloColorToken) {
            float f = ChaloThemeHelper.a().d;
            UIShape.Rectangle rectangle = new UIShape.Rectangle(f, f, f, f);
            float f2 = ChaloThemeHelper.a().f;
            float f3 = ChaloThemeHelper.a().c;
            ChaloPadding chaloPadding = new ChaloPadding(f3, f2, f2, f3);
            float f4 = ChaloThemeHelper.a().b;
            float f5 = ChaloThemeHelper.a().d;
            BorderUISpec borderUISpec = new BorderUISpec(f4, ChaloColorToken.White.f9870a, new UIShape.Rectangle(f5, f5, f5, f5));
            float f6 = ChaloThemeHelper.a().d;
            this.f4958a = imageUIState;
            this.b = chaloTextUIState;
            this.c = chaloColorToken;
            this.d = rectangle;
            this.e = chaloPadding;
            this.f = borderUISpec;
            this.g = f6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconWithBusNumber)) {
                return false;
            }
            IconWithBusNumber iconWithBusNumber = (IconWithBusNumber) obj;
            return Intrinsics.d(this.f4958a, iconWithBusNumber.f4958a) && Intrinsics.d(this.b, iconWithBusNumber.b) && Intrinsics.d(this.c, iconWithBusNumber.c) && Intrinsics.d(this.d, iconWithBusNumber.d) && Intrinsics.d(this.e, iconWithBusNumber.e) && Intrinsics.d(this.f, iconWithBusNumber.f) && Dp.m7283equalsimpl0(this.g, iconWithBusNumber.g);
        }

        public final int hashCode() {
            int iHashCode = this.f4958a.hashCode() * 31;
            TextUIState textUIState = this.b;
            return Dp.m7284hashCodeimpl(this.g) + ((this.f.hashCode() + r30.c(this.e, pk0.b(this.d, z40.b(this.c, (iHashCode + (textUIState == null ? 0 : textUIState.hashCode())) * 31, 31), 31), 31)) * 31);
        }

        public final String toString() {
            String strM7289toStringimpl = Dp.m7289toStringimpl(this.g);
            StringBuilder sb = new StringBuilder("IconWithBusNumber(img=");
            sb.append(this.f4958a);
            sb.append(", busNumber=");
            sb.append(this.b);
            sb.append(", background=");
            sb.append(this.c);
            sb.append(", shape=");
            sb.append(this.d);
            sb.append(", padding=");
            sb.append(this.e);
            sb.append(", border=");
            sb.append(this.f);
            sb.append(", spaceBetween=");
            return vo1.p(sb, strM7289toStringimpl, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/StopsListBusIconUIState$OnlyIcon;", "Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/StopsListBusIconUIState;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnlyIcon extends StopsListBusIconUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageUIState f4959a;

        public OnlyIcon(ImageUIState imageUIState) {
            this.f4959a = imageUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnlyIcon) && Intrinsics.d(this.f4959a, ((OnlyIcon) obj).f4959a);
        }

        public final int hashCode() {
            return this.f4959a.hashCode();
        }

        public final String toString() {
            return "OnlyIcon(img=" + this.f4959a + ")";
        }
    }
}
