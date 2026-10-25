package app.chalo.scenes.args;

import app.chalo.scenes.ChaloScenes;
import defpackage.dd;
import defpackage.n21;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/WebViewArgs;", "Lapp/chalo/scenes/args/SceneArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class WebViewArgs extends SceneArgs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/WebViewArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/WebViewArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<WebViewArgs> serializer() {
            return WebViewArgs$$serializer.f9349a;
        }
    }

    public /* synthetic */ WebViewArgs(String str, int i, String str2, boolean z, boolean z2) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(WebViewArgs$$serializer.f9349a.getDescriptor(), i, 15);
            throw null;
        }
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
    }

    @Override // app.chalo.scenes.args.SceneArgs
    public final ChaloScenes c() {
        return ChaloScenes.WebViewScene;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebViewArgs)) {
            return false;
        }
        WebViewArgs webViewArgs = (WebViewArgs) obj;
        return Intrinsics.d(this.b, webViewArgs.b) && Intrinsics.d(this.c, webViewArgs.c) && this.d == webViewArgs.d && this.e == webViewArgs.e;
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        return ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.d ? 1231 : 1237)) * 31) + (this.e ? 1231 : 1237);
    }

    public final String toString() {
        return n21.h(dd.e("WebViewArgs(url=", this.b, ", title=", this.c, ", imageMode="), this.d, ", hideActionBar=", this.e, ")");
    }

    public WebViewArgs(String str, String str2, boolean z, boolean z2) {
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
    }
}
