package app.chalo.scenes.args;

import app.chalo.constants.Source;
import app.chalo.data.StopBasedRouteSelectionFlowType;
import app.chalo.login.AuthenticatedArgs;
import app.chalo.network.config.ChaloJson;
import app.chalo.scenes.ChaloScenes;
import defpackage.b3;
import defpackage.dd;
import defpackage.qh1;
import defpackage.vo1;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\u0002\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lapp/chalo/scenes/args/TicketPurchaseArgs;", "Lapp/chalo/scenes/args/SceneArgs;", "Companion", "StopSelectionArgs", "RouteSelectionArgs", "PayForTicketArgs", "QuickPayArgs", "MTicketTripInfoArgs", "Lapp/chalo/scenes/args/TicketPurchaseArgs$MTicketTripInfoArgs;", "Lapp/chalo/scenes/args/TicketPurchaseArgs$PayForTicketArgs;", "Lapp/chalo/scenes/args/TicketPurchaseArgs$QuickPayArgs;", "Lapp/chalo/scenes/args/TicketPurchaseArgs$RouteSelectionArgs;", "Lapp/chalo/scenes/args/TicketPurchaseArgs$StopSelectionArgs;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class TicketPurchaseArgs extends SceneArgs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Object b = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new qh1(19));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/TicketPurchaseArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/TicketPurchaseArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<TicketPurchaseArgs> serializer() {
            return (KSerializer) TicketPurchaseArgs.b.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/scenes/args/TicketPurchaseArgs$RouteSelectionArgs;", "Lapp/chalo/scenes/args/TicketPurchaseArgs;", "Companion", "InstantTicket", "Lapp/chalo/scenes/args/TicketPurchaseArgs$RouteSelectionArgs$InstantTicket;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static abstract class RouteSelectionArgs extends TicketPurchaseArgs {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Object c = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new qh1(23));

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/TicketPurchaseArgs$RouteSelectionArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/TicketPurchaseArgs$RouteSelectionArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            public final KSerializer<RouteSelectionArgs> serializer() {
                return (KSerializer) RouteSelectionArgs.c.getValue();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/scenes/args/TicketPurchaseArgs$RouteSelectionArgs$InstantTicket;", "Lapp/chalo/scenes/args/TicketPurchaseArgs$RouteSelectionArgs;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class InstantTicket extends RouteSelectionArgs {
            public static final InstantTicket INSTANCE = new InstantTicket();
            public static final /* synthetic */ Object d = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new qh1(24));

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof InstantTicket);
            }

            public final int hashCode() {
                return -1411827331;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            public final KSerializer<InstantTicket> serializer() {
                return (KSerializer) d.getValue();
            }

            public final String toString() {
                return "InstantTicket";
            }
        }

        @Override // app.chalo.scenes.args.SceneArgs
        public final ChaloScenes c() {
            return ChaloScenes.RouteSelection;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/TicketPurchaseArgs$MTicketTripInfoArgs;", "Lapp/chalo/scenes/args/TicketPurchaseArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class MTicketTripInfoArgs extends TicketPurchaseArgs {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] f = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new qh1(20)), null, null};
        public final Source c;
        public final String d;
        public final String e;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/TicketPurchaseArgs$MTicketTripInfoArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/TicketPurchaseArgs$MTicketTripInfoArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<MTicketTripInfoArgs> serializer() {
                return TicketPurchaseArgs$MTicketTripInfoArgs$$serializer.f9323a;
            }
        }

        public /* synthetic */ MTicketTripInfoArgs(int i, Source source, String str, String str2) {
            if (7 != (i & 7)) {
                PluginExceptionsKt.b(TicketPurchaseArgs$MTicketTripInfoArgs$$serializer.f9323a.getDescriptor(), i, 7);
                throw null;
            }
            this.c = source;
            this.d = str;
            this.e = str2;
        }

        @Override // app.chalo.scenes.args.SceneArgs
        public final ChaloScenes c() {
            return ChaloScenes.MTicketTripInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MTicketTripInfoArgs)) {
                return false;
            }
            MTicketTripInfoArgs mTicketTripInfoArgs = (MTicketTripInfoArgs) obj;
            return this.c == mTicketTripInfoArgs.c && Intrinsics.d(this.d, mTicketTripInfoArgs.d) && Intrinsics.d(this.e, mTicketTripInfoArgs.e);
        }

        public final int hashCode() {
            Source source = this.c;
            int iHashCode = (source == null ? 0 : source.hashCode()) * 31;
            String str = this.d;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MTicketTripInfoArgs(source=");
            sb.append(this.c);
            sb.append(", routeJson=");
            sb.append(this.d);
            sb.append(", productId=");
            return vo1.p(sb, this.e, ")");
        }

        public MTicketTripInfoArgs(Source source, String str, String str2) {
            this.c = source;
            this.d = str;
            this.e = str2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/TicketPurchaseArgs$PayForTicketArgs;", "Lapp/chalo/scenes/args/TicketPurchaseArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class PayForTicketArgs extends TicketPurchaseArgs {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] e = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new qh1(21)), null};
        public final Source c;
        public final String d;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/TicketPurchaseArgs$PayForTicketArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/TicketPurchaseArgs$PayForTicketArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<PayForTicketArgs> serializer() {
                return TicketPurchaseArgs$PayForTicketArgs$$serializer.f9324a;
            }
        }

        public /* synthetic */ PayForTicketArgs(int i, Source source, String str) {
            if ((i & 1) == 0) {
                this.c = null;
            } else {
                this.c = source;
            }
            if ((i & 2) == 0) {
                this.d = null;
            } else {
                this.d = str;
            }
        }

        @Override // app.chalo.scenes.args.SceneArgs
        public final ChaloScenes c() {
            return ChaloScenes.PayForTicket;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PayForTicketArgs)) {
                return false;
            }
            PayForTicketArgs payForTicketArgs = (PayForTicketArgs) obj;
            return this.c == payForTicketArgs.c && Intrinsics.d(this.d, payForTicketArgs.d);
        }

        public final int hashCode() {
            Source source = this.c;
            int iHashCode = (source == null ? 0 : source.hashCode()) * 31;
            String str = this.d;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            return "PayForTicketArgs(source=" + this.c + ", routeJsonString=" + this.d + ")";
        }

        public PayForTicketArgs(Source source, String str, int i) {
            source = (i & 1) != 0 ? null : source;
            str = (i & 2) != 0 ? null : str;
            this.c = source;
            this.d = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0003¨\u0006\u0005"}, d2 = {"Lapp/chalo/scenes/args/TicketPurchaseArgs$QuickPayArgs;", "Lapp/chalo/scenes/args/TicketPurchaseArgs;", "Lapp/chalo/login/AuthenticatedArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class QuickPayArgs extends TicketPurchaseArgs implements AuthenticatedArgs {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] f = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new qh1(22)), null, null};
        public final Source c;
        public final String d;
        public final boolean e;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/TicketPurchaseArgs$QuickPayArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/TicketPurchaseArgs$QuickPayArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<QuickPayArgs> serializer() {
                return TicketPurchaseArgs$QuickPayArgs$$serializer.f9325a;
            }
        }

        public /* synthetic */ QuickPayArgs(int i, Source source, String str, boolean z) {
            if (1 != (i & 1)) {
                PluginExceptionsKt.b(TicketPurchaseArgs$QuickPayArgs$$serializer.f9325a.getDescriptor(), i, 1);
                throw null;
            }
            this.c = source;
            if ((i & 2) == 0) {
                this.d = null;
            } else {
                this.d = str;
            }
            if ((i & 4) == 0) {
                this.e = false;
            } else {
                this.e = z;
            }
        }

        @Override // app.chalo.login.AuthenticatedArgs
        public final boolean b() {
            return true;
        }

        @Override // app.chalo.scenes.args.SceneArgs
        public final ChaloScenes c() {
            return ChaloScenes.QuickPay;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QuickPayArgs)) {
                return false;
            }
            QuickPayArgs quickPayArgs = (QuickPayArgs) obj;
            return this.c == quickPayArgs.c && Intrinsics.d(this.d, quickPayArgs.d) && this.e == quickPayArgs.e;
        }

        public final int hashCode() {
            Source source = this.c;
            int iHashCode = (source == null ? 0 : source.hashCode()) * 31;
            String str = this.d;
            return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + (this.e ? 1231 : 1237);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("QuickPayArgs(source=");
            sb.append(this.c);
            sb.append(", tripAmountInPaisa=");
            sb.append(this.d);
            sb.append(", isFromCheckout=");
            return b3.g(")", sb, this.e);
        }

        public QuickPayArgs(Source source) {
            this.c = source;
            this.d = null;
            this.e = false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0004\u0004\u0005\u0006\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/scenes/args/TicketPurchaseArgs$StopSelectionArgs;", "Lapp/chalo/scenes/args/TicketPurchaseArgs;", "Lapp/chalo/login/AuthenticatedArgs;", "Companion", "ONDC", "InstantTicket", "PassPurchase", "Lapp/chalo/scenes/args/TicketPurchaseArgs$StopSelectionArgs$InstantTicket;", "Lapp/chalo/scenes/args/TicketPurchaseArgs$StopSelectionArgs$ONDC;", "Lapp/chalo/scenes/args/TicketPurchaseArgs$StopSelectionArgs$PassPurchase;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static abstract class StopSelectionArgs extends TicketPurchaseArgs implements AuthenticatedArgs {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Object d = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new qh1(25));
        public final String c;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/TicketPurchaseArgs$StopSelectionArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/TicketPurchaseArgs$StopSelectionArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            public final KSerializer<StopSelectionArgs> serializer() {
                return (KSerializer) StopSelectionArgs.d.getValue();
            }
        }

        public /* synthetic */ StopSelectionArgs(String str) {
            this.c = str;
        }

        @Override // app.chalo.login.AuthenticatedArgs
        public final boolean b() {
            return true;
        }

        @Override // app.chalo.scenes.args.SceneArgs
        public final ChaloScenes c() {
            return ChaloScenes.StopSelection;
        }

        public StopSelectionArgs(String str, int i) {
            this.c = str;
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/TicketPurchaseArgs$StopSelectionArgs$PassPurchase;", "Lapp/chalo/scenes/args/TicketPurchaseArgs$StopSelectionArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class PassPurchase extends StopSelectionArgs {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public final String e;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/TicketPurchaseArgs$StopSelectionArgs$PassPurchase$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/TicketPurchaseArgs$StopSelectionArgs$PassPurchase;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<PassPurchase> serializer() {
                    return TicketPurchaseArgs$StopSelectionArgs$PassPurchase$$serializer.f9328a;
                }
            }

            public PassPurchase(String productConfigId) {
                Intrinsics.i(productConfigId, "productConfigId");
                Json json = ChaloJson.b;
                StopBasedRouteSelectionFlowType.PassPurchase passPurchase = new StopBasedRouteSelectionFlowType.PassPurchase(productConfigId);
                json.getClass();
                super(json.a(StopBasedRouteSelectionFlowType.INSTANCE.serializer(), passPurchase), 0);
                this.e = productConfigId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PassPurchase) && Intrinsics.d(this.e, ((PassPurchase) obj).e);
            }

            public final int hashCode() {
                return this.e.hashCode();
            }

            public final String toString() {
                return vo1.B("PassPurchase(productConfigId=", this.e, ")");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ PassPurchase(int i, String str, String str2) {
                super(str);
                if (3 != (i & 3)) {
                    PluginExceptionsKt.b(TicketPurchaseArgs$StopSelectionArgs$PassPurchase$$serializer.f9328a.getDescriptor(), i, 3);
                    throw null;
                }
                this.e = str2;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/TicketPurchaseArgs$StopSelectionArgs$ONDC;", "Lapp/chalo/scenes/args/TicketPurchaseArgs$StopSelectionArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class ONDC extends StopSelectionArgs {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public final String e;
            public final String f;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/TicketPurchaseArgs$StopSelectionArgs$ONDC$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/TicketPurchaseArgs$StopSelectionArgs$ONDC;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<ONDC> serializer() {
                    return TicketPurchaseArgs$StopSelectionArgs$ONDC$$serializer.f9327a;
                }
            }

            public ONDC(String str, String str2) {
                Json json = ChaloJson.b;
                StopBasedRouteSelectionFlowType.ONDC ondc = new StopBasedRouteSelectionFlowType.ONDC(str, str2);
                json.getClass();
                super(json.a(StopBasedRouteSelectionFlowType.INSTANCE.serializer(), ondc), 0);
                this.e = str;
                this.f = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ONDC)) {
                    return false;
                }
                ONDC ondc = (ONDC) obj;
                return Intrinsics.d(this.e, ondc.e) && Intrinsics.d(this.f, ondc.f);
            }

            public final int hashCode() {
                String str = this.e;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                return vo1.o("ONDC(fromStop=", this.e, ", toStop=", this.f, ")");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ ONDC(int i, String str, String str2, String str3) {
                super(str);
                if (1 != (i & 1)) {
                    PluginExceptionsKt.b(TicketPurchaseArgs$StopSelectionArgs$ONDC$$serializer.f9327a.getDescriptor(), i, 1);
                    throw null;
                }
                if ((i & 2) == 0) {
                    this.e = null;
                } else {
                    this.e = str2;
                }
                if ((i & 4) == 0) {
                    this.f = null;
                } else {
                    this.f = str3;
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/TicketPurchaseArgs$StopSelectionArgs$InstantTicket;", "Lapp/chalo/scenes/args/TicketPurchaseArgs$StopSelectionArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class InstantTicket extends StopSelectionArgs {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public final String e;
            public final String f;
            public final String g;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/TicketPurchaseArgs$StopSelectionArgs$InstantTicket$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/TicketPurchaseArgs$StopSelectionArgs$InstantTicket;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<InstantTicket> serializer() {
                    return TicketPurchaseArgs$StopSelectionArgs$InstantTicket$$serializer.f9326a;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public InstantTicket(String str, String str2, String str3) {
                Json json = ChaloJson.b;
                StopBasedRouteSelectionFlowType.InstantTicket instantTicket = StopBasedRouteSelectionFlowType.InstantTicket.INSTANCE;
                json.getClass();
                super(json.a(StopBasedRouteSelectionFlowType.INSTANCE.serializer(), instantTicket), 0);
                this.e = str;
                this.f = str2;
                this.g = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InstantTicket)) {
                    return false;
                }
                InstantTicket instantTicket = (InstantTicket) obj;
                return Intrinsics.d(this.e, instantTicket.e) && Intrinsics.d(this.f, instantTicket.f) && Intrinsics.d(this.g, instantTicket.g);
            }

            public final int hashCode() {
                String str = this.e;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.g;
                return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            public final String toString() {
                return vo1.p(dd.e("InstantTicket(fromStop=", this.e, ", toStop=", this.f, ", routeId="), this.g, ")");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ InstantTicket(int i, String str, String str2, String str3, String str4) {
                super(str);
                if (1 != (i & 1)) {
                    PluginExceptionsKt.b(TicketPurchaseArgs$StopSelectionArgs$InstantTicket$$serializer.f9326a.getDescriptor(), i, 1);
                    throw null;
                }
                if ((i & 2) == 0) {
                    this.e = null;
                } else {
                    this.e = str2;
                }
                if ((i & 4) == 0) {
                    this.f = null;
                } else {
                    this.f = str3;
                }
                if ((i & 8) == 0) {
                    this.g = null;
                } else {
                    this.g = str4;
                }
            }
        }
    }
}
