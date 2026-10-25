package app.chalo.premiumbus.ui.seatselection.compose.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/compose/uistate/SeatSelectionDialogTypeUIState;", "", "SeatChangeDialogTypeUIState", "Lapp/chalo/premiumbus/ui/seatselection/compose/uistate/SeatSelectionDialogTypeUIState$SeatChangeDialogTypeUIState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SeatSelectionDialogTypeUIState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/compose/uistate/SeatSelectionDialogTypeUIState$SeatChangeDialogTypeUIState;", "Lapp/chalo/premiumbus/ui/seatselection/compose/uistate/SeatSelectionDialogTypeUIState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SeatChangeDialogTypeUIState extends SeatSelectionDialogTypeUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SeatChangeDialogTypeUISpecs f7787a;
        public final TextUIState.ChaloTextUIState b;
        public final ButtonUIState c;
        public final ButtonUIState d;
        public final ImageUIState e;
        public final ChaloPadding f;
        public final float g;

        public SeatChangeDialogTypeUIState(ButtonUIState positiveBtnUIState, ButtonUIState buttonUIState, ImageUIState imageUIState, TextUIState.ChaloTextUIState titleText) {
            SeatChangeDialogTypeUISpecs seatChangeDialogTypeUISpecs = new SeatChangeDialogTypeUISpecs();
            float f = ChaloThemeHelper.a().h;
            ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
            float f2 = ChaloThemeHelper.a().n;
            Intrinsics.i(titleText, "titleText");
            Intrinsics.i(positiveBtnUIState, "positiveBtnUIState");
            this.f7787a = seatChangeDialogTypeUISpecs;
            this.b = titleText;
            this.c = positiveBtnUIState;
            this.d = buttonUIState;
            this.e = imageUIState;
            this.f = chaloPadding;
            this.g = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SeatChangeDialogTypeUIState)) {
                return false;
            }
            SeatChangeDialogTypeUIState seatChangeDialogTypeUIState = (SeatChangeDialogTypeUIState) obj;
            return Intrinsics.d(this.f7787a, seatChangeDialogTypeUIState.f7787a) && Intrinsics.d(this.b, seatChangeDialogTypeUIState.b) && Intrinsics.d(this.c, seatChangeDialogTypeUIState.c) && Intrinsics.d(this.d, seatChangeDialogTypeUIState.d) && Intrinsics.d(this.e, seatChangeDialogTypeUIState.e) && Intrinsics.d(this.f, seatChangeDialogTypeUIState.f) && Dp.m7283equalsimpl0(this.g, seatChangeDialogTypeUIState.g);
        }

        public final int hashCode() {
            return Dp.m7284hashCodeimpl(this.g) + r30.c(this.f, r30.e(this.e, r30.d(this.d, r30.d(this.c, r30.f(this.b, this.f7787a.hashCode() * 31, 31), 31), 31), 31), 31);
        }

        public final String toString() {
            String strM7289toStringimpl = Dp.m7289toStringimpl(this.g);
            StringBuilder sb = new StringBuilder("SeatChangeDialogTypeUIState(specs=");
            sb.append(this.f7787a);
            sb.append(", titleText=");
            sb.append(this.b);
            sb.append(", positiveBtnUIState=");
            sb.append(this.c);
            sb.append(", negativeBtnUIState=");
            sb.append(this.d);
            sb.append(", closeBtnUIState=");
            sb.append(this.e);
            sb.append(", contentPadding=");
            sb.append(this.f);
            sb.append(", buttonHeight=");
            return vo1.p(sb, strM7289toStringimpl, ")");
        }
    }
}
