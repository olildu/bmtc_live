package app.chalo.home.ui.compose;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiAlignment;
import defpackage.pk0;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/compose/UserProfilingChaloBusStickyBannerUISpecs;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserProfilingChaloBusStickyBannerUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f3388a;
    public final UIShape b;
    public final ChaloPadding c;
    public final UiAlignment.Vertical d;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public UserProfilingChaloBusStickyBannerUISpecs() {
        UIShape.Rectangle backgroundShape = UIShape.e;
        float f = ChaloThemeHelper.a().f;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        Intrinsics.i(backgroundShape, "backgroundShape");
        this.f3388a = ChaloColorToken.GreenBase.f9800a;
        this.b = backgroundShape;
        this.c = chaloPadding;
        this.d = UiAlignment.Vertical.Center.f9888a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserProfilingChaloBusStickyBannerUISpecs)) {
            return false;
        }
        UserProfilingChaloBusStickyBannerUISpecs userProfilingChaloBusStickyBannerUISpecs = (UserProfilingChaloBusStickyBannerUISpecs) obj;
        return Intrinsics.d(this.f3388a, userProfilingChaloBusStickyBannerUISpecs.f3388a) && Intrinsics.d(this.b, userProfilingChaloBusStickyBannerUISpecs.b) && Intrinsics.d(this.c, userProfilingChaloBusStickyBannerUISpecs.c) && Intrinsics.d(this.d, userProfilingChaloBusStickyBannerUISpecs.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + r30.c(this.c, pk0.b(this.b, this.f3388a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "UserProfilingChaloBusStickyBannerUISpecs(backgroundColor=" + this.f3388a + ", backgroundShape=" + this.b + ", contentPadding=" + this.c + ", verticalAlignment=" + this.d + ")";
    }
}
