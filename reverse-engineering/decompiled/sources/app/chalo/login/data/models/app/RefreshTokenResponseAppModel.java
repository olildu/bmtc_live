package app.chalo.login.data.models.app;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/data/models/app/RefreshTokenResponseAppModel;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RefreshTokenResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5201a;
    public final String b;

    public RefreshTokenResponseAppModel(String accessToken, String refreshToken) {
        Intrinsics.i(accessToken, "accessToken");
        Intrinsics.i(refreshToken, "refreshToken");
        this.f5201a = accessToken;
        this.b = refreshToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RefreshTokenResponseAppModel)) {
            return false;
        }
        RefreshTokenResponseAppModel refreshTokenResponseAppModel = (RefreshTokenResponseAppModel) obj;
        return Intrinsics.d(this.f5201a, refreshTokenResponseAppModel.f5201a) && Intrinsics.d(this.b, refreshTokenResponseAppModel.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5201a.hashCode() * 31);
    }

    public final String toString() {
        return vo1.o("RefreshTokenResponseAppModel(accessToken=", this.f5201a, ", refreshToken=", this.b, ")");
    }
}
