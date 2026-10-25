package app.chalo.scenes.args;

import androidx.webkit.Profile;
import app.chalo.scenes.ChaloScenes;
import defpackage.dd;
import defpackage.nf1;
import defpackage.vo1;
import defpackage.y21;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/scenes/args/RideUserFeedbackScreenArgs;", "Lapp/chalo/scenes/args/SceneArgs;", "Companion", "Auto", Profile.DEFAULT_PROFILE_NAME, "Lapp/chalo/scenes/args/RideUserFeedbackScreenArgs$Auto;", "Lapp/chalo/scenes/args/RideUserFeedbackScreenArgs$Default;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class RideUserFeedbackScreenArgs extends SceneArgs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Object b = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new y21(2));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/RideUserFeedbackScreenArgs$Auto;", "Lapp/chalo/scenes/args/RideUserFeedbackScreenArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Auto extends RideUserFeedbackScreenArgs {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String c;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/RideUserFeedbackScreenArgs$Auto$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/RideUserFeedbackScreenArgs$Auto;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<Auto> serializer() {
                return RideUserFeedbackScreenArgs$Auto$$serializer.f9301a;
            }
        }

        public /* synthetic */ Auto(int i, String str) {
            if (1 == (i & 1)) {
                this.c = str;
            } else {
                PluginExceptionsKt.b(RideUserFeedbackScreenArgs$Auto$$serializer.f9301a.getDescriptor(), i, 1);
                throw null;
            }
        }

        @Override // app.chalo.scenes.args.SceneArgs
        public final ChaloScenes c() {
            return ChaloScenes.RideHailingUserFeedbackScreen;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Auto) && Intrinsics.d(this.c, ((Auto) obj).c);
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return vo1.B("Auto(bookingData=", this.c, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/RideUserFeedbackScreenArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/RideUserFeedbackScreenArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<RideUserFeedbackScreenArgs> serializer() {
            return (KSerializer) RideUserFeedbackScreenArgs.b.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/RideUserFeedbackScreenArgs$Default;", "Lapp/chalo/scenes/args/RideUserFeedbackScreenArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Default extends RideUserFeedbackScreenArgs {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String c;
        public final String d;
        public final String e;
        public final boolean f;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/RideUserFeedbackScreenArgs$Default$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/RideUserFeedbackScreenArgs$Default;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<Default> serializer() {
                return RideUserFeedbackScreenArgs$Default$$serializer.f9302a;
            }
        }

        public /* synthetic */ Default(String str, String str2, int i, String str3, boolean z) {
            if (7 != (i & 7)) {
                PluginExceptionsKt.b(RideUserFeedbackScreenArgs$Default$$serializer.f9302a.getDescriptor(), i, 7);
                throw null;
            }
            this.c = str;
            this.d = str2;
            this.e = str3;
            if ((i & 8) == 0) {
                this.f = false;
            } else {
                this.f = z;
            }
        }

        @Override // app.chalo.scenes.args.SceneArgs
        public final ChaloScenes c() {
            return ChaloScenes.RideHailingUserFeedbackScreen;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Default)) {
                return false;
            }
            Default r5 = (Default) obj;
            return Intrinsics.d(this.c, r5.c) && Intrinsics.d(this.d, r5.d) && Intrinsics.d(this.e, r5.e) && this.f == r5.f;
        }

        public final int hashCode() {
            return nf1.e(nf1.e(this.c.hashCode() * 31, 31, this.d), 31, this.e) + (this.f ? 1231 : 1237);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("Default(bookingData=", this.c, ", productType=", this.d, ", productSubType=");
            sbE.append(this.e);
            sbE.append(", returnToCallerOnExit=");
            sbE.append(this.f);
            sbE.append(")");
            return sbE.toString();
        }

        public Default(String str, String productType, String productSubType, boolean z) {
            Intrinsics.i(productType, "productType");
            Intrinsics.i(productSubType, "productSubType");
            this.c = str;
            this.d = productType;
            this.e = productSubType;
            this.f = z;
        }
    }
}
