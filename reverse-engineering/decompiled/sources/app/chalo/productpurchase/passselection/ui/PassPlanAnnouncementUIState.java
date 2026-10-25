package app.chalo.productpurchase.passselection.ui;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.text.TextUIState;
import defpackage.pk0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passselection/ui/PassPlanAnnouncementUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PassPlanAnnouncementUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f8530a;
    public final UIShape b;
    public final ChaloColorToken c;
    public final ChaloPadding d;

    public PassPlanAnnouncementUIState(ChaloColorToken chaloColorToken, TextUIState.ChaloTextUIState chaloTextUIState) {
        float f = ChaloThemeHelper.a().d;
        UIShape.Rectangle rectangle = new UIShape.Rectangle(f, f, f, f);
        float f2 = ChaloThemeHelper.a().g;
        ChaloPadding chaloPadding = new ChaloPadding(f2, f2, f2, f2);
        this.f8530a = chaloTextUIState;
        this.b = rectangle;
        this.c = chaloColorToken;
        this.d = chaloPadding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassPlanAnnouncementUIState)) {
            return false;
        }
        PassPlanAnnouncementUIState passPlanAnnouncementUIState = (PassPlanAnnouncementUIState) obj;
        return Intrinsics.d(this.f8530a, passPlanAnnouncementUIState.f8530a) && Intrinsics.d(this.b, passPlanAnnouncementUIState.b) && Intrinsics.d(this.c, passPlanAnnouncementUIState.c) && Intrinsics.d(this.d, passPlanAnnouncementUIState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + z40.b(this.c, pk0.b(this.b, this.f8530a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "PassPlanAnnouncementUIState(text=" + this.f8530a + ", shape=" + this.b + ", background=" + this.c + ", internalPadding=" + this.d + ")";
    }
}
