package app.chalo.scenes.args;

import app.chalo.constants.Source;
import app.chalo.login.AuthenticatedArgs;
import app.chalo.scenes.ChaloScenes;
import defpackage.b3;
import defpackage.cb0;
import defpackage.gg1;
import defpackage.n21;
import defpackage.nf1;
import defpackage.tf1;
import defpackage.vo1;
import defpackage.xs;
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
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u00012\u00020\u00022\u00020\u0003:\u0006\u0005\u0006\u0007\b\t\u0004\u0082\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lapp/chalo/scenes/args/SuperPassPurchaseArgs;", "Lapp/chalo/scenes/args/SceneArgs;", "Lapp/chalo/scenes/args/ParentArgs;", "Lapp/chalo/login/AuthenticatedArgs;", "Companion", "ConfirmSuperPassPurchaseArgs", "UserProofsOverviewArgs", "EnterUserDetailsArgs", "PassengerSelectionArgs", "ProofUploadInternalArgs", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs;", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs$EnterUserDetailsArgs;", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs$PassengerSelectionArgs;", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs$ProofUploadInternalArgs;", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs$UserProofsOverviewArgs;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class SuperPassPurchaseArgs extends SceneArgs implements ParentArgs, AuthenticatedArgs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Object b = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new tf1(21));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/SuperPassPurchaseArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<SuperPassPurchaseArgs> serializer() {
            return (KSerializer) SuperPassPurchaseArgs.b.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\u0002\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lapp/chalo/scenes/args/SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs;", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs;", "Companion", "FreshWithoutProof", "PaymentModeChangedNoVerification", "Renew", "PaymentPostVerification", "InternalArgs", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$FreshWithoutProof;", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$InternalArgs;", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$PaymentModeChangedNoVerification;", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$PaymentPostVerification;", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$Renew;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static abstract class ConfirmSuperPassPurchaseArgs extends SuperPassPurchaseArgs {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Object c = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new tf1(22));

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            public final KSerializer<ConfirmSuperPassPurchaseArgs> serializer() {
                return (KSerializer) ConfirmSuperPassPurchaseArgs.c.getValue();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/scenes/args/SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$InternalArgs;", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class InternalArgs extends ConfirmSuperPassPurchaseArgs {
            public static final InternalArgs INSTANCE = new InternalArgs();
            public static final /* synthetic */ Object d;

            static {
                Source.Companion companion = Source.INSTANCE;
                d = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new tf1(25));
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof InternalArgs);
            }

            public final int hashCode() {
                return 1609559732;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            public final KSerializer<InternalArgs> serializer() {
                return (KSerializer) d.getValue();
            }

            public final String toString() {
                return "InternalArgs";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$PaymentModeChangedNoVerification;", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class PaymentModeChangedNoVerification extends ConfirmSuperPassPurchaseArgs {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public static final Lazy[] j;
            public final Source d;
            public final String e;
            public final String f;
            public final long g;
            public final String h;
            public final PostPassPurchaseSuccessFlowType i;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$PaymentModeChangedNoVerification$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$PaymentModeChangedNoVerification;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<PaymentModeChangedNoVerification> serializer() {
                    return SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$PaymentModeChangedNoVerification$$serializer.f9312a;
                }
            }

            static {
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                j = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new tf1(26)), null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new tf1(27))};
            }

            public /* synthetic */ PaymentModeChangedNoVerification(int i, long j2, Source source, PostPassPurchaseSuccessFlowType postPassPurchaseSuccessFlowType, String str, String str2, String str3) {
                if (63 != (i & 63)) {
                    PluginExceptionsKt.b(SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$PaymentModeChangedNoVerification$$serializer.f9312a.getDescriptor(), i, 63);
                    throw null;
                }
                this.d = source;
                this.e = str;
                this.f = str2;
                this.g = j2;
                this.h = str3;
                this.i = postPassPurchaseSuccessFlowType;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PaymentModeChangedNoVerification)) {
                    return false;
                }
                PaymentModeChangedNoVerification paymentModeChangedNoVerification = (PaymentModeChangedNoVerification) obj;
                return this.d == paymentModeChangedNoVerification.d && Intrinsics.d(this.e, paymentModeChangedNoVerification.e) && Intrinsics.d(this.f, paymentModeChangedNoVerification.f) && this.g == paymentModeChangedNoVerification.g && Intrinsics.d(this.h, paymentModeChangedNoVerification.h) && this.i == paymentModeChangedNoVerification.i;
            }

            public final int hashCode() {
                int iE = nf1.e(nf1.e(this.d.hashCode() * 31, 31, this.e), 31, this.f);
                long j2 = this.g;
                return this.i.hashCode() + nf1.e((iE + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.h);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("PaymentModeChangedNoVerification(source=");
                sb.append(this.d);
                sb.append(", bookablePassConfig=");
                sb.append(this.e);
                sb.append(", userDetailsString=");
                n21.p(this.g, this.f, ", passStartTime=", sb);
                sb.append(", proofsMapString=");
                sb.append(this.h);
                sb.append(", postPassPurchaseSuccessFlowType=");
                sb.append(this.i);
                sb.append(")");
                return sb.toString();
            }
        }

        @Override // app.chalo.scenes.args.SceneArgs
        public final ChaloScenes c() {
            return ChaloScenes.ConfirmSuperPassScreen;
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$FreshWithoutProof;", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class FreshWithoutProof extends ConfirmSuperPassPurchaseArgs {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public static final Lazy[] j;
            public final Source d;
            public final String e;
            public final String f;
            public final String g;
            public final PostPassPurchaseSuccessFlowType h;
            public final boolean i;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$FreshWithoutProof$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$FreshWithoutProof;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<FreshWithoutProof> serializer() {
                    return SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$FreshWithoutProof$$serializer.f9311a;
                }
            }

            static {
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                j = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new tf1(23)), null, null, null, LazyKt.a(lazyThreadSafetyMode, new tf1(24)), null};
            }

            public /* synthetic */ FreshWithoutProof(int i, Source source, String str, String str2, String str3, PostPassPurchaseSuccessFlowType postPassPurchaseSuccessFlowType, boolean z) {
                if (31 != (i & 31)) {
                    PluginExceptionsKt.b(SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$FreshWithoutProof$$serializer.f9311a.getDescriptor(), i, 31);
                    throw null;
                }
                this.d = source;
                this.e = str;
                this.f = str2;
                this.g = str3;
                this.h = postPassPurchaseSuccessFlowType;
                if ((i & 32) == 0) {
                    this.i = false;
                } else {
                    this.i = z;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FreshWithoutProof)) {
                    return false;
                }
                FreshWithoutProof freshWithoutProof = (FreshWithoutProof) obj;
                return this.d == freshWithoutProof.d && Intrinsics.d(this.e, freshWithoutProof.e) && Intrinsics.d(this.f, freshWithoutProof.f) && Intrinsics.d(this.g, freshWithoutProof.g) && this.h == freshWithoutProof.h && this.i == freshWithoutProof.i;
            }

            public final int hashCode() {
                int iE = nf1.e(nf1.e(this.d.hashCode() * 31, 31, this.e), 31, this.f);
                String str = this.g;
                return ((this.h.hashCode() + ((iE + (str == null ? 0 : str.hashCode())) * 31)) * 31) + (this.i ? 1231 : 1237);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("FreshWithoutProof(source=");
                sb.append(this.d);
                sb.append(", bookablePassConfig=");
                sb.append(this.e);
                sb.append(", userDetailsString=");
                cb0.t(sb, this.f, ", purchaseStopsInfoString=", this.g, ", postPassPurchaseSuccessFlowType=");
                sb.append(this.h);
                sb.append(", isPremiumPassLandingFlow=");
                sb.append(this.i);
                sb.append(")");
                return sb.toString();
            }

            public FreshWithoutProof(Source source, String str, String str2, String str3, PostPassPurchaseSuccessFlowType postPassPurchaseSuccessFlowType, boolean z) {
                Intrinsics.i(source, "source");
                Intrinsics.i(postPassPurchaseSuccessFlowType, "postPassPurchaseSuccessFlowType");
                this.d = source;
                this.e = str;
                this.f = str2;
                this.g = str3;
                this.h = postPassPurchaseSuccessFlowType;
                this.i = z;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$PaymentPostVerification;", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class PaymentPostVerification extends ConfirmSuperPassPurchaseArgs {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public static final Lazy[] j;
            public final Source d;
            public final String e;
            public final String f;
            public final long g;
            public final long h;
            public final PostPassPurchaseSuccessFlowType i;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$PaymentPostVerification$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$PaymentPostVerification;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<PaymentPostVerification> serializer() {
                    return SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$PaymentPostVerification$$serializer.f9313a;
                }
            }

            static {
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                j = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new tf1(28)), null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new tf1(29))};
            }

            public /* synthetic */ PaymentPostVerification(int i, Source source, String str, String str2, long j2, long j3, PostPassPurchaseSuccessFlowType postPassPurchaseSuccessFlowType) {
                if (63 != (i & 63)) {
                    PluginExceptionsKt.b(SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$PaymentPostVerification$$serializer.f9313a.getDescriptor(), i, 63);
                    throw null;
                }
                this.d = source;
                this.e = str;
                this.f = str2;
                this.g = j2;
                this.h = j3;
                this.i = postPassPurchaseSuccessFlowType;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PaymentPostVerification)) {
                    return false;
                }
                PaymentPostVerification paymentPostVerification = (PaymentPostVerification) obj;
                return this.d == paymentPostVerification.d && Intrinsics.d(this.e, paymentPostVerification.e) && Intrinsics.d(this.f, paymentPostVerification.f) && this.g == paymentPostVerification.g && this.h == paymentPostVerification.h && this.i == paymentPostVerification.i;
            }

            public final int hashCode() {
                int iE = nf1.e(nf1.e(this.d.hashCode() * 31, 31, this.e), 31, this.f);
                long j2 = this.g;
                int i = (iE + ((int) (j2 ^ (j2 >>> 32)))) * 31;
                long j3 = this.h;
                return this.i.hashCode() + ((i + ((int) (j3 ^ (j3 >>> 32)))) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("PaymentPostVerification(source=");
                sb.append(this.d);
                sb.append(", bookablePassConfig=");
                sb.append(this.e);
                sb.append(", userDetailsString=");
                n21.p(this.g, this.f, ", verificationExpiryTime=", sb);
                xs.r(this.h, ", passStartTime=", ", postPassPurchaseSuccessFlowType=", sb);
                sb.append(this.i);
                sb.append(")");
                return sb.toString();
            }

            public PaymentPostVerification(Source source, String str, String str2, long j2, long j3, PostPassPurchaseSuccessFlowType postPassPurchaseSuccessFlowType) {
                Intrinsics.i(source, "source");
                Intrinsics.i(postPassPurchaseSuccessFlowType, "postPassPurchaseSuccessFlowType");
                this.d = source;
                this.e = str;
                this.f = str2;
                this.g = j2;
                this.h = j3;
                this.i = postPassPurchaseSuccessFlowType;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$Renew;", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class Renew extends ConfirmSuperPassPurchaseArgs {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public static final Lazy[] j;
            public final Source d;
            public final String e;
            public final String f;
            public final String g;
            public final long h;
            public final PostPassPurchaseSuccessFlowType i;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$Renew$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$Renew;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<Renew> serializer() {
                    return SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$Renew$$serializer.f9314a;
                }
            }

            static {
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                j = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new gg1(0)), null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new gg1(1))};
            }

            public /* synthetic */ Renew(int i, long j2, Source source, PostPassPurchaseSuccessFlowType postPassPurchaseSuccessFlowType, String str, String str2, String str3) {
                if (63 != (i & 63)) {
                    PluginExceptionsKt.b(SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$Renew$$serializer.f9314a.getDescriptor(), i, 63);
                    throw null;
                }
                this.d = source;
                this.e = str;
                this.f = str2;
                this.g = str3;
                this.h = j2;
                this.i = postPassPurchaseSuccessFlowType;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Renew)) {
                    return false;
                }
                Renew renew = (Renew) obj;
                return this.d == renew.d && Intrinsics.d(this.e, renew.e) && Intrinsics.d(this.f, renew.f) && Intrinsics.d(this.g, renew.g) && this.h == renew.h && this.i == renew.i;
            }

            public final int hashCode() {
                int iE = nf1.e(nf1.e(nf1.e(this.d.hashCode() * 31, 31, this.e), 31, this.f), 31, this.g);
                long j2 = this.h;
                return this.i.hashCode() + ((iE + ((int) (j2 ^ (j2 >>> 32)))) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Renew(source=");
                sb.append(this.d);
                sb.append(", bookablePassConfig=");
                sb.append(this.e);
                sb.append(", userDetailsString=");
                cb0.t(sb, this.f, ", passId=", this.g, ", verificationExpiryTime=");
                sb.append(this.h);
                sb.append(", postPassPurchaseSuccessFlowType=");
                sb.append(this.i);
                sb.append(")");
                return sb.toString();
            }

            public Renew(Source source, String str, String str2, String passId, long j2, PostPassPurchaseSuccessFlowType postPassPurchaseSuccessFlowType) {
                Intrinsics.i(source, "source");
                Intrinsics.i(passId, "passId");
                Intrinsics.i(postPassPurchaseSuccessFlowType, "postPassPurchaseSuccessFlowType");
                this.d = source;
                this.e = str;
                this.f = str2;
                this.g = passId;
                this.h = j2;
                this.i = postPassPurchaseSuccessFlowType;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/scenes/args/SuperPassPurchaseArgs$PassengerSelectionArgs;", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs;", "Companion", "FreshWithProof", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs$PassengerSelectionArgs$FreshWithProof;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static abstract class PassengerSelectionArgs extends SuperPassPurchaseArgs {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Object c = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new gg1(13));

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/SuperPassPurchaseArgs$PassengerSelectionArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs$PassengerSelectionArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            public final KSerializer<PassengerSelectionArgs> serializer() {
                return (KSerializer) PassengerSelectionArgs.c.getValue();
            }
        }

        @Override // app.chalo.scenes.args.SceneArgs
        public final ChaloScenes c() {
            return ChaloScenes.PassPassengerSelectionScreen;
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/SuperPassPurchaseArgs$PassengerSelectionArgs$FreshWithProof;", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs$PassengerSelectionArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class FreshWithProof extends PassengerSelectionArgs {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public static final Lazy[] i;
            public final Source d;
            public final String e;
            public final String f;
            public final PostPassPurchaseSuccessFlowType g;
            public final boolean h;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/SuperPassPurchaseArgs$PassengerSelectionArgs$FreshWithProof$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs$PassengerSelectionArgs$FreshWithProof;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<FreshWithProof> serializer() {
                    return SuperPassPurchaseArgs$PassengerSelectionArgs$FreshWithProof$$serializer.f9318a;
                }
            }

            static {
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                i = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new gg1(14)), null, null, LazyKt.a(lazyThreadSafetyMode, new gg1(15)), null};
            }

            public /* synthetic */ FreshWithProof(int i2, Source source, String str, String str2, PostPassPurchaseSuccessFlowType postPassPurchaseSuccessFlowType, boolean z) {
                if (15 != (i2 & 15)) {
                    PluginExceptionsKt.b(SuperPassPurchaseArgs$PassengerSelectionArgs$FreshWithProof$$serializer.f9318a.getDescriptor(), i2, 15);
                    throw null;
                }
                this.d = source;
                this.e = str;
                this.f = str2;
                this.g = postPassPurchaseSuccessFlowType;
                if ((i2 & 16) == 0) {
                    this.h = false;
                } else {
                    this.h = z;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FreshWithProof)) {
                    return false;
                }
                FreshWithProof freshWithProof = (FreshWithProof) obj;
                return this.d == freshWithProof.d && Intrinsics.d(this.e, freshWithProof.e) && Intrinsics.d(this.f, freshWithProof.f) && this.g == freshWithProof.g && this.h == freshWithProof.h;
            }

            public final int hashCode() {
                int iE = nf1.e(this.d.hashCode() * 31, 31, this.e);
                String str = this.f;
                return ((this.g.hashCode() + ((iE + (str == null ? 0 : str.hashCode())) * 31)) * 31) + (this.h ? 1231 : 1237);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("FreshWithProof(source=");
                sb.append(this.d);
                sb.append(", bookablePassConfig=");
                sb.append(this.e);
                sb.append(", purchaseStopsInfoString=");
                sb.append(this.f);
                sb.append(", postPassPurchaseSuccessFlowType=");
                sb.append(this.g);
                sb.append(", isPremiumPassLandingFlow=");
                return b3.g(")", sb, this.h);
            }

            public FreshWithProof(Source source, String str, String str2, PostPassPurchaseSuccessFlowType postPassPurchaseSuccessFlowType, boolean z) {
                Intrinsics.i(source, "source");
                Intrinsics.i(postPassPurchaseSuccessFlowType, "postPassPurchaseSuccessFlowType");
                this.d = source;
                this.e = str;
                this.f = str2;
                this.g = postPassPurchaseSuccessFlowType;
                this.h = z;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/scenes/args/SuperPassPurchaseArgs$UserProofsOverviewArgs;", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs;", "Companion", "Reapplication", "InternalArgs", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs$UserProofsOverviewArgs$InternalArgs;", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs$UserProofsOverviewArgs$Reapplication;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static abstract class UserProofsOverviewArgs extends SuperPassPurchaseArgs {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Object c = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new gg1(17));

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/SuperPassPurchaseArgs$UserProofsOverviewArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs$UserProofsOverviewArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            public final KSerializer<UserProofsOverviewArgs> serializer() {
                return (KSerializer) UserProofsOverviewArgs.c.getValue();
            }
        }

        @Override // app.chalo.scenes.args.SceneArgs
        public final ChaloScenes c() {
            return ChaloScenes.PassUserProofsOverviewScreen;
        }

        /* JADX INFO: renamed from: d */
        public abstract String getG();

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/SuperPassPurchaseArgs$UserProofsOverviewArgs$Reapplication;", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs$UserProofsOverviewArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class Reapplication extends UserProofsOverviewArgs {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public static final Lazy[] j = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new gg1(19)), null, null, null, null, null};
            public final Source d;
            public final String e;
            public final String f;
            public final String g;
            public final String h;
            public final long i;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/SuperPassPurchaseArgs$UserProofsOverviewArgs$Reapplication$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs$UserProofsOverviewArgs$Reapplication;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<Reapplication> serializer() {
                    return SuperPassPurchaseArgs$UserProofsOverviewArgs$Reapplication$$serializer.f9321a;
                }
            }

            public /* synthetic */ Reapplication(int i, Source source, String str, String str2, String str3, String str4, long j2) {
                if (63 != (i & 63)) {
                    PluginExceptionsKt.b(SuperPassPurchaseArgs$UserProofsOverviewArgs$Reapplication$$serializer.f9321a.getDescriptor(), i, 63);
                    throw null;
                }
                this.d = source;
                this.e = str;
                this.f = str2;
                this.g = str3;
                this.h = str4;
                this.i = j2;
            }

            @Override // app.chalo.scenes.args.SuperPassPurchaseArgs.UserProofsOverviewArgs
            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getG() {
                return this.g;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Reapplication)) {
                    return false;
                }
                Reapplication reapplication = (Reapplication) obj;
                return this.d == reapplication.d && Intrinsics.d(this.e, reapplication.e) && Intrinsics.d(this.f, reapplication.f) && Intrinsics.d(this.g, reapplication.g) && Intrinsics.d(this.h, reapplication.h) && this.i == reapplication.i;
            }

            public final int hashCode() {
                int iE = nf1.e(nf1.e(nf1.e(nf1.e(this.d.hashCode() * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h);
                long j2 = this.i;
                return iE + ((int) (j2 ^ (j2 >>> 32)));
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Reapplication(source=");
                sb.append(this.d);
                sb.append(", bookablePassConfig=");
                sb.append(this.e);
                sb.append(", userDetailsString=");
                cb0.t(sb, this.f, ", actionRequiredString=", this.g, ", rejectionReasonsString=");
                n21.p(this.i, this.h, ", passStartTime=", sb);
                sb.append(")");
                return sb.toString();
            }

            public Reapplication(Source source, String str, String str2, String str3, String str4, long j2) {
                Intrinsics.i(source, "source");
                this.d = source;
                this.e = str;
                this.f = str2;
                this.g = str3;
                this.h = str4;
                this.i = j2;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/SuperPassPurchaseArgs$UserProofsOverviewArgs$InternalArgs;", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs$UserProofsOverviewArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class InternalArgs extends UserProofsOverviewArgs {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public static final Lazy[] g = {null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new gg1(18)), null};
            public final String d;
            public final Source e;
            public final String f;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/SuperPassPurchaseArgs$UserProofsOverviewArgs$InternalArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs$UserProofsOverviewArgs$InternalArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<InternalArgs> serializer() {
                    return SuperPassPurchaseArgs$UserProofsOverviewArgs$InternalArgs$$serializer.f9320a;
                }
            }

            public /* synthetic */ InternalArgs(int i, Source source, String str, String str2) {
                if (1 != (i & 1)) {
                    PluginExceptionsKt.b(SuperPassPurchaseArgs$UserProofsOverviewArgs$InternalArgs$$serializer.f9320a.getDescriptor(), i, 1);
                    throw null;
                }
                this.d = str;
                this.e = (i & 2) == 0 ? Source.UNKNOWN : source;
                if ((i & 4) == 0) {
                    this.f = "";
                } else {
                    this.f = str2;
                }
            }

            @Override // app.chalo.scenes.args.SuperPassPurchaseArgs.UserProofsOverviewArgs
            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getG() {
                return this.d;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InternalArgs) && Intrinsics.d(this.d, ((InternalArgs) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return vo1.B("InternalArgs(actionRequiredString=", this.d, ")");
            }

            public InternalArgs(String str) {
                this.d = str;
                this.e = Source.UNKNOWN;
                this.f = "";
            }
        }
    }

    @Override // app.chalo.login.AuthenticatedArgs
    public final boolean b() {
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lapp/chalo/scenes/args/SuperPassPurchaseArgs$EnterUserDetailsArgs;", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs;", "Companion", "FreshWithoutProof", "FreshWithProof", "InternalArgs", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs$EnterUserDetailsArgs$FreshWithProof;", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs$EnterUserDetailsArgs$FreshWithoutProof;", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs$EnterUserDetailsArgs$InternalArgs;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static abstract class EnterUserDetailsArgs extends SuperPassPurchaseArgs {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Object c = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new gg1(2));

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/SuperPassPurchaseArgs$EnterUserDetailsArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs$EnterUserDetailsArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            public final KSerializer<EnterUserDetailsArgs> serializer() {
                return (KSerializer) EnterUserDetailsArgs.c.getValue();
            }
        }

        @Override // app.chalo.scenes.args.SceneArgs
        public final ChaloScenes c() {
            return ChaloScenes.PassUserEnterDetailsScreen;
        }

        /* JADX INFO: renamed from: d */
        public abstract SuperPassBasicUserPurpose getD();

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/SuperPassPurchaseArgs$EnterUserDetailsArgs$FreshWithProof;", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs$EnterUserDetailsArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class FreshWithProof extends EnterUserDetailsArgs {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public static final Lazy[] j;
            public final Source d;
            public final String e;
            public final String f;
            public final PostPassPurchaseSuccessFlowType g;
            public final boolean h;
            public final Lazy i;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/SuperPassPurchaseArgs$EnterUserDetailsArgs$FreshWithProof$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs$EnterUserDetailsArgs$FreshWithProof;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<FreshWithProof> serializer() {
                    return SuperPassPurchaseArgs$EnterUserDetailsArgs$FreshWithProof$$serializer.f9315a;
                }
            }

            static {
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                j = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new gg1(3)), null, null, LazyKt.a(lazyThreadSafetyMode, new gg1(4)), null};
            }

            public /* synthetic */ FreshWithProof(int i, Source source, String str, String str2, PostPassPurchaseSuccessFlowType postPassPurchaseSuccessFlowType, boolean z) {
                if (15 != (i & 15)) {
                    PluginExceptionsKt.b(SuperPassPurchaseArgs$EnterUserDetailsArgs$FreshWithProof$$serializer.f9315a.getDescriptor(), i, 15);
                    throw null;
                }
                this.d = source;
                this.e = str;
                this.f = str2;
                this.g = postPassPurchaseSuccessFlowType;
                if ((i & 16) == 0) {
                    this.h = false;
                } else {
                    this.h = z;
                }
                this.i = LazyKt.b(new gg1(5));
            }

            @Override // app.chalo.scenes.args.SuperPassPurchaseArgs.EnterUserDetailsArgs
            /* JADX INFO: renamed from: d */
            public final SuperPassBasicUserPurpose getD() {
                return (SuperPassBasicUserPurpose) this.i.getValue();
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FreshWithProof)) {
                    return false;
                }
                FreshWithProof freshWithProof = (FreshWithProof) obj;
                return this.d == freshWithProof.d && Intrinsics.d(this.e, freshWithProof.e) && Intrinsics.d(this.f, freshWithProof.f) && this.g == freshWithProof.g && this.h == freshWithProof.h;
            }

            public final int hashCode() {
                int iE = nf1.e(this.d.hashCode() * 31, 31, this.e);
                String str = this.f;
                return ((this.g.hashCode() + ((iE + (str == null ? 0 : str.hashCode())) * 31)) * 31) + (this.h ? 1231 : 1237);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("FreshWithProof(source=");
                sb.append(this.d);
                sb.append(", bookablePassConfig=");
                sb.append(this.e);
                sb.append(", purchaseStopsInfoString=");
                sb.append(this.f);
                sb.append(", postPassPurchaseSuccessFlowType=");
                sb.append(this.g);
                sb.append(", isPremiumPassLandingFlow=");
                return b3.g(")", sb, this.h);
            }

            public FreshWithProof(Source source, String str, String str2, PostPassPurchaseSuccessFlowType postPassPurchaseSuccessFlowType, boolean z) {
                Intrinsics.i(source, "source");
                Intrinsics.i(postPassPurchaseSuccessFlowType, "postPassPurchaseSuccessFlowType");
                this.d = source;
                this.e = str;
                this.f = str2;
                this.g = postPassPurchaseSuccessFlowType;
                this.h = z;
                this.i = LazyKt.b(new gg1(6));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/SuperPassPurchaseArgs$EnterUserDetailsArgs$FreshWithoutProof;", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs$EnterUserDetailsArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class FreshWithoutProof extends EnterUserDetailsArgs {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public static final Lazy[] j;
            public final Source d;
            public final String e;
            public final String f;
            public final PostPassPurchaseSuccessFlowType g;
            public final boolean h;
            public final Lazy i;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/SuperPassPurchaseArgs$EnterUserDetailsArgs$FreshWithoutProof$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs$EnterUserDetailsArgs$FreshWithoutProof;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<FreshWithoutProof> serializer() {
                    return SuperPassPurchaseArgs$EnterUserDetailsArgs$FreshWithoutProof$$serializer.f9316a;
                }
            }

            static {
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                j = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new gg1(8)), null, null, LazyKt.a(lazyThreadSafetyMode, new gg1(9)), null};
            }

            public /* synthetic */ FreshWithoutProof(int i, Source source, String str, String str2, PostPassPurchaseSuccessFlowType postPassPurchaseSuccessFlowType, boolean z) {
                if (15 != (i & 15)) {
                    PluginExceptionsKt.b(SuperPassPurchaseArgs$EnterUserDetailsArgs$FreshWithoutProof$$serializer.f9316a.getDescriptor(), i, 15);
                    throw null;
                }
                this.d = source;
                this.e = str;
                this.f = str2;
                this.g = postPassPurchaseSuccessFlowType;
                if ((i & 16) == 0) {
                    this.h = false;
                } else {
                    this.h = z;
                }
                this.i = LazyKt.b(new gg1(7));
            }

            @Override // app.chalo.scenes.args.SuperPassPurchaseArgs.EnterUserDetailsArgs
            /* JADX INFO: renamed from: d */
            public final SuperPassBasicUserPurpose getD() {
                return (SuperPassBasicUserPurpose) this.i.getValue();
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FreshWithoutProof)) {
                    return false;
                }
                FreshWithoutProof freshWithoutProof = (FreshWithoutProof) obj;
                return this.d == freshWithoutProof.d && Intrinsics.d(this.e, freshWithoutProof.e) && Intrinsics.d(this.f, freshWithoutProof.f) && this.g == freshWithoutProof.g && this.h == freshWithoutProof.h;
            }

            public final int hashCode() {
                int iE = nf1.e(this.d.hashCode() * 31, 31, this.e);
                String str = this.f;
                return ((this.g.hashCode() + ((iE + (str == null ? 0 : str.hashCode())) * 31)) * 31) + (this.h ? 1231 : 1237);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("FreshWithoutProof(source=");
                sb.append(this.d);
                sb.append(", bookablePassConfig=");
                sb.append(this.e);
                sb.append(", purchaseStopsInfoString=");
                sb.append(this.f);
                sb.append(", postPassPurchaseSuccessFlowType=");
                sb.append(this.g);
                sb.append(", isPremiumPassLandingFlow=");
                return b3.g(")", sb, this.h);
            }

            public FreshWithoutProof(Source source, String str, String str2, PostPassPurchaseSuccessFlowType postPassPurchaseSuccessFlowType, boolean z) {
                Intrinsics.i(source, "source");
                Intrinsics.i(postPassPurchaseSuccessFlowType, "postPassPurchaseSuccessFlowType");
                this.d = source;
                this.e = str;
                this.f = str2;
                this.g = postPassPurchaseSuccessFlowType;
                this.h = z;
                this.i = LazyKt.b(new gg1(10));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/SuperPassPurchaseArgs$EnterUserDetailsArgs$InternalArgs;", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs$EnterUserDetailsArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class InternalArgs extends EnterUserDetailsArgs {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public static final Lazy[] g;
            public final SuperPassBasicUserPurpose d;
            public final Source e;
            public final String f;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/SuperPassPurchaseArgs$EnterUserDetailsArgs$InternalArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs$EnterUserDetailsArgs$InternalArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<InternalArgs> serializer() {
                    return SuperPassPurchaseArgs$EnterUserDetailsArgs$InternalArgs$$serializer.f9317a;
                }
            }

            static {
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                g = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new gg1(11)), LazyKt.a(lazyThreadSafetyMode, new gg1(12)), null};
            }

            public /* synthetic */ InternalArgs(int i, SuperPassBasicUserPurpose superPassBasicUserPurpose, Source source, String str) {
                if (1 != (i & 1)) {
                    PluginExceptionsKt.b(SuperPassPurchaseArgs$EnterUserDetailsArgs$InternalArgs$$serializer.f9317a.getDescriptor(), i, 1);
                    throw null;
                }
                this.d = superPassBasicUserPurpose;
                if ((i & 2) == 0) {
                    this.e = Source.UNKNOWN;
                } else {
                    this.e = source;
                }
                if ((i & 4) == 0) {
                    this.f = "";
                } else {
                    this.f = str;
                }
            }

            @Override // app.chalo.scenes.args.SuperPassPurchaseArgs.EnterUserDetailsArgs
            /* JADX INFO: renamed from: d, reason: from getter */
            public final SuperPassBasicUserPurpose getD() {
                return this.d;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InternalArgs) && this.d == ((InternalArgs) obj).d;
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return "InternalArgs(purpose=" + this.d + ")";
            }

            public InternalArgs(SuperPassBasicUserPurpose purpose) {
                Intrinsics.i(purpose, "purpose");
                this.d = purpose;
                this.e = Source.UNKNOWN;
                this.f = "";
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/SuperPassPurchaseArgs$ProofUploadInternalArgs;", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class ProofUploadInternalArgs extends SuperPassPurchaseArgs {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] f = {null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new gg1(16)), null};
        public final String c;
        public final Source d;
        public final String e;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/SuperPassPurchaseArgs$ProofUploadInternalArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs$ProofUploadInternalArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<ProofUploadInternalArgs> serializer() {
                return SuperPassPurchaseArgs$ProofUploadInternalArgs$$serializer.f9319a;
            }
        }

        public /* synthetic */ ProofUploadInternalArgs(int i, Source source, String str, String str2) {
            if (1 != (i & 1)) {
                PluginExceptionsKt.b(SuperPassPurchaseArgs$ProofUploadInternalArgs$$serializer.f9319a.getDescriptor(), i, 1);
                throw null;
            }
            this.c = str;
            this.d = (i & 2) == 0 ? Source.UNKNOWN : source;
            if ((i & 4) == 0) {
                this.e = "";
            } else {
                this.e = str2;
            }
        }

        @Override // app.chalo.scenes.args.SceneArgs
        public final ChaloScenes c() {
            return ChaloScenes.SuperPassProofUploadScreen;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProofUploadInternalArgs) && Intrinsics.d(this.c, ((ProofUploadInternalArgs) obj).c);
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return vo1.B("ProofUploadInternalArgs(proofDocProps=", this.c, ")");
        }

        public ProofUploadInternalArgs(String proofDocProps) {
            Intrinsics.i(proofDocProps, "proofDocProps");
            this.c = proofDocProps;
            this.d = Source.UNKNOWN;
            this.e = "";
        }
    }
}
