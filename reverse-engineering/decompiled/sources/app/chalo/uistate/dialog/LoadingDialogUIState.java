package app.chalo.uistate.dialog;

import app.chalo.compose.components.CircularProgressIndicatorUIState;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.text.TextUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/dialog/LoadingDialogUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LoadingDialogUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f10006a;
    public final CircularProgressIndicatorUIState b;
    public final LoadingDialogUISpec c;
    public final DialogUIEventHandler d;

    public LoadingDialogUIState(TextUIState.ChaloTextUIState chaloTextUIState) {
        CircularProgressIndicatorUIState circularProgressIndicatorUIState = new CircularProgressIndicatorUIState(ChaloThemeHelper.a().d, ChaloThemeHelper.a().n);
        LoadingDialogUISpec loadingDialogUISpec = new LoadingDialogUISpec();
        DialogUIEventHandler dialogUIEventHandler = new DialogUIEventHandler(false, false, DialogDismissRequest.Companion.f9986a);
        this.f10006a = chaloTextUIState;
        this.b = circularProgressIndicatorUIState;
        this.c = loadingDialogUISpec;
        this.d = dialogUIEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadingDialogUIState)) {
            return false;
        }
        LoadingDialogUIState loadingDialogUIState = (LoadingDialogUIState) obj;
        return Intrinsics.d(this.f10006a, loadingDialogUIState.f10006a) && Intrinsics.d(this.b, loadingDialogUIState.b) && Intrinsics.d(this.c, loadingDialogUIState.c) && Intrinsics.d(this.d, loadingDialogUIState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f10006a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LoadingDialogUIState(text=" + this.f10006a + ", loader=" + this.b + ", spec=" + this.c + ", eventHandler=" + this.d + ")";
    }
}
