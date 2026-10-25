package app.chalo.uistate.text;

import app.chalo.uistate.image.ImageUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/text/AlertTextWithIconUiState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AlertTextWithIconUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AlertTextWithIconSpec f10076a;
    public final ImageUIState b;
    public final TextUIState c;

    public AlertTextWithIconUiState(AlertTextWithIconSpec spec, ImageUIState icon, TextUIState textUIState) {
        Intrinsics.i(spec, "spec");
        Intrinsics.i(icon, "icon");
        this.f10076a = spec;
        this.b = icon;
        this.c = textUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlertTextWithIconUiState)) {
            return false;
        }
        AlertTextWithIconUiState alertTextWithIconUiState = (AlertTextWithIconUiState) obj;
        return Intrinsics.d(this.f10076a, alertTextWithIconUiState.f10076a) && Intrinsics.d(this.b, alertTextWithIconUiState.b) && Intrinsics.d(this.c, alertTextWithIconUiState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + r30.e(this.b, this.f10076a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AlertTextWithIconUiState(spec=" + this.f10076a + ", icon=" + this.b + ", text=" + this.c + ")";
    }

    public /* synthetic */ AlertTextWithIconUiState(ImageUIState imageUIState, TextUIState.StyledTextUIState styledTextUIState) {
        this(new AlertTextWithIconSpec(0.0f, 15), imageUIState, styledTextUIState);
    }
}
