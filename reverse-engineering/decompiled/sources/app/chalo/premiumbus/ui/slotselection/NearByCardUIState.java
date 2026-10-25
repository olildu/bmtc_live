package app.chalo.premiumbus.ui.slotselection;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.text.TextUIState;
import defpackage.nf1;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/NearByCardUIState;", "", "SlotUIState", "ViewMoreUIState", "Lapp/chalo/premiumbus/ui/slotselection/NearByCardUIState$SlotUIState;", "Lapp/chalo/premiumbus/ui/slotselection/NearByCardUIState$ViewMoreUIState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class NearByCardUIState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/NearByCardUIState$SlotUIState;", "Lapp/chalo/premiumbus/ui/slotselection/NearByCardUIState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SlotUIState extends NearByCardUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChaloColorToken f7804a;
        public final TextUIState.ChaloTextUIState b;
        public final BorderUISpec c;
        public final ChaloPadding d;
        public final UiEventHandler$Companion$fromLambda$1 e;

        public SlotUIState(ChaloColorToken chaloColorToken, TextUIState.ChaloTextUIState chaloTextUIState, BorderUISpec borderUISpec, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
            float f = ChaloThemeHelper.a().h;
            float f2 = ChaloThemeHelper.a().f;
            ChaloPadding chaloPadding = new ChaloPadding(f2, f, f, f2);
            this.f7804a = chaloColorToken;
            this.b = chaloTextUIState;
            this.c = borderUISpec;
            this.d = chaloPadding;
            this.e = uiEventHandler$Companion$fromLambda$1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SlotUIState)) {
                return false;
            }
            SlotUIState slotUIState = (SlotUIState) obj;
            return Intrinsics.d(this.f7804a, slotUIState.f7804a) && Intrinsics.d(this.b, slotUIState.b) && Intrinsics.d(this.c, slotUIState.c) && Intrinsics.d(this.d, slotUIState.d) && Intrinsics.d(this.e, slotUIState.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + r30.c(this.d, (this.c.hashCode() + r30.f(this.b, this.f7804a.hashCode() * 31, 31)) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SlotUIState(backgroundColor=");
            sb.append(this.f7804a);
            sb.append(", slotTimeUIState=");
            sb.append(this.b);
            sb.append(", borderUIState=");
            sb.append(this.c);
            sb.append(", contentPadding=");
            sb.append(this.d);
            sb.append(", clickHandler=");
            return nf1.n(sb, this.e, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/NearByCardUIState$ViewMoreUIState;", "Lapp/chalo/premiumbus/ui/slotselection/NearByCardUIState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ViewMoreUIState extends NearByCardUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextUIState.ChaloTextUIState f7805a;
        public final BorderUISpec b;
        public final ChaloPadding c;
        public final UiEventHandler$Companion$fromLambda$1 d;

        public ViewMoreUIState(TextUIState.ChaloTextUIState chaloTextUIState, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
            BorderUISpec borderUISpec = new BorderUISpec(ChaloThemeHelper.a().b, ChaloColorToken.LightGray.f9814a, UIShape.d);
            float f = ChaloThemeHelper.a().h;
            float f2 = ChaloThemeHelper.a().f;
            ChaloPadding chaloPadding = new ChaloPadding(f2, f, f, f2);
            this.f7805a = chaloTextUIState;
            this.b = borderUISpec;
            this.c = chaloPadding;
            this.d = uiEventHandler$Companion$fromLambda$1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewMoreUIState)) {
                return false;
            }
            ViewMoreUIState viewMoreUIState = (ViewMoreUIState) obj;
            return Intrinsics.d(this.f7805a, viewMoreUIState.f7805a) && Intrinsics.d(this.b, viewMoreUIState.b) && Intrinsics.d(this.c, viewMoreUIState.c) && Intrinsics.d(this.d, viewMoreUIState.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + r30.c(this.c, (this.b.hashCode() + (this.f7805a.hashCode() * 31)) * 31, 31);
        }

        public final String toString() {
            return "ViewMoreUIState(viewMoreUIState=" + this.f7805a + ", borderUIState=" + this.b + ", contentPadding=" + this.c + ", clickHandler=" + this.d + ")";
        }
    }
}
