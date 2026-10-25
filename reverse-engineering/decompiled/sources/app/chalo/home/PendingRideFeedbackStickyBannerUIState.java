package app.chalo.home;

import app.chalo.home.ui.base.a;
import defpackage.n4;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/PendingRideFeedbackStickyBannerUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PendingRideFeedbackStickyBannerUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f2862a;
    public final n4 b;
    public final a c;

    public PendingRideFeedbackStickyBannerUIState(ArrayList arrayList, n4 n4Var, a aVar) {
        this.f2862a = arrayList;
        this.b = n4Var;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PendingRideFeedbackStickyBannerUIState)) {
            return false;
        }
        PendingRideFeedbackStickyBannerUIState pendingRideFeedbackStickyBannerUIState = (PendingRideFeedbackStickyBannerUIState) obj;
        return this.f2862a.equals(pendingRideFeedbackStickyBannerUIState.f2862a) && this.b.equals(pendingRideFeedbackStickyBannerUIState.b) && this.c.equals(pendingRideFeedbackStickyBannerUIState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f2862a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PendingRideFeedbackStickyBannerUIState(prompts=" + this.f2862a + ", onRatingClick=" + this.b + ", onDismissClick=" + this.c + ")";
    }
}
