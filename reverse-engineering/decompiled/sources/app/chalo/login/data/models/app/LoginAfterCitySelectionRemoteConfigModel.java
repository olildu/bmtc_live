package app.chalo.login.data.models.app;

import defpackage.dd;
import defpackage.nf1;
import defpackage.vo1;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/login/data/models/app/LoginAfterCitySelectionRemoteConfigModel;", "", "Companion", "$serializer", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class LoginAfterCitySelectionRemoteConfigModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5193a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/login/data/models/app/LoginAfterCitySelectionRemoteConfigModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/login/data/models/app/LoginAfterCitySelectionRemoteConfigModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<LoginAfterCitySelectionRemoteConfigModel> serializer() {
            return LoginAfterCitySelectionRemoteConfigModel$$serializer.f5194a;
        }
    }

    public LoginAfterCitySelectionRemoteConfigModel() {
        this.f5193a = "";
        this.b = "";
        this.c = false;
        this.d = false;
        this.e = "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginAfterCitySelectionRemoteConfigModel)) {
            return false;
        }
        LoginAfterCitySelectionRemoteConfigModel loginAfterCitySelectionRemoteConfigModel = (LoginAfterCitySelectionRemoteConfigModel) obj;
        return Intrinsics.d(this.f5193a, loginAfterCitySelectionRemoteConfigModel.f5193a) && Intrinsics.d(this.b, loginAfterCitySelectionRemoteConfigModel.b) && this.c == loginAfterCitySelectionRemoteConfigModel.c && this.d == loginAfterCitySelectionRemoteConfigModel.d && Intrinsics.d(this.e, loginAfterCitySelectionRemoteConfigModel.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((((nf1.e(this.f5193a.hashCode() * 31, 31, this.b) + (this.c ? 1231 : 1237)) * 31) + (this.d ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("LoginAfterCitySelectionRemoteConfigModel(expId=", this.f5193a, ", expName=", this.b, ", isEnabled=");
        z40.r(sbE, this.c, ", isLoginMandatory=", this.d, ", variant=");
        return vo1.p(sbE, this.e, ")");
    }

    public /* synthetic */ LoginAfterCitySelectionRemoteConfigModel(int i, String str, String str2, boolean z, boolean z2, String str3) {
        if ((i & 1) == 0) {
            this.f5193a = "";
        } else {
            this.f5193a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z2;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str3;
        }
    }
}
