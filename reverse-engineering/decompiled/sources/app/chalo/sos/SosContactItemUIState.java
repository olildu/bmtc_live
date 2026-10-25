package app.chalo.sos;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.dialog.DropDownMenuUIState;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.TextUIState;
import defpackage.pk0;
import defpackage.py;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/sos/SosContactItemUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SosContactItemUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageUIState f9399a;
    public final TextUIState.ChaloTextUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final DropDownMenuUIState d;
    public final ImageUIState e;
    public final DividerUIState f;
    public final ChaloPadding g;
    public final ChaloPadding h;
    public final ChaloPadding i;
    public final ChaloColorToken j;

    public SosContactItemUIState(TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, DropDownMenuUIState dropDownMenuUIState, ImageUIState imageUIState) {
        ImageUIState imageUIState2 = new ImageUIState(IconType.IC_NO_PHOTO, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254);
        DividerUIState dividerUIState = new DividerUIState(0.0f, null, null, 7);
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().d, 0.0f, 0.0f, 0.0f, 14);
        ChaloPadding chaloPadding2 = new ChaloPadding(0.0f, ChaloThemeHelper.a().h, 0.0f, 0.0f, 13);
        float f = ChaloThemeHelper.a().g;
        float f2 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding3 = new ChaloPadding(f, f2, f2, f);
        this.f9399a = imageUIState2;
        this.b = chaloTextUIState;
        this.c = chaloTextUIState2;
        this.d = dropDownMenuUIState;
        this.e = imageUIState;
        this.f = dividerUIState;
        this.g = chaloPadding;
        this.h = chaloPadding2;
        this.i = chaloPadding3;
        this.j = ChaloColorToken.White.f9870a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SosContactItemUIState)) {
            return false;
        }
        SosContactItemUIState sosContactItemUIState = (SosContactItemUIState) obj;
        return Intrinsics.d(this.f9399a, sosContactItemUIState.f9399a) && Intrinsics.d(this.b, sosContactItemUIState.b) && Intrinsics.d(this.c, sosContactItemUIState.c) && Intrinsics.d(this.d, sosContactItemUIState.d) && Intrinsics.d(this.e, sosContactItemUIState.e) && Intrinsics.d(this.f, sosContactItemUIState.f) && Intrinsics.d(this.g, sosContactItemUIState.g) && Intrinsics.d(this.h, sosContactItemUIState.h) && Intrinsics.d(this.i, sosContactItemUIState.i) && Intrinsics.d(this.j, sosContactItemUIState.j);
    }

    public final int hashCode() {
        int iF = r30.f(this.c, r30.f(this.b, this.f9399a.hashCode() * 31, 31), 31);
        DropDownMenuUIState dropDownMenuUIState = this.d;
        int iHashCode = (iF + (dropDownMenuUIState == null ? 0 : dropDownMenuUIState.hashCode())) * 31;
        ImageUIState imageUIState = this.e;
        return this.j.hashCode() + r30.c(this.i, r30.c(this.h, r30.c(this.g, py.c(this.f, (iHashCode + (imageUIState != null ? imageUIState.hashCode() : 0)) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = pk0.n("SosContactItemUIState(contactPhoto=", this.f9399a, ", contactName=", this.b, ", phoneNumber=");
        sbN.append(this.c);
        sbN.append(", removeMenu=");
        sbN.append(this.d);
        sbN.append(", dropDownIcon=");
        sbN.append(this.e);
        sbN.append(", bottomDivider=");
        sbN.append(this.f);
        sbN.append(", paddingAroundPhoneNumber=");
        r30.o(sbN, this.g, ", paddingAroundNameSection=", this.h, ", internalPadding=");
        sbN.append(this.i);
        sbN.append(", backgroundColor=");
        sbN.append(this.j);
        sbN.append(")");
        return sbN.toString();
    }
}
