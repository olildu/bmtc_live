package app.chalo.uistate.button;

import app.chalo.uistate.base.ChaloColorToken;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/button/ButtonUIColor;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ButtonUIColor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f9918a;
    public final ChaloColorToken b;

    public ButtonUIColor(ChaloColorToken chaloColorToken, ChaloColorToken chaloColorToken2) {
        this.f9918a = chaloColorToken;
        this.b = chaloColorToken2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonUIColor)) {
            return false;
        }
        ButtonUIColor buttonUIColor = (ButtonUIColor) obj;
        return Intrinsics.d(this.f9918a, buttonUIColor.f9918a) && Intrinsics.d(this.b, buttonUIColor.b);
    }

    public final int hashCode() {
        ChaloColorToken chaloColorToken = this.f9918a;
        int iHashCode = (chaloColorToken == null ? 0 : chaloColorToken.hashCode()) * 31;
        ChaloColorToken chaloColorToken2 = this.b;
        return iHashCode + (chaloColorToken2 != null ? chaloColorToken2.hashCode() : 0);
    }

    public final String toString() {
        return "ButtonUIColor(containerColor=" + this.f9918a + ", disabledContainerColor=" + this.b + ")";
    }

    public /* synthetic */ ButtonUIColor(ChaloColorToken chaloColorToken, int i) {
        this((i & 1) != 0 ? null : chaloColorToken, (ChaloColorToken) null);
    }
}
