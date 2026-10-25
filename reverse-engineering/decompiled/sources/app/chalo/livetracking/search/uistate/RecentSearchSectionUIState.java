package app.chalo.livetracking.search.uistate;

import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/search/uistate/RecentSearchSectionUIState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RecentSearchSectionUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecentSearchSectionSpec f4516a;
    public final TextUIState.ChaloTextUIState b;
    public final RecentSearchSectionTypeUIState c;

    public RecentSearchSectionUIState(RecentSearchSectionSpec spec, TextUIState.ChaloTextUIState heading, RecentSearchSectionTypeUIState recentSearchSectionTypeUIState) {
        Intrinsics.i(spec, "spec");
        Intrinsics.i(heading, "heading");
        this.f4516a = spec;
        this.b = heading;
        this.c = recentSearchSectionTypeUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentSearchSectionUIState)) {
            return false;
        }
        RecentSearchSectionUIState recentSearchSectionUIState = (RecentSearchSectionUIState) obj;
        return Intrinsics.d(this.f4516a, recentSearchSectionUIState.f4516a) && Intrinsics.d(this.b, recentSearchSectionUIState.b) && Intrinsics.d(this.c, recentSearchSectionUIState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + r30.f(this.b, this.f4516a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "RecentSearchSectionUIState(spec=" + this.f4516a + ", heading=" + this.b + ", sectionType=" + this.c + ")";
    }
}
