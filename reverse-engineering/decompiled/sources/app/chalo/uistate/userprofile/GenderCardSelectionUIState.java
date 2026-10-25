package app.chalo.uistate.userprofile;

import app.chalo.uistate.text.TextUIState;
import defpackage.pk0;
import defpackage.xs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/userprofile/GenderCardSelectionUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GenderCardSelectionUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GenderCardSelectionSpec f10123a;
    public final TextUIState b;
    public final List c;

    public GenderCardSelectionUIState(GenderCardSelectionSpec genderCardSelectionSpec, TextUIState title, List cards) {
        Intrinsics.i(title, "title");
        Intrinsics.i(cards, "cards");
        this.f10123a = genderCardSelectionSpec;
        this.b = title;
        this.c = cards;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenderCardSelectionUIState)) {
            return false;
        }
        GenderCardSelectionUIState genderCardSelectionUIState = (GenderCardSelectionUIState) obj;
        return Intrinsics.d(this.f10123a, genderCardSelectionUIState.f10123a) && Intrinsics.d(this.b, genderCardSelectionUIState.b) && Intrinsics.d(this.c, genderCardSelectionUIState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + pk0.c(this.b, this.f10123a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GenderCardSelectionUIState(spec=");
        sb.append(this.f10123a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", cards=");
        return xs.l(sb, this.c, ")");
    }
}
