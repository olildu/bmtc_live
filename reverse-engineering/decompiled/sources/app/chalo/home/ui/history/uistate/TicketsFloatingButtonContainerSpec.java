package app.chalo.home.ui.history.uistate;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/TicketsFloatingButtonContainerSpec;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TicketsFloatingButtonContainerSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f3489a;
    public final float b;

    public TicketsFloatingButtonContainerSpec() {
        float f = ChaloThemeHelper.a().h;
        this.f3489a = new ChaloPadding(f, f, f, f);
        this.b = 2.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketsFloatingButtonContainerSpec)) {
            return false;
        }
        TicketsFloatingButtonContainerSpec ticketsFloatingButtonContainerSpec = (TicketsFloatingButtonContainerSpec) obj;
        return Intrinsics.d(this.f3489a, ticketsFloatingButtonContainerSpec.f3489a) && Float.compare(this.b, ticketsFloatingButtonContainerSpec.b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) + (this.f3489a.hashCode() * 31);
    }

    public final String toString() {
        return "TicketsFloatingButtonContainerSpec(contentPadding=" + this.f3489a + ", zIndex=" + this.b + ")";
    }
}
