package app.chalo.sos;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.textField.BaseTextFieldUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import defpackage.hq0;
import defpackage.pk0;
import defpackage.py;
import defpackage.r30;
import defpackage.t8;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/sos/SosScreenTypeUIState;", "", "EditMsgUIState", "DisplayScreenUIState", "Lapp/chalo/sos/SosScreenTypeUIState$DisplayScreenUIState;", "Lapp/chalo/sos/SosScreenTypeUIState$EditMsgUIState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SosScreenTypeUIState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/sos/SosScreenTypeUIState$DisplayScreenUIState;", "Lapp/chalo/sos/SosScreenTypeUIState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DisplayScreenUIState extends SosScreenTypeUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SosDisplayScreenUISpecs f9419a;
        public final ToolbarUIState b;
        public final TextUIState c;
        public final SosScreenSectionHeader d;
        public final TextUIState e;
        public final DividerUIState f;
        public final SosScreenSectionHeader g;
        public final List h;
        public final TextUIState i;
        public final ImageUIState j;
        public final UiEventHandler k;
        public final DividerUIState l;
        public final ButtonUIState m;

        public DisplayScreenUIState(ToolbarUIState toolbar, TextUIState description, SosScreenSectionHeader msgSectionHeader, TextUIState sosMsg, SosScreenSectionHeader contactsSectionsHeader, List contactsList, TextUIState addContactOption, UiEventHandler addContactEventHandler, ButtonUIState buttonUIState) {
            SosDisplayScreenUISpecs sosDisplayScreenUISpecs = new SosDisplayScreenUISpecs();
            DividerUIState dividerUIState = new DividerUIState(0.0f, null, null, 7);
            ImageUIState imageUIState = new ImageUIState(IconType.IC_ADD, (String) null, ChaloColorToken.OrangePrimary.f9835a, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 250);
            DividerUIState dividerUIState2 = new DividerUIState(0.0f, null, null, 7);
            Intrinsics.i(toolbar, "toolbar");
            Intrinsics.i(description, "description");
            Intrinsics.i(msgSectionHeader, "msgSectionHeader");
            Intrinsics.i(sosMsg, "sosMsg");
            Intrinsics.i(contactsSectionsHeader, "contactsSectionsHeader");
            Intrinsics.i(contactsList, "contactsList");
            Intrinsics.i(addContactOption, "addContactOption");
            Intrinsics.i(addContactEventHandler, "addContactEventHandler");
            this.f9419a = sosDisplayScreenUISpecs;
            this.b = toolbar;
            this.c = description;
            this.d = msgSectionHeader;
            this.e = sosMsg;
            this.f = dividerUIState;
            this.g = contactsSectionsHeader;
            this.h = contactsList;
            this.i = addContactOption;
            this.j = imageUIState;
            this.k = addContactEventHandler;
            this.l = dividerUIState2;
            this.m = buttonUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DisplayScreenUIState)) {
                return false;
            }
            DisplayScreenUIState displayScreenUIState = (DisplayScreenUIState) obj;
            return Intrinsics.d(this.f9419a, displayScreenUIState.f9419a) && Intrinsics.d(this.b, displayScreenUIState.b) && Intrinsics.d(this.c, displayScreenUIState.c) && Intrinsics.d(this.d, displayScreenUIState.d) && Intrinsics.d(this.e, displayScreenUIState.e) && Intrinsics.d(this.f, displayScreenUIState.f) && Intrinsics.d(this.g, displayScreenUIState.g) && Intrinsics.d(this.h, displayScreenUIState.h) && Intrinsics.d(this.i, displayScreenUIState.i) && Intrinsics.d(this.j, displayScreenUIState.j) && Intrinsics.d(this.k, displayScreenUIState.k) && Intrinsics.d(this.l, displayScreenUIState.l) && Intrinsics.d(this.m, displayScreenUIState.m);
        }

        public final int hashCode() {
            return this.m.hashCode() + py.c(this.l, (this.k.hashCode() + r30.e(this.j, pk0.c(this.i, r30.b((this.g.hashCode() + py.c(this.f, pk0.c(this.e, (this.d.hashCode() + pk0.c(this.c, t8.d(this.b, this.f9419a.hashCode() * 31, 31), 31)) * 31, 31), 31)) * 31, 31, this.h), 31), 31)) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DisplayScreenUIState(specs=");
            sb.append(this.f9419a);
            sb.append(", toolbar=");
            sb.append(this.b);
            sb.append(", description=");
            sb.append(this.c);
            sb.append(", msgSectionHeader=");
            sb.append(this.d);
            sb.append(", sosMsg=");
            sb.append(this.e);
            sb.append(", msgDivider=");
            sb.append(this.f);
            sb.append(", contactsSectionsHeader=");
            sb.append(this.g);
            sb.append(", contactsList=");
            sb.append(this.h);
            sb.append(", addContactOption=");
            sb.append(this.i);
            sb.append(", addContactIcon=");
            sb.append(this.j);
            sb.append(", addContactEventHandler=");
            sb.append(this.k);
            sb.append(", contactsDivider=");
            sb.append(this.l);
            sb.append(", sendAlertBtn=");
            return hq0.j(sb, this.m, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/sos/SosScreenTypeUIState$EditMsgUIState;", "Lapp/chalo/sos/SosScreenTypeUIState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EditMsgUIState extends SosScreenTypeUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ToolbarUIState f9420a;
        public final BaseTextFieldUIState.TextFieldUIState b;
        public final ChaloPadding c;

        public EditMsgUIState(ToolbarUIState toolbarUIState, BaseTextFieldUIState.TextFieldUIState textFieldUIState) {
            float f = ChaloThemeHelper.a().h;
            float f2 = ChaloThemeHelper.a().f;
            ChaloPadding chaloPadding = new ChaloPadding(f2, f, f, f2);
            this.f9420a = toolbarUIState;
            this.b = textFieldUIState;
            this.c = chaloPadding;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EditMsgUIState)) {
                return false;
            }
            EditMsgUIState editMsgUIState = (EditMsgUIState) obj;
            return Intrinsics.d(this.f9420a, editMsgUIState.f9420a) && Intrinsics.d(this.b, editMsgUIState.b) && Intrinsics.d(this.c, editMsgUIState.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.f9420a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("EditMsgUIState(toolbar=");
            sb.append(this.f9420a);
            sb.append(", msgTextField=");
            sb.append(this.b);
            sb.append(", paddingAroundTextField=");
            return py.e(sb, this.c, ")");
        }
    }
}
