package app.chalo.scenes.args;

import app.chalo.constants.Source;
import app.chalo.scenes.ChaloScenes;
import defpackage.to0;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/PassSelectionArgs;", "Lapp/chalo/scenes/args/SceneArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PassSelectionArgs extends SceneArgs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] h;
    public final String b;
    public final Source c;
    public final Source d;
    public final String e;
    public final PostPassPurchaseSuccessFlowType f;
    public final boolean g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/PassSelectionArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/PassSelectionArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PassSelectionArgs> serializer() {
            return PassSelectionArgs$$serializer.f9279a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new Lazy[]{null, LazyKt.a(lazyThreadSafetyMode, new to0(25)), LazyKt.a(lazyThreadSafetyMode, new to0(26)), null, LazyKt.a(lazyThreadSafetyMode, new to0(27)), null};
    }

    public /* synthetic */ PassSelectionArgs(int i, String str, Source source, Source source2, String str2, PostPassPurchaseSuccessFlowType postPassPurchaseSuccessFlowType, boolean z) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(PassSelectionArgs$$serializer.f9279a.getDescriptor(), i, 3);
            throw null;
        }
        this.b = str;
        this.c = source;
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = source2;
        }
        if ((i & 8) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 16) == 0) {
            this.f = PostPassPurchaseSuccessFlowType.ACTIVATION;
        } else {
            this.f = postPassPurchaseSuccessFlowType;
        }
        if ((i & 32) == 0) {
            this.g = false;
        } else {
            this.g = z;
        }
    }

    @Override // app.chalo.scenes.args.SceneArgs
    public final ChaloScenes c() {
        return ChaloScenes.PassSelectionScreen;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassSelectionArgs)) {
            return false;
        }
        PassSelectionArgs passSelectionArgs = (PassSelectionArgs) obj;
        return Intrinsics.d(this.b, passSelectionArgs.b) && this.c == passSelectionArgs.c && this.d == passSelectionArgs.d && Intrinsics.d(this.e, passSelectionArgs.e) && this.f == passSelectionArgs.f && this.g == passSelectionArgs.g;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        Source source = this.c;
        int iHashCode2 = (iHashCode + (source == null ? 0 : source.hashCode())) * 31;
        Source source2 = this.d;
        int iHashCode3 = (iHashCode2 + (source2 == null ? 0 : source2.hashCode())) * 31;
        String str = this.e;
        return ((this.f.hashCode() + ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31)) * 31) + (this.g ? 1231 : 1237);
    }

    public final String toString() {
        return "PassSelectionArgs(configId=" + this.b + ", source=" + this.c + ", previousScreenSource=" + this.d + ", stopsInfo=" + this.e + ", postSuccessFlow=" + this.f + ", isPremiumPassLandingFlow=" + this.g + ")";
    }

    public PassSelectionArgs(String configId, Source source, Source source2, String str, PostPassPurchaseSuccessFlowType postSuccessFlow, boolean z) {
        Intrinsics.i(configId, "configId");
        Intrinsics.i(postSuccessFlow, "postSuccessFlow");
        this.b = configId;
        this.c = source;
        this.d = source2;
        this.e = str;
        this.f = postSuccessFlow;
        this.g = z;
    }

    public /* synthetic */ PassSelectionArgs(String str, Source source, Source source2, String str2, PostPassPurchaseSuccessFlowType postPassPurchaseSuccessFlowType, int i) {
        this(str, source, (i & 4) != 0 ? null : source2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? PostPassPurchaseSuccessFlowType.ACTIVATION : postPassPurchaseSuccessFlowType, false);
    }
}
