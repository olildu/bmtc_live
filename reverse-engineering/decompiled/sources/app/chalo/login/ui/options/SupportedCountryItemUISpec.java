package app.chalo.login.ui.options;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.image.ImageUISize;
import defpackage.vo1;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/options/SupportedCountryItemUISpec;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SupportedCountryItemUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageUISize f5323a;
    public final ChaloColorToken b;
    public final float c;

    public SupportedCountryItemUISpec() {
        ImageUISize imageUISize = new ImageUISize(ChaloThemeHelper.a().n);
        float f = ChaloThemeHelper.a().h;
        this.f5323a = imageUISize;
        this.b = ChaloColorToken.Gray85.f9798a;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SupportedCountryItemUISpec)) {
            return false;
        }
        SupportedCountryItemUISpec supportedCountryItemUISpec = (SupportedCountryItemUISpec) obj;
        return Intrinsics.d(this.f5323a, supportedCountryItemUISpec.f5323a) && Intrinsics.d(this.b, supportedCountryItemUISpec.b) && Dp.m7283equalsimpl0(this.c, supportedCountryItemUISpec.c);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.c) + z40.b(this.b, this.f5323a.hashCode() * 31, 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.c);
        StringBuilder sb = new StringBuilder("SupportedCountryItemUISpec(unavailableIconSize=");
        sb.append(this.f5323a);
        sb.append(", unavailableIconBackgroundColor=");
        sb.append(this.b);
        sb.append(", iconAndCallingCodeSpace=");
        return vo1.p(sb, strM7289toStringimpl, ")");
    }
}
