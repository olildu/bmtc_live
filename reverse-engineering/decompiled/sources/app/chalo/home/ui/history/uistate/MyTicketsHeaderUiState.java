package app.chalo.home.ui.history.uistate;

import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/MyTicketsHeaderUiState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MyTicketsHeaderUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TicketsHeaderUISpec f3475a;
    public final TextUIState.ChaloTextUIState b;
    public final SeeMoreSectionUiState c;

    public MyTicketsHeaderUiState(TextUIState.ChaloTextUIState title, SeeMoreSectionUiState seeMoreSectionUiState) {
        TicketsHeaderUISpec ticketsHeaderUISpec = new TicketsHeaderUISpec();
        Intrinsics.i(title, "title");
        this.f3475a = ticketsHeaderUISpec;
        this.b = title;
        this.c = seeMoreSectionUiState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MyTicketsHeaderUiState)) {
            return false;
        }
        MyTicketsHeaderUiState myTicketsHeaderUiState = (MyTicketsHeaderUiState) obj;
        return Intrinsics.d(this.f3475a, myTicketsHeaderUiState.f3475a) && Intrinsics.d(this.b, myTicketsHeaderUiState.b) && Intrinsics.d(this.c, myTicketsHeaderUiState.c);
    }

    public final int hashCode() {
        int iF = r30.f(this.b, this.f3475a.f3491a.hashCode() * 31, 31);
        SeeMoreSectionUiState seeMoreSectionUiState = this.c;
        return iF + (seeMoreSectionUiState == null ? 0 : seeMoreSectionUiState.hashCode());
    }

    public final String toString() {
        return "MyTicketsHeaderUiState(spec=" + this.f3475a + ", title=" + this.b + ", seeMoreSectionUiState=" + this.c + ")";
    }
}
