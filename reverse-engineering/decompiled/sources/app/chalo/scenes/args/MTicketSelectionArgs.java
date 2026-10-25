package app.chalo.scenes.args;

import app.chalo.constants.Source;
import app.chalo.login.AuthenticatedArgs;
import app.chalo.scenes.ChaloScenes;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.sg0;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0003¨\u0006\u0005"}, d2 = {"Lapp/chalo/scenes/args/MTicketSelectionArgs;", "Lapp/chalo/scenes/args/SceneArgs;", "Lapp/chalo/login/AuthenticatedArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class MTicketSelectionArgs extends SceneArgs implements AuthenticatedArgs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] h = {null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new sg0(6)), null};
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Source f;
    public final String g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/MTicketSelectionArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/MTicketSelectionArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<MTicketSelectionArgs> serializer() {
            return MTicketSelectionArgs$$serializer.f9270a;
        }
    }

    public /* synthetic */ MTicketSelectionArgs(int i, String str, String str2, String str3, String str4, Source source, String str5) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(MTicketSelectionArgs$$serializer.f9270a.getDescriptor(), i, 7);
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
        if ((i & 16) == 0) {
            this.f = null;
        } else {
            this.f = source;
        }
        if ((i & 32) == 0) {
            this.g = null;
        } else {
            this.g = str5;
        }
    }

    @Override // app.chalo.login.AuthenticatedArgs
    public final boolean b() {
        return true;
    }

    @Override // app.chalo.scenes.args.SceneArgs
    public final ChaloScenes c() {
        return ChaloScenes.MTicketSelection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MTicketSelectionArgs)) {
            return false;
        }
        MTicketSelectionArgs mTicketSelectionArgs = (MTicketSelectionArgs) obj;
        return Intrinsics.d(this.b, mTicketSelectionArgs.b) && Intrinsics.d(this.c, mTicketSelectionArgs.c) && Intrinsics.d(this.d, mTicketSelectionArgs.d) && Intrinsics.d(this.e, mTicketSelectionArgs.e) && this.f == mTicketSelectionArgs.f && Intrinsics.d(this.g, mTicketSelectionArgs.g);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        String str = this.e;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        Source source = this.f;
        int iHashCode2 = (iHashCode + (source == null ? 0 : source.hashCode())) * 31;
        String str2 = this.g;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("MTicketSelectionArgs(routeDetailsJson=", this.b, ", fromStopJson=", this.c, ", toStopJson=");
        cb0.t(sbE, this.d, ", configId=", this.e, ", source=");
        sbE.append(this.f);
        sbE.append(", oldMticketId=");
        sbE.append(this.g);
        sbE.append(")");
        return sbE.toString();
    }

    public MTicketSelectionArgs(String str, String str2, String str3, String str4, Source source, String str5) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = source;
        this.g = str5;
    }

    public /* synthetic */ MTicketSelectionArgs(String str, String str2, String str3, String str4, Source source, int i) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : source, (String) null);
    }
}
