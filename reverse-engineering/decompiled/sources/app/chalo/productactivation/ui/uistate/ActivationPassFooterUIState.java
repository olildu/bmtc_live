package app.chalo.productactivation.ui.uistate;

import defpackage.xs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/uistate/ActivationPassFooterUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ActivationPassFooterUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActivationPassFooterUISpecs f8055a;
    public final ActivationNoticeUIState b;
    public final List c;

    public ActivationPassFooterUIState(ActivationNoticeUIState activationNoticeUIState, List ctaButtonUIStateList, int i) {
        ActivationPassFooterUISpecs activationPassFooterUISpecs = new ActivationPassFooterUISpecs();
        activationNoticeUIState = (i & 2) != 0 ? null : activationNoticeUIState;
        Intrinsics.i(ctaButtonUIStateList, "ctaButtonUIStateList");
        this.f8055a = activationPassFooterUISpecs;
        this.b = activationNoticeUIState;
        this.c = ctaButtonUIStateList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivationPassFooterUIState)) {
            return false;
        }
        ActivationPassFooterUIState activationPassFooterUIState = (ActivationPassFooterUIState) obj;
        return Intrinsics.d(this.f8055a, activationPassFooterUIState.f8055a) && Intrinsics.d(this.b, activationPassFooterUIState.b) && Intrinsics.d(this.c, activationPassFooterUIState.c);
    }

    public final int hashCode() {
        int iHashCode = this.f8055a.hashCode() * 31;
        ActivationNoticeUIState activationNoticeUIState = this.b;
        return this.c.hashCode() + ((iHashCode + (activationNoticeUIState == null ? 0 : activationNoticeUIState.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivationPassFooterUIState(specs=");
        sb.append(this.f8055a);
        sb.append(", noticeUIState=");
        sb.append(this.b);
        sb.append(", ctaButtonUIStateList=");
        return xs.l(sb, this.c, ")");
    }
}
