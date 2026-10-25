package app.chalo.scenes.args;

import app.chalo.constants.Source;
import app.chalo.login.AuthenticatedArgs;
import app.chalo.scenes.ChaloScenes;
import defpackage.dd;
import defpackage.hq0;
import defpackage.nf1;
import defpackage.r30;
import defpackage.t10;
import defpackage.vo1;
import defpackage.vr0;
import java.util.List;
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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lapp/chalo/scenes/args/PremiumBusArgs;", "Lapp/chalo/scenes/args/SceneArgs;", "Lapp/chalo/scenes/args/ParentArgs;", "Companion", "StopSelectionArgs", "SlotSelectionArgs", "PremiumProductSelectionArgs", "PremiumStopDetailsArgs", "PremiumBusPassLandingScreenArgs", "PremiumBusSeatSelectionArgs", "PremiumBusBulkBookingConfirmationScreenArgs", "PremiumBusSlotListScreenArgs", "Lapp/chalo/scenes/args/PremiumBusArgs$PremiumBusBulkBookingConfirmationScreenArgs;", "Lapp/chalo/scenes/args/PremiumBusArgs$PremiumBusPassLandingScreenArgs;", "Lapp/chalo/scenes/args/PremiumBusArgs$PremiumBusSeatSelectionArgs;", "Lapp/chalo/scenes/args/PremiumBusArgs$PremiumBusSlotListScreenArgs;", "Lapp/chalo/scenes/args/PremiumBusArgs$PremiumProductSelectionArgs;", "Lapp/chalo/scenes/args/PremiumBusArgs$PremiumStopDetailsArgs;", "Lapp/chalo/scenes/args/PremiumBusArgs$SlotSelectionArgs;", "Lapp/chalo/scenes/args/PremiumBusArgs$StopSelectionArgs;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class PremiumBusArgs extends SceneArgs implements ParentArgs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Object b = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new vr0(19));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/PremiumBusArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/PremiumBusArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<PremiumBusArgs> serializer() {
            return (KSerializer) PremiumBusArgs.b.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/PremiumBusArgs$PremiumBusBulkBookingConfirmationScreenArgs;", "Lapp/chalo/scenes/args/PremiumBusArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class PremiumBusBulkBookingConfirmationScreenArgs extends PremiumBusArgs {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] e = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new vr0(20)), null};
        public final Source c;
        public final String d;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/PremiumBusArgs$PremiumBusBulkBookingConfirmationScreenArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/PremiumBusArgs$PremiumBusBulkBookingConfirmationScreenArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<PremiumBusBulkBookingConfirmationScreenArgs> serializer() {
                return PremiumBusArgs$PremiumBusBulkBookingConfirmationScreenArgs$$serializer.f9284a;
            }
        }

        public /* synthetic */ PremiumBusBulkBookingConfirmationScreenArgs(int i, Source source, String str) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.b(PremiumBusArgs$PremiumBusBulkBookingConfirmationScreenArgs$$serializer.f9284a.getDescriptor(), i, 3);
                throw null;
            }
            this.c = source;
            this.d = str;
        }

        @Override // app.chalo.scenes.args.SceneArgs
        public final ChaloScenes c() {
            return ChaloScenes.PremiumBusBulkBookingConfirmationScreen;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PremiumBusBulkBookingConfirmationScreenArgs)) {
                return false;
            }
            PremiumBusBulkBookingConfirmationScreenArgs premiumBusBulkBookingConfirmationScreenArgs = (PremiumBusBulkBookingConfirmationScreenArgs) obj;
            return this.c == premiumBusBulkBookingConfirmationScreenArgs.c && Intrinsics.d(this.d, premiumBusBulkBookingConfirmationScreenArgs.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + (this.c.hashCode() * 31);
        }

        public final String toString() {
            return "PremiumBusBulkBookingConfirmationScreenArgs(source=" + this.c + ", flowType=" + this.d + ")";
        }

        public PremiumBusBulkBookingConfirmationScreenArgs(Source source, String str) {
            Intrinsics.i(source, "source");
            this.c = source;
            this.d = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0003¨\u0006\u0005"}, d2 = {"Lapp/chalo/scenes/args/PremiumBusArgs$PremiumBusPassLandingScreenArgs;", "Lapp/chalo/scenes/args/PremiumBusArgs;", "Lapp/chalo/login/AuthenticatedArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class PremiumBusPassLandingScreenArgs extends PremiumBusArgs implements AuthenticatedArgs {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] g;
        public final PassLandingFlowType c;
        public final Source d;
        public final boolean e;
        public final String f;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/PremiumBusArgs$PremiumBusPassLandingScreenArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/PremiumBusArgs$PremiumBusPassLandingScreenArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<PremiumBusPassLandingScreenArgs> serializer() {
                return PremiumBusArgs$PremiumBusPassLandingScreenArgs$$serializer.f9285a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            g = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new vr0(21)), LazyKt.a(lazyThreadSafetyMode, new vr0(22)), null, null};
        }

        public /* synthetic */ PremiumBusPassLandingScreenArgs(int i, PassLandingFlowType passLandingFlowType, Source source, boolean z, String str) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.b(PremiumBusArgs$PremiumBusPassLandingScreenArgs$$serializer.f9285a.getDescriptor(), i, 3);
                throw null;
            }
            this.c = passLandingFlowType;
            this.d = source;
            if ((i & 4) == 0) {
                this.e = false;
            } else {
                this.e = z;
            }
            if ((i & 8) == 0) {
                this.f = null;
            } else {
                this.f = str;
            }
        }

        @Override // app.chalo.login.AuthenticatedArgs
        public final boolean b() {
            return true;
        }

        @Override // app.chalo.scenes.args.SceneArgs
        public final ChaloScenes c() {
            return ChaloScenes.PremiumBusPassPurchaseLandingScreen;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PremiumBusPassLandingScreenArgs)) {
                return false;
            }
            PremiumBusPassLandingScreenArgs premiumBusPassLandingScreenArgs = (PremiumBusPassLandingScreenArgs) obj;
            return Intrinsics.d(this.c, premiumBusPassLandingScreenArgs.c) && this.d == premiumBusPassLandingScreenArgs.d && this.e == premiumBusPassLandingScreenArgs.e && Intrinsics.d(this.f, premiumBusPassLandingScreenArgs.f);
        }

        public final int hashCode() {
            int iF = (nf1.f(this.d, this.c.hashCode() * 31, 31) + (this.e ? 1231 : 1237)) * 31;
            String str = this.f;
            return iF + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "PremiumBusPassLandingScreenArgs(passLandingFlowType=" + this.c + ", previousScreenSource=" + this.d + ", isRouteBasedPass=" + this.e + ", deeplinkAttribution=" + this.f + ")";
        }

        public PremiumBusPassLandingScreenArgs(PassLandingFlowType passLandingFlowType, Source previousScreenSource, boolean z, String str) {
            Intrinsics.i(passLandingFlowType, "passLandingFlowType");
            Intrinsics.i(previousScreenSource, "previousScreenSource");
            this.c = passLandingFlowType;
            this.d = previousScreenSource;
            this.e = z;
            this.f = str;
        }

        public /* synthetic */ PremiumBusPassLandingScreenArgs(PassLandingFlowType passLandingFlowType, Source source, String str, int i) {
            this(passLandingFlowType, source, (i & 4) == 0, (i & 8) != 0 ? null : str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/PremiumBusArgs$PremiumBusSlotListScreenArgs;", "Lapp/chalo/scenes/args/PremiumBusArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class PremiumBusSlotListScreenArgs extends PremiumBusArgs {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] f = {null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new vr0(24)), null};
        public final String c;
        public final Source d;
        public final String e;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/PremiumBusArgs$PremiumBusSlotListScreenArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/PremiumBusArgs$PremiumBusSlotListScreenArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<PremiumBusSlotListScreenArgs> serializer() {
                return PremiumBusArgs$PremiumBusSlotListScreenArgs$$serializer.f9287a;
            }
        }

        public /* synthetic */ PremiumBusSlotListScreenArgs(int i, Source source, String str, String str2) {
            if (7 != (i & 7)) {
                PluginExceptionsKt.b(PremiumBusArgs$PremiumBusSlotListScreenArgs$$serializer.f9287a.getDescriptor(), i, 7);
                throw null;
            }
            this.c = str;
            this.d = source;
            this.e = str2;
        }

        @Override // app.chalo.scenes.args.SceneArgs
        public final ChaloScenes c() {
            return ChaloScenes.SlotSelectionListScreen;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PremiumBusSlotListScreenArgs)) {
                return false;
            }
            PremiumBusSlotListScreenArgs premiumBusSlotListScreenArgs = (PremiumBusSlotListScreenArgs) obj;
            return Intrinsics.d(this.c, premiumBusSlotListScreenArgs.c) && this.d == premiumBusSlotListScreenArgs.d && Intrinsics.d(this.e, premiumBusSlotListScreenArgs.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + nf1.f(this.d, this.c.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PremiumBusSlotListScreenArgs(requestId=");
            sb.append(this.c);
            sb.append(", source=");
            sb.append(this.d);
            sb.append(", flowType=");
            return vo1.p(sb, this.e, ")");
        }

        public PremiumBusSlotListScreenArgs(Source source, String requestId, String str) {
            Intrinsics.i(requestId, "requestId");
            Intrinsics.i(source, "source");
            this.c = requestId;
            this.d = source;
            this.e = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0003¨\u0006\u0005"}, d2 = {"Lapp/chalo/scenes/args/PremiumBusArgs$SlotSelectionArgs;", "Lapp/chalo/scenes/args/PremiumBusArgs;", "Lapp/chalo/login/AuthenticatedArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class SlotSelectionArgs extends PremiumBusArgs implements AuthenticatedArgs {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] f = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new vr0(26)), null, null};
        public final Source c;
        public final String d;
        public final String e;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/PremiumBusArgs$SlotSelectionArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/PremiumBusArgs$SlotSelectionArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<SlotSelectionArgs> serializer() {
                return PremiumBusArgs$SlotSelectionArgs$$serializer.f9290a;
            }
        }

        public /* synthetic */ SlotSelectionArgs(int i, Source source, String str, String str2) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.b(PremiumBusArgs$SlotSelectionArgs$$serializer.f9290a.getDescriptor(), i, 3);
                throw null;
            }
            this.c = source;
            this.d = str;
            if ((i & 4) == 0) {
                this.e = null;
            } else {
                this.e = str2;
            }
        }

        @Override // app.chalo.login.AuthenticatedArgs
        public final boolean b() {
            return true;
        }

        @Override // app.chalo.scenes.args.SceneArgs
        public final ChaloScenes c() {
            return ChaloScenes.PremiumBusSlotSelection;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SlotSelectionArgs)) {
                return false;
            }
            SlotSelectionArgs slotSelectionArgs = (SlotSelectionArgs) obj;
            return this.c == slotSelectionArgs.c && Intrinsics.d(this.d, slotSelectionArgs.d) && Intrinsics.d(this.e, slotSelectionArgs.e);
        }

        public final int hashCode() {
            int iE = nf1.e(this.c.hashCode() * 31, 31, this.d);
            String str = this.e;
            return iE + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SlotSelectionArgs(previousScreenSource=");
            sb.append(this.c);
            sb.append(", premiumBusProductPurchaseFlowType=");
            sb.append(this.d);
            sb.append(", deeplinkAttribution=");
            return vo1.p(sb, this.e, ")");
        }

        public SlotSelectionArgs(Source previousScreenSource, String premiumBusProductPurchaseFlowType, String str) {
            Intrinsics.i(previousScreenSource, "previousScreenSource");
            Intrinsics.i(premiumBusProductPurchaseFlowType, "premiumBusProductPurchaseFlowType");
            this.c = previousScreenSource;
            this.d = premiumBusProductPurchaseFlowType;
            this.e = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0003¨\u0006\u0005"}, d2 = {"Lapp/chalo/scenes/args/PremiumBusArgs$PremiumProductSelectionArgs;", "Lapp/chalo/scenes/args/PremiumBusArgs;", "Lapp/chalo/login/AuthenticatedArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class PremiumProductSelectionArgs extends PremiumBusArgs implements AuthenticatedArgs {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String c;
        public final String d;
        public final PremiumBusProductSelectionConfig e;
        public final String f;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/PremiumBusArgs$PremiumProductSelectionArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/PremiumBusArgs$PremiumProductSelectionArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<PremiumProductSelectionArgs> serializer() {
                return PremiumBusArgs$PremiumProductSelectionArgs$$serializer.f9288a;
            }
        }

        public /* synthetic */ PremiumProductSelectionArgs(int i, String str, String str2, PremiumBusProductSelectionConfig premiumBusProductSelectionConfig, String str3) {
            if ((i & 1) == 0) {
                this.c = null;
            } else {
                this.c = str;
            }
            if ((i & 2) == 0) {
                this.d = null;
            } else {
                this.d = str2;
            }
            if ((i & 4) == 0) {
                this.e = new PremiumBusProductSelectionConfig(false, 7);
            } else {
                this.e = premiumBusProductSelectionConfig;
            }
            if ((i & 8) == 0) {
                this.f = null;
            } else {
                this.f = str3;
            }
        }

        @Override // app.chalo.login.AuthenticatedArgs
        public final boolean b() {
            return false;
        }

        @Override // app.chalo.scenes.args.SceneArgs
        public final ChaloScenes c() {
            return ChaloScenes.PremiumBusProductSelection;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PremiumProductSelectionArgs)) {
                return false;
            }
            PremiumProductSelectionArgs premiumProductSelectionArgs = (PremiumProductSelectionArgs) obj;
            return Intrinsics.d(this.c, premiumProductSelectionArgs.c) && Intrinsics.d(this.d, premiumProductSelectionArgs.d) && Intrinsics.d(this.e, premiumProductSelectionArgs.e) && Intrinsics.d(this.f, premiumProductSelectionArgs.f);
        }

        public final int hashCode() {
            String str = this.c;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.d;
            int iHashCode2 = (this.e.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.f;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("PremiumProductSelectionArgs(premiumBusProductPurchaseFlowType=", this.c, ", selectedODPair=", this.d, ", premiumBusProductSelectionConfig=");
            sbE.append(this.e);
            sbE.append(", deeplinkAttribution=");
            sbE.append(this.f);
            sbE.append(")");
            return sbE.toString();
        }

        public PremiumProductSelectionArgs(String str, String str2, PremiumBusProductSelectionConfig premiumBusProductSelectionConfig, String str3, int i) {
            str2 = (i & 2) != 0 ? null : str2;
            str3 = (i & 8) != 0 ? null : str3;
            this.c = str;
            this.d = str2;
            this.e = premiumBusProductSelectionConfig;
            this.f = str3;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/PremiumBusArgs$PremiumBusSeatSelectionArgs;", "Lapp/chalo/scenes/args/PremiumBusArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class PremiumBusSeatSelectionArgs extends PremiumBusArgs {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] g = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new vr0(23)), null, null, null};
        public final Source c;
        public final String d;
        public final String e;
        public final String f;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/PremiumBusArgs$PremiumBusSeatSelectionArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/PremiumBusArgs$PremiumBusSeatSelectionArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<PremiumBusSeatSelectionArgs> serializer() {
                return PremiumBusArgs$PremiumBusSeatSelectionArgs$$serializer.f9286a;
            }
        }

        public PremiumBusSeatSelectionArgs(Source source, String str, String str2, String str3, int i) {
            str2 = (i & 4) != 0 ? null : str2;
            str3 = (i & 8) != 0 ? null : str3;
            Intrinsics.i(source, "source");
            this.c = source;
            this.d = str;
            this.e = str2;
            this.f = str3;
        }

        @Override // app.chalo.scenes.args.SceneArgs
        public final ChaloScenes c() {
            return ChaloScenes.PremiumBusSeatSelectionScreen;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PremiumBusSeatSelectionArgs)) {
                return false;
            }
            PremiumBusSeatSelectionArgs premiumBusSeatSelectionArgs = (PremiumBusSeatSelectionArgs) obj;
            return this.c == premiumBusSeatSelectionArgs.c && Intrinsics.d(this.d, premiumBusSeatSelectionArgs.d) && Intrinsics.d(this.e, premiumBusSeatSelectionArgs.e) && Intrinsics.d(this.f, premiumBusSeatSelectionArgs.f);
        }

        public final int hashCode() {
            int iE = nf1.e(this.c.hashCode() * 31, 31, this.d);
            String str = this.e;
            int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PremiumBusSeatSelectionArgs(source=");
            sb.append(this.c);
            sb.append(", flowType=");
            sb.append(this.d);
            sb.append(", requestId=");
            return r30.i(sb, this.e, ", deeplinkAttribution=", this.f, ")");
        }

        public /* synthetic */ PremiumBusSeatSelectionArgs(int i, Source source, String str, String str2, String str3) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.b(PremiumBusArgs$PremiumBusSeatSelectionArgs$$serializer.f9286a.getDescriptor(), i, 3);
                throw null;
            }
            this.c = source;
            this.d = str;
            if ((i & 4) == 0) {
                this.e = null;
            } else {
                this.e = str2;
            }
            if ((i & 8) == 0) {
                this.f = null;
            } else {
                this.f = str3;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/PremiumBusArgs$PremiumStopDetailsArgs;", "Lapp/chalo/scenes/args/PremiumBusArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class PremiumStopDetailsArgs extends PremiumBusArgs {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] h = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new vr0(25)), null, null, null, null};
        public final List c;
        public final String d;
        public final String e;
        public final boolean f;
        public final String g;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/PremiumBusArgs$PremiumStopDetailsArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/PremiumBusArgs$PremiumStopDetailsArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<PremiumStopDetailsArgs> serializer() {
                return PremiumBusArgs$PremiumStopDetailsArgs$$serializer.f9289a;
            }
        }

        public PremiumStopDetailsArgs(String pickupStopId, String dropStopId, String str, List routeIds) {
            Intrinsics.i(routeIds, "routeIds");
            Intrinsics.i(pickupStopId, "pickupStopId");
            Intrinsics.i(dropStopId, "dropStopId");
            this.c = routeIds;
            this.d = pickupStopId;
            this.e = dropStopId;
            this.f = false;
            this.g = str;
        }

        @Override // app.chalo.scenes.args.SceneArgs
        public final ChaloScenes c() {
            return ChaloScenes.PremiumBusStopDetails;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PremiumStopDetailsArgs)) {
                return false;
            }
            PremiumStopDetailsArgs premiumStopDetailsArgs = (PremiumStopDetailsArgs) obj;
            return Intrinsics.d(this.c, premiumStopDetailsArgs.c) && Intrinsics.d(this.d, premiumStopDetailsArgs.d) && Intrinsics.d(this.e, premiumStopDetailsArgs.e) && this.f == premiumStopDetailsArgs.f && Intrinsics.d(this.g, premiumStopDetailsArgs.g);
        }

        public final int hashCode() {
            int iE = (nf1.e(nf1.e(this.c.hashCode() * 31, 31, this.d), 31, this.e) + (this.f ? 1231 : 1237)) * 31;
            String str = this.g;
            return iE + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PremiumStopDetailsArgs(routeIds=");
            sb.append(this.c);
            sb.append(", pickupStopId=");
            sb.append(this.d);
            sb.append(", dropStopId=");
            t10.s(this.e, ", isPreBookingFlow=", ", deeplinkAttribution=", sb, this.f);
            return vo1.p(sb, this.g, ")");
        }

        public /* synthetic */ PremiumStopDetailsArgs(int i, String str, String str2, String str3, List list, boolean z) {
            if (7 != (i & 7)) {
                PluginExceptionsKt.b(PremiumBusArgs$PremiumStopDetailsArgs$$serializer.f9289a.getDescriptor(), i, 7);
                throw null;
            }
            this.c = list;
            this.d = str;
            this.e = str2;
            if ((i & 8) == 0) {
                this.f = false;
            } else {
                this.f = z;
            }
            if ((i & 16) == 0) {
                this.g = null;
            } else {
                this.g = str3;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/PremiumBusArgs$StopSelectionArgs;", "Lapp/chalo/scenes/args/PremiumBusArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class StopSelectionArgs extends PremiumBusArgs {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] h = {null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new vr0(27)), null};
        public final String c;
        public final boolean d;
        public final boolean e;
        public final Source f;
        public final String g;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/PremiumBusArgs$StopSelectionArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/PremiumBusArgs$StopSelectionArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<StopSelectionArgs> serializer() {
                return PremiumBusArgs$StopSelectionArgs$$serializer.f9291a;
            }
        }

        public StopSelectionArgs(String str, boolean z, boolean z2, Source previousScreenSource, String str2, int i) {
            str = (i & 1) != 0 ? null : str;
            z = (i & 2) != 0 ? false : z;
            z2 = (i & 4) != 0 ? true : z2;
            str2 = (i & 16) != 0 ? null : str2;
            Intrinsics.i(previousScreenSource, "previousScreenSource");
            this.c = str;
            this.d = z;
            this.e = z2;
            this.f = previousScreenSource;
            this.g = str2;
        }

        @Override // app.chalo.scenes.args.SceneArgs
        public final ChaloScenes c() {
            return ChaloScenes.PremiumBusStopSelection;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StopSelectionArgs)) {
                return false;
            }
            StopSelectionArgs stopSelectionArgs = (StopSelectionArgs) obj;
            return Intrinsics.d(this.c, stopSelectionArgs.c) && this.d == stopSelectionArgs.d && this.e == stopSelectionArgs.e && this.f == stopSelectionArgs.f && Intrinsics.d(this.g, stopSelectionArgs.g);
        }

        public final int hashCode() {
            String str = this.c;
            int iF = nf1.f(this.f, (((((str == null ? 0 : str.hashCode()) * 31) + (this.d ? 1231 : 1237)) * 31) + (this.e ? 1231 : 1237)) * 31, 31);
            String str2 = this.g;
            return iF + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbM = hq0.m("StopSelectionArgs(configId=", this.c, ", isPassPurchaseFromAllProducts=", ", showLandingScreen=", this.d);
            sbM.append(this.e);
            sbM.append(", previousScreenSource=");
            sbM.append(this.f);
            sbM.append(", deeplinkAttribution=");
            return vo1.p(sbM, this.g, ")");
        }

        public /* synthetic */ StopSelectionArgs(int i, String str, boolean z, boolean z2, Source source, String str2) {
            if (8 != (i & 8)) {
                PluginExceptionsKt.b(PremiumBusArgs$StopSelectionArgs$$serializer.f9291a.getDescriptor(), i, 8);
                throw null;
            }
            if ((i & 1) == 0) {
                this.c = null;
            } else {
                this.c = str;
            }
            if ((i & 2) == 0) {
                this.d = false;
            } else {
                this.d = z;
            }
            if ((i & 4) == 0) {
                this.e = true;
            } else {
                this.e = z2;
            }
            this.f = source;
            if ((i & 16) == 0) {
                this.g = null;
            } else {
                this.g = str2;
            }
        }
    }
}
