package app.chalo.scenes.args;

import app.chalo.login.AuthenticatedArgs;
import app.chalo.scenes.ChaloScenes;
import defpackage.dd;
import defpackage.nf1;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0003¨\u0006\u0005"}, d2 = {"Lapp/chalo/scenes/args/FareDetailsArgs;", "Lapp/chalo/scenes/args/SceneArgs;", "Lapp/chalo/login/AuthenticatedArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class FareDetailsArgs extends SceneArgs implements AuthenticatedArgs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/FareDetailsArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/FareDetailsArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<FareDetailsArgs> serializer() {
            return FareDetailsArgs$$serializer.f9250a;
        }
    }

    public /* synthetic */ FareDetailsArgs(int i, String str, String str2, String str3, String str4) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(FareDetailsArgs$$serializer.f9250a.getDescriptor(), i, 7);
            throw null;
        }
        this.b = str;
        this.c = str2;
        this.d = str3;
        if ((i & 8) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
    }

    @Override // app.chalo.login.AuthenticatedArgs
    public final boolean b() {
        return true;
    }

    @Override // app.chalo.scenes.args.SceneArgs
    public final ChaloScenes c() {
        return ChaloScenes.FareDetails;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FareDetailsArgs)) {
            return false;
        }
        FareDetailsArgs fareDetailsArgs = (FareDetailsArgs) obj;
        return Intrinsics.d(this.b, fareDetailsArgs.b) && Intrinsics.d(this.c, fareDetailsArgs.c) && Intrinsics.d(this.d, fareDetailsArgs.d) && Intrinsics.d(this.e, fareDetailsArgs.e);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        String str = this.e;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return r30.i(dd.e("FareDetailsArgs(fareDetailsData=", this.b, ", productBookingFlowType=", this.c, ", screenType="), this.d, ", configId=", this.e, ")");
    }

    public FareDetailsArgs(String str, String str2, String str3, String str4) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }
}
