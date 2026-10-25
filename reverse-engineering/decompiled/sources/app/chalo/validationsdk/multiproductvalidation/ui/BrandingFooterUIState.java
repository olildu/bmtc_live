package app.chalo.validationsdk.multiproductvalidation.ui;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.divider.DividerOrientation;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.py;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/multiproductvalidation/ui/BrandingFooterUIState;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BrandingFooterUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f10682a;
    public final List b;
    public final DividerUIState c;
    public final ChaloPadding d;

    public BrandingFooterUIState(TextUIState.ChaloTextUIState chaloTextUIState, List branding) {
        DividerUIState dividerUIState = new DividerUIState(0.0f, null, DividerOrientation.Vertical, 3);
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().g, 0.0f, 2);
        Intrinsics.i(branding, "branding");
        this.f10682a = chaloTextUIState;
        this.b = branding;
        this.c = dividerUIState;
        this.d = chaloPadding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrandingFooterUIState)) {
            return false;
        }
        BrandingFooterUIState brandingFooterUIState = (BrandingFooterUIState) obj;
        return Intrinsics.d(this.f10682a, brandingFooterUIState.f10682a) && Intrinsics.d(this.b, brandingFooterUIState.b) && Intrinsics.d(this.c, brandingFooterUIState.c) && Intrinsics.d(this.d, brandingFooterUIState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + py.c(this.c, r30.b(this.f10682a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return "BrandingFooterUIState(label=" + this.f10682a + ", branding=" + this.b + ", divider=" + this.c + ", paddingAroundDivider=" + this.d + ")";
    }
}
