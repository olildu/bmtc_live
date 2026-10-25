package app.chalo.productpurchase.productselection.ui;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.text.TextUIState;
import defpackage.py;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/ui/RecentProductItemTagText;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RecentProductItemTagText {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f8700a;
    public final ChaloColorToken b;
    public final ChaloPadding c;

    public RecentProductItemTagText(ChaloColorToken chaloColorToken, TextUIState.ChaloTextUIState chaloTextUIState) {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().d, 0.0f, 2);
        this.f8700a = chaloTextUIState;
        this.b = chaloColorToken;
        this.c = chaloPadding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentProductItemTagText)) {
            return false;
        }
        RecentProductItemTagText recentProductItemTagText = (RecentProductItemTagText) obj;
        return Intrinsics.d(this.f8700a, recentProductItemTagText.f8700a) && Intrinsics.d(this.b, recentProductItemTagText.b) && Intrinsics.d(this.c, recentProductItemTagText.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + z40.b(this.b, this.f8700a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecentProductItemTagText(text=");
        sb.append(this.f8700a);
        sb.append(", backgroundColor=");
        sb.append(this.b);
        sb.append(", internalPadding=");
        return py.e(sb, this.c, ")");
    }
}
