package app.chalo.scenes.args;

import app.chalo.constants.Source;
import app.chalo.scenes.ChaloScenes;
import defpackage.b3;
import defpackage.dd;
import defpackage.hf0;
import defpackage.nf1;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/LoginOtpSceneArgs;", "Lapp/chalo/scenes/args/SceneArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class LoginOtpSceneArgs extends SceneArgs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] g = {null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new hf0(19)), null};
    public final String b;
    public final String c;
    public final String d;
    public final Source e;
    public final boolean f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/LoginOtpSceneArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/LoginOtpSceneArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<LoginOtpSceneArgs> serializer() {
            return LoginOtpSceneArgs$$serializer.f9269a;
        }
    }

    public /* synthetic */ LoginOtpSceneArgs(int i, String str, String str2, String str3, Source source, boolean z) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(LoginOtpSceneArgs$$serializer.f9269a.getDescriptor(), i, 15);
            throw null;
        }
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = source;
        if ((i & 16) == 0) {
            this.f = true;
        } else {
            this.f = z;
        }
    }

    @Override // app.chalo.scenes.args.SceneArgs
    public final ChaloScenes c() {
        return ChaloScenes.LoginOtp;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginOtpSceneArgs)) {
            return false;
        }
        LoginOtpSceneArgs loginOtpSceneArgs = (LoginOtpSceneArgs) obj;
        return Intrinsics.d(this.b, loginOtpSceneArgs.b) && Intrinsics.d(this.c, loginOtpSceneArgs.c) && Intrinsics.d(this.d, loginOtpSceneArgs.d) && this.e == loginOtpSceneArgs.e && this.f == loginOtpSceneArgs.f;
    }

    public final int hashCode() {
        return nf1.f(this.e, nf1.e(nf1.e(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31) + (this.f ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("LoginOtpSceneArgs(refNo=", this.b, ", phoneNumber=", this.c, ", countryCallingCode=");
        sbE.append(this.d);
        sbE.append(", source=");
        sbE.append(this.e);
        sbE.append(", handlePostLoginNavigation=");
        return b3.g(")", sbE, this.f);
    }

    public LoginOtpSceneArgs(Source source, String refNo, String phoneNumber, String countryCallingCode, boolean z) {
        Intrinsics.i(refNo, "refNo");
        Intrinsics.i(phoneNumber, "phoneNumber");
        Intrinsics.i(countryCallingCode, "countryCallingCode");
        Intrinsics.i(source, "source");
        this.b = refNo;
        this.c = phoneNumber;
        this.d = countryCallingCode;
        this.e = source;
        this.f = z;
    }
}
