package app.chalo.home.ui.history.uistate;

import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/ChaloCitySelectedContainerUiState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloCitySelectedContainerUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloCitySelectedContainerSpec f3464a;
    public final ImageUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final ImageUIState d;

    public ChaloCitySelectedContainerUiState(ChaloCitySelectedContainerSpec chaloCitySelectedContainerSpec, ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState, ImageUIState imageUIState2) {
        this.f3464a = chaloCitySelectedContainerSpec;
        this.b = imageUIState;
        this.c = chaloTextUIState;
        this.d = imageUIState2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloCitySelectedContainerUiState)) {
            return false;
        }
        ChaloCitySelectedContainerUiState chaloCitySelectedContainerUiState = (ChaloCitySelectedContainerUiState) obj;
        if (!this.f3464a.equals(chaloCitySelectedContainerUiState.f3464a) || !this.b.equals(chaloCitySelectedContainerUiState.b) || !this.c.equals(chaloCitySelectedContainerUiState.c) || !this.d.equals(chaloCitySelectedContainerUiState.d)) {
            return false;
        }
        Object obj2 = UiEventHandler.Companion.f9897a;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return UiEventHandler.Companion.f9897a.hashCode() + r30.e(this.d, r30.f(this.c, r30.e(this.b, this.f3464a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "ChaloCitySelectedContainerUiState(spec=" + this.f3464a + ", leadingIcon=" + this.b + ", text=" + this.c + ", trailingIcon=" + this.d + ", eventHandler=" + UiEventHandler.Companion.f9897a + ")";
    }
}
