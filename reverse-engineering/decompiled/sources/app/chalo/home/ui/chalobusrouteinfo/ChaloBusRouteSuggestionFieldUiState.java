package app.chalo.home.ui.chalobusrouteinfo;

import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TitleSubtitleUiState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteSuggestionFieldUiState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloBusRouteSuggestionFieldUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageUIState f3363a;
    public final TitleSubtitleUiState b;
    public final ChaloBusRouteSuggestionFieldUiSpec c;

    public ChaloBusRouteSuggestionFieldUiState(ImageUIState imageUIState, TitleSubtitleUiState titleSubtitleUiState) {
        ChaloBusRouteSuggestionFieldUiSpec chaloBusRouteSuggestionFieldUiSpec = new ChaloBusRouteSuggestionFieldUiSpec();
        this.f3363a = imageUIState;
        this.b = titleSubtitleUiState;
        this.c = chaloBusRouteSuggestionFieldUiSpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloBusRouteSuggestionFieldUiState)) {
            return false;
        }
        ChaloBusRouteSuggestionFieldUiState chaloBusRouteSuggestionFieldUiState = (ChaloBusRouteSuggestionFieldUiState) obj;
        return Intrinsics.d(this.f3363a, chaloBusRouteSuggestionFieldUiState.f3363a) && Intrinsics.d(this.b, chaloBusRouteSuggestionFieldUiState.b) && Intrinsics.d(this.c, chaloBusRouteSuggestionFieldUiState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f3363a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ChaloBusRouteSuggestionFieldUiState(icon=" + this.f3363a + ", content=" + this.b + ", specs=" + this.c + ")";
    }
}
