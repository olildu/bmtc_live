package app.chalo.premiumbus.ui.faredetails;

import app.chalo.models.SuperPassSubTypes;
import app.chalo.premiumbus.data.models.app.PremiumBusPassUpsellAppModel;
import defpackage.dd;
import defpackage.nf1;
import defpackage.nt0;
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
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/PremiumBusFareDetailsFlowType;", "", "Companion", "FreshPurchase", "PurchaseThroughPass", "PassUpsellNudge", "Lapp/chalo/premiumbus/ui/faredetails/PremiumBusFareDetailsFlowType$FreshPurchase;", "Lapp/chalo/premiumbus/ui/faredetails/PremiumBusFareDetailsFlowType$PassUpsellNudge;", "Lapp/chalo/premiumbus/ui/faredetails/PremiumBusFareDetailsFlowType$PurchaseThroughPass;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class PremiumBusFareDetailsFlowType {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f7551a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new nt0(3));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/PremiumBusFareDetailsFlowType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/ui/faredetails/PremiumBusFareDetailsFlowType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<PremiumBusFareDetailsFlowType> serializer() {
            return (KSerializer) PremiumBusFareDetailsFlowType.f7551a.getValue();
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract String getB();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/PremiumBusFareDetailsFlowType$FreshPurchase;", "Lapp/chalo/premiumbus/ui/faredetails/PremiumBusFareDetailsFlowType;", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class FreshPurchase extends PremiumBusFareDetailsFlowType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String b;
        public final String c;
        public final String d;
        public final PremiumBusPassUpsellAppModel e;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/PremiumBusFareDetailsFlowType$FreshPurchase$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/ui/faredetails/PremiumBusFareDetailsFlowType$FreshPurchase;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<FreshPurchase> serializer() {
                return PremiumBusFareDetailsFlowType$FreshPurchase$$serializer.f7552a;
            }
        }

        public /* synthetic */ FreshPurchase(int i, String str, String str2, String str3, PremiumBusPassUpsellAppModel premiumBusPassUpsellAppModel) {
            if (7 != (i & 7)) {
                PluginExceptionsKt.b(PremiumBusFareDetailsFlowType$FreshPurchase$$serializer.f7552a.getDescriptor(), i, 7);
                throw null;
            }
            this.b = str;
            this.c = str2;
            this.d = str3;
            if ((i & 8) == 0) {
                this.e = null;
            } else {
                this.e = premiumBusPassUpsellAppModel;
            }
        }

        @Override // app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsFlowType
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FreshPurchase)) {
                return false;
            }
            FreshPurchase freshPurchase = (FreshPurchase) obj;
            return Intrinsics.d(this.b, freshPurchase.b) && Intrinsics.d(this.c, freshPurchase.c) && Intrinsics.d(this.d, freshPurchase.d) && Intrinsics.d(this.e, freshPurchase.e);
        }

        public final int hashCode() {
            int iE = nf1.e(nf1.e(this.b.hashCode() * 31, 31, this.c), 31, this.d);
            PremiumBusPassUpsellAppModel premiumBusPassUpsellAppModel = this.e;
            return iE + (premiumBusPassUpsellAppModel == null ? 0 : premiumBusPassUpsellAppModel.hashCode());
        }

        public final String toString() {
            StringBuilder sbE = dd.e("FreshPurchase(tripId=", this.b, ", configId=", this.c, ", agency=");
            sbE.append(this.d);
            sbE.append(", passUpsell=");
            sbE.append(this.e);
            sbE.append(")");
            return sbE.toString();
        }

        public FreshPurchase(String str, String configId, String str2, PremiumBusPassUpsellAppModel premiumBusPassUpsellAppModel) {
            Intrinsics.i(configId, "configId");
            this.b = str;
            this.c = configId;
            this.d = str2;
            this.e = premiumBusPassUpsellAppModel;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/PremiumBusFareDetailsFlowType$PassUpsellNudge;", "Lapp/chalo/premiumbus/ui/faredetails/PremiumBusFareDetailsFlowType;", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class PassUpsellNudge extends PremiumBusFareDetailsFlowType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String b;
        public final String c;
        public final String d;
        public final PremiumBusPassUpsellAppModel e;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/PremiumBusFareDetailsFlowType$PassUpsellNudge$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/ui/faredetails/PremiumBusFareDetailsFlowType$PassUpsellNudge;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<PassUpsellNudge> serializer() {
                return PremiumBusFareDetailsFlowType$PassUpsellNudge$$serializer.f7553a;
            }
        }

        public /* synthetic */ PassUpsellNudge(int i, String str, String str2, String str3, PremiumBusPassUpsellAppModel premiumBusPassUpsellAppModel) {
            if (15 != (i & 15)) {
                PluginExceptionsKt.b(PremiumBusFareDetailsFlowType$PassUpsellNudge$$serializer.f7553a.getDescriptor(), i, 15);
                throw null;
            }
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = premiumBusPassUpsellAppModel;
        }

        @Override // app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsFlowType
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PassUpsellNudge)) {
                return false;
            }
            PassUpsellNudge passUpsellNudge = (PassUpsellNudge) obj;
            return Intrinsics.d(this.b, passUpsellNudge.b) && Intrinsics.d(this.c, passUpsellNudge.c) && Intrinsics.d(this.d, passUpsellNudge.d) && Intrinsics.d(this.e, passUpsellNudge.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + nf1.e(nf1.e(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("PassUpsellNudge(tripId=", this.b, ", configId=", this.c, ", agency=");
            sbE.append(this.d);
            sbE.append(", passUpsell=");
            sbE.append(this.e);
            sbE.append(")");
            return sbE.toString();
        }

        public PassUpsellNudge(String tripId, String configId, String agency, PremiumBusPassUpsellAppModel premiumBusPassUpsellAppModel) {
            Intrinsics.i(tripId, "tripId");
            Intrinsics.i(configId, "configId");
            Intrinsics.i(agency, "agency");
            this.b = tripId;
            this.c = configId;
            this.d = agency;
            this.e = premiumBusPassUpsellAppModel;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/PremiumBusFareDetailsFlowType$PurchaseThroughPass;", "Lapp/chalo/premiumbus/ui/faredetails/PremiumBusFareDetailsFlowType;", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class PurchaseThroughPass extends PremiumBusFareDetailsFlowType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] e = {null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new nt0(4))};
        public final String b;
        public final String c;
        public final SuperPassSubTypes d;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/PremiumBusFareDetailsFlowType$PurchaseThroughPass$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/ui/faredetails/PremiumBusFareDetailsFlowType$PurchaseThroughPass;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<PurchaseThroughPass> serializer() {
                return PremiumBusFareDetailsFlowType$PurchaseThroughPass$$serializer.f7554a;
            }
        }

        public /* synthetic */ PurchaseThroughPass(int i, SuperPassSubTypes superPassSubTypes, String str, String str2) {
            if (7 != (i & 7)) {
                PluginExceptionsKt.b(PremiumBusFareDetailsFlowType$PurchaseThroughPass$$serializer.f7554a.getDescriptor(), i, 7);
                throw null;
            }
            this.b = str;
            this.c = str2;
            this.d = superPassSubTypes;
        }

        @Override // app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsFlowType
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PurchaseThroughPass)) {
                return false;
            }
            PurchaseThroughPass purchaseThroughPass = (PurchaseThroughPass) obj;
            return Intrinsics.d(this.b, purchaseThroughPass.b) && Intrinsics.d(this.c, purchaseThroughPass.c) && this.d == purchaseThroughPass.d;
        }

        public final int hashCode() {
            return this.d.hashCode() + nf1.e(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("PurchaseThroughPass(tripId=", this.b, ", passId=", this.c, ", passSubTypes=");
            sbE.append(this.d);
            sbE.append(")");
            return sbE.toString();
        }

        public PurchaseThroughPass(String tripId, String passId, SuperPassSubTypes passSubTypes) {
            Intrinsics.i(tripId, "tripId");
            Intrinsics.i(passId, "passId");
            Intrinsics.i(passSubTypes, "passSubTypes");
            this.b = tripId;
            this.c = passId;
            this.d = passSubTypes;
        }
    }
}
