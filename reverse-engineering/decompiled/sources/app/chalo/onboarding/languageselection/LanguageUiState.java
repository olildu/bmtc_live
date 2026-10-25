package app.chalo.onboarding.languageselection;

import app.chalo.data.BackgroundShape;
import app.chalo.uistate.text.TextUIState;
import defpackage.cy;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/languageselection/LanguageUiState;", "", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LanguageUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f6663a;
    public final LanguageItemUiSpec b;
    public final cy c;

    static {
        BackgroundShape.Companion companion = BackgroundShape.INSTANCE;
    }

    public LanguageUiState(TextUIState.ChaloTextUIState chaloTextUIState, LanguageItemUiSpec languageItemUiSpec, cy cyVar) {
        this.f6663a = chaloTextUIState;
        this.b = languageItemUiSpec;
        this.c = cyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LanguageUiState)) {
            return false;
        }
        LanguageUiState languageUiState = (LanguageUiState) obj;
        return this.f6663a.equals(languageUiState.f6663a) && this.b.equals(languageUiState.b) && this.c.equals(languageUiState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f6663a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LanguageUiState(textState=" + this.f6663a + ", languageItemUiSpec=" + this.b + ", itemClickIntentHandler=" + this.c + ")";
    }
}
