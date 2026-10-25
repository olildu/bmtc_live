package app.chalo.livetracking.stoptripplannerresult.uistate;

import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/RefreshNudgeUiState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RefreshNudgeUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RefreshNudgeUiSpec f4606a = new RefreshNudgeUiSpec();
    public final TextUIState.ChaloTextUIState b;
    public final ImageUIState c;
    public final UiEventHandler$Companion$fromLambda$1 d;

    public RefreshNudgeUiState(UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1, ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState) {
        this.b = chaloTextUIState;
        this.c = imageUIState;
        this.d = uiEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RefreshNudgeUiState)) {
            return false;
        }
        RefreshNudgeUiState refreshNudgeUiState = (RefreshNudgeUiState) obj;
        return Intrinsics.d(this.f4606a, refreshNudgeUiState.f4606a) && Intrinsics.d(this.b, refreshNudgeUiState.b) && Intrinsics.d(this.c, refreshNudgeUiState.c) && Intrinsics.d(this.d, refreshNudgeUiState.d);
    }

    public final int hashCode() {
        int iF = r30.f(this.b, this.f4606a.hashCode() * 31, 31);
        ImageUIState imageUIState = this.c;
        return this.d.hashCode() + ((iF + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31);
    }

    public final String toString() {
        return "RefreshNudgeUiState(specs=" + this.f4606a + ", text=" + this.b + ", icon=" + this.c + ", clickHandler=" + this.d + ")";
    }
}
