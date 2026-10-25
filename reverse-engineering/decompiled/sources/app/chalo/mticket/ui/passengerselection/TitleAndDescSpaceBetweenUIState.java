package app.chalo.mticket.ui.passengerselection;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.uistate.text.TextUIState;
import defpackage.py;
import defpackage.r30;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/mticket/ui/passengerselection/TitleAndDescSpaceBetweenUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TitleAndDescSpaceBetweenUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f5764a;
    public final TextUIState.ChaloTextUIState b;
    public final TextUIState.ChaloTextUIState c;

    public TitleAndDescSpaceBetweenUIState(ChaloPadding chaloPadding, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2) {
        this.f5764a = chaloPadding;
        this.b = chaloTextUIState;
        this.c = chaloTextUIState2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TitleAndDescSpaceBetweenUIState)) {
            return false;
        }
        TitleAndDescSpaceBetweenUIState titleAndDescSpaceBetweenUIState = (TitleAndDescSpaceBetweenUIState) obj;
        return this.f5764a.equals(titleAndDescSpaceBetweenUIState.f5764a) && this.b.equals(titleAndDescSpaceBetweenUIState.b) && this.c.equals(titleAndDescSpaceBetweenUIState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + r30.f(this.b, this.f5764a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TitleAndDescSpaceBetweenUIState(paddingAround=");
        sb.append(this.f5764a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", desc=");
        return py.f(sb, this.c, ")");
    }
}
