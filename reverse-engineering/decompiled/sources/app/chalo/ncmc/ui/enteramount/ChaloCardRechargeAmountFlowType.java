package app.chalo.ncmc.ui.enteramount;

import app.chalo.ncmc.data.appmodel.ChaloCardDetails;
import app.chalo.ncmc.data.appmodel.ChaloCardRechargeConfigAppModel;
import defpackage.ji;
import defpackage.uf0;
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
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lapp/chalo/ncmc/ui/enteramount/ChaloCardRechargeAmountFlowType;", "", "Companion", "WithChaloCardDetails", "WithoutChaloCardDetails", "Unknown", "Lapp/chalo/ncmc/ui/enteramount/ChaloCardRechargeAmountFlowType$Unknown;", "Lapp/chalo/ncmc/ui/enteramount/ChaloCardRechargeAmountFlowType$WithChaloCardDetails;", "Lapp/chalo/ncmc/ui/enteramount/ChaloCardRechargeAmountFlowType$WithoutChaloCardDetails;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class ChaloCardRechargeAmountFlowType {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f6319a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ji(9));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/ui/enteramount/ChaloCardRechargeAmountFlowType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/ui/enteramount/ChaloCardRechargeAmountFlowType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<ChaloCardRechargeAmountFlowType> serializer() {
            return (KSerializer) ChaloCardRechargeAmountFlowType.f6319a.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/ncmc/ui/enteramount/ChaloCardRechargeAmountFlowType$Unknown;", "Lapp/chalo/ncmc/ui/enteramount/ChaloCardRechargeAmountFlowType;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Unknown extends ChaloCardRechargeAmountFlowType {
        public static final Unknown INSTANCE = new Unknown();
        public static final /* synthetic */ Object b = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ji(11));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Unknown);
        }

        public final int hashCode() {
            return -949539935;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<Unknown> serializer() {
            return (KSerializer) b.getValue();
        }

        public final String toString() {
            return "Unknown";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/ui/enteramount/ChaloCardRechargeAmountFlowType$WithChaloCardDetails;", "Lapp/chalo/ncmc/ui/enteramount/ChaloCardRechargeAmountFlowType;", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class WithChaloCardDetails extends ChaloCardRechargeAmountFlowType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] c = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ji(13))};
        public final ChaloCardDetails b;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/ui/enteramount/ChaloCardRechargeAmountFlowType$WithChaloCardDetails$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/ui/enteramount/ChaloCardRechargeAmountFlowType$WithChaloCardDetails;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<WithChaloCardDetails> serializer() {
                return ChaloCardRechargeAmountFlowType$WithChaloCardDetails$$serializer.f6320a;
            }
        }

        public /* synthetic */ WithChaloCardDetails(int i, ChaloCardDetails chaloCardDetails) {
            if (1 == (i & 1)) {
                this.b = chaloCardDetails;
            } else {
                PluginExceptionsKt.b(ChaloCardRechargeAmountFlowType$WithChaloCardDetails$$serializer.f6320a.getDescriptor(), i, 1);
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WithChaloCardDetails) && Intrinsics.d(this.b, ((WithChaloCardDetails) obj).b);
        }

        public final int hashCode() {
            ChaloCardDetails chaloCardDetails = this.b;
            if (chaloCardDetails == null) {
                return 0;
            }
            return chaloCardDetails.hashCode();
        }

        public final String toString() {
            return "WithChaloCardDetails(chaloCardDetails=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/ui/enteramount/ChaloCardRechargeAmountFlowType$WithoutChaloCardDetails;", "Lapp/chalo/ncmc/ui/enteramount/ChaloCardRechargeAmountFlowType;", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class WithoutChaloCardDetails extends ChaloCardRechargeAmountFlowType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String b;
        public final ChaloCardRechargeConfigAppModel c;
        public final long d;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/ui/enteramount/ChaloCardRechargeAmountFlowType$WithoutChaloCardDetails$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/ui/enteramount/ChaloCardRechargeAmountFlowType$WithoutChaloCardDetails;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<WithoutChaloCardDetails> serializer() {
                return ChaloCardRechargeAmountFlowType$WithoutChaloCardDetails$$serializer.f6321a;
            }
        }

        public /* synthetic */ WithoutChaloCardDetails(int i, String str, ChaloCardRechargeConfigAppModel chaloCardRechargeConfigAppModel, long j) {
            if (7 != (i & 7)) {
                PluginExceptionsKt.b(ChaloCardRechargeAmountFlowType$WithoutChaloCardDetails$$serializer.f6321a.getDescriptor(), i, 7);
                throw null;
            }
            this.b = str;
            this.c = chaloCardRechargeConfigAppModel;
            this.d = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WithoutChaloCardDetails)) {
                return false;
            }
            WithoutChaloCardDetails withoutChaloCardDetails = (WithoutChaloCardDetails) obj;
            return Intrinsics.d(this.b, withoutChaloCardDetails.b) && Intrinsics.d(this.c, withoutChaloCardDetails.c) && this.d == withoutChaloCardDetails.d;
        }

        public final int hashCode() {
            int iHashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
            long j = this.d;
            return iHashCode + ((int) (j ^ (j >>> 32)));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("WithoutChaloCardDetails(cardNumber=");
            sb.append(this.b);
            sb.append(", rechargeConfig=");
            sb.append(this.c);
            sb.append(", rechargeLimit=");
            return uf0.m(this.d, ")", sb);
        }
    }
}
