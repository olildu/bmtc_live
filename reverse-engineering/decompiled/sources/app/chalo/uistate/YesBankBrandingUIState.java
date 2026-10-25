package app.chalo.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.TextUIState;
import defpackage.py;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/YesBankBrandingUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class YesBankBrandingUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f9752a;
    public final ImageUIState b;
    public final ChaloPadding c;

    public YesBankBrandingUIState(TextUIState.ChaloTextUIState chaloTextUIState) {
        ImageUIState imageUIState = new ImageUIState(IconType.YES_BANK, (String) null, (ChaloColorToken) null, new ImageUISize(null, Dp.m7276boximpl(ChaloThemeHelper.a().a0), 1), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().f, 0.0f, ChaloThemeHelper.a().d, ChaloThemeHelper.a().f, 2);
        this.f9752a = chaloTextUIState;
        this.b = imageUIState;
        this.c = chaloPadding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YesBankBrandingUIState)) {
            return false;
        }
        YesBankBrandingUIState yesBankBrandingUIState = (YesBankBrandingUIState) obj;
        return Intrinsics.d(this.f9752a, yesBankBrandingUIState.f9752a) && Intrinsics.d(this.b, yesBankBrandingUIState.b) && Intrinsics.d(this.c, yesBankBrandingUIState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + r30.e(this.b, this.f9752a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("YesBankBrandingUIState(text=");
        sb.append(this.f9752a);
        sb.append(", image=");
        sb.append(this.b);
        sb.append(", paddingAroundText=");
        return py.e(sb, this.c, ")");
    }
}
