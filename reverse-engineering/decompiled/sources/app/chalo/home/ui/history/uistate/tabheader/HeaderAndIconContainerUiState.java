package app.chalo.home.ui.history.uistate.tabheader;

import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.image.ImageUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/tabheader/HeaderAndIconContainerUiState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HeaderAndIconContainerUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HeaderAndIconContainerSpec f3525a;
    public final HeaderTextUiState b;
    public final ImageUIState c;
    public final UiEventHandler$Companion$fromLambda$1 d;

    public HeaderAndIconContainerUiState(HeaderAndIconContainerSpec headerAndIconContainerSpec, HeaderTextUiState headerTextUiState, ImageUIState imageUIState, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        this.f3525a = headerAndIconContainerSpec;
        this.b = headerTextUiState;
        this.c = imageUIState;
        this.d = uiEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeaderAndIconContainerUiState)) {
            return false;
        }
        HeaderAndIconContainerUiState headerAndIconContainerUiState = (HeaderAndIconContainerUiState) obj;
        return this.f3525a.equals(headerAndIconContainerUiState.f3525a) && this.b.equals(headerAndIconContainerUiState.b) && Intrinsics.d(this.c, headerAndIconContainerUiState.c) && this.d.equals(headerAndIconContainerUiState.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f3525a.hashCode() * 31)) * 31;
        ImageUIState imageUIState = this.c;
        return this.d.hashCode() + ((iHashCode + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31);
    }

    public final String toString() {
        return "HeaderAndIconContainerUiState(spec=" + this.f3525a + ", headerTextUiState=" + this.b + ", headerIcon=" + this.c + ", iconEventHandler=" + this.d + ")";
    }
}
