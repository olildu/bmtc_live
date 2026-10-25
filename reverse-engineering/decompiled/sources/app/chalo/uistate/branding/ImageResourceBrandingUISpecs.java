package app.chalo.uistate.branding;

import androidx.compose.ui.Alignment;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/branding/ImageResourceBrandingUISpecs;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ImageResourceBrandingUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f9914a;
    public final Alignment b;

    public ImageResourceBrandingUISpecs(ChaloPadding chaloPadding, Alignment imageAlignment, int i) {
        chaloPadding = (i & 1) != 0 ? new ChaloPadding(ChaloThemeHelper.a().f1916a, 0.0f, 0.0f, 0.0f, 14) : chaloPadding;
        imageAlignment = (i & 2) != 0 ? Alignment.INSTANCE.getCenter() : imageAlignment;
        Intrinsics.i(imageAlignment, "imageAlignment");
        this.f9914a = chaloPadding;
        this.b = imageAlignment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageResourceBrandingUISpecs)) {
            return false;
        }
        ImageResourceBrandingUISpecs imageResourceBrandingUISpecs = (ImageResourceBrandingUISpecs) obj;
        return Intrinsics.d(this.f9914a, imageResourceBrandingUISpecs.f9914a) && Intrinsics.d(this.b, imageResourceBrandingUISpecs.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f9914a.hashCode() * 31);
    }

    public final String toString() {
        return "ImageResourceBrandingUISpecs(paddingAroundBranding=" + this.f9914a + ", imageAlignment=" + this.b + ")";
    }
}
