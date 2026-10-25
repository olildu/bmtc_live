package app.chalo.uistate.dialog;

import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.text.TextUIState;
import defpackage.nf1;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/dialog/DialogueCtaUiState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DialogueCtaUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DialogueCtaUISpec f9991a = new DialogueCtaUISpec();
    public final TextUIState.ChaloTextUIState b;
    public final UiEventHandler$Companion$fromLambda$1 c;

    public DialogueCtaUiState(TextUIState.ChaloTextUIState chaloTextUIState, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        this.b = chaloTextUIState;
        this.c = uiEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DialogueCtaUiState)) {
            return false;
        }
        DialogueCtaUiState dialogueCtaUiState = (DialogueCtaUiState) obj;
        return Intrinsics.d(this.f9991a, dialogueCtaUiState.f9991a) && Intrinsics.d(this.b, dialogueCtaUiState.b) && Intrinsics.d(this.c, dialogueCtaUiState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + r30.f(this.b, this.f9991a.f9990a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogueCtaUiState(spec=");
        sb.append(this.f9991a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", uiEventHandler=");
        return nf1.n(sb, this.c, ")");
    }
}
