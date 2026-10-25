package app.chalo.login.data.models.app;

import app.chalo.userprofile.UserProfileAppModel;
import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/data/models/app/PostLoginProfileAndTokensAppModel;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PostLoginProfileAndTokensAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5200a;
    public final String b;
    public final UserProfileAppModel c;

    public PostLoginProfileAndTokensAppModel(String accessToken, String refreshToken, UserProfileAppModel userProfileAppModel) {
        Intrinsics.i(accessToken, "accessToken");
        Intrinsics.i(refreshToken, "refreshToken");
        this.f5200a = accessToken;
        this.b = refreshToken;
        this.c = userProfileAppModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostLoginProfileAndTokensAppModel)) {
            return false;
        }
        PostLoginProfileAndTokensAppModel postLoginProfileAndTokensAppModel = (PostLoginProfileAndTokensAppModel) obj;
        return Intrinsics.d(this.f5200a, postLoginProfileAndTokensAppModel.f5200a) && Intrinsics.d(this.b, postLoginProfileAndTokensAppModel.b) && Intrinsics.d(this.c, postLoginProfileAndTokensAppModel.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + nf1.e(this.f5200a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PostLoginProfileAndTokensAppModel(accessToken=", this.f5200a, ", refreshToken=", this.b, ", userProfile=");
        sbE.append(this.c);
        sbE.append(")");
        return sbE.toString();
    }
}
