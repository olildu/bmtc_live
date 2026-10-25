package app.chalo.productactivation.ui;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiAlignment;
import defpackage.pk0;
import defpackage.uf0;
import defpackage.xs;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/UserProfilingTicketActivationBannerUISpecs;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserProfilingTicketActivationBannerUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f8048a;
    public final UiAlignment.Horizontal b;
    public final UiAlignment.Vertical c;
    public final UIShape d;
    public final List e;

    public UserProfilingTicketActivationBannerUISpecs() {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        UIShape.Rectangle backgroundShape = UIShape.e;
        ChaloColorToken.UserProfileLinearLight userProfileLinearLight = ChaloColorToken.UserProfileLinearLight.f9867a;
        List gradientBackgroundColorList = CollectionsKt.S(userProfileLinearLight, ChaloColorToken.CardLinearDark.f9775a, userProfileLinearLight);
        Intrinsics.i(backgroundShape, "backgroundShape");
        Intrinsics.i(gradientBackgroundColorList, "gradientBackgroundColorList");
        this.f8048a = chaloPadding;
        this.b = UiAlignment.Horizontal.Start.f9886a;
        this.c = UiAlignment.Vertical.Center.f9888a;
        this.d = backgroundShape;
        this.e = gradientBackgroundColorList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserProfilingTicketActivationBannerUISpecs)) {
            return false;
        }
        UserProfilingTicketActivationBannerUISpecs userProfilingTicketActivationBannerUISpecs = (UserProfilingTicketActivationBannerUISpecs) obj;
        return Intrinsics.d(this.f8048a, userProfilingTicketActivationBannerUISpecs.f8048a) && Intrinsics.d(this.b, userProfilingTicketActivationBannerUISpecs.b) && Intrinsics.d(this.c, userProfilingTicketActivationBannerUISpecs.c) && Intrinsics.d(this.d, userProfilingTicketActivationBannerUISpecs.d) && Intrinsics.d(this.e, userProfilingTicketActivationBannerUISpecs.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + pk0.b(this.d, uf0.e(this.c, uf0.d(this.b, this.f8048a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserProfilingTicketActivationBannerUISpecs(padding=");
        sb.append(this.f8048a);
        sb.append(", horizontalAlignment=");
        sb.append(this.b);
        sb.append(", rowVerticalAlignment=");
        sb.append(this.c);
        sb.append(", backgroundShape=");
        sb.append(this.d);
        sb.append(", gradientBackgroundColorList=");
        return xs.l(sb, this.e, ")");
    }
}
