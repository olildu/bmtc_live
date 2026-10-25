package app.chalo.uistate.dialog;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/dialog/DialogueCtaUISpec;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DialogueCtaUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f9990a;

    public DialogueCtaUISpec() {
        float f = ChaloThemeHelper.a().f;
        float f2 = ChaloThemeHelper.a().e;
        this.f9990a = new ChaloPadding(f2, f, f, f2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DialogueCtaUISpec) && Intrinsics.d(this.f9990a, ((DialogueCtaUISpec) obj).f9990a);
    }

    public final int hashCode() {
        return this.f9990a.hashCode();
    }

    public final String toString() {
        return "DialogueCtaUISpec(contentPadding=" + this.f9990a + ")";
    }
}
