package app.chalo.uistate.text;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.py;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/text/HeaderTextUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HeaderTextUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f10082a;
    public final ChaloColorToken b;
    public final ChaloPadding c;

    public HeaderTextUIState(TextUIState.ChaloTextUIState chaloTextUIState) {
        float f = ChaloThemeHelper.a().h;
        float f2 = ChaloThemeHelper.a().f;
        ChaloPadding chaloPadding = new ChaloPadding(f2, f, f, f2);
        this.f10082a = chaloTextUIState;
        this.b = ChaloColorToken.NewActivityColor.f9827a;
        this.c = chaloPadding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeaderTextUIState)) {
            return false;
        }
        HeaderTextUIState headerTextUIState = (HeaderTextUIState) obj;
        return Intrinsics.d(this.f10082a, headerTextUIState.f10082a) && Intrinsics.d(this.b, headerTextUIState.b) && Intrinsics.d(this.c, headerTextUIState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + z40.b(this.b, this.f10082a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeaderTextUIState(title=");
        sb.append(this.f10082a);
        sb.append(", backgroundColor=");
        sb.append(this.b);
        sb.append(", padding=");
        return py.e(sb, this.c, ")");
    }
}
