package app.chalo.home.ui.history.uistate;

import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/SeeMoreSectionUiState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SeeMoreSectionUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SeeMoreSectionUISpec f3484a = new SeeMoreSectionUISpec();
    public final TextUIState.ChaloTextUIState b;
    public final SeeMoreIconUiState c;
    public final UiEventHandler$Companion$fromLambda$1 d;

    public SeeMoreSectionUiState(TextUIState.ChaloTextUIState chaloTextUIState, SeeMoreIconUiState seeMoreIconUiState, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        this.b = chaloTextUIState;
        this.c = seeMoreIconUiState;
        this.d = uiEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeeMoreSectionUiState)) {
            return false;
        }
        SeeMoreSectionUiState seeMoreSectionUiState = (SeeMoreSectionUiState) obj;
        return Intrinsics.d(this.f3484a, seeMoreSectionUiState.f3484a) && Intrinsics.d(this.b, seeMoreSectionUiState.b) && Intrinsics.d(this.c, seeMoreSectionUiState.c) && Intrinsics.d(this.d, seeMoreSectionUiState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + r30.f(this.b, this.f3484a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "SeeMoreSectionUiState(spec=" + this.f3484a + ", text=" + this.b + ", icon=" + this.c + ", eventHandler=" + this.d + ")";
    }
}
