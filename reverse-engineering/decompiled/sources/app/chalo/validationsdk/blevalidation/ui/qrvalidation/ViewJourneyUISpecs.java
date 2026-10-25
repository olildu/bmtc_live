package app.chalo.validationsdk.blevalidation.ui.qrvalidation;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.UiAlignment;
import defpackage.py;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/ViewJourneyUISpecs;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ViewJourneyUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UiAlignment.Horizontal f10663a;
    public final UiAlignment.Vertical b;
    public final ChaloPadding c;

    public ViewJourneyUISpecs() {
        ChaloPadding chaloPadding = new ChaloPadding(0.0f, ChaloThemeHelper.a().f, 1);
        this.f10663a = UiAlignment.Horizontal.Center.f9884a;
        this.b = UiAlignment.Vertical.Center.f9888a;
        this.c = chaloPadding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewJourneyUISpecs)) {
            return false;
        }
        ViewJourneyUISpecs viewJourneyUISpecs = (ViewJourneyUISpecs) obj;
        return Intrinsics.d(this.f10663a, viewJourneyUISpecs.f10663a) && Intrinsics.d(this.b, viewJourneyUISpecs.b) && Intrinsics.d(this.c, viewJourneyUISpecs.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + uf0.e(this.b, this.f10663a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewJourneyUISpecs(horizontalAlignment=");
        sb.append(this.f10663a);
        sb.append(", verticalAlignment=");
        sb.append(this.b);
        sb.append(", padding=");
        return py.e(sb, this.c, ")");
    }
}
