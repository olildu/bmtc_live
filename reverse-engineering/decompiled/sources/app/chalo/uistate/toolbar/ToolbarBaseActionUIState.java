package app.chalo.uistate.toolbar;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.TextUIState;
import defpackage.py;
import defpackage.r30;
import defpackage.uf0;
import defpackage.vo1;
import defpackage.z40;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/uistate/toolbar/ToolbarBaseActionUIState;", "", "DropDownAction", "IconAndTextUIState", "Lapp/chalo/uistate/toolbar/ToolbarActionsUIState;", "Lapp/chalo/uistate/toolbar/ToolbarBaseActionUIState$DropDownAction;", "Lapp/chalo/uistate/toolbar/ToolbarBaseActionUIState$IconAndTextUIState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ToolbarBaseActionUIState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/toolbar/ToolbarBaseActionUIState$DropDownAction;", "Lapp/chalo/uistate/toolbar/ToolbarBaseActionUIState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DropDownAction extends ToolbarBaseActionUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f10117a;
        public final ImageUIState b;
        public final UiEventHandler c;
        public final ChaloColorToken d;
        public final float e;

        public DropDownAction(List list) {
            ImageUIState imageUIState = new ImageUIState(IconType.ROUTE_SCREEN_MENU, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
            float f = ChaloThemeHelper.a().f;
            this.f10117a = list;
            this.b = imageUIState;
            this.c = UiEventHandler.Companion.f9897a;
            this.d = ChaloColorToken.White.f9870a;
            this.e = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DropDownAction)) {
                return false;
            }
            DropDownAction dropDownAction = (DropDownAction) obj;
            return Intrinsics.d(this.f10117a, dropDownAction.f10117a) && Intrinsics.d(this.b, dropDownAction.b) && Intrinsics.d(this.c, dropDownAction.c) && Intrinsics.d(this.d, dropDownAction.d) && Dp.m7283equalsimpl0(this.e, dropDownAction.e);
        }

        public final int hashCode() {
            return Dp.m7284hashCodeimpl(this.e) + z40.b(this.d, (this.c.hashCode() + r30.e(this.b, this.f10117a.hashCode() * 31, 31)) * 31, 31);
        }

        public final String toString() {
            String strM7289toStringimpl = Dp.m7289toStringimpl(this.e);
            StringBuilder sb = new StringBuilder("DropDownAction(optionsMenu=");
            sb.append(this.f10117a);
            sb.append(", icon=");
            sb.append(this.b);
            sb.append(", iconClick=");
            sb.append(this.c);
            sb.append(", background=");
            sb.append(this.d);
            sb.append(", spaceAfterItems=");
            return vo1.p(sb, strM7289toStringimpl, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/toolbar/ToolbarBaseActionUIState$IconAndTextUIState;", "Lapp/chalo/uistate/toolbar/ToolbarBaseActionUIState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IconAndTextUIState extends ToolbarBaseActionUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageUIState f10118a;
        public final TextUIState b;
        public final UiEventHandler c;
        public final float d;
        public final boolean e;
        public final BorderUISpec f;
        public final ChaloPadding g;

        public IconAndTextUIState(ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState, UiEventHandler actionEventHandler, BorderUISpec borderUISpec, ChaloPadding chaloPadding, int i) {
            float f = ChaloThemeHelper.a().d;
            borderUISpec = (i & 32) != 0 ? null : borderUISpec;
            chaloPadding = (i & 64) != 0 ? new ChaloPadding(0.0f, 0.0f, 3) : chaloPadding;
            Intrinsics.i(actionEventHandler, "actionEventHandler");
            this.f10118a = imageUIState;
            this.b = chaloTextUIState;
            this.c = actionEventHandler;
            this.d = f;
            this.e = true;
            this.f = borderUISpec;
            this.g = chaloPadding;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconAndTextUIState)) {
                return false;
            }
            IconAndTextUIState iconAndTextUIState = (IconAndTextUIState) obj;
            return Intrinsics.d(this.f10118a, iconAndTextUIState.f10118a) && Intrinsics.d(this.b, iconAndTextUIState.b) && Intrinsics.d(this.c, iconAndTextUIState.c) && Dp.m7283equalsimpl0(this.d, iconAndTextUIState.d) && this.e == iconAndTextUIState.e && Intrinsics.d(this.f, iconAndTextUIState.f) && Intrinsics.d(this.g, iconAndTextUIState.g);
        }

        public final int hashCode() {
            ImageUIState imageUIState = this.f10118a;
            int iHashCode = (imageUIState == null ? 0 : imageUIState.hashCode()) * 31;
            TextUIState textUIState = this.b;
            int iA = (uf0.a(this.d, (this.c.hashCode() + ((iHashCode + (textUIState == null ? 0 : textUIState.hashCode())) * 31)) * 31, 31) + (this.e ? 1231 : 1237)) * 31;
            BorderUISpec borderUISpec = this.f;
            return this.g.hashCode() + ((iA + (borderUISpec != null ? borderUISpec.hashCode() : 0)) * 31);
        }

        public final String toString() {
            String strM7289toStringimpl = Dp.m7289toStringimpl(this.d);
            StringBuilder sb = new StringBuilder("IconAndTextUIState(icon=");
            sb.append(this.f10118a);
            sb.append(", text=");
            sb.append(this.b);
            sb.append(", actionEventHandler=");
            sb.append(this.c);
            sb.append(", spaceBetween=");
            sb.append(strM7289toStringimpl);
            sb.append(", shouldShowIconFirst=");
            sb.append(this.e);
            sb.append(", borderUISpec=");
            sb.append(this.f);
            sb.append(", borderInnerPadding=");
            return py.e(sb, this.g, ")");
        }
    }
}
