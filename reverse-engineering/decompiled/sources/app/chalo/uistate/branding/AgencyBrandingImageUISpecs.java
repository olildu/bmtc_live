package app.chalo.uistate.branding;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/branding/AgencyBrandingImageUISpecs;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AgencyBrandingImageUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f9912a;
    public final boolean b;

    public AgencyBrandingImageUISpecs(int i) {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 0.0f, 0.0f, 14);
        boolean z = (i & 2) != 0;
        this.f9912a = chaloPadding;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AgencyBrandingImageUISpecs)) {
            return false;
        }
        AgencyBrandingImageUISpecs agencyBrandingImageUISpecs = (AgencyBrandingImageUISpecs) obj;
        return Intrinsics.d(this.f9912a, agencyBrandingImageUISpecs.f9912a) && this.b == agencyBrandingImageUISpecs.b;
    }

    public final int hashCode() {
        return (this.f9912a.hashCode() * 31) + (this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "AgencyBrandingImageUISpecs(paddingAroundBranding=" + this.f9912a + ", shouldTakeFullSpace=" + this.b + ")";
    }
}
