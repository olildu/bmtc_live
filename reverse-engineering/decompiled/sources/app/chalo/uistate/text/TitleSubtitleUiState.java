package app.chalo.uistate.text;

import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/text/TitleSubtitleUiState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TitleSubtitleUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TitleSubtitleUiSpecs f10097a;
    public final TextUIState.ChaloTextUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final UiEventHandler d;

    public TitleSubtitleUiState(TitleSubtitleUiSpecs titleSubtitleUiSpecs, TextUIState.ChaloTextUIState title, TextUIState.ChaloTextUIState chaloTextUIState, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1, int i) {
        titleSubtitleUiSpecs = (i & 1) != 0 ? new TitleSubtitleUiSpecs(0.0f, 3) : titleSubtitleUiSpecs;
        UiEventHandler uiEventHandler = (i & 8) != 0 ? UiEventHandler.Companion.f9897a : uiEventHandler$Companion$fromLambda$1;
        Intrinsics.i(title, "title");
        this.f10097a = titleSubtitleUiSpecs;
        this.b = title;
        this.c = chaloTextUIState;
        this.d = uiEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TitleSubtitleUiState)) {
            return false;
        }
        TitleSubtitleUiState titleSubtitleUiState = (TitleSubtitleUiState) obj;
        return Intrinsics.d(this.f10097a, titleSubtitleUiState.f10097a) && Intrinsics.d(this.b, titleSubtitleUiState.b) && Intrinsics.d(this.c, titleSubtitleUiState.c) && Intrinsics.d(this.d, titleSubtitleUiState.d);
    }

    public final int hashCode() {
        int iF = r30.f(this.b, this.f10097a.hashCode() * 31, 31);
        TextUIState.ChaloTextUIState chaloTextUIState = this.c;
        return this.d.hashCode() + ((iF + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31);
    }

    public final String toString() {
        return "TitleSubtitleUiState(spec=" + this.f10097a + ", title=" + this.b + ", subtitle=" + this.c + ", eventHandler=" + this.d + ")";
    }
}
