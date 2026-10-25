package app.chalo.compose.components.userprofile;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.pk0;
import defpackage.r30;
import defpackage.uf0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/compose/components/userprofile/UserProfilePicComposableUISpecs;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserProfilePicComposableUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BorderUISpec f1901a;
    public final ChaloPadding b;
    public final ChaloColorToken c;
    public final UIShape d;
    public final float e;
    public final float f;

    public UserProfilePicComposableUISpecs(float f, float f2, ChaloPadding defaultProfileImagePadding, UIShape imageClipShape, BorderUISpec borderUISpecs, ChaloColorToken defaultImageBackgroundColor) {
        Intrinsics.i(borderUISpecs, "borderUISpecs");
        Intrinsics.i(defaultProfileImagePadding, "defaultProfileImagePadding");
        Intrinsics.i(defaultImageBackgroundColor, "defaultImageBackgroundColor");
        Intrinsics.i(imageClipShape, "imageClipShape");
        this.f1901a = borderUISpecs;
        this.b = defaultProfileImagePadding;
        this.c = defaultImageBackgroundColor;
        this.d = imageClipShape;
        this.e = f;
        this.f = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserProfilePicComposableUISpecs)) {
            return false;
        }
        UserProfilePicComposableUISpecs userProfilePicComposableUISpecs = (UserProfilePicComposableUISpecs) obj;
        return Intrinsics.d(this.f1901a, userProfilePicComposableUISpecs.f1901a) && Intrinsics.d(this.b, userProfilePicComposableUISpecs.b) && Intrinsics.d(this.c, userProfilePicComposableUISpecs.c) && Intrinsics.d(this.d, userProfilePicComposableUISpecs.d) && Dp.m7283equalsimpl0(this.e, userProfilePicComposableUISpecs.e) && Dp.m7283equalsimpl0(this.f, userProfilePicComposableUISpecs.f);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.f) + uf0.a(this.e, pk0.b(this.d, z40.b(this.c, r30.c(this.b, this.f1901a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.e);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.f);
        StringBuilder sb = new StringBuilder("UserProfilePicComposableUISpecs(borderUISpecs=");
        sb.append(this.f1901a);
        sb.append(", defaultProfileImagePadding=");
        sb.append(this.b);
        sb.append(", defaultImageBackgroundColor=");
        sb.append(this.c);
        sb.append(", imageClipShape=");
        sb.append(this.d);
        sb.append(", elevationSize=");
        return r30.i(sb, strM7289toStringimpl, ", imageSize=", strM7289toStringimpl2, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public UserProfilePicComposableUISpecs(BorderUISpec borderUISpec, float f, float f2, int i) {
        BorderUISpec borderUISpec2 = (i & 1) != 0 ? new BorderUISpec(ChaloThemeHelper.a().e, ChaloColorToken.IvoryYellow.f9812a, UIShape.Circle.p) : borderUISpec;
        this((i & 16) != 0 ? ChaloThemeHelper.a().b : f, (i & 32) != 0 ? ChaloThemeHelper.a().u : f2, new ChaloPadding(ChaloThemeHelper.a().f, 0.0f, 0.0f, 0.0f, 14), UIShape.Circle.p, borderUISpec2, ChaloColorToken.White.f9870a);
    }
}
