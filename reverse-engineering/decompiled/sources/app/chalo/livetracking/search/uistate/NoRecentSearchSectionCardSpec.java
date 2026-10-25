package app.chalo.livetracking.search.uistate;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.pk0;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/search/uistate/NoRecentSearchSectionCardSpec;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NoRecentSearchSectionCardSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f4510a;
    public final ChaloPadding b;
    public final UIShape c;
    public final ChaloColorToken d;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public NoRecentSearchSectionCardSpec() {
        ChaloPadding chaloPadding = new ChaloPadding(0.0f, 0.0f, 3);
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 2);
        UIShape.Rectangle shape = UIShape.d;
        Intrinsics.i(shape, "shape");
        this.f4510a = chaloPadding;
        this.b = chaloPadding2;
        this.c = shape;
        this.d = ChaloColorToken.CornSilk.f9778a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoRecentSearchSectionCardSpec)) {
            return false;
        }
        NoRecentSearchSectionCardSpec noRecentSearchSectionCardSpec = (NoRecentSearchSectionCardSpec) obj;
        return Intrinsics.d(this.f4510a, noRecentSearchSectionCardSpec.f4510a) && Intrinsics.d(this.b, noRecentSearchSectionCardSpec.b) && Intrinsics.d(this.c, noRecentSearchSectionCardSpec.c) && Intrinsics.d(this.d, noRecentSearchSectionCardSpec.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + pk0.b(this.c, r30.c(this.b, this.f4510a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbM = pk0.m("NoRecentSearchSectionCardSpec(contentPadding=", this.f4510a, ", containerSpacing=", this.b, ", shape=");
        sbM.append(this.c);
        sbM.append(", backgroundColor=");
        sbM.append(this.d);
        sbM.append(")");
        return sbM.toString();
    }
}
